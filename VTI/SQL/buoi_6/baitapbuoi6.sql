-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó 
SELECT
    dp.DepartmentName, 
    acc.AccountID, 
    acc.FullName, 
    acc.Email, 
    acc.PositionID, 
    acc.CreateDate
FROM Department AS dp
INNER JOIN `account` AS acc ON dp.DepartmentID = acc.DepartmentID
WHERE dp.DepartmentName = 'Sale';

DELIMITER $$
create procedure layaccount_phongpban(in tenphongban varchar(200))
begin
     SELECT
    dp.DepartmentName, 
    acc.AccountID, 
    acc.FullName, 
    acc.Email, 
    acc.PositionID, 
    acc.CreateDate
	FROM Department AS dp
	INNER JOIN `account` AS acc ON dp.DepartmentID = acc.DepartmentID
	WHERE dp.DepartmentName = tenphongban;
end $$
DELIMITER $$;

call layaccount_phongpban('Marketing');
call layaccount_phongpban('sale');
DELIMITER $$;
-- Question 2: Tạo store để in ra số lượng account trong mỗi group  

DELIMITER $$

CREATE PROCEDURE ThongKeNhanVienMoiGroup()
BEGIN
    SELECT 
        g.GroupName, 
        COUNT(ga.AccountID) AS SoLuongAccount
    FROM `Group` g
    LEFT JOIN GroupAccount ga ON g.GroupID = ga.GroupID
    GROUP BY g.GroupID;
END $$

DELIMITER ;

call ThongKeNhanVienMoiGroup()
DELIMITER ;
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất 
DELIMITER $$
create procedure layidconhieucauhoi(out type_id int)
begin 
     select TypeID into type_id
     from question
	 group by TypeID
	 order by count(QuestionID) desc
	 limit 1;
end $$
DELIMITER ;


CALL layidconhieucauhoi(@id_max);
SELECT @id_max;
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question 

select TypeName from typequestion
where TypeID =1

delimiter $$
create procedure layten_type_max()
begin 
   declare v_max_id int;
   call layidconhieucauhoi(v_max_id);
	select TypeName from typequestion
	where TypeID =v_max_id;
end $$
delimiter ;

call layten_type_max();

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi 
-- và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào 
DELIMITER $$
CREATE PROCEDURE TimKiemRanhMach(IN v_chuoi_nhap VARCHAR(50))
BEGIN
    -- Câu 1: Tìm Group
    SELECT GroupName, 'Đây là Group' AS PhanLoai
    FROM `Group`
    WHERE GroupName LIKE CONCAT('%', v_chuoi_nhap, '%')
	union
    -- Câu 2: Tìm User (Hiện ra một bảng khác bên dưới)
    SELECT Username, 'Đây là User' AS PhanLoai
    FROM `Account`
    WHERE Username LIKE CONCAT('%', v_chuoi_nhap, '%');
END $$
DELIMITER ;

-- Thử lại với chữ 'a' xem có ra cả hai không
CALL TimKiemRanhMach('a');


-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay
--  hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất 
DELIMITER $$

CREATE PROCEDURE ThongKeContentDaiNhat_Cach2(IN v_typeName VARCHAR(50))
BEGIN
    SELECT ty.TypeName, qe.Content, LENGTH(qe.Content) AS DoDai
    FROM typequestion AS ty
    INNER JOIN question AS qe ON ty.TypeID = qe.TypeID
    WHERE ty.TypeName = v_typeName 
    AND LENGTH(qe.Content) = (
        SELECT MAX(LENGTH(Content)) 
        FROM question 
        WHERE TypeID = ty.TypeID
    );
END $$

DELIMITER ;
call ThongKeContentDaiNhat_Cach2('Essay');
call ThongKeContentDaiNhat_Cach2('Multiple-Choice')


DELIMITER $$
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID 
CREATE PROCEDURE XoaExamTheoID(IN p_ExamID INT)
BEGIN
    DELETE FROM Exam
    WHERE ExamID = p_ExamID;
END $$

DELIMITER ;
call XoaExamTheoID(1)

## Question 12: Thống kê câu hỏi mỗi tháng trong NĂM NAY

DELIMITER $$

CREATE PROCEDURE ThongKeCauHoiNamNay()
BEGIN
    SELECT 
        MONTH(CreateDate) AS Thang, 
        COUNT(QuestionID) AS SoLuongCauHoi
    FROM Question
    WHERE YEAR(CreateDate) = YEAR(NOW()) -- Chỉ lấy năm hiện tại (2026)
    GROUP BY MONTH(CreateDate)
    ORDER BY MONTH(CreateDate) ASC;
END $$
DELIMITER ;
## Question 13: Thống kê câu hỏi trong 6 THÁNG GẦN ĐÂY

DROP PROCEDURE IF EXISTS ThongKeCauHoi6ThangGanDay;
DELIMITER $$

CREATE PROCEDURE ThongKeCauHoi6ThangGanDay()
BEGIN
    SELECT 
        MONTH(CreateDate) AS Thang, 
        YEAR(CreateDate) AS Nam,
        COUNT(QuestionID) AS SoLuongCauHoi
    FROM Question
    -- Dùng DATE_SUB để lùi lại đúng 6 tháng từ hôm nay
    WHERE CreateDate >= DATE_SUB(NOW(), INTERVAL 6 MONTH)
    GROUP BY YEAR(CreateDate), MONTH(CreateDate)
    ORDER BY YEAR(CreateDate) DESC, MONTH(CreateDate) DESC;
END $$
DELIMITER ;
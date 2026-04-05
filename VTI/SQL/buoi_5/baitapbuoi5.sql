
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
CREATE VIEW View_NhanVien_Tong_Hop AS 
SELECT acc.*, de.DepartmentName 
FROM `account` AS acc 
INNER JOIN Department AS de ON acc.DepartmentID = de.DepartmentID;


SELECT * FROM View_NhanVien_Tong_Hop 
WHERE DepartmentName = 'sale';

CREATE VIEW View_NhanVien_Tong_Hop_sale AS 
SELECT acc.*, de.DepartmentName 
FROM `account` AS acc 
INNER JOIN Department AS de ON acc.DepartmentID = de.DepartmentID
WHERE de.DepartmentName  = 'sale';

select * from  View_NhanVien_Tong_Hop_sale ;
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
select GroupID,count(AccountID) as taikhoan from groupaccount
group by GroupID;
-- count tk join nhiều gr nhất
select count( GroupID)  as nhom from groupaccount
group by AccountID
order by nhom desc 
limit 1;
-- tạo vieww
create view acc_join_nhieu_gr as 
select acc.AccountID,acc.Email,acc.FullName,count( GroupID) as soluongnhom from `account` as acc
inner join groupaccount as gracc
on acc.AccountID=gracc.AccountID
group by acc.AccountID,acc.Email,acc.FullName
having soluongnhom =
(select count( GroupID)  as nhom from groupaccount
group by AccountID
order by nhom desc 
limit 1);
select * from acc_join_nhieu_gr;


-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi em k biết làm
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
-- count department có nhiều nhân viên nhất

select count(AccountID) as soluongnhanvien from `account`
group by DepartmentID
order by  soluongnhanvien desc 
limit 1;

create view department_nhanvien as
select de.DepartmentID,de.DepartmentName,count(acc.AccountID) as soluongnhanvien from Department as de
inner join `account` AS acc 
on de.DepartmentID=acc.DepartmentID
group by de.DepartmentID,de.DepartmentName 
having soluongnhanvien = (
select count(AccountID) as soluongnhanvien from `account`
group by DepartmentID
order by  soluongnhanvien desc 
limit 1);

select * from department_nhanvien;


-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
create view user_nguyen as 
select qe.Content,acc.FullName from Question as qe 
inner join `account` AS acc 
on qe.AccountID=acc.AccountID
where acc.FullName like '%Nguyễn%';
SELECT * FROM user_nguyen;
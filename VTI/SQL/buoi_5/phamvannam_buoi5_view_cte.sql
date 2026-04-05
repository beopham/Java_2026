create database phamvannam_buoi5_view_cte;
use phamvannam_buoi5_view_cte;


create table Department(
DepartmentID        int not null auto_increment,
DepartmentName      varchar(200) not null,
constraint          pk_DepartmentID primary key(DepartmentID)
);       
-- Table 2: Position  
-- PositionID:  định danh của chức vụ (auto increment) 
-- PositionName: tên chức vụ (Dev, Test, Scrum Master, PM) 
create table  `Position`(
PositionID         int not null auto_increment,
PositionName   	   varchar(200) not null,
constraint     	   pk_PositionID primary key(PositionID)
);  

-- Table 3: Account  
-- AccountID:  định danh của User (auto increment) 
-- Email:  Địa chỉ email
-- Username:  tên đăng nhập
-- FullName:  tên đầy đủ
-- DepartmentID: phòng ban của user trong hệ thống 
-- PositionID: chức vụ của User 
-- CreateDate: ngày tạo tài khoản 
create table `Account`(
AccountID       int not null auto_increment,
Email           varchar(200) not null,
Username 		varchar(200) not null,
FullName 		varchar(200) not null,
DepartmentID    int null,
PositionID      int null,
CreateDate      date not null,
constraint 		pk_AccountID  primary key(AccountID),
constraint 		fk_DepartmentID  foreign key(DepartmentID) references Department(DepartmentID)
                on delete cascade
                on update cascade,
constraint 		fk_PositionID  foreign key(PositionID) references `Position`(PositionID)
                on delete cascade
                on update cascade
);

CREATE TABLE `Group` (
GroupID        INT NOT NULL AUTO_INCREMENT,
GroupName      VARCHAR(255) NOT NULL,
AccountID  	   int NULL,
CreateDate     DATE not null,
constraint     pk_GroupID PRIMARY KEY (GroupID),
constraint     fk_AccountID foreign key(AccountID) references `Account` (AccountID)
			   on delete cascade
			   on update cascade
);

create table GroupAccount(
GroupID        INT not null,
AccountID      int not null,
JoinDate       DATE not null,
constraint 	   pk_GroupID_AccountID primary key(GroupID,AccountID),
constraint 	   fk_GroupID foreign key(GroupID) references `Group`(GroupID)
               on delete cascade
			   on update cascade,
constraint 	   fk_AccountIDok  foreign key(AccountID) references `Account` (AccountID)
               on delete cascade
			   on update cascade
);

CREATE TABLE TypeQuestion (
TypeID         int not null AUTO_INCREMENT,                
TypeName       ENUM('Essay', 'Multiple-Choice') NOT NULL,   -- Tên loại câu hỏi (chỉ cho phép 2 giá trị này)
constraint 	   pk_TypeID primary key(TypeID)
);


CREATE TABLE  CategoryQuestion (
CategoryID     INT  not null AUTO_INCREMENT,    
CategoryName   VARCHAR(100) NOT NULL,           
constraint     pk_CategoryID primary key(CategoryID),
constraint     uq_CategoryName unique(CategoryName)
);

create table  Question (
QuestionID    int not null auto_increment,
Content       VARCHAR(255) NOT NULL,
AccountID     INT null,
TypeID        int null ,    
CategoryID    INT NULL,
CreateDate    DATE not null,
constraint 	  pk_QuestionID primary key(QuestionID), 
constraint    fk_AccountID_que foreign key(AccountID) references `Account` (AccountID)
			  on delete cascade
			  on update cascade,
constraint 	  fk_CategoryID foreign key(CategoryID) references CategoryQuestion (CategoryID)
	          on delete cascade
			  on update cascade,
constraint 	  fk_TypeID foreign key(TypeID) references TypeQuestion (TypeID)
	          on delete cascade
			  on update cascade
);


CREATE TABLE Answer (
AnswerID     INT not null AUTO_INCREMENT,
Content      TEXT NOT NULL,
QuestionID   INT  NULL,
isCorrect    BOOLEAN NOT NULL, -- Bắt buộc phải nhập khi INSERT
constraint   pk_AnswerID  primary key(AnswerID),
CONSTRAINT   FK_Question_Answer FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
			 on delete cascade
			 on update cascade
);

CREATE TABLE Exam (
ExamID        INT PRIMARY KEY AUTO_INCREMENT, -- Định danh đề thi, tự động tăng
`Code`        VARCHAR(20) NOT NULL UNIQUE,              -- Mã đề thi (ví dụ: VTI001)
Title         VARCHAR(255) NOT NULL,                    -- Tiêu đề đề thi
CategoryID    INT  NOT NULL,               -- Khóa ngoại trỏ về CategoryQuestion
Duration      INT  NOT NULL,             -- Thời gian thi (phút)
AccountID     INT null,               -- ID người tạo (trỏ về bảng Account)
CreateDate    DATETIME DEFAULT CURRENT_TIMESTAMP,  
CONSTRAINT    FK_Exam_Category FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)
              on delete cascade
			  on update cascade,
constraint    fk_AccountID_quea foreign key(AccountID) references `Account` (AccountID)
			  on delete cascade
			  on update cascade
);



CREATE TABLE ExamQuestion (
ExamID       INT NOT NULL,
QuestionID   INT NOT NULL,
constraint   pk_ExamID_QuestionID PRIMARY KEY (ExamID, QuestionID),
CONSTRAINT   FK_Exam_ExamQuestion FOREIGN KEY (ExamID) REFERENCES Exam(ExamID) 
		     on delete cascade
			 on update cascade,
CONSTRAINT   FK_Question_ExamQuestion FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID) 
		     on delete cascade
			 on update cascade
);
INSERT INTO Department (DepartmentName) 
VALUES 
    (N'Sale'),
    (N'Marketing'),
    (N'Kỹ thuật'),
    (N'Nhân sự'),
    (N'Tài chính'),
    (N'Phát triển sản phẩm'),
    (N'Chăm sóc khách hàng'),
    (N'Đào tạo'),
    (N'Quản lý chất lượng'),
    (N'Bảo mật hệ thống');


select * from Department;

INSERT INTO `Position` (PositionName) 
VALUES 
    ('Dev'), 
    ('Test'), 
    ('Scrum Master'), 
    ('PM'), 
    ('Designer'),
    ('Data Analyst'),
    ('Business Analyst'),
    ('DevOps'),
    ('Technical Lead'),
    ('Solution Architect');
    
select * from `Position` ;


INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES
    ('nam.pv@gmail.com', 'nam.pv', N'Phạm Văn Nam', 1, 1, '2024-01-01'),
    ('hoang.nguyen@vku.udn.vn', 'hoang.ng', N'Nguyễn Văn Hoàng', 1, 2, '2024-01-05'),
    ('lan.anh@gmail.com', 'lananh.le', N'Lê Lan Anh', 2, 4, '2024-01-10'),
    -- Dòng này NULL DepartmentID (Nhân viên mới chưa phân phòng)
    ('minh.quan@outlook.com', 'quan.m', N'Trần Minh Quân', NULL, 1, '2024-02-15'),
    ('thu.thao@gmail.com', 'thao.p', N'Phan Thu Thảo', 4, 7, '2024-02-20'),
    ('duc.thinh@vku.udn.vn', 'thinh.d', N'Đỗ Đức Thịnh', 5, 8, '2024-03-01'),
    -- Dòng này NULL PositionID (Thực tập sinh chưa có chức danh)
    ('mai.chi@gmail.com', 'chi.m', N'Ngô Mai Chi', 6, NULL, '2024-03-12'),
    ('son.tung@gmail.com', 'tung.s', N'Nguyễn Sơn Tùng', 7, 10, '2024-03-15'),
    ('bao.ngoc@outlook.com', 'ngoc.b', N'Vũ Bảo Ngọc', 8, 2, '2024-04-01'),
    ('quang.hai@gmail.com', 'hai.q', N'Lê Quang Hải', 9, 4, '2024-04-05'),
    -- Dòng này NULL cả hai
    ('thuy.tien@gmail.com', 'tien.t', N'Đặng Thủy Tiên', NULL, NULL, '2024-04-10'),
    ('huy.hoang@vku.udn.vn', 'hoang.huy', N'Bùi Huy Hoàng', 1, 1, '2024-05-01'),
    ('ngoc.trinh@gmail.com', 'trinh.n', N'Phạm Ngọc Trinh', 2, 6, '2024-05-15'),
    ('anh.tuan@outlook.com', 'tuan.a', N'Trương Anh Tuấn', 3, 9, '2024-05-20'),
    ('quynh.huong@gmail.com', 'huong.q', N'Nguyễn Quỳnh Hương', 4, 2, '2024-06-01'),
    ('gia.bao@vku.udn.vn', 'bao.g', N'Lý Gia Bảo', 5, 1, '2024-06-10'),
    ('minh.hang@gmail.com', 'hang.m', N'Võ Minh Hằng', NULL, 7, '2024-06-15'),
    ('thanh.nam@outlook.com', 'nam.th', N'Trần Thanh Nam', 7, NULL, '2024-07-01'),
    ('hong.ngoc@gmail.com', 'ngoc.h', N'Phan Hồng Ngọc', 8, 3, '2024-07-05'),
    ('viet.anh@vku.udn.vn', 'anh.v', N'Hoàng Việt Anh', 9, 1, '2024-07-10');
    
    
INSERT INTO `Group` (GroupName, AccountID, CreateDate)
VALUES
    (N'Cộng đồng Java Việt Nam', 1, '2024-01-10'),
    (N'Hội yêu thích SQL', 2, '2024-01-15'),
    (N'Nhóm học Python VKU', 3, '2024-02-01'),
    (N'CLB Thể thao Da Nang', NULL, '2024-02-10'), -- Group chưa có người quản lý
    (N'Team Project AI', 5, '2024-02-20'),
    (N'Hội nghiện FC Online', 6, '2024-03-01'),
    (N'Góc học tập TOEIC', NULL, '2024-03-10'),  -- Group hệ thống tự tạo (NULL)
    (N'Kỹ năng mềm 101', 8, '2024-03-15'),
    (N'Tuyển dụng IT miền Trung', 9, '2024-03-20'),
    (N'Testing & QA Group', NULL, '2024-04-01');  -- Group đang chờ Admin
    
    
INSERT INTO GroupAccount (GroupID, AccountID, JoinDate)
VALUES
    (1, 1, '2024-01-11'), -- Nam tham gia Java VN
    (1, 2, '2024-01-12'), -- Hoang tham gia Java VN
    (2, 2, '2024-01-16'), -- Hoang tham gia Hội SQL
    (3, 3, '2024-02-02'), -- Lan Anh tham gia Python VKU
    (3, 1, '2024-02-05'), -- Nam tham gia thêm Python VKU
    (5, 5, '2024-02-21'), -- Thao tham gia Project AI
    (6, 6, '2024-03-02'), -- Thinh tham gia FC Online
    (6, 1, '2024-03-05'), -- Nam cũng nghiện FC Online
    (8, 8, '2024-03-16'), -- Tung tham gia Kỹ năng mềm
    (9, 9, '2024-03-21'); -- Ngoc tham gia Tuyển dụng IT
    
INSERT INTO TypeQuestion (TypeName) 
VALUES 
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice'),
    ('Essay'), ('Multiple-Choice');
    
INSERT INTO CategoryQuestion (CategoryName) 
VALUES 
    ('Java'),
    ('Python'),
    ('C++'),
    ('SQL'),
    ('PostgreSQL'),
    ('HTML'),
    ('CSS'),
    ('JavaScript'),
    ('ReactJS'),
    ('Spring Boot'),
    ('NodeJS'),
    ('Docker'),
    ('Redis'),
    ('Machine Learning'),
    ('Data Science'),
    ('AI'),
    ('Git'),
    ('Linux'),
    ('AWS'),
    ('C#');
    
INSERT INTO Question (Content, AccountID, TypeID, CategoryID, CreateDate)
VALUES
    (N'Java là gì?', 1, 1, 1, '2024-01-01'),
    (N'Cách khai báo biến trong Python?', 2, 2, 2, '2024-01-02'),
    (N'SQL stands for?', 3, 2, 4, '2024-01-05'),
    (N'Định nghĩa tính đóng gói trong OOP?', 5, 1, 1, '2024-01-10'),
    (N'Lợi ích của Docker là gì?', NULL, 1, 12, '2024-01-15'), -- NULL AccountID
    (N'Cú pháp vòng lặp for trong C++?', 6, 2, 3, '2024-02-01'),
    (N'Spring Boot dùng để làm gì?', 8, NULL, 10, '2024-02-05'), -- NULL TypeID
    (N'Cách tạo table trong MySQL?', 9, 2, 4, '2024-02-10'),
    (N'Sự khác biệt giữa Let và Var?', 1, 1, 8, '2024-02-15'),
    (N'Tại sao nên dùng Redis?', NULL, NULL, 13, '2024-02-20'), -- NULL cả Account & Type
    (N'HTML là ngôn ngữ lập trình đúng không?', 12, 2, 6, '2024-03-01'),
    (N'Câu hỏi chưa có chủ đề 1', 13, 1, NULL, '2024-03-05'), -- NULL CategoryID
    (N'Cách sử dụng Git Clone?', 15, 2, 17, '2024-03-10'),
    (N'Machine Learning cơ bản?', 16, 1, 14, '2024-03-12'),
    (N'Câu hỏi bí ẩn', NULL, NULL, NULL, '2024-03-15'), -- NULL tất cả khóa ngoại
    (N'React Hooks là gì?', 1, 1, 9, '2024-03-20'),
    (N'NodeJS chạy trên môi trường nào?', 2, 2, 11, '2024-03-25'),
    (N'Câu hỏi chưa có chủ đề 2', 5, 2, NULL, '2024-03-28'), -- NULL CategoryID
    (N'Lệnh xóa thư mục trong Linux?', 18, 1, 18, '2024-04-01'),
    (N'Đặc điểm của AWS S3?', 20, 1, 19, '2024-04-05');
    
INSERT INTO Answer (Content, QuestionID, isCorrect)
VALUES
    (N'Java là ngôn ngữ lập trình hướng đối tượng.', 1, 1), -- Đúng cho Q1
    (N'Java là một hệ điều hành.', 1, 0), -- Sai cho Q1
    (N'Dùng từ khóa var, let hoặc const.', 2, 0), -- Câu này của JS nhưng gán nhầm vào Q2 (Python)
    (N'Dùng tên_biến = giá trị.', 2, 1), -- Đúng cho Q2
    (N'Structured Query Language', 3, 1), -- Đúng cho Q3
    (N'Hệ quản trị cơ sở dữ liệu', 3, 0), -- Sai cho Q3
    (N'Là việc che giấu thông tin và chi tiết cài đặt.', 4, 1), -- Đúng cho Q4
    (N'Giúp đóng gói hàng hóa nhanh hơn.', 4, 0), -- Sai cho Q4
    (N'Rút ngắn thời gian triển khai phần mềm.', 5, 1), -- Đúng cho Q5
    (N'Một loại hải sản.', 5, 0), -- Sai cho Q5
    (N'Câu trả lời chưa biết thuộc về câu hỏi nào 1', NULL, 0), -- NULL QuestionID
    (N'Sử dụng vòng lặp for(int i=0; i<n; i++)', 6, 1), -- Đúng cho Q6
    (N'Sử dụng vòng lặp while true.', 6, 0), -- Sai cho Q6
    (N'Câu trả lời chưa biết thuộc về câu hỏi nào 2', NULL, 1), -- NULL QuestionID
    (N'Giúp tạo project Spring nhanh chóng.', 7, 1), -- Đúng cho Q7
    (N'Là một loại giày chạy bộ.', 7, 0), -- Sai cho Q7
    (N'Dùng lệnh CREATE TABLE name...', 8, 1), -- Đúng cho Q8
    (N'Dùng lệnh MAKE TABLE name...', 8, 0), -- Sai cho Q8
    (N'Câu trả lời hệ thống tự tạo', NULL, 0), -- NULL QuestionID
    (N'Let có phạm vi block, Var có phạm vi function.', 9, 1); -- Đúng cho Q9

INSERT INTO Exam (`Code`, Title, CategoryID, Duration, AccountID, CreateDate)
VALUES
    ('VTI001', N'Đề thi Java cơ bản', 1, 60, 1, '2024-01-10 08:00:00'),
    ('VTI002', N'Đề thi Python nâng cao', 2, 90, 2, '2024-01-12 09:30:00'),
    ('VTI003', N'Trắc nghiệm SQL cơ bản', 4, 45, 3, '2024-01-15 14:00:00'),
    ('VTI004', N'Kiến thức Docker & Container', 12, 60, NULL, '2024-01-20 10:00:00'), -- NULL Account
    ('VTI005', N'Lập trình Web với ReactJS', 9, 120, 5, '2024-01-25 13:00:00'),
    ('VTI006', N'Data Science Quiz 01', 15, 60, 6, '2024-02-01 08:00:00'),
    ('VTI007', N'Linux Command Line Basics', 18, 30, NULL, '2024-02-05 15:30:00'), -- NULL Account
    ('VTI008', N'AWS Cloud Practitioner Prep', 19, 90, 8, '2024-02-10 09:00:00'),
    ('VTI009', N'Git & Version Control Expert', 17, 45, 9, '2024-02-15 10:30:00'),
    ('VTI010', N'C# & .NET Core Backend', 20, 60, 10, '2024-02-20 14:00:00'),
    ('VTI011', N'Cấu trúc dữ liệu và giải thuật', 1, 120, 1, '2024-02-25 08:00:00'),
    ('VTI012', N'NodeJS & Express Framework', 11, 90, 12, '2024-03-01 13:00:00'),
    ('VTI013', N'Cơ bản về Machine Learning', 14, 60, NULL, '2024-03-05 10:00:00'), -- NULL Account
    ('VTI014', N'Thiết kế giao diện với CSS', 7, 45, 14, '2024-03-10 09:30:00'),
    ('VTI015', N'Quản trị cơ sở dữ liệu Postgres', 5, 60, 15, '2024-03-12 14:00:00'),
    ('VTI016', N'Kiến thức AI tổng hợp', 16, 90, NULL, '2024-03-15 16:00:00'), -- NULL Account
    ('VTI017', N'JavaScript ES6+ New Features', 8, 60, 17, '2024-03-20 08:30:00'),
    ('VTI018', N'Spring Boot Microservices', 10, 120, 1, '2024-03-25 13:00:00'),
    ('VTI019', N'Sử dụng Redis trong dự án', 13, 30, 19, '2024-03-28 10:00:00'),
    ('VTI020', N'HTML5 & Web Accessibility', 6, 45, NULL, '2024-04-01 09:00:00'); -- NULL Account
INSERT INTO ExamQuestion (ExamID, QuestionID)
VALUES
    (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), -- Đề 1: 5 câu
    (2, 6), (2, 7), (2, 8), (2, 9),         -- Đề 2: 4 câu
    (3, 10), (3, 11), (3, 12),              -- Đề 3: 3 câu
    (4, 13), (4, 14),                       -- Đề 4: 2 câu
    (5, 15), (5, 16),                       -- Đề 5: 2 câu
    (6, 17), (6, 18),                       -- Đề 6: 2 câu
    (7, 19),                                -- Đề 7: 1 câu
    (8, 20),                                -- Đề 8: 1 câu
    -- Chèn thêm cho đủ 20 dòng
    (9, 1), (9, 3),                         -- Đề 9: 2 câu (lấy lại câu cũ)
    (10, 2), (10, 4);                       -- Đề 10: 2 câu
    
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 
select * from `Account` as acc
inner join Department as de 
on acc.DepartmentID=de.DepartmentID;


-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010  
select * from `Account` as acc
where CreateDate > '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer  
select acc.*,po.PositionName from `account` as acc
inner join position as po
on acc.PositionID=po.PositionID
where po.PositionName='Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES
    ('minh.tuan@vku.udn.vn', 'tuan.minh', N'Nguyễn Minh Tuấn', 1, 1, '2023-11-15'), -- Thêm vào Sale
    ('thuy.duong@gmail.com', 'duong.thuy', N'Hoàng Thúy Dương', 1, 3, '2023-12-20'), -- Thêm vào Sale
    ('anh.khoa@outlook.com', 'khoa.anh', N'Lê Anh Khoa', 3, 1, '2024-01-10'),      -- Thêm vào Kỹ thuật
    ('ngoc.huyen@vku.udn.vn', 'huyen.ngoc', N'Vũ Ngọc Huyền', 3, 2, '2023-05-25'),  -- Thêm vào Kỹ thuật
    ('duy.manh@gmail.com', 'manh.duy', N'Đỗ Duy Mạnh', 3, 8, '2024-02-14'),        -- Thêm vào Kỹ thuật
    ('thanh.hang@outlook.com', 'hang.thanh', N'Nguyễn Thanh Hằng', 3, 1, '2023-08-05'), -- Thêm vào Kỹ thuật
    ('quoc.bao@vku.udn.vn', 'bao.quoc', N'Trần Quốc Bảo', 2, 4, '2023-09-12'),
    ('thu.huong@gmail.com', 'huong.thu', N'Phạm Thu Hương', 4, 7, '2024-01-05'),
    ('van.quyet@outlook.com', 'quyet.van', N'Trịnh Văn Quyết', 6, 9, '2023-11-30'),
    ('thao.nguyen@vku.udn.vn', 'nguyen.thao', N'Đặng Thảo Nguyên', 1, 2, '2023-07-22'); -- Thêm vào Sale
select de.DepartmentID, de.DepartmentName, count(acc.AccountID) from department as de
inner join `account` as acc
on de.DepartmentID=acc.DepartmentID
group by  de.DepartmentID, de.DepartmentName
having count(acc.AccountID)>3;

--  Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất 

SELECT 
    Q.QuestionID, 
    Q.Content, 
    COUNT(EQ.QuestionID) AS SoLanDung
FROM Question Q
JOIN ExamQuestion EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY Q.QuestionID, Q.Content
HAVING SoLanDung = (
    -- Đây là "vòng trong" để tìm con số lớn nhất
    SELECT COUNT(QuestionID) 
    FROM ExamQuestion 
    GROUP BY QuestionID 
    ORDER BY COUNT(QuestionID) DESC 
    LIMIT 1
);

-- 6 Thông kê mỗi category Question được sử dụng trong bao nhiêu Question 
SELECT 
    cate.CategoryName, 
    COUNT(Q.QuestionID) AS SoLuongCauHoi
FROM CategoryQuestion AS cate 
LEFT JOIN Question AS Q ON cate.CategoryID = Q.CategoryID
GROUP BY cate.CategoryID, cate.CategoryName;

 






-- 7 Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 
select qe.QuestionID, qe.content,count(exa.ExamID) as 'Số lần xuất hiện trong Exam' from question as qe
inner join examquestion as ex 
on qe.QuestionID =ex.QuestionID
inner join exam as exa
on ex .ExamID =exa.ExamID  
group by  qe.QuestionID,qe.content;

SELECT 
    Q.QuestionID, 
    Q.Content, 
    COUNT(EQ.ExamID) AS SoLuongDeThi
FROM Question AS Q
LEFT JOIN ExamQuestion AS EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY Q.QuestionID, Q.Content;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 

INSERT INTO Answer (Content, QuestionID, isCorrect)
VALUES
    (N'Python dùng thụt lề để phân chia block code.', 2, 1),
    (N'Python là ngôn ngữ kịch bản mạnh mẽ.', 2, 0),
    (N'SQL là ngôn ngữ truy vấn mang tính khai báo.', 3, 1),
    (N'C++ hỗ trợ con trỏ và quản lý bộ nhớ thủ công.', 4, 1),
    (N'Tính đóng gói giúp bảo vệ dữ liệu bên trong class.', 4, 0),
    (N'Docker giúp đóng gói ứng dụng vào container.', 5, 1),
    (N'Container nhẹ hơn máy ảo (VM).', 5, 0),
    (N'Spring Boot giúp cấu hình dự án nhanh hơn.', 7, 1),
    (N'MySQL là hệ quản trị cơ sở dữ liệu quan hệ.', 8, 1),
    (N'Redis lưu trữ dữ liệu trên RAM để tăng tốc độ.', 8, 0);
INSERT INTO Answer (Content, QuestionID, isCorrect)
VALUES (N'Python hỗ trợ cả lập trình hướng đối tượng và lập trình hàm.', 2, 1);

-- tìm ra số câu trả lời theo câu hỏi
select QuestionID,count(AnswerID) as 'số câu trả lời theo câu hỏi' from answer

group by QuestionID;

SELECT 
    Q.QuestionID, 
    Q.Content, 
    COUNT(Asw.AnswerID) AS SoLuongTraLoi 
FROM Question AS Q
INNER JOIN Answer AS Asw ON Q.QuestionID = Asw.QuestionID
GROUP BY Q.QuestionID, Q.Content
having SoLuongTraLoi  =(
SELECT COUNT(AnswerID) 
    FROM Answer 
    GROUP BY QuestionID 
    ORDER BY COUNT(AnswerID) DESC 
    LIMIT 1);


SELECT COUNT(AnswerID) 
    FROM Answer 
    GROUP BY QuestionID 
    ORDER BY COUNT(AnswerID) DESC 
    LIMIT 1;

-- Question 9: Thống kê số lượng account trong mỗi group  
select * from `group`;

select GroupID, count(AccountID) as SoLuongAccount 
from groupaccount 
group by GroupID;

SELECT 
    G.GroupName, 
    COUNT(GA.AccountID) AS SoLuongAccount
FROM `group` G
LEFT JOIN groupaccount GA ON G.GroupID = GA.GroupID
GROUP BY G.GroupID, G.GroupName;
-- Question 10: Tìm chức vụ có ít người nhất em chưa biết làm
 
 
 select po.PositionName,count(acc.AccountID) soluongnhanvien from position as po 
 left join `account` as acc 
 on po.PositionID=acc.PositionID
 group by po.PositionName
 having soluongnhanvien=( select count(AccountID) soluongnhanvien from `account` 
 group by  PositionID 
 order by soluongnhanvien asc 
 limit 1);
 


SELECT 
    p.PositionName, 
    COUNT(a.AccountID) AS SoLuongNhanVien
FROM Position p
LEFT JOIN Account a ON p.PositionID = a.PositionID
GROUP BY p.PositionID
HAVING SoLuongNhanVien = (
    -- Tầng lõi: Tìm xem con số ít người nhất là bao nhiêu
    SELECT COUNT(AccountID) 
    FROM Account 
    GROUP BY PositionID 
    ORDER BY COUNT(AccountID) ASC 
    LIMIT 1
);
 -- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM   

select dp.DepartmentID,dp.DepartmentName,po.PositionName,count(po.PositionID) as soluongnhanvien from department as dp
left join `account` as acc
on dp.DepartmentID =acc.DepartmentID
left join position as po
on acc.PositionID =po.PositionID
group by dp.DepartmentID,dp.DepartmentName,po.PositionName;
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm:
--  thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … 
select qe.QuestionID,qe.Content,ty.TypeName,acc.FullName,Answ.Content from question as qe
inner join typequestion as ty
on qe.TypeID=ty.TypeID
inner join `account` as acc
on qe.AccountID=acc.AccountID
left JOIN Answer AS Answ 
ON qe.QuestionID = Answ.QuestionID;





SELECT 
    Q.QuestionID, 
    Q.Content AS Noi_Dung_Cau_Hoi, 
    TQ.TypeName AS Loai_Cau_Hoi, 
    A.FullName AS Nguoi_Tao, 
    Answ.Content AS Dap_An
FROM Question Q
-- 1. Nối với TypeQuestion để biết Tự luận hay Trắc nghiệm
INNER JOIN TypeQuestion TQ ON Q.TypeID = TQ.TypeID
-- 2. Nối với Account để lấy tên người tạo
inner JOIN Account A ON Q.CreatorID = A.AccountID
-- 3. Nối với Answer để lấy nội dung câu trả lời
left JOIN Answer Answ ON Q.QuestionID = Answ.QuestionID;

SELECT 
    Q.QuestionID, 
    Q.Content AS Noi_Dung_Cau_Hoi, 
    TQ.TypeName AS Loai_Cau_Hoi, 
    A.FullName AS Nguoi_Tao, 
    Answ.Content AS Dap_An
FROM Question Q
-- 1. Nối với TypeQuestion để biết Tự luận hay Trắc nghiệm
INNER JOIN TypeQuestion TQ ON Q.TypeID = TQ.TypeID
-- 2. Nối với Account để lấy tên người tạo
INNER JOIN Account A ON Q.AccountID = A.AccountID
-- 3. Nối với Answer để lấy nội dung câu trả lời
INNER JOIN Answer Answ ON Q.QuestionID = Answ.QuestionID;

SELECT 
    Q.QuestionID, 
    Q.Content AS NoiDungCauHoi, 
    TQ.TypeName AS LoaiCauHoi, 
    Acc.FullName AS NguoiTao, 
    Answ.Content AS NoiDungTraLoi
FROM Question AS Q
INNER JOIN TypeQuestion AS TQ ON Q.TypeID = TQ.TypeID
INNER JOIN Account AS Acc ON Q.AccountID = Acc.AccountID
INNER JOIN Answer AS Answ ON Q.QuestionID = Answ.QuestionID;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm 
select TQ.typeID,TQ.TypeName AS LoaiCauHoi,Q.QuestionID, count(Q.QuestionID) as 'soluongcauhoi' from  TypeQuestion AS TQ 
left join Question AS Q
on Q.TypeID = TQ.TypeID
group by TQ.typeID,TQ.TypeName,Q.QuestionID;

-- Question 14:Lấy ra group không có account nào  Question 15: Lấy ra group không có account nào 
SELECT 
    G.GroupID, 
    G.GroupName 
FROM `Group` AS G
LEFT JOIN GroupAccount AS GA ON G.GroupID = GA.GroupID
WHERE GA.AccountID IS NULL;

-- Question 16: Lấy ra question không có answer nào 
SELECT 
    Q.QuestionID, 
    Q.Content 
FROM Question AS Q
LEFT JOIN Answer AS A ON Q.QuestionID = A.QuestionID
WHERE A.AnswerID IS NULL;


-- Question 17: Ghép Account nhóm 1 và nhóm 2 (Không trùng)
-- a) Lấy account thuộc nhóm 1
SELECT AccountID 
FROM GroupAccount 
WHERE GroupID = 1

UNION -- Phép ghép giúp loại bỏ bản ghi trùng nhau

-- b) Lấy account thuộc nhóm 2
SELECT AccountID 
FROM GroupAccount 
WHERE GroupID = 2;
-- Question 18: Ghép Group có số lượng thành viên đặc biệt

-- a) Lấy các group có > 5 thành viên
SELECT GroupID, COUNT(AccountID) AS SoLuong
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) > 5

UNION -- Ghép lại (những nhóm có 6 thành viên thỏa cả 2 bên sẽ chỉ hiện 1 lần)

-- b) Lấy các group có < 7 thành viên
SELECT GroupID, COUNT(AccountID) AS SoLuong
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) < 7;



create view layall_phongban as
select * from department;

select * from layall_phongban;


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
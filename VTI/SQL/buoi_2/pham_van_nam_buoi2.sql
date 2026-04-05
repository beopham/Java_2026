create database pham_van_nam_buoi2;
use pham_van_nam_buoi2;
-- Exercise 1: Tiếp tục với Database Testing System 
-- Question 1: Tối ưu lại Assignment trước và thêm các constraints phù hợp cho các bảng (nếu cần)
-- Table 1:Department  
-- DepartmentID:  định danh của phòng ban (auto increment) 
-- DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …) 
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
constraint 		fk_DepartmentID  foreign key(DepartmentID) references Department(DepartmentID),
constraint 		fk_PositionID  foreign key(PositionID) references `Position`(PositionID)
);

-- Table 4: Group  
-- GroupID:  định danh của nhóm (auto increment) 
-- GroupName:  tên nhóm 
-- CreatorID: id của người tạo group 
-- CreateDate: ngày tạo group 

CREATE TABLE `Group` (
GroupID        INT NOT NULL AUTO_INCREMENT,
GroupName      VARCHAR(255) NOT NULL,
CreatorID      INT NOT NULL,
CreateDate     DATE not null,
constraint     pk_GroupID PRIMARY KEY (GroupID)
);
-- Table 5: GroupAccount  PRIMARY
-- GroupID:  định danh của nhóm 
-- AccountID:  định danh của User 
-- JoinDate: Ngày user tham gia vào nhóm 

create table GroupAccount(
GroupID        INT not null,
AccountID      int not null,
JoinDate       DATE not null,
constraint 	   pk_GroupID_AccountID primary key(GroupID,AccountID),
constraint 	   fk_GroupID foreign key(GroupID) references `Group`(GroupID),
constraint 	   fk_AccountID  foreign key(AccountID) references `Account` (AccountID)
);
-- Table 6: TypeQuestion  
-- TypeID:  định danh của loại câu hỏi (auto increment) 
-- TypeName:  tên của loại câu hỏi (Essay, Multiple-Choice) 
CREATE TABLE TypeQuestion (
TypeID         int not null AUTO_INCREMENT,                
TypeName       ENUM('Essay', 'Multiple-Choice') NOT NULL,   -- Tên loại câu hỏi (chỉ cho phép 2 giá trị này)
constraint 	   pk_TypeID primary key(TypeID)
);

-- Table 7: CategoryQuestion  
-- CategoryID:  định danh của chủ đề câu hỏi (auto increment) 
-- CategoryName:  tên của chủ đề câu hỏi (Java, .NET, SQL, Postman, Ruby, …) 
CREATE TABLE CategoryQuestion (
CategoryID     INT  not null AUTO_INCREMENT,    
CategoryName   VARCHAR(100) NOT NULL,           
constraint     pk_CategoryID primary key(CategoryID),
constraint     uq_CategoryName unique(CategoryName)
);


-- Table 8: Question  
-- QuestionID:  định danh của câu hỏi (auto increment) 
-- Content:  nội dung của câu hỏi 
-- CategoryID:  định danh của chủ đề câu hỏi 
-- TypeID:  định danh của loại câu hỏi 
-- CreatorID: id của người tạo câu hỏi 
-- CreateDate: ngày tạo câu hỏi 
create table Question (
QuestionID    int not null auto_increment,
Content       VARCHAR(255) NOT NULL,
CategoryID    INT null,
TypeID        int null ,    
CreatorID     INT NOT NULL,
CreateDate    DATE not null,
constraint 	  pk_QuestionID primary key(QuestionID), 
constraint 	  fk_CategoryID foreign key(CategoryID) references CategoryQuestion (CategoryID),
constraint 	  fk_TypeID     foreign key(TypeID)     references TypeQuestion     (TypeID)
);

-- Table 9: Answer  
-- AnswerID:  định danh của câu trả lời (auto increment) 
-- Content:  nội dung của câu trả lời 
-- QuestionID:  định danh của câu hỏi  
-- isCorrect: câu trả lời này đúng hay sai 

CREATE TABLE Answer (
AnswerID     INT AUTO_INCREMENT,
Content      TEXT NOT NULL,
QuestionID   INT  NULL,
isCorrect    BOOLEAN NOT NULL, -- Bắt buộc phải nhập khi INSERT
constraint   pk_AnswerID  primary key(AnswerID),
CONSTRAINT   FK_Question_Answer FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- Table 10: Exam  
-- ExamID:  định danh của đề thi (auto increment) 
-- Code: mã đề thi 
-- Title: tiêu đề của đề thi 
-- CategoryID:  định danh của chủ đề thi 
-- Duration: thời gian thi 
-- CreatorID: id của người tạo đề thi 
-- CreateDate: ngày tạo đề thi 


CREATE TABLE Exam (
ExamID        INT PRIMARY KEY AUTO_INCREMENT, -- Định danh đề thi, tự động tăng
`Code`        VARCHAR(20) NOT NULL UNIQUE,              -- Mã đề thi (ví dụ: VTI001)
Title         VARCHAR(255) NOT NULL,                    -- Tiêu đề đề thi
CategoryID    INT  NOT NULL,               -- Khóa ngoại trỏ về CategoryQuestion
Duration      INT  NOT NULL,             -- Thời gian thi (phút)
CreatorID     INT NOT NULL,                -- ID người tạo (trỏ về bảng Account)
CreateDate    DATETIME DEFAULT CURRENT_TIMESTAMP,  
CONSTRAINT    FK_Exam_Category FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)
);
-- Table 11: ExamQuestion  
-- ExamID:  định danh của đề thi 
-- QuestionID:  định danh của câu hỏi  


CREATE TABLE ExamQuestion (
ExamID       INT NOT NULL,
QuestionID   INT NOT NULL,
constraint pk_ExamID_QuestionID PRIMARY KEY (ExamID, QuestionID),
CONSTRAINT FK_Exam_ExamQuestion FOREIGN KEY (ExamID) REFERENCES Exam(ExamID) ,
CONSTRAINT FK_Question_ExamQuestion FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID) 
);

-- Exercise 2: Tiếp tục với Database Testing System 
-- Question 1: Thêm ít nhất 10 record vào mỗi table 
INSERT INTO Department (DepartmentName) VALUES 
('Phòng Giám Đốc'),
('Phòng Hành Chính Nhân Sự'),
('Phòng Kỹ Thuật (Engineering)'),
('Phòng Marketing'),
('Phòng Sale (Kinh doanh)'),
('Phòng Tài Chính - Kế Toán'),
('Phòng Chăm Sóc Khách Hàng'),
('Phòng R&D (Nghiên cứu & Phát triển)'),
('Phòng Đảm Bảo Chất Lượng (QA/QC)'),
('Phòng Bảo Mật Hệ Thống');
select * from Department;
INSERT INTO `Position` (PositionName) VALUES 
('Backend Developer'),
('Frontend Developer'),
('Fullstack Developer'),
('Manual Tester'),
('Automation Tester'),
('Business Analyst'),
('Scrum Master'),
('Project Manager (PM)'),
('UI/UX Designer'),
('DevOps Engineer');
select * from `Position`;
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate) VALUES
('nam.pv1@gmail.com', 'nam.pham1', 'Phạm Văn Nam 1', 1, 1, '2023-05-10'),
('linh.nt@gmail.com',  'linh.nguyen', 'Nguyễn Thùy Linh', 2, 2, '2023-05-12'),
('hung.dv@gmail.com',  'hung.dang', 'Đặng Việt Hùng', 3, 3, '2023-06-01'),
('an.lt@gmail.com',    'an.le', 'Lê Thị An', 4, 4, '2023-06-05'),
('minh.hoang@gmail.com','minh.hoang', 'Hoàng Nhật Minh', 5, 5, '2023-06-15'),
('tuan.anh@gmail.com', 'tuan.anh', 'Trần Tuấn Anh', 6, 6, '2023-07-01'),
('huong.mai@gmail.com', 'huong.mai', 'Vũ Mai Hương', 7, 7, '2023-07-10'),
('loc.duc@gmail.com',  'loc.duc', 'Phan Đức Lộc', 8, 8, '2023-08-15'),
('thao.phuong@gmail.com','thao.phuong', 'Trịnh Phương Thảo', 9, 9, '2023-09-01'),
('huy.quang@gmail.com', 'huy.quang', 'Ngô Quang Huy', 10, 10, '2023-09-20');
select * from  `Account`;


INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES
('Nhóm Phát Triển Java', 1, '2023-03-01'),
('Hội Anh Em Tester', 2, '2023-03-05'),
('Biệt Đội Scrum Master', 3, '2023-03-10'),
('Team Dự Án Fintech', 4, '2023-03-15'),
('Nhóm Marketing Online', 5, '2023-03-20'),
('CLB Cầu Lông Công Ty', 6, '2023-04-01'),
('Hội Thảo Luận SQL', 7, '2023-04-05'),
('Nhóm Học Tiếng Anh', 8, '2023-04-10'),
('Team Support Khách Hàng', 9, '2023-04-15'),
('Ban Quản Trị Hệ Thống', 10, '2023-04-20');
 select * from  `Group`;

INSERT INTO GroupAccount (GroupID, AccountID, JoinDate) VALUES
(1, 1, '2015-01-10'),
(2, 2, '2016-02-15'),
(3, 3, '2017-03-20'),
(4, 4, '2018-04-25'),
(5, 5, '2019-05-30'),
(6, 6, '2020-06-05'),
(7, 7, '2021-07-10'),
(8, 8, '2022-08-15'),
(9, 9, '2023-09-20'),
(10, 10, '2024-10-25');

 select * from  GroupAccount;
 
 INSERT INTO TypeQuestion (TypeName) VALUES 
('Essay'),
('Multiple-Choice'),
('Essay'),
('Multiple-Choice'),
('Essay'),
('Multiple-Choice'),
('Essay'),
('Multiple-Choice'),
('Essay'),
('Multiple-Choice');
 select * from  TypeQuestion ;
INSERT INTO CategoryQuestion (CategoryName) VALUES 
('Java'), 
('.NET'), 
('SQL'), 
('Postman'), 
('Ruby'), 
('Python'), 
('C++'), 
('AWS'), 
('Docker'), 
('Git');
 select * from CategoryQuestion;
 
 
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate) VALUES 
('Java: Phân biệt JDK và JRE?', 1, 1, 1, '2021-01-15'),
('.NET: Ý nghĩa của CLR là gì?', 2, 2, 2, '2021-05-20'),
('SQL: Trình bày về Inner Join?', 3, 3, 3, '2022-02-10'),
('Postman: Cách tạo một Collection?', 4, 4, 4, '2022-08-12'),
('Ruby: Tại sao gọi là ngôn ngữ kịch bản?', 5, 5, 5, '2023-01-05'),
('Python: List khác gì Tuple?', 6, 6, 6, '2023-06-25'),
('C++: Con trỏ (Pointer) dùng làm gì?', 7, 7, 7, '2024-03-14'),
('AWS: S3 dùng để lưu trữ gì?', 8, 8, 8, '2024-09-30'),
('Docker: Container và Image khác gì nhau?', 9, 9, 9, '2025-01-20'),
('Git: Lệnh Merge dùng khi nào?', 10, 10, 10, '2025-03-15');


 select * from Question;
 
 
 INSERT INTO Answer (Content, QuestionID, isCorrect) VALUES 
('JDK bao gồm JRE và các công cụ phát triển như trình biên dịch.', 1, 1),
('CLR là thành phần quản lý việc thực thi các chương trình .NET.', 2, 1),
('Inner Join trả về các bản ghi có giá trị khớp ở cả hai bảng.', 3, 1),
('Collection là một nhóm các API request được tổ chức cùng nhau.', 4, 1),
('Ruby không phải là ngôn ngữ kịch bản (Sai).', 5, 0),
('List trong Python có thể thay đổi, còn Tuple thì không.', 6, 1),
('Con trỏ dùng để lưu trữ địa chỉ của một biến khác.', 7, 1),
('S3 chỉ dùng để chạy code (Sai, nó dùng để lưu trữ dữ liệu).', 8, 0),
('Image là bản đóng gói, Container là một instance đang chạy.', 9, 1),
('Merge dùng để gộp các thay đổi từ nhánh này sang nhánh khác.', 10, 1);

 select * from Answer;
 
 
 INSERT INTO Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES 
('VTI001', 'Đề thi Java Cơ Bản', 1, 60, 1, '2023-01-10 08:30:00'),
('VTI002', 'Kiểm tra .NET Nâng Cao', 2, 90, 2, '2023-05-15 10:00:00'),
('VTI003', 'Truy vấn SQL Thực Chiến', 3, 45, 3, '2023-11-20 14:00:00'),
('VTI004', 'Kiến thức Postman cơ bản', 4, 30, 4, '2024-02-10 09:15:00'),
('VTI005', 'Lập trình Ruby on Rails', 5, 120, 5, '2024-04-05 13:30:00'),
('VTI006', 'Python cho người mới', 6, 60, 6, '2024-07-22 16:45:00'),
('VTI007', 'C++ Cấu trúc dữ liệu', 7, 90, 7, '2024-10-12 08:00:00'),
('VTI008', 'Dịch vụ lưu trữ AWS', 8, 45, 8, '2025-01-05 11:20:00'),
('VTI009', 'Docker và Microservices', 9, 60, 9, '2025-02-18 15:10:00'),
('VTI010', 'Quản lý mã nguồn với Git', 10, 15, 10, '2025-03-25 10:00:00');

 select * from Exam;
 
 INSERT INTO ExamQuestion (ExamID, QuestionID) VALUES 
(1, 1),  
(2, 2),   
(3, 3),   
(4, 4), 
(5, 5), 
(6, 6), 
(7, 7), 
(8, 8), 
(9, 9), 
(10, 10);

select * from ExamQuestion;

-- Question 2: Lấy ra tất cả các phòng ban 
select * from Department;

-- Question 3: Lấy ra id của phòng ban "Sale" 
select DepartmentID from Department where DepartmentName in('Phòng Sale (Kinh doanh)');

-- Question 4: Lấy ra thông tin account có full name dài nhất 
select * from `Account`
order by length(FullName) DESC
limit 1;
SELECT * FROM `Account`
WHERE LENGTH(FullName) = (SELECT MAX(LENGTH(FullName)) FROM `Account` where DepartmentID =3)  ;
-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id  = 3 
select * from `Account`
where DepartmentID =3
order by length(FullName) DESC
limit 1;

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019 
-- em k biết làm

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời 
SELECT QuestionID,COUNT(AnswerID)
FROM Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID) >= 4;
-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 

SELECT `Code`
FROM Exam
WHERE Duration >= 60 AND CreateDate < '2019-12-20';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất 
SELECT * FROM `Group`
ORDER BY CreateDate DESC
LIMIT 5;
-- Question 10: Đếm số nhân viên thuộc department có id = 2 
SELECT COUNT(*) AS SoNhanVien
FROM `Account`
WHERE DepartmentID = 2;


-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" 
SELECT * FROM `Account`
WHERE FullName LIKE 'D%o';
-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019 
delete from exam 
where CreateDate < '2019-12-20';

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" 

DELETE FROM Question 
WHERE Content LIKE 'câu hỏi%';
-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE `Account` 
SET FullName = 'Nguyễn Bá Lộc', 
    Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4 

UPDATE GroupAccount 
SET GroupID = 4 
WHERE AccountID = 5;
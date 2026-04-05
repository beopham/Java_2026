use VTI_buoi_1;
-- Table 4: Group  
-- GroupID:  định danh của nhóm (auto increment) 
-- GroupName:  tên nhóm 
-- CreatorID: id của người tạo group 
-- CreateDate: ngày tạo group 

create table `Group`(
 GroupID int auto_increment ,
 GroupName varchar(200) ,
 CreatorID int ,
 CreateDate date,
 constraint pk_group_id primary key( GroupID)
);

-- thêm 5 dòng dữ liệu vào bảng Group
-- vì có  auto_increment tăng tự động r nên e chỉ điền 3 cội thôi
insert into `Group`(GroupName,CreatorID,CreateDate)
values("GR1",1,"2026-02-02"),
	  ("GR2",2,"2026-10-01"),
	  ("GR3",3,"2022-10-11"),
	  ("GR4",4,"2022-05-12"),
      ("GR4",5,"2021-03-05");
      
select * from `Group`;
-- xóa dữ liệu có id =1
delete from `Group` where  GroupID =1;
select * from `Group`;
-- thay đổi tên của group 2 thành nam 
update `Group` set  GroupName  ="Nam" where  GroupID =2;
select * from `Group`;

-- Table 5: GroupAccount  
-- GroupID:  định danh của nhóm 
-- AccountID:  định danh của User 
-- JoinDate: Ngày user tham gia vào nhóm 
create table  GroupAccount (
 GroupID int auto_increment ,
  AccountID int ,
  JoinDate date ,
  constraint pk_group_id primary key( GroupID)
);

INSERT INTO GroupAccount (AccountID, JoinDate) 
VALUES 
(101, '2026-01-15'),
(102, '2026-02-10'),
(103, '2026-02-25'),
(104, '2026-03-05'),
(105, '2026-03-12');

select * from GroupAccount;
-- xóa 1 dòng có GroupID = 1;
DELETE FROM GroupAccount 
WHERE GroupID = 1;
select * from GroupAccount;
UPDATE GroupAccount 
SET JoinDate = '2026-03-26' 
WHERE GroupID = 2;

select * from GroupAccount;

-- Table 6: TypeQuestion  
-- TypeID:  định danh của loại câu hỏi (auto increment) 
-- TypeName:  tên của loại câu hỏi (Essay, Multiple-Choice) 

create table  TypeQuestion(
TypeID int auto_increment,
TypeName enum("Essay", "Multiple-Choice") ,
constraint pk_typeid primary key(TypeID)
);
INSERT INTO TypeQuestion (TypeName) 
VALUES 
('Essay'), 
('Multiple-Choice'), 
('Essay'), 
('Multiple-Choice'), 
('Essay');
select * from TypeQuestion;
UPDATE TypeQuestion 
SET TypeName = 'Multiple-Choice' 
WHERE TypeID = 1;
select * from TypeQuestion;


-- Table 7: CategoryQuestion  
-- CategoryID:  định danh của chủ đề câu hỏi (auto increment) 
-- CategoryName:  tên của chủ đề câu hỏi (Java, .NET, SQL, Postman, Ruby, …) 


CREATE TABLE CategoryQuestion (
    CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName ENUM('Java', '.NET', 'SQL', 'Postman', 'Ruby')
);

INSERT INTO CategoryQuestion (CategoryName) 
VALUES 
('Java'), 
('.NET'), 
('SQL'), 
('Postman'), 
('Ruby');

UPDATE CategoryQuestion 
SET CategoryName = '.Net' 
WHERE CategoryID = 4;

DELETE FROM CategoryQuestion 
WHERE CategoryID = 5;
select * from CategoryQuestion;

-- Table 8: Question  
-- QuestionID:  định danh của câu hỏi (auto increment) 
-- Content:  nội dung của câu hỏi 
-- CategoryID:  định danh của chủ đề câu hỏi 
-- TypeID:  định danh của loại câu hỏi 
-- CreatorID: id của người tạo câu hỏi 
-- CreateDate: ngày tạo câu hỏi 

CREATE TABLE Question (
    QuestionID INT AUTO_INCREMENT PRIMARY KEY,
    Content VARCHAR(500) ,
    CategoryID INT,
    TypeID INT,
    CreatorID INT,
    CreateDate DATE
);

INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate) 
VALUES 
('Java là gì?', 1, 1, 101, '2026-03-20'),
('SQL có mấy loại Join?', 3, 2, 102, '2026-03-21'),
('Tính đóng gói trong OOP?', 1, 1, 101, '2026-03-22'),
('Postman dùng để làm gì?', 4, 1, 103, '2026-03-23'),
('Ruby on Rails là Framework của ngôn ngữ nào?', 5, 2, 104, '2026-03-24');

UPDATE Question 
SET Content = 'Cách tạo Collection trong Postman?' 
WHERE QuestionID = 4;
DELETE FROM Question 
WHERE QuestionID = 5;
select * from  Question ;


-- Table 9: Answer  
-- AnswerID:  định danh của câu trả lời (auto increment) 
-- Content:  nội dung của câu trả lời 
-- QuestionID:  định danh của câu hỏi  
-- isCorrect: câu trả lời này đúng hay sai 

CREATE TABLE Answer (
    AnswerID INT AUTO_INCREMENT PRIMARY KEY,
    Content VARCHAR(500) ,
    QuestionID INT,
    isCorrect TINYINT -- 1: Đúng, 0: Sai
);

-- Thêm 5 dòng dữ liệu cho Answer
INSERT INTO Answer (Content, QuestionID, isCorrect) 
VALUES 
('Java là ngôn ngữ lập trình hướng đối tượng', 1, 1),
('Java là một loại cà phê', 1, 0),
('Inner Join, Left Join, Right Join', 2, 1),
('Chỉ có duy nhất một loại Join', 2, 0),
('Interface dùng để định nghĩa bộ khung', 3, 1);

-- Update: Sửa nội dung câu trả lời số 2
UPDATE Answer SET Content = 'Java là ngôn ngữ lập trình bậc cao' WHERE AnswerID = 2;

-- Delete: Xóa câu trả lời số 4
DELETE FROM Answer WHERE AnswerID = 4;

select *from Answer;

-- Table 10: Exam  
-- ExamID:  định danh của đề thi (auto increment) 
-- Code: mã đề thi 
-- Title: tiêu đề của đề thi 
-- CategoryID:  định danh của chủ đề thi 
-- Duration: thời gian thi 
-- CreatorID: id của người tạo đề thi 
-- CreateDate: ngày tạo đề thi 
-- Table 11: ExamQuestion  
-- ExamID:  định danh của đề thi 
-- QuestionID:  định danh của câu hỏi  

CREATE TABLE Exam (
    ExamID INT AUTO_INCREMENT PRIMARY KEY,
    Code VARCHAR(20) ,
    Title VARCHAR(200),
    CategoryID INT,
    Duration INT, -- Phút
    CreatorID INT,
    CreateDate DATE
);

-- Thêm 5 dòng dữ liệu cho Exam
INSERT INTO Exam (Code, Title, CategoryID, Duration, CreatorID, CreateDate) 
VALUES 
('VTI001', 'Đề thi Java Cơ Bản', 1, 60, 101, '2026-03-26'),
('VTI002', 'Đề thi SQL Nâng Cao', 3, 45, 102, '2026-03-26'),
('VTI003', 'Đề thi .NET Framework', 2, 90, 101, '2026-03-27'),
('VTI004', 'Đề thi API Testing', 4, 60, 103, '2026-03-28'),
('VTI005', 'Đề thi Ruby on Rails', 5, 120, 104, '2026-03-29');

-- Update: Tăng thời gian thi của đề VTI001 lên 90 phút
UPDATE Exam SET Duration = 90 WHERE Code = 'VTI001';

-- Delete: Xóa đề thi VTI005
DELETE FROM Exam WHERE ExamID = 5;

select * from Exam;

-- Table 11: ExamQuestion  
-- ExamID:  định danh của đề thi 
-- QuestionID:  định danh của câu hỏi  
CREATE TABLE ExamQuestion (
    ExamID INT,
    QuestionID INT,
    PRIMARY KEY (ExamID, QuestionID) -- Khóa chính kết hợp để không bị trùng câu hỏi trong 1 đề
);

-- Thêm 5 dòng dữ liệu cho ExamQuestion
INSERT INTO ExamQuestion (ExamID, QuestionID) 
VALUES 
(1, 1),
(1, 3),
(2, 2),
(3, 1),
(4, 4);

-- Update: Đổi câu hỏi số 4 trong đề 4 thành câu hỏi số 2
UPDATE ExamQuestion SET QuestionID = 2 WHERE ExamID = 4 AND QuestionID = 4;

-- Delete: Xóa câu hỏi số 1 ra khỏi đề thi số 3
DELETE FROM ExamQuestion WHERE ExamID = 3 AND QuestionID = 1;
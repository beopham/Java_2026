create database phamvannam_buoi3;

use phamvannam_buoi3;
create table students(
students_id int not null auto_increment primary key,
students_name varchar(50) not null,
students_age int not null
);

create table courses(
courses_id int not null auto_increment primary key,
courses_name varchar(50) not null,
price  DECIMAL(10,2)not null
);

CREATE TABLE enrollments (
  enrollments_id INT PRIMARY KEY AUTO_INCREMENT,
    students_id INT null,
    courses_id INT null,
    score FLOAT,
    FOREIGN KEY (students_id) REFERENCES students(students_id),
    FOREIGN KEY (courses_id) REFERENCES courses(courses_id)
); 

INSERT INTO students (students_name,students_age) VALUES
('An', 20),
('Binh', 21),
('Cuong', 22),
('Dung', 20),
('Em', 23),
('Giang', 21),
('Huy', 22),
('Khanh', 20),
('Linh', 23),
('Minh', 21);



INSERT INTO courses (courses_name, price) VALUES
('Java', 100),
('MySQL', 80),
('Spring Boot', 120),
('React', 110),
('NodeJS', 90),
('Python', 95),
('Docker', 70),
('Kubernetes', 130),
('AWS', 150),
('DevOps', 140);

INSERT INTO enrollments (students_id, courses_id, score) VALUES
(1,1,7),
(1,2,5),
(2,1,4),
(2,3,6),
(3,2,0),
(3,4,8),
(4,1,9),
(5,3,3),
(6,5,6),
(7,6,7),
(8,7,5),
(9,8,4),
(10,9,10),
(1,10,8),
(2,5,2);


-- 3, Tăng điểm (score) thêm 1 cho những bản ghi có điểm < 5+
select * from enrollments;
UPDATE enrollments
SET score = score + 1
WHERE score < 5;
-- 4, Xóa các bản ghi trong enrollments có điểm = 0
 delete from enrollments where score =0;
-- 5,  a.Đếm số lượng sinh viên
select count(*) as'số lượng sinh viên' from students;
--   b.Tìm điểm cao nhất và thấp nhất
select max(score) from  enrollments;
select min(score) from  enrollments;
--   c.Đếm số lượng đăng ký theo từng course
select  courses_id,count(students_id) from  enrollments
group by  courses_id
;
-- SELECT 
--     c.courses_name AS 'Tên khóa học', 
--     COUNT(e.students_id) AS 'Số lượng đăng ký'
-- FROM courses c
-- LEFT JOIN enrollments e ON c.courses_id = e.courses_id
-- GROUP BY c.courses_id, c.courses_name;
--   d.Chỉ lấy những course có số lượng đăng ký >= 2
select  courses_id,count(students_id) from  enrollments
group by  courses_id
having count(students_id)>=2;
--   e.Tìm student_id có điểm trung bình > 6;

select students_id from  enrollments where avg(score) >6;


-- 1 Hiển thị toàn bộ thông tin sinh viên đăng kí học
-- 	(id sinh viên , tên, tuổi, tên khóa học, điểm tương ứng)
select stu.students_id,stu.students_name,stu.students_age,cou.courses_name,en.score from students  as stu
inner join enrollments as en 
on stu.students_id = en.students_id 
inner join courses as cou
on en.courses_id=cou.courses_id;
-- 2 lấy ra cac khóa học ko sinh viên nào dki(id khóa học, tên khóa học)

-- Xóa dữ liệu cũ để nạp lại cho chuẩn
TRUNCATE TABLE enrollments;

-- Chèn dữ liệu mới: Để trống các khóa học ID 8, 9, 10
INSERT INTO enrollments (students_id, courses_id, score) VALUES
(1, 1, 7), (1, 2, 5),
(2, 1, 4), (2, 3, 6),
(3, 2, 0), (3, 4, 8),
(4, 1, 9),
(5, 3, 3),
(6, 5, 6),
(7, 6, 7),
(8, 7, 5),
(9, 1, 4), -- Sinh viên 9 học môn 1 thay vì môn 8
(10, 2, 10), -- Sinh viên 10 học môn 2 thay vì môn 9
(1, 4, 8), -- Sinh viên 1 học môn 4 thay vì môn 10
(2, 5, 2);

select *from courses as cou
left join enrollments as en 
on en.courses_id=cou.courses_id
where en.courses_id is null;
-- 3 lấy ra các sinh viên ko đăng kí khóa học nào(id sinh viên , tên, tuổi)
-- Xóa sạch dữ liệu cũ trong bảng đăng ký
TRUNCATE TABLE enrollments;

-- Chèn data mới "chuẩn chỉ" để làm bài tập:
-- Sinh viên từ 1 đến 8 có đi học. (9 và 10 nghỉ)
-- Khóa học từ 1 đến 8 có người học. (9 và 10 trống)
INSERT INTO enrollments (students_id, courses_id, score) VALUES
(1, 1, 8.5), (1, 2, 7.0),
(2, 3, 6.0), (2, 4, 5.5),
(3, 5, 9.0), (4, 6, 4.5),
(5, 7, 10),  (6, 8, 7.5),
(7, 1, 6.0), (8, 2, 5.0),
(1, 3, 8.0), (2, 5, 7.0); 
-- Lưu ý: ID 9 và 10 hoàn toàn không xuất hiện ở cả 2 cột.
-- 	(id sinh viên , tên, tuổi, tên khóa học, điểm tương ứng)
select * from students as stu
left join enrollments as en 
on stu.students_id = en.students_id ;

-- 4 Đếm số lượng sinh viên đăng kí theo từng khóa học
-- 	(id khóa học, tên khóa học, số lượng sv đăng kí)  - group by
select cou.courses_id,cou.courses_name,count(stu.students_id) as 'số lượng sinh viên đăng kí' from students  as stu
inner join enrollments as en 
on stu.students_id = en.students_id 
inner join courses as cou
on en.courses_id=cou.courses_id
group by cou.courses_id,cou.courses_name;


SELECT 
    c.courses_id, 
    c.courses_name, 
    CASE 
        WHEN COUNT(e.students_id) = 0 THEN 'K có ai đăng kí'
        ELSE CAST(COUNT(e.students_id) AS CHAR)
    END AS 'Tình trạng đăng ký'
FROM courses c
LEFT JOIN enrollments e ON c.courses_id = e.courses_id
GROUP BY c.courses_id, c.courses_name;

-- 5 Tìm ra các sinh viên đăng kí nhiều hơn  1 khóa học
-- 	(id sinh viên, tên sinh viên, tuổi, số lượng khóa học)- group by
SELECT 
    stu.students_id, 
    stu.students_name, 
    stu.students_age, 
    COUNT(en.courses_id) AS 'Số lượng khóa học'
FROM students AS stu
inner JOIN enrollments AS en ON stu.students_id = en.students_id
GROUP BY stu.students_id, stu.students_name, stu.students_age
HAVING COUNT(en.courses_id) > 1;
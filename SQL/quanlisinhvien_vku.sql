create database quanlisinhvien_vku;
use quanlisinhvien_vku;


create table Khoa(
MaKhoa       varchar(200) not null,
TenKhoa      varchar(200) not null,
SDT          varchar(200) null,
constraint   pk_MaKhoa primary key(MaKhoa),
constraint   uq_TenKhoa unique(TenKhoa)
);

CREATE TABLE LOP (
MALOP        VARCHAR(60) NOT NULL,
TENLOP       VARCHAR(60) NOT NULL,
KHOAHOC      INT NULL,
HEDAOTAO     VARCHAR(25) not NULL default 'Chính Quy',
NAMNHAPHOC   INT NULL,
MaKhoa       varchar(200) null, 
constraint   pk_malop primary key (MALOP),
CONSTRAINT   FK_Lop_Khoa FOREIGN KEY (MAKHOA) REFERENCES KHOA(MAKHOA)
		     on delete cascade
			 on update cascade
);

create table  sinhvien(
masv          varchar(200) not null ,
hodem         varchar(200) not null ,
ten           varchar(200) not null ,
ngaysinh      date not null,
gioitinh      enum('Nam','Nữ') not null,
noisinh       varchar(200) not null ,
MALOP         VARCHAR(60) NULL,
constraint    pk_masv primary key (masv),
CONSTRAINT    FK_Lop_malop FOREIGN KEY (MALOP) REFERENCES lop(MALOP)
			  on delete cascade
			  on update cascade
);

CREATE TABLE  HOCPHAN (
MAHOCPHAN     varchar(200) not null ,
TENHOCPHAN    varchar(200) not null ,
SOTINCHI      INT NOT NULL,
constraint    pk_MAHOCPHAN PRIMARY KEY (MAHOCPHAN)
);

alter table  HOCPHAN 
add constraint check_sotinchi check(SOTINCHI>0);
create table diemthi(
MAHOCPHAN     varchar(200) not null ,
masv          varchar(200) not null ,
lanthi        int not null ,
diem          decimal(4,2) not null check (diem>=0 and diem <=10),
constraint    check_lanthi check(lanthi in(1,2)),
constraint    pk_diemthi primary key(MAHOCPHAN,masv,lanthi),
constraint    fk_mahocphan foreign key(MAHOCPHAN) references hocphan(MAHOCPHAN)
			  on delete cascade
			  on update cascade,
constraint    fk_masv  foreign key(masv) references sinhvien(masv)
			  on delete cascade
			  on update cascade
);

-- Thêm các khoa có trong ảnh mẫu vào bảng Khoa của bạn
INSERT INTO Khoa (MaKhoa, TenKhoa, SDT) VALUES 
('cnud', 'Công nghệ ứng dụng', '02363123456'),
('khmt', 'Khoa học máy tính', '02363654321'),
('tmdt', 'Thương mại điện tử', '02363888999');


INSERT INTO LOP (MALOP, TENLOP, KHOAHOC, HEDAOTAO, NAMNHAPHOC, MaKhoa) VALUES 
('dh01', 'Đồ họa 1', 1, 'Chính quy', 2007, 'cnud'),
('dh02', 'Đồ họa 2', 2, 'Chính quy', 2008, 'cnud'),
('dh03', 'Đồ họa 3', 3, 'Chính quy', 2009, 'cnud'),
('dl01', 'Dữ liệu 1', 1, 'Chính quy', 2007, 'khmt'),
('dl02', 'Dữ liệu 2', NULL, 'Chính quy', 2008, 'khmt'), -- NULL ở KHOAHOC
('kt01', 'Kiến trúc 1', 1, 'Chính quy', 2007, 'cnud'),
('lt01a', 'Lập trình 1 A', 1, 'Chính quy', NULL, 'khmt'), -- NULL ở NAMNHAPHOC
('lt01b', 'Lập trình 1 B', 1, 'Chính quy', 2007, NULL),   -- NULL ở MaKhoa (Khóa ngoại null)
('lt02', 'Lập trình 2', 2, 'Chính quy', 2008, 'khmt'),
('mm01', 'Mạng máy tính 1', 1, 'Chính quy', 2007, 'khmt');


INSERT INTO sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, MALOP) VALUES 
('SV01', 'Nguyễn Văn', 'An', '2005-01-15', 'Nam', 'Đà Nẵng', 'dh01'),
('SV02', 'Trần Thị', 'Bình', '2005-03-22', 'Nữ', 'Quảng Nam', 'dh02'),
('SV03', 'Lê Hoàng', 'Cường', '2005-07-10', 'Nam', 'Huế', 'dh03'),
('SV04', 'Phạm Minh', 'Dũng', '2006-11-05', 'Nam', 'Hà Nội', 'dl01'),
('SV05', 'Đỗ Thùy', 'Dương', '2005-12-30', 'Nữ', 'TP. Hồ Chí Minh', 'dl02'),
('SV06', 'Hoàng Văn', 'Hùng', '2005-02-14', 'Nam', 'Nghệ An', 'kt01'),
('SV07', 'Bùi Tuyết', 'Lan', '2006-05-20', 'Nữ', 'Đà Nẵng', 'lt01a'),
('SV08', 'Ngô Quốc', 'Nam', '2005-08-08', 'Nam', 'Bình Định', 'lt01b'),
('SV09', 'Phan Thanh', 'Sơn', '2005-10-12', 'Nam', 'Quảng Ngãi', 'lt02'),
('SV10', 'Vũ Ngọc', 'Trinh', '2006-04-01', 'Nữ', 'Cần Thơ', 'mm01'),
('SV11', 'Lý Gia', 'Hân', '2005-09-15', 'Nữ', 'Đà Nẵng', 'dh01'),
('SV12', 'Trịnh Công', 'Sơn', '2005-02-28', 'Nam', 'Huế', 'dh02'),
('SV13', 'Đặng Thu', 'Thảo', '2006-03-12', 'Nữ', 'Bạc Liêu', 'dh03'),
('SV14', 'Võ Duy', 'Ninh', '2005-06-21', 'Nam', 'Quảng Bình', 'dl01'),
('SV15', 'Mai Phương', 'Thúy', '2005-08-19', 'Nữ', 'Hà Nội', 'dl02'),
('SV16', 'Đinh Tiến', 'Dũng', '2006-01-01', 'Nam', 'Ninh Bình', 'kt01'),
('SV17', 'Quách Thành', 'Danh', '2005-11-11', 'Nam', 'An Giang', 'lt01a'),
('SV18', 'Tạ Bích', 'Loan', '2005-05-05', 'Nữ', 'Yên Bái', 'lt01b'),
('SV19', 'Cao Minh', 'Thắng', '2006-02-14', 'Nam', 'Sóc Trăng', 'lt02'),
('SV20', 'Lương Bích', 'Hữu', '2005-04-20', 'Nữ', 'TP. Hồ Chí Minh', 'mm01'),
('SV21', 'Hà Anh', 'Tuấn', '2005-12-15', 'Nam', 'Đà Lạt', 'dh01'),
('SV22', 'Lê Cát', 'Trọng Lý', '2006-08-24', 'Nữ', 'Đà Nẵng', 'dh02'),
('SV23', 'Sơn', 'Tùng', '2005-07-05', 'Nam', 'Thái Bình', 'dh03'),
('SV24', 'Đông', 'Nhi', '2005-10-13', 'Nữ', 'TP. Hồ Chí Minh', 'dl01'),
('SV25', 'Isaac', 'Phạm', '2006-06-13', 'Nam', 'Cần Thơ', 'dl02'),
('SV26', 'Tóc', 'Tiên', '2005-05-13', 'Nữ', 'Hà Nội', 'kt01'),
('SV27', 'Noo Phước', 'Thịnh', '2005-12-18', 'Nam', 'TP. Hồ Chí Minh', 'lt01a'),
('SV28', 'Hồ Ngọc', 'Hà', '2006-11-25', 'Nữ', 'Quảng Bình', 'lt01b'),
('SV29', 'Đen', 'Vâu', '2005-05-13', 'Nam', 'Quảng Ninh', 'lt02'),
('SV30', 'Suboi', 'Hàng', '2005-01-10', 'Nữ', 'TP. Hồ Chí Minh', 'mm01');


INSERT INTO HOCPHAN (MAHOCPHAN, TENHOCPHAN, SOTINCHI) VALUES 
('hoa', 'Hóa đại cương', 3),
('javacb', 'Java cơ bản', 3),
('ltc', 'Lập trình C++', 3),
('nlhdh', 'Nguyên lý hệ điều hành', 3),
('nlkt', 'Nguyên lý kế toán', 3),
('orac', 'Oracle', 3),
('sql', 'HQTCSDL SQL Server', 3),
('tindc', 'Tin học Đại cương', 4),
('Tinvp', 'Tin học Văn phòng', 3),
('tkms', 'Thiết kế màu sắc', 2),
('triet', 'Triết học', 3),
('trr', 'Toán rời rạc', 3);


INSERT INTO diemthi (MAHOCPHAN, masv, lanthi, diem) VALUES 
('javacb', 'SV01', 1, 8.50),
('javacb', 'SV02', 1, 4.00),
('javacb', 'SV02', 2, 6.50),
('sql',    'SV03', 1, 10.00),
('sql',    'SV04', 1, 7.25),
('trr',    'SV01', 1, 3.50),
('trr',    'SV01', 2, 5.25),
('ltc',    'SV05', 1, 9.00),
('ltc',    'SV06', 1, 8.75),
('hoa',    'SV07', 1, 6.00),
('hoa',    'SV08', 1, 7.50),
('triet',  'SV09', 1, 4.50),
('triet',  'SV09', 2, 8.00),
('tindc',  'SV10', 1, 9.50),
('Tinvp',  'SV11', 1, 8.20),
('nlhdh',  'SV12', 1, 7.00),
('orac',   'SV13', 1, 5.50),
('tkms',   'SV14', 1, 10.00),
('nlkt',   'SV15', 1, 6.75),
('sql',    'SV20', 1, 8.25);

select * from sinhvien;

--  Hiển thị các học phần có số tín chỉ lớn hơn 3 gồm các thông tin: mahocphan
-- đặt bí danh (Alias) là Mã học phần, tenhocphan đặt bí danh là Tên học phần

select MAHOCPHAN as 'mã học phần' , TENHOCPHAN as 'tên học phần' ,SOTINCHI from hocphan where SOTINCHI >3;

-- 3. Hiển thị danh sách sinh viên nữ của trường gồm các thông tin: masv,
-- hodem, ten, ngay sinh, gioitinh. Kết quả trả về sắp xếp giảm dần theo tên
-- sinh viên

select * from sinhvien 
where gioitinh in('nữ')
order by ten desc ;

--  Hiển thị bảng điểm lần 1 của học phần có mã là tindc gồm các thông tin
-- sau: masv, ho va ten (ghép giữa hai cột hodem và ten), diem
select sv.masv,concat(hodem,ten),diem.diem from sinhvien as sv
inner join diemthi as diem
on sv.masv=diem.masv
where MAHOCPHAN = 'tindc' and lanthi=1
;

-- Hiển thị danh sách sinh viên của khoa Khoa học Máy tính gồm các thông
-- tin masv, hodem, ten, tenlop, namnhaphoc.

select sv.masv,concat(hodem,ten),l.tenlop, l.namnhaphoc from sinhvien as sv
inner join lop as l
on sv.malop=l.malop
inner join khoa as kh
on l.makhoa=kh.makhoa
where kh.tenkhoa='Khoa học máy tính';


SELECT 
    sv.masv, 
    sv.hodem, 
    sv.ten, 
    l.tenlop, 
    l.namnhaphoc
FROM sinhvien AS sv
INNER JOIN lop AS l ON sv.malop = l.malop
INNER JOIN khoa AS k ON l.makhoa = k.makhoa
WHERE k.tenkhoa = N'Khoa học Máy tính';


select * from hocphan;


-- Hiển thị những sinh viên nữ thi lại học phần tên SQL Server gồm các thông
-- tin sau: masv, hodem, ten, tenlop.
select * from sinhvien 
where gioitinh in('nữ');

select * from sinhvien as sv
inner join diemthi as dt
on sv.masv=dt.masv
inner join hocphan as hp
on dt.mahocphan=hp.mahocphan
where hp.mahocphan='sql' and dt.lanthi=2;


update diemthi set lanthi=2 where masv='sv20' and mahocphan='sql';

--  Hiển thị những sinh viên khóa 1 có điểm thi lần 1 từ 8 đến 9 gồm các thông
-- tin sau: masv, hodem, ten, tenlop, tenmonhoc, diem, tenkhoa.

select * from sinhvien as sv
INNER JOIN lop AS l 
ON sv.malop = l.malop
inner join diemthi as dt
on sv.masv=dt.masv
INNER JOIN khoa AS k
ON l.makhoa = k.makhoa
where l.khoahoc=1 and lanthi=1 and diem between 8 and 9;


-- Hiển thị masv, hodem, ten, trung bình điểm lần 1 của từng sinh viên

select sv.masv,concat(sv.hodem,' ',sv.ten) as 'họ và tên ',avg(dt.diem) as 'điểm trung bình'
from sinhvien as sv
inner join diemthi as dt
on sv.masv=dt.masv 
where dt.lanthi=1
group by sv.masv,concat(sv.hodem,' ',sv.ten);


-- Hiển thị makhoa, tenkhoa, số sinh viên của mỗi khoa.

SELECT k.makhoa,k.tenkhoa, count(sv.masv)
FROM khoa k
LEFT JOIN lop l ON k.MaKhoa = l.MaKhoa
LEFT JOIN sinhvien sv ON l.MALOP = sv.MALOP
group by k.makhoa,k.tenkhoa;


SELECT 
    k.makhoa, 
    k.tenkhoa, 
    COUNT(sv.masv) AS SoLuongSV
FROM sinhvien sv
RIGHT JOIN lop l ON sv.MALOP = l.MALOP    -- Ưu tiên Lớp (lấy hết Lớp, SV nào ko lớp thì kệ)
RIGHT JOIN khoa k ON l.MaKhoa = k.MaKhoa  -- Ưu tiên Khoa (lấy hết Khoa, Lớp nào ko khoa thì kệ)
GROUP BY k.makhoa, k.tenkhoa;



select sv.masv,concat(sv.hodem,' ',sv.ten) as 'họ và tên ',avg(dt.diem) as 'điểm trung bình'
from sinhvien as sv
left join diemthi as dt
on sv.masv=dt.masv 
where dt.lanthi=1
group by sv.masv,concat(sv.hodem,' ',sv.ten);


select * from sinhvien as sv
left join diemthi as dt
on sv.masv=dt.masv 
where dt.lanthi is null;

SELECT sv.*
FROM sinhvien AS sv
LEFT JOIN diemthi AS dt ON sv.masv = dt.masv 
WHERE dt.masv IS NULL; -- Nếu mã SV ở bảng điểm bị NULL, nghĩa là ông này chưa từng đi thi

SELECT 
    l.MALOP, 
    l.TENLOP, 
    COUNT(sv.masv) AS SoLuongSV
FROM lop AS l
INNER JOIN sinhvien AS sv ON l.MALOP = sv.MALOP
GROUP BY l.MALOP, l.TENLOP
HAVING COUNT(sv.masv) > 2;
-- .Hiển thị mã lớp, tên lớp có nhiều hơn 2 sinh viên.
SELECT 
    l.MALOP, 
    l.TENLOP, 
    COUNT(sv.masv) AS SoLuongSV
FROM lop AS l
INNER JOIN sinhvien AS sv ON l.MALOP = sv.MALOP;
SELECT 
    l.MALOP, 
    l.TENLOP, 
    COUNT(sv.masv) AS SoLuongSV
FROM lop AS l
INNER JOIN sinhvien AS sv ON l.MALOP = sv.MALOP;
SELECT 
    l.MALOP, 
    l.TENLOP, 
    COUNT(sv.masv) AS SoLuongSV
FROM lop AS l
INNER JOIN sinhvien AS sv ON l.MALOP = sv.MALOP;


-- Hiển thị mã sinh viên, họ và tên, tên lớp có điểm trung bình lần 1 lớn hơn 7


select sv.masv,concat(sv.hodem,' ',sv.ten) as 'họ và tên ',avg(dt.diem) as 'điểm trung bình'
from sinhvien as sv
inner join diemthi as dt
on sv.masv=dt.masv 
inner join lop as l
on sv.malop=l.malop
group by sv.masv,concat(sv.hodem,' ',sv.ten)
having avg(dt.diem)>7;


-- Hiển thị mã sinh viên, họ và tên, tên lớp, tên khoa của những sinh viên từ
-- 23 đến 30 tuổi, kết quả trả về sắp xếp giảm dần theo tên.


select sv.masv,concat(sv.hodem,' ',sv.ten) as 'họ và tên ',sv.ngaysinh,(year(curdate()) -year(sv.ngaysinh)) as 'tuổi', l.tenlop,k.tenkhoa
from sinhvien as sv
inner join lop as l
on sv.malop=l.malop
inner join khoa as k
on l.makhoa=k.makhoa
where (year(curdate()) -year(sv.ngaysinh)) between 20 and  30 
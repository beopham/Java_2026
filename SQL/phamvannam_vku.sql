create database PhamVanNam_VKU;
use PhamVanNam_VKU;

create table PhongBan(
   Mapb int not null auto_increment,
   tenpb varchar(500) not null,
   mota varchar(500) not null,
   constraint pk_Mapb primary key( Mapb) ,
   constraint uq_tenpb unique(tenpb)
);

create table NhanVien(
MaNV varchar(500) not null ,
Hoten varchar(500) not null,
Gioitinh enum('Nam','Nữ'),
Ngaysinh date not null,
Diachi varchar(500) null default 'Đà Nẵng',
SDT varchar(500) null,
Mapb int null,
constraint pk_manv primary key(MaNV),
CONSTRAINT fk_Mapb FOREIGN KEY (Mapb) REFERENCES PhongBan(Mapb)
on delete set null
on update cascade
);

INSERT INTO PhongBan (tenpb, mota) VALUES 
('Phòng Giám đốc', 'Ban điều hành và quản lý chiến lược công ty'),
('Phòng Hành chính Nhân sự', 'Quản lý nhân sự, tuyển dụng và phúc lợi nhân viên'),
('Phòng Kế toán', 'Quản lý tài chính, ngân sách và quyết toán thuế'),
('Phòng Kinh doanh', 'Tìm kiếm khách hàng và phát triển thị trường'),
('Phòng Kỹ thuật', 'Hỗ trợ kỹ thuật, vận hành và bảo trì hệ thống');
select * from PhongBan;


INSERT INTO NhanVien (MaNV, Hoten, Gioitinh, Ngaysinh, Diachi, SDT, Mapb) VALUES 
-- Phòng 1: Phòng Giám đốc
('NV01', 'Nguyễn Văn An', 'Nam', '1985-05-20', 'Đà Nẵng', '0905123456', 1),
('NV02', 'Trần Thị Bình', 'Nữ', '1990-02-15', NULL, '0914123789', 1),
('NV03', 'Lê Văn Cường', 'Nam', '1988-11-30', 'Quảng Nam', NULL, 1),
('NV04', 'Phạm Minh Đức', 'Nam', '1992-07-10', 'Đà Nẵng', '0935111222', 1),

-- Phòng 2: Phòng Hành chính Nhân sự
('NV05', 'Hoàng Thị Em', 'Nữ', '1995-01-25', 'Đà Nẵng', NULL, 2),
('NV06', 'Ngô Văn Giang', 'Nam', '1993-08-14', NULL, '0905666777', 2),
('NV07', 'Đỗ Thị Hoa', 'Nữ', '1996-12-05', 'Huế', '0944000111', 2),
('NV08', 'Bùi Văn Hùng', 'Nam', '1991-03-20', 'Đà Nẵng', '0919222333', 2),

-- Phòng 3: Phòng Kế toán
('NV09', 'Lý Thị Lan', 'Nữ', '1994-06-18', NULL, NULL, 3),
('NV10', 'Vũ Văn Nam', 'Nam', '1989-10-12', 'Đà Nẵng', '0905888999', 3),
('NV11', 'Phan Thị Ngọc', 'Nữ', '1997-04-22', 'Quảng Ngãi', '0988777666', 3),
('NV12', 'Trịnh Văn Phú', 'Nam', '1992-09-30', 'Đà Nẵng', NULL, 3),

-- Phòng 4: Phòng Kinh doanh
('NV13', 'Đặng Thị Quý', 'Nữ', '1995-02-14', 'Đà Nẵng', '0911444555', 4),
('NV14', 'Cao Văn Sơn', 'Nam', '1990-12-25', NULL, '0905222111', 4),
('NV15', 'Mai Thị Tươi', 'Nữ', '1998-07-08', 'Bình Định', NULL, 4),
('NV16', 'Đinh Văn Uy', 'Nam', '1994-05-05', 'Đà Nẵng', '0932333444', 4),

-- Phòng 5: Phòng Kỹ thuật
('NV17', 'Hồ Thị Vân', 'Nữ', '1996-03-15', 'Đà Nẵng', '0905999000', 5),
('NV18', 'Trương Văn Xuân', 'Nam', '1991-11-11', NULL, NULL, 5),
('NV19', 'Lương Thị Yến', 'Nữ', '1997-08-20', 'Đà Nẵng', '0945666555', 5),
('NV20', 'Phạm Văn Long', 'Nam', '1993-01-01', 'Quảng Nam', '0905777888', 5);

ALTER TABLE `phamvannam_vku`.`nhanvien` 
ADD COLUMN `Luong` DECIMAL(10,2) NULL AFTER `SDT`;

UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '50000' WHERE (`MaNV` = 'NV09');
UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '55000' WHERE (`MaNV` = 'NV11');
UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '60000' WHERE (`MaNV` = 'NV07');
UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '70000' WHERE (`MaNV` = 'NV15');
UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '80000' WHERE (`MaNV` = 'NV17');
UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '90000' WHERE (`MaNV` = 'NV19');
UPDATE `phamvannam_vku`.`NhanVien` SET `Luong` = '20000' WHERE (`MaNV` = 'NV20');

select * from NhanVien;


-- lấy ra nhân viên có địa chỉ là đà nẵng
select * from nhanvien where Diachi = "Đà Nẵng" and luong is not null;

-- kiếm mức lương từ 50000 đến 70000 
select * from nhanvien where (luong between 50000 and 70000) and gioitinh in ("nữ");

select * from nhanvien where Hoten like '%Nam%';

SELECT * FROM PhongBan pb
WHERE EXISTS (SELECT 1 FROM NhanVien nv WHERE nv.Mapb = pb.Mapb);

-- lấy ra giá trị k trùng lặp 
select distinct diachi from nhanvien where Diachi in ("Đà Nẵng") ;

-- thopong tin nhân viên có lluowng cao nhất
SELECT * FROM NhanVien 
WHERE Luong = (SELECT MAX(Luong) FROM NhanVien);

SELECT * FROM NhanVien  
where diachi=(select distinct diachi from nhanvien where Diachi in ("Đà Nẵng"))
limit 1;

select * from nhanvien 
where Diachi in ("Đà Nẵng") and luong is not null
order by luong desc;


-- lấy ra tổng lương của mapb=1
select sum(luong) as 'tổng lương',mapb from nhanvien where mapb=1;


select count(manv),mapb from nhanvien
group by mapb;


SELECT Mapb, Gioitinh, COUNT(*) AS SoLuong
FROM NhanVien
GROUP BY Mapb, Gioitinh;

-- đếm số nhân vien theo giới tính
select count(*), gioitinh from nhanvien
where diachi in ("đà nẵng")
group by gioitinh;


select mapb,count(*),sum(luong) from nhanvien
group by mapb
having sum(luong) >250000;

select mapb , max(luong) as'lương cao nhất'  
from nhanvien
where mapb in(1)
group by mapb
having max(luong) >70000;

select * from nhanvien 
where luong > any(select luong from nhanvien where  Mapb =3) and mapb !=3;


SELECT * FROM nhanvien 
WHERE luong > (SELECT MAX(luong) FROM nhanvien WHERE Mapb = 3);


-- select nv.mapb,count(*) from nhanvien as nv
-- inner join phongban as pb
-- on nv.mapb=pb.mapb
-- where tenpb ='Phòng Giám đốc'
-- group by  nv.mapb
select * from nhanvien as nv
right join phongban as pb
on nv.mapb=pb.mapb
where tenpb ='Phòng Giám đốc'

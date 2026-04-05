USE quanlidiem;
--  TẠO BẢNG KHOA
create table khoa(
 makhoa varchar(200)  not null,
 tenkhoa nvarchar(200) not null,
 dienthoai varchar(200)  not null,
 -- tạo khóa chính 
 constraint pk_khoa_makhoa primary key(makhoa),
 -- tạo ràng buộ unique cho hai cột tenkhoa và điện thoại
  constraint uq_makhoa_tenkhoa_dienthoai unique(tenkhoa,dienthoai)
);


-- thêm ba dòng vào bảng
INSERT INTO khoa (makhoa, tenkhoa, dienthoai)
VALUES 
('CNTT', 'Công Nghệ Thông Tin', '0909123456'),
('KT', 'Kinh Tế', '0912345678'),
('MTMT', 'Kỹ Thuật Máy Tính', '0987654321');
-- xem thông tin bảng khoa
select * from khoa;

-- tạo bảng lớp
create table lop(
  malop varchar(200) not null,
  tenlop varchar(200) not null, 
  khoahoc varchar(200) not null,
  hedaotao nvarchar(200) not null default 'CHÍNH QUY',
  namnhaphoc int not null,
  makhoa varchar(200)  not null,
  -- tạo khóa chính
  constraint pk_malop_lop primary key(malop),
  -- tạo khóa ngoại
  constraint fk_malop_makhoa foreign key(makhoa) references khoa(makhoa)
);

select * from lop;

-- chèn 6 lớp vào
INSERT INTO `quanlidiem`.`lop` (`malop`, `tenlop`, `khoahoc`, `hedaotao`, `namnhaphoc`, `makhoa`) VALUES ('21AD', 'AI', '2021-2026', 'Chính Quy', '2021', 'CNTT');
INSERT INTO `quanlidiem`.`lop` (`malop`, `tenlop`, `khoahoc`, `hedaotao`, `namnhaphoc`, `makhoa`) VALUES ('21IT', 'IT', '2021-2026', 'Chính Quy', '2021', 'CNTT');
INSERT INTO `quanlidiem`.`lop` (`malop`, `tenlop`, `khoahoc`, `hedaotao`, `namnhaphoc`, `makhoa`) VALUES ('20BA1', 'BA1', '2020-2025', 'Chính Quy', '2020', 'KT');
INSERT INTO `quanlidiem`.`lop` (`malop`, `tenlop`, `khoahoc`, `hedaotao`, `namnhaphoc`, `makhoa`) VALUES ('20BA2', 'BA2', '2020-2025', 'Chính Quy', '2020', 'KT');
INSERT INTO `quanlidiem`.`lop` (`malop`, `tenlop`, `khoahoc`, `hedaotao`, `namnhaphoc`, `makhoa`) VALUES ('23CE1', 'CE1', '2023-2028', 'Chính Quy', '2023', 'KTMT');
INSERT INTO `quanlidiem`.`lop` (`malop`, `tenlop`, `khoahoc`, `hedaotao`, `namnhaphoc`, `makhoa`) VALUES ('24CE2', 'CE2', '2025-2030', 'Chính Quy', '2025', 'KTMT');
-- tạo bảng sinh viên

create table sinhvien(
  masv varchar(200) not null,
  hodem nvarchar(200) not null,
  ten nvarchar(200) not null,
  ngaysinh date not null,
  gioitinh nvarchar(200) not null,
  noisinh nvarchar(200) not null,
  malop varchar(200) not null,
  constraint pk_masv_sinhvien primary key(masv) ,
  constraint check_gioitinh check(gioitinh in ('Nam','Nữ')),
  constraint fk_malop_lop foreign key(malop) references lop(malop)
)

select * from sinhvien;
-- ==========================
-- CHÈN 60 SINH VIÊN VÀO BẢNG SINHVIEN
-- MỖI LỚP 10 SINH VIÊN
-- ==========================

-- ======== LỚP 21AD (AI) ========
INSERT INTO quanlidiem.sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, malop) VALUES
('SV001','Nguyễn Văn','An','2003-05-12','Nam','Đà Nẵng','21AD'),
('SV002','Trần Thị','Bích','2003-09-02','Nữ','Huế','21AD'),
('SV003','Lê Minh','Hoàng','2003-12-21','Nam','Quảng Nam','21AD'),
('SV004','Phạm Ngọc','Trâm','2004-02-17','Nữ','Đà Nẵng','21AD'),
('SV005','Đỗ Đức','Thịnh','2003-11-08','Nam','Quảng Trị','21AD'),
('SV006','Ngô Thị','Hồng','2003-06-15','Nữ','Quảng Ngãi','21AD'),
('SV007','Phan Quang','Vinh','2003-07-27','Nam','Huế','21AD'),
('SV008','Vũ Ngọc','Anh','2004-01-05','Nữ','Đà Nẵng','21AD'),
('SV009','Hoàng Đức','Long','2003-10-20','Nam','Quảng Nam','21AD'),
('SV010','Trịnh Thị','Ly','2004-03-10','Nữ','Huế','21AD');

-- ======== LỚP 21IT (CNTT) ========
INSERT INTO quanlidiem.sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, malop) VALUES
('SV011','Lý Hoàng','Nam','2003-10-01','Nam','Đà Nẵng','21IT'),
('SV012','Trương Thị','Thu','2003-04-25','Nữ','Quảng Nam','21IT'),
('SV013','Nguyễn Đình','Phong','2003-06-19','Nam','Huế','21IT'),
('SV014','Phạm Thị','Tú','2003-12-10','Nữ','Đà Nẵng','21IT'),
('SV015','Bùi Thanh','Hải','2003-08-07','Nam','Quảng Bình','21IT'),
('SV016','Hồ Thị','Lan','2003-11-15','Nữ','Quảng Ngãi','21IT'),
('SV017','Đặng Văn','Hiếu','2004-03-23','Nam','Huế','21IT'),
('SV018','Trần Mỹ','Hạnh','2004-01-29','Nữ','Đà Nẵng','21IT'),
('SV019','Ngô Quốc','Trung','2003-09-12','Nam','Quảng Nam','21IT'),
('SV020','Lưu Thị','Thanh','2004-05-04','Nữ','Huế','21IT');

-- ======== LỚP 20BA1 (Kế Toán 1) ========
INSERT INTO quanlidiem.sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, malop) VALUES
('SV021','Nguyễn Thị','Mai','2002-09-17','Nữ','Đà Nẵng','20BA1'),
('SV022','Phan Văn','Quý','2002-07-22','Nam','Huế','20BA1'),
('SV023','Võ Thị','Nhung','2002-05-11','Nữ','Quảng Nam','20BA1'),
('SV024','Lê Minh','Tú','2002-08-30','Nam','Quảng Ngãi','20BA1'),
('SV025','Đinh Thị','Hoa','2002-12-03','Nữ','Đà Nẵng','20BA1'),
('SV026','Nguyễn Đức','Hòa','2002-03-18','Nam','Huế','20BA1'),
('SV027','Trần Mỹ','Ngọc','2002-04-20','Nữ','Quảng Bình','20BA1'),
('SV028','Phạm Anh','Tài','2002-10-12','Nam','Quảng Trị','20BA1'),
('SV029','Lưu Thị','Thảo','2002-06-05','Nữ','Quảng Nam','20BA1'),
('SV030','Đỗ Văn','Bình','2002-02-14','Nam','Đà Nẵng','20BA1');

-- ======== LỚP 20BA2 (Kế Toán 2) ========
INSERT INTO quanlidiem.sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, malop) VALUES
('SV031','Bùi Thị','Hương','2002-09-05','Nữ','Đà Nẵng','20BA2'),
('SV032','Đặng Minh','Tuấn','2002-06-14','Nam','Huế','20BA2'),
('SV033','Vũ Thị','Oanh','2002-11-27','Nữ','Quảng Nam','20BA2'),
('SV034','Trần Văn','Kiệt','2002-04-09','Nam','Quảng Ngãi','20BA2'),
('SV035','Ngô Thị','Trang','2002-01-16','Nữ','Đà Nẵng','20BA2'),
('SV036','Phan Quốc','Đạt','2002-08-02','Nam','Huế','20BA2'),
('SV037','Đỗ Thị','Mỹ','2002-03-25','Nữ','Quảng Trị','20BA2'),
('SV038','Lê Văn','Cường','2002-07-10','Nam','Đà Nẵng','20BA2'),
('SV039','Hoàng Thị','Duyên','2002-09-19','Nữ','Quảng Bình','20BA2'),
('SV040','Phạm Quốc','Khánh','2002-05-21','Nam','Huế','20BA2');

-- ======== LỚP 23CE1 (Kỹ Thuật Máy Tính 1) ========
INSERT INTO quanlidiem.sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, malop) VALUES
('SV041','Trương Minh','Quang','2005-09-29','Nam','Đà Nẵng','23CE1'),
('SV042','Nguyễn Thị','Ngân','2005-06-18','Nữ','Huế','23CE1'),
('SV043','Phạm Hữu','Tín','2005-10-11','Nam','Quảng Nam','23CE1'),
('SV044','Bùi Thị','Yến','2005-12-05','Nữ','Đà Nẵng','23CE1'),
('SV045','Đặng Thanh','Tùng','2005-11-22','Nam','Quảng Ngãi','23CE1'),
('SV046','Lý Thị','Tươi','2005-07-07','Nữ','Huế','23CE1'),
('SV047','Nguyễn Đức','Lợi','2005-05-15','Nam','Đà Nẵng','23CE1'),
('SV048','Trần Thị','Phương','2005-08-13','Nữ','Quảng Nam','23CE1'),
('SV049','Đỗ Quốc','Phong','2005-04-04','Nam','Huế','23CE1'),
('SV050','Phan Thị','Vy','2005-09-25','Nữ','Đà Nẵng','23CE1');

-- ======== LỚP 24CE2 (Kỹ Thuật Máy Tính 2) ========
INSERT INTO quanlidiem.sinhvien (masv, hodem, ten, ngaysinh, gioitinh, noisinh, malop) VALUES
('SV051','Phan Văn','Bảo','2006-04-02','Nam','Đà Nẵng','24CE2'),
('SV052','Nguyễn Thị','Như','2006-03-21','Nữ','Huế','24CE2'),
('SV053','Võ Minh','Trí','2006-09-14','Nam','Quảng Nam','24CE2'),
('SV054','Lê Thị','Hằng','2006-12-28','Nữ','Đà Nẵng','24CE2'),
('SV055','Phạm Văn','Khải','2006-06-08','Nam','Quảng Ngãi','24CE2'),
('SV056','Đặng Thị','Linh','2006-10-05','Nữ','Huế','24CE2'),
('SV057','Nguyễn Văn','Tài','2006-07-03','Nam','Quảng Nam','24CE2'),
('SV058','Trần Thị','Kim','2006-02-24','Nữ','Đà Nẵng','24CE2'),
('SV059','Vũ Đức','Phát','2006-05-10','Nam','Huế','24CE2'),
('SV060','Lý Thị','Thanh','2006-11-17','Nữ','Đà Nẵng','24CE2');

select * from sinhvien;


-- đếm thửu có bnh sinh viên

select count(*) as `tống sinh viên` from sinhvien;

create table hocphan(
mahocphan varchar(200) not null,
tenhocphan nvarchar(200) not null,
sotinchi int not null,
constraint pk_hocphan_mahochan primary key(mahocphan),
constraint check_sotinchi check(sotinchi > 0)
);


-- ===============================
-- CHÈN 10 MÔN HỌC
-- ===============================
INSERT INTO hocphan (mahocphan, tenhocphan, sotinchi) VALUES
('CSDL', N'Cơ sở dữ liệu', 3),
('JAVA', N'Lập trình Java', 3),
('CTDL', N'Cấu trúc dữ liệu và giải thuật', 3),
('AI', N'Trí tuệ nhân tạo', 3),
('MMT', N'Mạng máy tính', 3),
('HDH', N'Hệ điều hành', 2),
('PTTKHT', N'Phân tích và thiết kế hệ thống', 3),
('TRR', N'Toán rời rạc', 2),
('PY', N'Lập trình Python', 3),
('WEB', N'Thiết kế web', 3);

SELECT * FROM hocphan;


create table diemthi(
  mahocphan varchar(200) not null,
  masv varchar(200) not null,
  lanthi int not null,
  diem float not null,
  -- tạo ba khóa chính  
  constraint pk_diemthi primary key(mahocphan,masv,lanthi),
  -- tạo khóa ngoại 
  constraint fk_diemthi_mahocphan foreign key (mahocphan) references hocphan(mahocphan),
  CONSTRAINT fk_diemthi_sinhvien FOREIGN KEY (masv) REFERENCES sinhvien(masv),
  -- tạo ràng buộc điểm lớn hơn 0 và bé hơn 10
  constraint check_diem check (diem >=0 and diem <=10)
);

select * from diemthi;
ALTER TABLE quanlidiem.lop 
DROP FOREIGN KEY fk_malop_makhoa;

ALTER TABLE quanlidiem.lop 
ADD CONSTRAINT fk_malop_makhoa
  FOREIGN KEY (makhoa)
  REFERENCES quanlidiem.khoa (makhoa)
  ON DELETE CASCADE
  ON UPDATE CASCADE;


ALTER TABLE `quanlidiem`.`sinhvien` 
DROP FOREIGN KEY `fk_malop_lop`;
ALTER TABLE `quanlidiem`.`sinhvien` 
ADD CONSTRAINT `fk_malop_lop`
  FOREIGN KEY (`malop`)
  REFERENCES `quanlidiem`.`lop` (`malop`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  
ALTER TABLE `quanlidiem`.`diemthi` 
DROP FOREIGN KEY `fk_diemthi_mahocphan`;
ALTER TABLE `quanlidiem`.`diemthi` 
ADD CONSTRAINT `fk_diemthi_mahocphan`
  FOREIGN KEY (`mahocphan`)
  REFERENCES `quanlidiem`.`hocphan` (`mahocphan`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  
  
ALTER TABLE `quanlidiem`.`diemthi` 
DROP FOREIGN KEY `fk_diemthi_sinhvien`;
ALTER TABLE `quanlidiem`.`diemthi` 
ADD CONSTRAINT `fk_diemthi_sinhvien`
  FOREIGN KEY (`masv`)
  REFERENCES `quanlidiem`.`sinhvien` (`masv`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

select * from sinhvien;

-- ============================================
-- THÊM 200 DÒNG DỮ LIỆU VÀO BẢNG ĐIEMTHI (ĐA DẠNG ĐIỂM 1.0 -> 10.0)
-- ============================================

INSERT INTO quanlidiem.diemthi (mahocphan, masv, lanthi, diem) VALUES
('CSDL','SV001',1,8.4),('JAVA','SV001',1,6.2),('CTDL','SV001',2,5.7),('AI','SV001',2,9.1),('PY','SV001',1,7.8),
('MMT','SV002',1,4.5),('HDH','SV002',2,8.6),('PTTKHT','SV002',1,6.9),('TRR','SV002',1,9.2),('WEB','SV002',2,7.3),
('CSDL','SV003',1,5.9),('JAVA','SV003',2,9.4),('CTDL','SV003',1,7.1),('AI','SV003',1,6.8),('PY','SV003',2,8.7),
('MMT','SV004',1,9.0),('HDH','SV004',1,3.6),('PTTKHT','SV004',1,7.4),('TRR','SV004',2,5.2),('WEB','SV004',1,8.9),
('CSDL','SV005',2,9.6),('JAVA','SV005',1,7.2),('CTDL','SV005',2,6.3),('AI','SV005',1,8.1),('PY','SV005',2,5.8),
('MMT','SV006',1,9.7),('HDH','SV006',2,3.9),('PTTKHT','SV006',1,7.6),('TRR','SV006',1,4.1),('WEB','SV006',1,8.2),
('CSDL','SV007',1,6.7),('JAVA','SV007',2,8.4),('CTDL','SV007',1,9.3),('AI','SV007',2,5.1),('PY','SV007',1,7.9),
('MMT','SV008',1,4.8),('HDH','SV008',1,8.7),('PTTKHT','SV008',2,9.0),('TRR','SV008',2,5.4),('WEB','SV008',1,7.5),
('CSDL','SV009',1,8.6),('JAVA','SV009',2,9.1),('CTDL','SV009',1,4.9),('AI','SV009',1,7.8),('PY','SV009',2,5.5),
('MMT','SV010',1,6.4),('HDH','SV010',2,7.2),('PTTKHT','SV010',1,9.5),('TRR','SV010',1,3.8),('WEB','SV010',1,8.0),
('CSDL','SV011',1,5.2),('JAVA','SV011',2,9.6),('CTDL','SV011',1,7.3),('AI','SV011',1,8.8),('PY','SV011',2,6.5),
('MMT','SV012',1,7.7),('HDH','SV012',2,4.6),('PTTKHT','SV012',1,9.9),('TRR','SV012',1,8.1),('WEB','SV012',2,5.0),
('CSDL','SV013',2,9.3),('JAVA','SV013',1,6.8),('CTDL','SV013',1,8.2),('AI','SV013',1,9.7),('PY','SV013',2,5.6),
('MMT','SV014',1,7.4),('HDH','SV014',2,8.9),('PTTKHT','SV014',1,6.1),('TRR','SV014',1,9.5),('WEB','SV014',2,7.8),
('CSDL','SV015',1,8.0),('JAVA','SV015',2,9.2),('CTDL','SV015',1,4.3),('AI','SV015',1,7.1),('PY','SV015',2,9.8),
('MMT','SV016',1,6.9),('HDH','SV016',1,8.4),('PTTKHT','SV016',2,7.5),('TRR','SV016',1,9.0),('WEB','SV016',2,5.7),
('CSDL','SV017',1,8.3),('JAVA','SV017',2,4.7),('CTDL','SV017',1,9.4),('AI','SV017',1,7.6),('PY','SV017',2,6.0),
('MMT','SV018',1,9.1),('HDH','SV018',1,5.8),('PTTKHT','SV018',1,8.7),('TRR','SV018',2,6.3),('WEB','SV018',2,9.8),
('CSDL','SV019',1,5.5),('JAVA','SV019',2,9.0),('CTDL','SV019',1,7.7),('AI','SV019',1,8.9),('PY','SV019',2,4.4),
('MMT','SV020',1,6.6),('HDH','SV020',2,8.3),('PTTKHT','SV020',1,9.4),('TRR','SV020',1,5.1),('WEB','SV020',2,7.0),
('CSDL','SV021',1,9.8),('JAVA','SV021',1,8.5),('CTDL','SV021',2,6.7),('AI','SV021',1,9.1),('PY','SV021',2,4.2),
('MMT','SV022',1,7.8),('HDH','SV022',1,9.0),('PTTKHT','SV022',2,5.4),('TRR','SV022',2,8.6),('WEB','SV022',1,9.7),
('CSDL','SV023',1,7.3),('JAVA','SV023',2,8.2),('CTDL','SV023',1,5.6),('AI','SV023',2,9.5),('PY','SV023',1,8.0),
('MMT','SV024',1,9.1),('HDH','SV024',1,7.9),('PTTKHT','SV024',2,6.8),('TRR','SV024',1,8.7),('WEB','SV024',2,4.9),
('CSDL','SV025',2,5.7),('JAVA','SV025',1,9.4),('CTDL','SV025',1,8.3),('AI','SV025',2,7.6),('PY','SV025',1,9.2),
('MMT','SV026',1,8.4),('HDH','SV026',2,5.9),('PTTKHT','SV026',1,9.8),('TRR','SV026',1,6.2),('WEB','SV026',2,7.5),
('CSDL','SV027',1,8.6),('JAVA','SV027',2,9.9),('CTDL','SV027',1,7.1),('AI','SV027',1,9.3),('PY','SV027',2,6.7),
('MMT','SV028',1,9.5),('HDH','SV028',1,8.1),('PTTKHT','SV028',2,7.8),('TRR','SV028',1,9.4),('WEB','SV028',2,5.3),
('CSDL','SV029',1,6.9),('JAVA','SV029',1,9.6),('CTDL','SV029',2,8.0),('AI','SV029',1,9.2),('PY','SV029',2,4.8),
('MMT','SV030',1,9.8),('HDH','SV030',2,5.1),('PTTKHT','SV030',1,8.6),('TRR','SV030',1,7.9),('WEB','SV030',2,9.0),
('CSDL','SV031',1,8.7),('JAVA','SV031',2,5.6),('CTDL','SV031',1,9.5),('AI','SV031',1,7.2),('PY','SV031',2,6.8),
('MMT','SV032',1,9.4),('HDH','SV032',2,7.5),('PTTKHT','SV032',1,8.9),('TRR','SV032',1,6.1),('WEB','SV032',1,9.7),
('CSDL','SV033',1,8.1),('JAVA','SV033',2,9.3),('CTDL','SV033',1,7.0),('AI','SV033',2,5.8),('PY','SV033',1,8.5),
('MMT','SV034',1,9.2),('HDH','SV034',1,7.7),('PTTKHT','SV034',2,9.6),('TRR','SV034',1,6.9),('WEB','SV034',2,8.0),
('CSDL','SV035',1,5.3),('JAVA','SV035',2,9.1),('CTDL','SV035',1,8.4),('AI','SV035',1,9.8),('PY','SV035',2,6.6),
('MMT','SV036',1,7.8),('HDH','SV036',2,9.0),('PTTKHT','SV036',1,5.7),('TRR','SV036',1,8.3),('WEB','SV036',2,9.5),
('CSDL','SV037',1,8.7),('JAVA','SV037',2,9.4),('CTDL','SV037',1,7.6),('AI','SV037',1,9.2),('PY','SV037',2,6.0),
('MMT','SV038',1,9.1),('HDH','SV038',1,8.9),('PTTKHT','SV038',2,5.4),('TRR','SV038',1,9.7),('WEB','SV038',2,7.3),
('CSDL','SV039',1,9.8),('JAVA','SV039',1,7.1),('CTDL','SV039',2,9.4),('AI','SV039',1,8.6),('PY','SV039',2,5.9),
('MMT','SV040',1,8.2),('HDH','SV040',2,9.3),('PTTKHT','SV040',1,7.5),('TRR','SV040',1,8.9),('WEB','SV040',2,6.7);

select hp.tenhocphan, dt.mahocphan,dt.masv,sv.hodem,sv.ten,sv.malop,dt.lanthi,dt.diem ,lp.makhoa from diemthi as `dt`
inner join hocphan as `hp`
on dt.mahocphan=hp.mahocphan
inner join sinhvien as `sv`
on dt.masv=sv.masv
inner join lop as `lp`
on sv.malop=lp.malop
inner join khoa as `kh`
on lp.makhoa=kh.makhoa
-- where diem = (select max(diem) from diemthi)
order by dt.lanthi asc,dt.diemthi desc
limit 5;



SELECT 
    hp.tenhocphan, 
    dt.mahocphan, 
    dt.masv, 
    sv.hodem, 
    sv.ten, 
    sv.malop, 
    dt.lanthi, 
    dt.diem, 
    lp.makhoa 
FROM 
    diemthi AS dt
INNER JOIN 
    hocphan AS hp ON dt.mahocphan = hp.mahocphan
INNER JOIN 
    sinhvien AS sv ON dt.masv = sv.masv
INNER JOIN 
    lop AS lp ON sv.malop = lp.malop
ORDER BY 
   dt.diem desc -- điểm giảm dần
LIMIT 10;


-- 1. Hiển thị tất cả thông tin trong bảng SINHVIEN
select * from sinhvien;

-- 2 Hiển thị các học phần có số tín chỉ lớn hơn 3 gồm các thông tin: mahocphan
-- đặt bí danh (Alias) là Mã học phần, tenhocphan đặt bí danh là Tên học phần
select * from hocphan;
select mahocphan as `mã học phần`,tenhocphan from hocphan 
where sotinchi >= 3 ;

-- 3. Hiển thị danh sách sinh viên nữ của trường gồm các thông tin: masv,
-- hodem, ten, ngay sinh, gioitinh. Kết quả trả về sắp xếp giảm dần theo tên
-- sinh viên

select masv,hodem,ten,ngaysinh,gioitinh  from sinhvien
where gioitinh in ('Nữ')
order by  masv asc , ten desc;

-- 4. Hiển thị bảng điểm lần 1 của học phần có mã là csdl gồm các thông tin
-- sau: masv, ho va ten (ghép giữa hai cột hodem và ten), diem.

select 
   sv.masv
   ,concat(sv.hodem,' ' ,sv.ten)
   as 'họ và tên',dt.diem
from sinhvien as sv
inner join diemthi as dt
on sv.masv=dt.masv
where lanthi = 1 and dt.mahocphan in ('csdl');

-- 5. Hiển thị danh sách sinh viên của khoa Khoa học Máy tính gồm các thông
-- tin masv, hodem, ten, tenlop, namnhaphoc.

select sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ',lp.tenlop,lp.namnhaphoc,kh.tenkhoa from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
inner join khoa as kh
on lp.makhoa=kh.makhoa
where kh.makhoa in ('CNTT');


-- 6 Hiển thị những sinh viên nữ thi lại học phần tên SQL Server gồm các thông
-- tin sau: masv, hodem, ten, tenlop.
select sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ',lp.tenlop,dt.lanthi,hp.tenhocphan
from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
inner join diemthi as dt
on sv.masv=dt.masv
inner join hocphan as hp
on dt.mahocphan=hp.mahocphan
-- where dt.lanthi =2 and hp.mahocphan in('Cơ sở dữ liệu') and sv.gioitinh in('Nữ')
where sv.gioitinh in('Nữ') and hp.tenhocphan in('Cơ sở dữ liệu') and  dt.lanthi =2;
--  7. Hiển thị những sinh viên khóa 1 có điểm thi lần 1 từ 8 đến 9 gồ
-- in sau: masv, hodem, ten, tenlop, tenmonhoc, diem, tenkhoa
select sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ',lp.tenlop,hp.tenhocphan,dt.diem,kh.tenkhoa,lp.khoahoc
from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
inner join khoa as kh
on lp.makhoa=kh.makhoa
inner join diemthi as dt
on sv.masv=dt.masv
inner join hocphan as hp
on dt.mahocphan=hp.mahocphan
where dt.lanthi=1 and dt.diem between 8 and 9 and lp.khoahoc=1;

-- 8. Hiển thị masv, hodem, ten, trung bình điểm lần 1 của từng sinh viên
select sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ' , avg(dt.diem) as `  điểm trung bình điểm lần 1 `
from sinhvien as sv
inner join diemthi as dt
on sv.masv=dt.masv
where dt.lanthi =1
group by sv.masv , ' họ tên sinh viên '
order by sv.masv asc;
-- 9. Hiển thị makhoa, tenkhoa, số sinh viên của mỗi khoa.
select kh.makhoa, kh.tenkhoa,count(*) as` số lượng sinh viên `
from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
inner join khoa as kh
on lp.makhoa=kh.makhoa
group by kh.makhoa, kh.tenkhoa;

-- 10.Hiển thị mã lớp, tên lớp có nhiều hơn 2 sinh viên
select lp.malop,lp.tenlop,count(sv.masv) as ` số lượng sinh viên `
from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
group by  lp.malop,lp.tenlop
having count(sv.masv) >2;
-- 11.Hiển thị mã sinh viên, họ và tên, tên lớp có điểm trung bình lần 1 lớn hơn 7
select sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ',lp.tenlop, avg(dt.diem) as `  điểm trung bình điểm lần 1 `
from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
inner join diemthi as dt
on sv.masv=dt.masv
where dt.lanthi=1
group by sv.masv , ' họ tên sinh viên ',lp.tenlop
having avg(dt.diem)>7;
-- 12.Hiển thị mã sinh viên, họ và tên, tên lớp, tên khoa của những sinh viên từ
-- 23 đến 30 tuổi, kết quả trả về sắp xếp giảm dần theo tên
select sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ',lp.tenlop, kh.tenkhoa, year(sv.ngaysinh) as 'nắm sinh'
from sinhvien as sv
inner join lop as lp
on sv.malop=lp.malop
inner join khoa as kh
on lp.makhoa=kh.makhoa
where TIMESTAMPDIFF(YEAR, sv.ngaysinh, CURDATE()) BETWEEN 22 AND 30
order by sv.ten desc;

-- 13.Hiển thị mã sinh viên, họ và tên, điểm của những sinh viên thi lầ
-- phần có mã là SQL cao điểm nhất (HD: sử dụng View trung gian).
SELECT
    sv.masv,
    CONCAT(sv.hodem, ' ', sv.ten) AS 'Họ và Tên',
    dt.diem
FROM
    sinhvien AS sv
INNER JOIN
    diemthi AS dt ON sv.masv = dt.masv
WHERE
    dt.mahocphan = 'csdl'
    AND dt.diem = (
        SELECT MAX(diem) 
        FROM diemthi 
        WHERE mahocphan = 'csdl'
);
select 
    sv.masv , concat(sv.hodem,' ', sv.ten) as ' họ tên sinh viên ' ,
	avg(dt.diem) as `  điểm trung bình điểm lần 1 `,
	case 
	   when avg(dt.diem) >=9 then ' điểm xuất xắc'
	   when avg(dt.diem) >=8 then ' điểm giỏi'
	   when avg(dt.diem) >=7 then ' điểm khá'
	   else ' điểm trung bình'
	 end as 'Xếp loại học lực'
from sinhvien as sv
inner join diemthi as dt
on sv.masv=dt.masv
GROUP BY sv.masv, ' họ tên sinh viên ';


use quanlidiem;

select * from lop;
-- Hiển thị masv, hodem, ten của sinh viên khóa 1.

select sv.masv,concat(sv.hodem,' ',sv.ten) as 'Họ tên', lp.khoahoc as 'khóa học' from sinhvien as `sv`
inner join lop as lp
on sv.malop=lp.malop
where lp.khoahoc = 1


-- Hiển thị danh sách sinh viên nữ của trường gồm các thông tin: masv,
-- hodem, ten, ngay sinh, gioitinh. Kết quả sắp xếp tăng dần theo tên, họ đệm
-- sinh viên.

select masv,hodem,ten,ngaysinh,gioitinh from sinhvien where gioitinh in ('nữ')
order by ten asc ,hodem desc;

-- . Hiển thị bảng điểm lần 1 có học phần có mã là ‘SQL’ gồm các thông tin
-- sau: masv, hodem, ten, diem.

select sv.masv,concat(sv.hodem,' ',sv.ten) as 'họ tên' ,dim.diem , hp.tenhocphan from sinhvien as sv
inner join diemthi as dim
on sv.masv=dim.masv
inner join hocphan as hp
on dim.mahocphan=hp.mahocphan
where hp.mahocphan ='sql' and dim.lanthi =1;


select sv.masv,concat(sv.hodem,' ',sv.ten) as 'họ tên' ,dim.diem , hp.tenhocphan from sinhvien as sv
inner join diemthi as dim
on sv.masv=dim.masv
inner join hocphan as hp
on dim.mahocphan=hp.mahocphan
where dim.lanthi =2 AND gioitinh in('nữ') and hp.mahocphan = 'hdh';

-- Hiển thị malop, tenlop của các lớp thuộc khoa có mã là KHMT. Yêu cầu
-- đặt lại tiêu đề bằng tiếng Việt cho các cột tương ứng

use quanlidiem


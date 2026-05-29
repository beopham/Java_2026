create database quanlisinhvien_titv_spring;
use quanlisinhvien_titv_spring;

create table sinhvien(
id_sinhvien int auto_increment,
hodem varchar(200) not null,
ten varchar(200) not null,
email varchar(200) not null,
constraint pk_sinhvien primary key(id_sinhvien)
);

INSERT INTO sinhvien (hodem, ten, email) VALUES

('Nguyễn Văn', 'An', 'an.nguyen@gmail.com'),
('Trần Thị', 'Bình', 'binh.tran@yahoo.com'),
('Lê Hoàng', 'Cường', 'cuong.le@hotmail.com'),
('Phạm Minh', 'Dũng', 'dung.pham@outlook.com'),
('Hoàng Thu', 'Giang', 'giang.hoang@gmail.com'),
('Vũ Quốc', 'Hải', 'hai.vu@gmail.com'),
('Đặng Thị', 'Khánh', 'khanh.dang@yahoo.com'),
('Bùi Tiến', 'Linh', 'linh.bui@gmail.com'),
('Đỗ Hồng', 'Nhung', 'nhung.do@hotmail.com'),
('Ngô Chí', 'Thành', 'thanh.ngo@outlook.com');
select * from sinhvien;
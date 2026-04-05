use sach;
create table Sach(
 id varchar(200) not null,
 tensach nvarchar(200) not null,
 giaban int not null,
 namxuanban int not null,
 constraint pk_sach_id primary key(id)
);
create table Khachhang(
 id varchar(200) not null,
 hoten nvarchar(200) not null,
 ngaysinh date not null,
 diachi nvarchar(200) not null,
 constraint pk_kh_id primary key(id),
 constraint fk_id_sach foreign key(id) references Sach(id)
);

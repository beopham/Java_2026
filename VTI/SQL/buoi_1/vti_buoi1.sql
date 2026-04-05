create database VTI_buoi_1;
use VTI_buoi_1;

-- Table 1:Department  
-- DepartmentID:  định danh của phòng ban (auto increment) 
-- DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …) 
-- Table 2: Position  
-- PositionID:  định danh của chức vụ (auto increment) 
-- PositionName: tên chức vụ (Dev, Test, Scrum Master, PM) 
-- Table 3: Account  
-- AccountID:  định danh của User (auto increment) 
-- Email:  Địa chỉ email
-- Username:  tên đăng nhập
-- FullName:  tên đầy đủ
-- DepartmentID: phòng ban của user trong hệ thống 
-- PositionID: chức vụ của User 
-- CreateDate: ngày tạo tài khoản 

create table Position   (
PositionID int not null auto_increment,
PositionName varchar(200) not null ,
constraint pk_po primary key(PositionID) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



create table Department (
DepartmentID int not null auto_increment,
DepartmentName varchar(200) not null ,
constraint pk_de primary key(DepartmentID) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


create table Account_vti(
  AccountID int not null auto_increment,
  Email varchar(500) not null,
  Username varchar(500) not null,
  Fullname varchar(500) not null,
  DepartmentID int not null,
  PositionID int not null,
  CreateDate date not null,
  constraint pk_acc primary key( AccountID )
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- thêm dữ liệu nha 

insert into Department(DepartmentName)
values('cntt');


insert into Department(DepartmentName)
values('bảo vê'),
	 ('lao công'),
	 ('kế toán');
select * from vti_buoi_1.department;


delete from Department where DepartmentID = 3;


update Department set DepartmentName = 'nam' where DepartmentID = 1;
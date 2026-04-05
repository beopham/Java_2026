create database hoctap;
use hoctap;

create table vendor(
  V_code int not null auto_increment,
 V_Contact VARCHAR(300) NOT NULL, -- Đổi NVARCHAR thành VARCHAR
    V_AreaCode CHAR(3) NOT NULL,
    V_Phone CHAR(8) NOT NULL,
    V_State CHAR(2) NOT NULL,
    V_Order CHAR(1) NOT NULL,
    constraint pk_vendor primary key(V_code) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4; -- Thêm dòng này để hỗ trợ tiếng Việt chuẩn nhất

CREATE TABLE Product (
P_Code	VARCHAR(10) NOT NULL,
P_Descript	VARCHAR(35) NOT NULL,
P_InDate	DATE NOT NULL,
P_QOH	INT NOT NULL,
P_Min	INT NOT NULL,
P_Price	DECIMAL(8,2) NOT NULL,
P_Discount	DECIMAL(8,2) NOT NULL,
 V_code int,
 -- tạo khóa chínhw
 constraint PK_Product primary key(P_Code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
ALTER TABLE Product
ADD CONSTRAINT fk_pr_vendor 
FOREIGN KEY (V_code) REFERENCES Vendor(V_Code)
ON DELETE SET NULL  -- An toàn hơn CASCADE
ON UPDATE CASCADE;  -- Vẫn giữ cái này để đồng bộ mã



-- Use	the	SQL	statements	to	create	the	tables:	Books	
-- (BookID,	BookTitle,	CopyRight,	Year),	Authors	(AuthorID,	
-- AuthorFName,	AuthorMName,	AuthorLName,	
-- DateOfBirth,	Gender,	Address)		and	AuthorBook	
-- (BookID,	AuthorID)	
create table Books(
BookID int not null auto_increment,
BookTitle varchar(200) not null,
CopyRight varchar(200) not null,
Publishyear Year not null,
constraint pk_book primary key(BookID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table Authors(
AuthorID int not null auto_increment,
AuthorFName varchar(200) not null,
AuthorLName varchar(200) not null,
constraint pk_Authors primary key(AuthorID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table AuthorBook	(
AuthorID int not null ,
BookID int not null,
constraint pk_auh primary key( AuthorID,BookID), 
constraint fk_author foreign key(AuthorID) references Authors
on update cascade
on delete cascade,
constraint fk_book foreign key(BookID) references Books
on update cascade
on delete cascade
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



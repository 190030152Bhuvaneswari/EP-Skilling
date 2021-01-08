create database datascienceskill1;
create table Employee(id int,name varchar(45),mail varchar(45),Dept varchar(45), DOB date,salary int);
insert into Employee values(30152,'Bhuvana','B@gmail.com','CSE','1986-04-11',45000);
insert into Employee values(30001,'Sai','S@gmail.com','EEE','1996-08-12',45000);
insert into Employee values(30002,'Vamsi','V@gmail.com','ECSE','1986-07-11',45000);
insert into Employee values(30003,'Phani','P@gmail.com','CSE','1997-09-13',45000);
insert into Employee values(30004,'Priya','Pr@gmail.com','MP','1990-05-15',45000);
desc Employee;
select * from Employee;
#alter command
alter  table Employee add(address varchar(45));
#updation
update Employee set name='Roy' where id=30152;
select * from Employee;
update Employee set salary=salary+1000; 
# deletion
alter table Employee drop address;
select * from Employee;


create table goodsinfo (
code char(5) not null,
name varchar2(30) not null,
price number(8) not null,
maker varchar2(20),
primary key(code)
);

--����
insert into goodsinfo(code, name, price, maker)
values('10001','������TV',350000,'LG');
insert into goodsinfo(code, name, price, maker)
values('10002','DVD �÷��̾�',250000,'LG');
insert into goodsinfo(code, name, price, maker)
values('10003','������ ī�޶�',210000,'�Ｚ');
insert into goodsinfo(code, name, price, maker)
values('10004','���ڻ���',180000,'���̸���');
insert into goodsinfo(code, name, price, maker)
values('10005','������ ������',400000,'�Ｚ');

commit
--�˻�
select * from GOODSINFO;
select * from goodsinfo where price>300000;
select * from goodsinfo where maker='LG' or name ='���ڻ���';
select * from goodsinfo where maker like '��%' or code like '%3';
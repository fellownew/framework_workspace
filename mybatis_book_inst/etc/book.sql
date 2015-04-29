drop sequence publisher_no_seq;
create sequence publisher_no_seq
nocache;

drop table publisher cascade constraint;
create table publisher (
	publisher_no number primary key,
	publisher_name varchar2(50) not null,
	publisher_address varchar2(100) not null,
	publisher_tel varchar2(20) not null
);

insert into publisher values (publisher_no_seq.nextval, 'A출판사', '경기도 파주시', '031-541-8624');
insert into publisher values (publisher_no_seq.nextval, 'B출판사', '경기도 파주시', '031-332-1228');
insert into publisher values (publisher_no_seq.nextval, 'C출판사', '경기도 성남시', '031-5321-2332');
insert into publisher values (publisher_no_seq.nextval, 'D출판사', '경기도 파주시', '031-987-3418');
insert into publisher values (publisher_no_seq.nextval, 'E출판사', '서울시 동대문구', '02-333-4321');
insert into publisher values (publisher_no_seq.nextval, 'F출판사', '서울시 마포구', '02-531-8392');
insert into publisher values (publisher_no_seq.nextval, 'G출판사', '서울시 마포구', '02-8211-7398');
insert into publisher values (publisher_no_seq.nextval, 'H출판사', '서울시 동작구', '02-982-1012');



drop table book;
create table book (
	isbn varchar2(13) primary key,
	title varchar2(50) not null, 
	author varchar2(50) not null, 
	page number(4) not null, 
	price number not null, 
	publish_date date not null, 
	publisher_no number not null,
	constraint fk_publisher_to_book foreign key (publisher_no) references publisher (publisher_no)	
);
insert into book values('9788971996676','자바기본','김저자',910 ,30000,'20100704',1);
insert into book values('8788971996676','자바서블릿','이저자',754 ,25000,'20111004',1);
insert into book values('5488971996676','JSP','최저자',910 ,33200,'20150705',1);
insert into book values('9182971996676','자바기본2','엄저자',910 ,17000,'20011023',2);
insert into book values('5218971996676','자바기본2','오저자',1070 ,33000,'20130722',2);
insert into book values('1288971019283','마이바티스','김저자',630 ,36000,'20150214',4);
insert into book values('9186171996676','자바웹프로그래밍','김저자',730 ,17000,'20011023',5);
insert into book values('5218812996676','안드로이드','안저자',880 ,33000,'20140521',3);
insert into book values('9997971019283','스프링','김저자',678 ,26000,'20150214',3);




select * from publisher

select * from book
where publish_date between '20111001' and '20150101'


create table publisher(
publisher_no number,
publisher_name varchar2(50) not null,
publisher_address varchar2(100) not null,
publisher_tel varchar2(20) not null,
constraint pk_pub_no primary key(publisher_no)
);

create table book(
isbn varchar2(13) primary key,
title varchar2(50) not null,
author varchar(50) not null,
page number(4) not null,
price number not null,
publish_date date not null,
publisher_no number,
foreign key(publisher_no) references publisher(publisher_no)
)

drop table book;
drop table publisher

select *from book;
select *from publisher
select ISBN,title,author,page,price,publish_date,publisher_no from book

drop sequence pub_No_seq;
create sequence pub_No_seq;
select pub_No_seq.nextval from dual


select pub.publisher_no,pub.publisher_name,pub.publisher_address,pub.publisher_tel,
book.isbn,book.title,book.author,page,book.price,book.publish_date,book.publisher_no
from publisher pub, book book
where pub.publisher_no=13 and pub.publisher_no=book.publisher_no




insert into book(isbn,title,author,page,price,publish_date,publisher_no)
values ('9788994797205','유지보수 어렵게 코딩하는 방법 ', '로에디 그린', 70,1000,to_date(111201),1)



('9788996991342','미움받을용기', '기시미 이치로', 331,13000,to_date(141125),2)
('9791155780480','지지 않는 청춘', '이케다 다이사쿠', 180,9000,to_date(150316),2)
('9791185502076','비밀의 정원', '조해너 배스포드 ', 96,10000,to_date(140920),3)
('9788994120966','지적 대화를 위한 넓고 얕은 지식', '채사장',376,14000,to_date(140624),4)
('9788960867680','대화의 신', '래리 킹', 276,11000,to_date(150127),5)
('9788901203287','오늘 내가 사는 게 재미있는 이유', '김혜남', 288,12000,to_date(150323),6)
('9788998274238','레프트오버 ', '톰 페로타', 524,13000,to_date(150411),7)
('9791156755371','1그램의 용기 ', '한비야', 360,12000,to_date(150224),8)
('9788954635738','생각하는 인문학 ', '이지성', 424,16000,to_date(150330),9)





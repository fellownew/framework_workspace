select *from member

drop table member;
create table member(
member_id varchar(50) primary key,
member_pwd varchar(50) not null,
member_name varchar(50) not null,
member_email varchar(50) not null,
member_date varchar(50) not null

)

select to_char(sysdate, 'yyyymmdd') from dual
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

select ceil(rownum/5) page,member_id,member_pwd,member_name,member_email,member_date from member

select page, member_id,member_pwd,member_name,member_email,member_date
from(
	select ceil(rownum/5) page, member_id,member_pwd,member_name,member_email,member_date 
	from(
		select member_id,member_pwd,member_name,member_email,member_date 
		from member
		order by member_date desc,member_id asc
	)
)
where page=1

select count(member_id) from member
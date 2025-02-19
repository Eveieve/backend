create database ssgdb; -- root 계정만 가능한 명령. 루트 계정으로 ssgdb 라는 사용자 정의 디비 만들었음. 
create user ssgdb@localhost identified by 'ssg'; -- ssgdb 디비를 사용하는 ssgdb 사용자, 패스워드 'ssg1234'
grant all privileges on ssgdb. * to ssgdb@localhost; -- ssgdb@localhost에게 모든 접근 권한을 주겠다.alter
commit; -- 반영해라.

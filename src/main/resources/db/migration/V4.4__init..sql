create table Reader
(
  id       serial primary key,
  username varchar(25) unique not null,
  password varchar(20)        not null,
  fullname varchar(50)        not null
);


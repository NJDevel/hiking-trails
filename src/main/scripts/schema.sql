drop table if exists trail;
drop table if exists trail_seq;
create table trail (
                       id bigint not null,
                       address varchar(255),
                       name varchar(255),
                       trail_length_in_miles varchar(255),
                       trail_website varchar(255),
                       primary key (id)
) engine=InnoDB;

create table trail_seq (
    next_val bigint
) engine=InnoDB;

insert into trail_seq values (1);
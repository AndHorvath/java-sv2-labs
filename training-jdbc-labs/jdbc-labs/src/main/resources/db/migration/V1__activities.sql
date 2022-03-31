create table activities (
    id bigint auto_increment,
    start_time timestamp,
    description varchar(511),
    activity_type varchar(127),
    constraint pk_activities primary key (id)
);
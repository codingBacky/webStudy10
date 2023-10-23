package com.backy.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerVO {
/*
 custno NUMBER(6) not null,
custname varchar2(20),
phone VARCHAR2(13),
address VARCHAR2(60),
joindate date,
grade char(1),
city char(2),
primary key(custno)
 */
	String custno;
	String custname;
	String phone;
	String address;
	Timestamp joindate;
	String grade;
	String city;
}

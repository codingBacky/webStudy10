package com.backy.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MoneyVO {
 /*
  	custno NUMBER(6) not null,
	salenol NUMBER(8)not null,
	pcost NUMBER(8),
	amount VARCHAR2(4),
	price number(8),
	pcode VARCHAR2(4),
	sdate date,
	primary key(custno,salenol)  
  
  */
	String custno;
	String salenol;
	int pcost;
	String amount;
	int price;
	String pcode;
	String sdate;
}

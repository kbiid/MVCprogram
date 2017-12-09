package com.kkjproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Offer {
	private int year;
	private int semester;
	private String coursecode;
	private String coursename;
	private String division;
	private int credit;
	
}

package com.kkjproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class creditSum {
	private int must,core,desig,found,choice,free,total;
	
	public void sumCredit(Offer offer){
		switch(offer.getDivision()){
		case "핵교A" :
		case "핵교B" :
		case "인재" :
			core += offer.getCredit();
			total += offer.getCredit();
			break;
		case "교필" :
			must += offer.getCredit();
			total += offer.getCredit();
			break;
		case "전지" :
			desig += offer.getCredit();
			total += offer.getCredit();
			break;
		case "전기" :
			found += offer.getCredit();
			total += offer.getCredit();
			break;
		case "전선" :
			choice += offer.getCredit();
			total += offer.getCredit();
			break;
		case "자율" :
			free += offer.getCredit();
			total += offer.getCredit();
			break;
			
		}
	}
}

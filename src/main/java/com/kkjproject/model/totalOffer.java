package com.kkjproject.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class totalOffer {
	int totalCredit;
	int year;
	int semester;
	List<Offer> offers = new ArrayList<Offer>();
	
	public void sumoffer(Offer offer){
		offers.add(offer);
	}
}

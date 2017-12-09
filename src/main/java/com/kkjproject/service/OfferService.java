package com.kkjproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkjproject.dao.OfferDAO;
import com.kkjproject.model.Offer;


@Service
public class OfferService {

	@Autowired
	private OfferDAO offerDao;
	
	public List<Offer> getCurrent(){
		return offerDao.getOffers();
	}
	
	public void insert(Offer offer) {
		offerDao.insert(offer);
		
	}
}

package com.kkjproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kkjproject.dao.OfferDAO;
import com.kkjproject.model.Offer;
import com.kkjproject.model.creditSum;
import com.kkjproject.model.totalOffer;
import com.kkjproject.service.OfferService;


@Controller
public class OfferController {

	@Autowired
	private OfferService offerService;
	
	@RequestMapping("/choice")
	public String showChoice(Model model){
		model.addAttribute("offer", new Offer());
		return "choice";
	}
	
	@RequestMapping("/divisionshow")
	public String showDivisionshow(Model model){
		List<Offer> offers = offerService.getCurrent();
		creditSum sum = new creditSum();
		for(int i=0; i<offers.size();i++){
			sum.sumCredit(offers.get(i));
		}
		model.addAttribute("sum", sum);
		
		return "divisionshow";
	}
	
	@RequestMapping("/enrolementview")
	public String showEnrolementview(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if(offer.get(i).getYear() == 2018){
				offers.add(offer.get(i));
			}
			
		}
		model.addAttribute("offer", offers);
		return "enrolementview";
	}
	
	@RequestMapping("/totalshow")
	public String showTotalshow(Model model){
		List<Offer> offers = offerService.getCurrent();
		
		
		model.addAttribute("offers", offers);
		
		return "totalshow";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Offer offer, BindingResult result){
		
		if(result.hasErrors()){
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error:errors){
				System.out.println(error.getDefaultMessage());
			}
			
			return "choice";
		}
		
		offer.setSemester(1);
		offer.setYear(2018);
		offerService.insert(offer);
		
		return "offercreated";
	}
	
	@RequestMapping("/showcourse")
	public String showCourse(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if((offer.get(i).getYear() == 2012) && (offer.get(i).getSemester() == 1)){
				offers.add(offer.get(i));
			}
		}
		
		model.addAttribute("offer", offers);
		
		return "showcourse";
	}
	
	@RequestMapping("/showcourse2")
	public String showCourse2(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if((offer.get(i).getYear() == 2012) && (offer.get(i).getSemester() == 2)){
				offers.add(offer.get(i));
			}
		}
		
		model.addAttribute("offer", offers);
		
		return "showcourse2";
	}
	
	@RequestMapping("/showcourse3")
	public String showCourse3(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if((offer.get(i).getYear() == 2016) && (offer.get(i).getSemester() == 1)){
				offers.add(offer.get(i));
			}
		}
		
		model.addAttribute("offer", offers);
		
		return "showcourse3";
	}
	
	@RequestMapping("/showcourse4")
	public String showCourse4(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if((offer.get(i).getYear() == 2016) && (offer.get(i).getSemester() == 2)){
				offers.add(offer.get(i));
			}
		}
		
		model.addAttribute("offer", offers);
		
		return "showcourse4";
	}
	
	@RequestMapping("/showcourse5")
	public String showCourse5(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if((offer.get(i).getYear() == 2017) && (offer.get(i).getSemester() == 1)){
				offers.add(offer.get(i));
			}
		}
		
		model.addAttribute("offer", offers);
		
		return "showcourse5";
	}
	
	@RequestMapping("/showcourse6")
	public String showCourse6(Model model){
		List<Offer> offer = offerService.getCurrent();
		List<Offer> offers = new ArrayList<Offer>();
		for(int i = 0; i<offer.size(); i++){
			if((offer.get(i).getYear() == 2017) && (offer.get(i).getSemester() == 2)){
				offers.add(offer.get(i));
			}
		}
		
		model.addAttribute("offer", offers);
		
		return "showcourse6";
	}
	
}

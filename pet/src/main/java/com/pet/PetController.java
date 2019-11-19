package com.pet;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pet")
public class PetController {
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView selectAll() {
		List<Pet> pets = new PetService().selectAllService();
		
		ModelAndView mav = new ModelAndView("/list");
		mav.addObject("pets", pets);
		
		return mav;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView select(int no) {
		Pet pet = new PetService().selectService(no);
		
		ModelAndView mav = new ModelAndView("/detail");
		mav.addObject("pet", pet);
		
		return mav;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("/add");
		
		return mav;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(Pet pet) {
		String addMsg = new PetService().add(pet);
		System.out.println(addMsg);
		
		ModelAndView mav = new ModelAndView("redirect:/pet/list");
		
		return mav;
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView edit(int no) {
		Pet pet = new PetService().edit(no);
		
		ModelAndView mav = new ModelAndView("/edit");
		mav.addObject("pet", pet);
		
		return mav;
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView edit(Pet pet) {
		String addMsg = new PetService().edit(pet);
		System.out.println(addMsg);
		ModelAndView mav = new ModelAndView("redirect:/pet/list");
		
		return mav;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(int no) {
		String addMsg = new PetService().delete(no);
		System.out.println(addMsg);
		
		ModelAndView mav = new ModelAndView("redirect:/pet/list");
		
		return mav;
	}
}
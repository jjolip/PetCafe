package com.pet;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PetService {
	public List<Pet> selectAllService() {
		List<Pet> pets = new PetDao().selectAllDao();
		return pets;
	}
	
	public Pet selectService(int no) {
		Pet pet = new PetDao().selectDao(no);
		return pet;
	}
	
	public String add(Pet pet) {
		String addMsg = new PetDao().add(pet);
		
		return addMsg;
	}
	
	public Pet edit(int no) {
		Pet pet = this.selectService(no);
		return pet;
	}
	
	public String edit(Pet pet) {
		String editMsg = new PetDao().edit(pet);
		
		return editMsg;
	}
	
	public String delete(int no) {
		String deleteMsg = new PetDao().delete(no);
		
		return deleteMsg;
	}
}

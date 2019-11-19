package com.pet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PetDao {
	Pet pet = new Pet("1", "멍구", "강아지", "믹스", "겁이 많음.");
	
	public List<Pet> selectAllDao() {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(pet);
		
		return pets;
	}
	
	public Pet selectDao(int no) {
		return pet;
	}
	
	public String add(Pet pet) {
		return "성공적으로 등록 되었습니다.";
	}
	
	public String edit(Pet pet) {
		return "성공적으로 수정 되었습니다.";
	}
	
	public String delete(int no) {
		return "성공적으로 삭제 되었습니다.";
	}
}

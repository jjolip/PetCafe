package com.pet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PetDao {
	Pet pet = new Pet("1", "�۱�", "������", "�ͽ�", "���� ����.");
	
	public List<Pet> selectAllDao() {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(pet);
		
		return pets;
	}
	
	public Pet selectDao(int no) {
		return pet;
	}
	
	public String add(Pet pet) {
		return "���������� ��� �Ǿ����ϴ�.";
	}
	
	public String edit(Pet pet) {
		return "���������� ���� �Ǿ����ϴ�.";
	}
	
	public String delete(int no) {
		return "���������� ���� �Ǿ����ϴ�.";
	}
}
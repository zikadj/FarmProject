package com.model.intefaces;

import java.util.List;

public interface AnimalService<T> {

	T addAnimal(T animal);

	T updateAnimal(T animal);

	boolean deleteAnimal(int id);

	T getAnimalById(int id);

	List<T> getAllAnimals();

	void updateStatus(int id, String status);

}

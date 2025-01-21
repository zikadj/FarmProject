package com.model.intefaces;

import com.model.animal.herbivores.Horse;

public interface HorseService extends AnimalService<Horse> {

	void trackPerformance(int horseId, String performanceDetails);

	void assignToTask(int horseId, String task);

}

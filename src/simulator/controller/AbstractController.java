package simulator.controller;

import simulator.model.Model;
import simulator.modules.food.AbstractFood;
import simulator.modules.insulin.Insulin;

public abstract class AbstractController {

	public static enum FoodType {HIGH,MED,LOW};
	public static enum InsulinType {LONG,RAPID,SHORT};
	
	private Model model;
	/**
	 * 
	 */
	 java.lang.Thread timeSource;
	/**
	 * 
	 */
	 java.lang.Boolean pause;
	/**
	 * 
	 */
	 int delay;
	/**
	 * 
	 */
	public abstract void addFood(AbstractFood food);

	/**
	 * 
	 */
	 abstract void addInsulin(Insulin insulin);

	/**
	 * 
	 */
	 abstract void setPause();

	/**
	 * 
	 */
	 abstract void unsetPause();

	/**
	 * 
	 */
	 abstract void setDelay(int delay);

	public AbstractController(Model model2) {
		model = model2;
	}

	/**
	 * 
	 */
	 abstract void addFood(FoodType foodType);
	 abstract void addInsulin(InsulinType insulinType);

}
package Factory;

//import Factory.Food;
//import Factory.FoodFactorySystem;
public class FactoryMain {

	public static void main(String[] args)
	{
		FoodFactorySystem fm = new FoodFactorySystem();
	Food obj = fm.getFood("Cake");
		obj.spec();

	}

}

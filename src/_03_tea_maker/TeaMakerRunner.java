package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[]arg0) {
		TeaBag bag = new TeaBag("Passion Fruit");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		
		
		kettle.boil();
		cup.makeTea(bag, kettle.getWater());
		
		
		
		
	}
	
	
}

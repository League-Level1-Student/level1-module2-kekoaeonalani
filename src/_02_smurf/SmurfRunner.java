package _02_smurf;

public class SmurfRunner {

	public static void main(String[]Arg0) {
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa Smurf");
		Smurf ette = new Smurf("Smurfette");
		
		System.out.println(handy.eat());
		System.out.println(handy.getName());
		
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor("red"));
		System.out.println(papa.isGirlOrBoy("boy"));
		
		System.out.println(ette.getName());
		System.out.println(ette.getHatColor("white"));
		System.out.println(ette.isGirlOrBoy("girl"));
		
		
		
	}
	
}

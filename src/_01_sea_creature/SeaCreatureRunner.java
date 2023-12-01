package _01_sea_creature;

public class SeaCreatureRunner {


public static void main(String[]arg0) {
	SeaCreature bob = new SeaCreature("Sponge Bob");
	SeaCreature pat = new SeaCreature("Patrick");
	SeaCreature sq= new SeaCreature("Squidward");
	
	
	bob.getName();
	pat.getName();
	sq.getName();
	
	bob.eat();
	pat.eat();
	sq.eat();
	
	bob.laugh();
	pat.laugh();
	sq.laugh();
}



}

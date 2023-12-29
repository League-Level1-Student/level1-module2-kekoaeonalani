package _99_extra._05_minion;

public class Minion {

		private String color;
		private String master;
		private int eyes;
		private String name;

		public Minion(String name, int eyes, String color, String master) {
			this.name = name;
			this.eyes = eyes;
			this.color = color;
			this.master = master;
		}
		
		public String getName (){
			return ("this minion's name is " + name);
		}
		public String getEyes() {
			return ("this minion has " + eyes);
		}
		public String getColor() {
			return("this minion's color is "+ color);
		}
		
}

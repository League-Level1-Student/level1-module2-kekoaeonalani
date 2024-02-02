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
			return (name);
		}
		void setName(String name) {
			this.name = name;
		}
		
		public int getEyes() {
			return eyes;
		}
		
		void setEyes(int eyes) {
			this.eyes = eyes;
		}
		public String getColor() {
			return(color);
		}
		
		void setColor(String color) {
			this.color = color;
		}
		
		public String getMaster() {
			return(master);
		}
		void setMaster(String master) {
			this.master = master;
		}

}

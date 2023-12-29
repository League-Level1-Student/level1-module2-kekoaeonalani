package _99_extra;

public class PixelPartyRunner {
	public static void main(String[]arg0) {
		PixelParty draw = new PixelParty();
		draw.setColor(245, 24, 92);
		draw.drawCircle(34, 69, 68);
		draw.drawLine(0.123, 0.3546, 2.3847, 1.8725);
		draw.drawRectangle(70, 95, 70, 60);
		draw.drawTriangle(12, 243, 253, 76, 45, 2736);
		draw.saveImage();
		draw.displayImage();
	}
}

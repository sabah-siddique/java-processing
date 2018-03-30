import processing.core.PApplet;

public class ShapeArrays extends PApplet {

	public static int[][] shapes = new int[5][5]; // error unless declared "public static"
	
	
	public static void main(String[] args) {
		PApplet.main("ShapeArrays");
		
		for (int i = 0; i < shapes.length; i++) {
			for (int j = 0; j < shapes[i].length; j++) {
				shapes[i][j] = (int)Math.round(Math.random()); // random integer 0 or 1
			}
		}
	}
	
	
	public void settings() {
		size(500,500);
		
	}
	
	
	public void setup() {
		rectMode(CENTER);
		
	}
	
	
	public void draw() {
		background(0); // clear the background at the start of each draw loop
		
		// for loop to determine which shape to draw
		for (int row = 0; row < shapes.length; row++) {
			for (int col = 0; col < shapes[row].length; col++) {
				if (shapes[row][col] == 0)
					drawShape(row, col, shapes[row][col]);
				else
					drawShape(row, col, shapes[row][col]);
			}
		} 
		
		 
	}
	
	
	public void drawShape(int row, int col, int shape) {
		// row tells us the y coordinate - all shapes in row 0 are 50 pixels down
		// col tells us the x coordinate - all shapes in col 0 are 50 pixels in
		// shape is either 0 or 1, telling us which shape to draw
		int x, y;
		
		switch (row) {
		case 0:
			y = 50;
			break;
		case 1:
			y = 150;
			break;
		case 2:
			y = 250;
			break;
		case 3:
			y = 350;
			break;
		case 4:
			y = 450;
			break;
		default:
			y = 0;
		}
		
		switch (col) {
		case 0:
			x = 50;
			break;
		case 1:
			x = 150;
			break;
		case 2:
			x = 250;
			break;
		case 3:
			x = 350;
			break;
		case 4:
			x = 450;
			break;
		default:
			x = 0;
		}
		
		noStroke();
		fill(255);
		
		if (shape == 0) {
			ellipse(x, y, 50, 50);
		} else {
			rect(x, y, 50, 50);
		}
	}
	
}

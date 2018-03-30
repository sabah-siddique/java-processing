import processing.core.PApplet;

public class Rainbow extends PApplet {
	int sky = color(133,220,255);
	
	public static void main(String[] args) {
		PApplet.main("Rainbow");
	}
	
	
	public void settings() {
		size(500,500);
	}
	
	
	public void setup() {
		background(sky);
		
		beginShape();
		fill(255);
		smooth();
		stroke(89,207,255);
		strokeWeight(2);
		vertex(100, 100);
		bezierVertex(110, 60, 180, 60, 180, 90);
		bezierVertex(180, 85, 190, 85, 190, 90);
		bezierVertex(220, 70, 250, 150, 210, 160);
		bezierVertex(230, 180, 170, 190, 170, 170);
		bezierVertex(170, 190, 80, 200, 85, 160);
		bezierVertex(50, 160, 60, 90, 100, 100);
		endShape(CLOSE);
	
	}
	
	public void draw() {
		int[] colors = {
				color(252,126,126),
				color(252,180,126),
				color(252,235,126),
				color(227,252,126),
				color(182,252,126),
				color(140,252,125),
				color(126,252,146),
				color(126,252,195),
				color(126,148,252),
				color(152,125,252),
				color(168,126,252),
				color(252,126,213),
				color(227,126,252),
				color(252,126,227),
				color(252,125,153),
				color(252,126,138) // 16 colors
		};
		
		noFill();
		strokeWeight(30); // thickness of stroke
		stroke(colors[(int)random(16)]); // get random color from colors
		float rainbowSize = random(300, 390); // value for the width and height of ellipse
		
		// show only half of the ellipse, so center coordinate is (250, 550)
		ellipse(250, 550, rainbowSize, rainbowSize);

	}

}

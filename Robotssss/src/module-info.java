module Robotssss {
	import acm.graphics.*;
	import acm.program.*;
	import java.awt.*;


	public class MrRobot extends GraphicsProgram {
	static final double HEAD_HEIGHT = 400;
	static final double HEAD_WIDTH  = 300;
	static final double MOUTH_HEIGHT = HEAD_HEIGHT * .2;
	static final double MOUTH_WIDTH = HEAD_WIDTH * .80;
	double X;
	double Y;

	//entrance point to program
	public void run() {

	X = (getWidth() - HEAD_WIDTH) / 2;
	Y = (getHeight()- HEAD_HEIGHT) / 2;
	face(HEAD_WIDTH, HEAD_HEIGHT, Color.gray, Color.black);
	rightEye(20, Color.yellow);
	mouth(Color.white);

	}

	private void face (double HEAD_WIDTH, double HEAD_HEIGHT, Color fillColor, Color outlineColor) {
	System.out.println(getWidth());
	System.out.println(getHeight());


	//create new face  This code centers the head
	GRect face = new GRect(X, Y, HEAD_WIDTH, HEAD_HEIGHT);

	face.setFilled(true);
	face.setFillColor(fillColor);
	face.setColor(outlineColor);

	add (face);
	}

	private void rightEye (int rad, Color eyeColor) {
	int diam = rad * 2;

	//create new eye
	GOval eye = new GOval
	//coordinates of eyes
	(//(getWidth() - HEAD_WIDTH)/2,
	X -( HEAD_WIDTH/ 4),
	//coordinates of eyes
	(getHeight() - HEAD_HEIGHT)/2,

	diam, diam);

	eye.setFilled(true);
	eye.setColor(eyeColor);
	add(eye);

	}
	private void mouth (Color color) {
	//
	GRect mouth = new GRect
	((getWidth() - MOUTH_WIDTH) /2,
	((getHeight() * .7)) ,
	MOUTH_WIDTH, MOUTH_HEIGHT);
	mouth.setFilled(true);
	mouth.setColor(color);
	add(mouth);


	}
}
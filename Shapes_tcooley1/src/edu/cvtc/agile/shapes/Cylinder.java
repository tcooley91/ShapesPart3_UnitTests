/**
 * 
 */
package edu.cvtc.agile.shapes;

import javax.swing.JOptionPane;

/**
 * @author Tyler
 *
 */
public class Cylinder extends Shape {
	// Fields for holding incoming values for radius and height
	private float radius = 0.0f;
	private float height = 0.0f;
	
	// Constructor for the Cylinder class
	public Cylinder(float radius, float height) {
		if (radius > 0 && height > 0) {
			setRadius(radius);
			setHeight(height);
		} else {
			System.out.println("Please make sure to enter valid values!");
		}	
	}

	// surfaceArea method adjusted for cylinder formula
	@Override
	public float surfaceArea() {
		float cylinderSurfaceArea = (float)(2 * Math.PI * getRadius() * getHeight() + (2 * Math.PI * Math.pow(getRadius(), 2)));
		
		return cylinderSurfaceArea;
	}

	// volume method adjusted for cylinder formula
	@Override
	public float volume() {
		float cylinderVolume = (float)(Math.PI * Math.pow(getRadius(), 2) * getHeight());
		
		return cylinderVolume;
	}

	// render method for displaying message box with cylinder values
	@Override
	public void render() {
		String cylinderDisplay = "Cylinder:\nHeight: " + getHeight() + "\nRadius: " + getRadius() + "\nSurface Area: " + surfaceArea() + 
				"\nVolume: " + volume();
		
		JOptionPane.showMessageDialog(null, cylinderDisplay);
	}
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}
}

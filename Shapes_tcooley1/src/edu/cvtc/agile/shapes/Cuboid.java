/**
 * 
 */
package edu.cvtc.agile.shapes;

import javax.swing.JOptionPane;

/**
 * @author Tyler
 *
 */
public class Cuboid extends Shape {
	// The three fields for holding incoming values for width, height, and depth
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	// Constructor for Cuboid class
	public Cuboid(float width, float height, float depth) {
		if (width > 0 && height > 0 && depth > 0) {
			setWidth(width);
			setHeight(height);
			setDepth(depth);
		} else {
			System.out.println("Please enter a valid value for a valid result!");
		}
	}
	
	// surfaceArea method adjusted for cuboid formula
	@Override
	public float surfaceArea() {
		float cuboidSurfaceArea = (float)(2 * ((getDepth() * getWidth()) + (getWidth() * getHeight()) + (getHeight() * getDepth())));
		
		return cuboidSurfaceArea;
	}
	
	// volume method adjusted for cuboid formula
	@Override
	public float volume() {
		float cuboidVolume = (float)(getWidth() * getHeight() * getDepth());
		
		return cuboidVolume;
	}

	// render method for displaying message box with cuboid values
	@Override
	public void render() {
		String cuboidDisplay = "Cuboid:\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nDepth: " + getDepth() + "\nSurface Area: " + surfaceArea() + 
				"\nVolume: " + volume();
		
		JOptionPane.showMessageDialog(null, cuboidDisplay);
	}

	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	private void setDepth(float depth) {
		this.depth = depth;
	}

}

package edu.cvtc.agile.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.agile.shapes.Sphere;

public class SphereTest {

	@Test
	public void testSurfaceArea1() {
		Sphere sphere = new Sphere(10);
		
		float expected = (float)(4 * Math.PI * Math.pow(10, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea2() {
		Sphere sphere = new Sphere(5.725f);
		
		float expected = (float)(4 * Math.PI * Math.pow(5.725f, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea3() {
		Sphere sphere = new Sphere(1.25750f);
		
		float expected = (float)(4 * Math.PI * Math.pow(1.25750f, 2));
		
		float actual = sphere.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testVolume1() {
		Sphere sphere = new Sphere(10);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(10, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume2() {
		Sphere sphere = new Sphere(7.725f);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(7.725f, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume3() {
		Sphere sphere = new Sphere(7.725f);
		
		float expected = (float)(1.33 * Math.PI * Math.pow(7.725f, 3));
		
		float actual = sphere.volume();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testSphere1() {
		float expectedRadius = 6.275f;
		
		Sphere sphere = new Sphere(6.275f);
		
		assertEquals(expectedRadius, sphere.getRadius(), 0);
	}
	
	@Test
	public void testSphere2() {
		float unexpected = -6.275f;
		
		Sphere sphere = new Sphere(-6.275f);
		
		assertNotEquals("Please make sure to enter valid values!", unexpected, sphere.getRadius());
	}

	@Test
	public void testGetRadius() {
		Sphere sphere = new Sphere(10.250f);
		
		float expected = 10.250f;
		
		float actual = sphere.getRadius();
		
		assertEquals(expected, actual, 0);
	}

}

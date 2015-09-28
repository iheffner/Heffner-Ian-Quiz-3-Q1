package Main;

/**
 * JUnit testing for Triangle.java
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	//Three test case triangles
	Triangle tri1;
	Triangle tri2;
	Triangle tri3;
	
	@Before
	public void setUp() throws Exception {
		//Construct three triangles
		tri1 = new Triangle(4,4,2);
		tri2 = new Triangle(5,6,7);
		tri3 = new Triangle(4,4,4);
		
		//Run getPerimeter now to ensure area calculations can be done
		tri1.getPerimeter();
		tri2.getPerimeter();
		tri3.getPerimeter();
	}	
	
	@Test
	public void testGetPerimeter() {
		//Test the instance method getPerimeter
		assertTrue(tri1.getPerimeter() == 10);
		assertTrue(tri2.getPerimeter() == 18);
		assertTrue(tri3.getPerimeter() == 12);
	}
	
	@Test
	public void testGetArea() {
		//Test the instance method getArea
		assertTrue(tri1.getArea() == Math.sqrt(15));
		assertTrue(tri2.getArea() == Math.sqrt(216));
		assertTrue(tri3.getArea() == Math.sqrt(48));
		//Test the instance method toString once as well
		System.out.print(tri1.toString());
	}

}

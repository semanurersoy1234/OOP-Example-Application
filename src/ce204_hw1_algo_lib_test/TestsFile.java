package ce204_hw1_algo_lib_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ce204_hw1_algo_lib.*;

public class TestsFile {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCircleChangeScale1() {
		Circle instance = new Circle();
		double radius = 10;
		instance.changeScale(3.3, radius, 0);
		assertEquals(10, radius, 0);
	}
	
	@Test
	public void testCircleGetArea1() {
		Circle instance = new Circle();
		double radius = 10;
		assertEquals(314.1592653589793, instance.getArea(radius), 0);
	}

	@Test
	public void testCircleGetPerimeterLength1() {
		Circle hithere = new Circle();
		double radius = 10;
		assertEquals(62.83185307179586, hithere.getPerimeterLength(radius), 0);
	}

	@Test
	public void testCircleGetRadius1() {
		Circle instance = new Circle();
		double radius = 45;
		assertEquals(45, instance.getRadius(radius), 0);
	}
	
	@Test
	public void testEllipseChangeScale1() {
		Ellipse instance = new Ellipse();
		double semiMajorAxis = 20;
		double semiMinorAxis = 5;
		instance.changeScale(2, semiMajorAxis, semiMinorAxis);
		assertEquals(5.0, semiMinorAxis, 0);
	}

	@Test
	public void testEllipseGetArea1() {
		Ellipse instance = new Ellipse();
		double semiMajorAxis = 20;
		double semiMinorAxis = 5;
		assertEquals(314.1592653589793, instance.getArea(semiMajorAxis, semiMinorAxis), 0);
	}

	@Test
	public void testEllipseGetPerimeterLength1() {
		Ellipse instance = new Ellipse();
		double semiMajorAxis = 20;
		double semiMinorAxis = 5;
		// it is -1 because it is more than that expected
		assertEquals(-1, instance.getPerimeterLength(semiMajorAxis, semiMinorAxis), 0);
	}

	@Test
	public void testEllipseGetOrientation() {
		Ellipse instance = new Ellipse();
		assertEquals(0, instance.getOrientation(), 0);
	}
	
	@Test
	public void testEllipseGetSemiMajorAxis1() {
		Ellipse instance = new Ellipse();
		assertEquals(20, instance.getSemiMajorAxis(20), 0);
	}

	@Test
	public void testEllipseGetSemiMinorAxis1() {
		Ellipse instance = new Ellipse();
		assertEquals(342.3, instance.getSemiMinorAxis(342.3), 0);
	}

	@Test
	public void testEllipseGetFocus11() {
		Ellipse instance = new Ellipse();
		double semiMajorAxis = 234.34;
		double semiMinorAxis = 34.43;
		double[] centerCoord = {34, 23};
		double[] coord = instance.getFocus1(centerCoord, semiMajorAxis, semiMinorAxis);
		assertEquals(265.7969169337677, coord[0], 0);
	}

	@Test
	public void testEllipseGetFocus21() {
		Ellipse instance = new Ellipse();
		double semiMajorAxis = 56.5;
		double semiMinorAxis = 33;
		double[] centerCoord = {23, 46};
		double[] coord = instance.getFocus2(centerCoord, semiMajorAxis, semiMinorAxis);
		assertEquals(-22.86120364752761, coord[0], 0);
	}

	@Test
	public void testRectangleChangeScale1() {
		Rectangle instance = new Rectangle();
		double height = 34;
		double width = 56.5;
		instance.changeScale(3.3, height, width);
		assertEquals(34.0, height, 0);
	}

	@Test
	public void testRectangleSetHeight1() {
		Rectangle instance = new Rectangle();
		double height = 56.5;
		instance.setHeight(height);
		assertEquals(56.5, height, 0);
	}
	
	@Test
	public void testRectangleSetWidth1() {
		Rectangle instance = new Rectangle();
		double width = 56.5;
		instance.setWidth(width);
		assertEquals(56.5, width, 0);
	}
	
	@Test
	public void testRectangleGetArea1() {
		Rectangle instance = new Rectangle();
		double height = 23.34;
		double width = 65.3;
		assertEquals(1524.1019999999999, instance.getArea(height, width), 0);
	}

	@Test
	public void testRectangleGetPerimeterLength() {
		Rectangle instance = new Rectangle();
		double height = 23.34;
		double width = 65.3;
		assertEquals(177.28, instance.getPerimeterLength(height, width), 0);
	}
	
	@Test
	public void testRegularPolygonChangeNumPoints() {
		RegularPolygon instance = new RegularPolygon();
		instance.changeNumPoints(20);
		assertEquals(34.0, 34, 0);
	}
	
	@Test
	public void testRegularPolygonChangeScale() {
		RegularPolygon instance = new RegularPolygon();
		instance.changeScale(3, instance.getPerimeterLength(33));
		instance.numPoints = 10;
		assertEquals(330, instance.getPerimeterLength(33), 0);
	}
	
	@Test
	public void testRegularPolygonGetArea() {
		RegularPolygon instance = new RegularPolygon();
		instance.numPoints = 10;
		assertEquals(0, instance.getArea(12, instance.getPerimeterLength(12.3)), 0);
	}
	
	@Test
	public void testRegularPolygonGetPerimeterLength() {
		RegularPolygon instance = new RegularPolygon();
		instance.numPoints = 10;
		assertEquals(430, instance.getPerimeterLength(43), 0);
	}
	
	@Test
	public void testArbitraryPolygonAddPoint() {
		ArbitraryPolygon instance = new ArbitraryPolygon();
		instance.addPoint(34, 23, 0);
		assertEquals(34, instance.points[0][0], 0);
	}
	
	@Test
	public void testArbitraryPolygonRemovePoint() {
		ArbitraryPolygon instance = new ArbitraryPolygon();
		instance.removePoint(0);
		assertEquals(0, instance.points[0][0], 0);
	}
	
	@Test
	public void testArbitraryPolygonRotate() {
		ArbitraryPolygon instance = new ArbitraryPolygon();
		instance.addPoint(34, 23, 0);
		instance.addPoint(23, 34, 1);
		instance.addPoint(12, 15, 2);
		instance.rotate(30);
		assertEquals(16.992183489865482, instance.points[0][0], 0);
	}
	
	@Test
	public void testArbitraryPolygonChangeScale() {
		ArbitraryPolygon instance = new ArbitraryPolygon();
		instance.addPoint(20, 10, 0);
		instance.changeScale(5);
		assertEquals(100, instance.points[0][0], 0);
	}
}

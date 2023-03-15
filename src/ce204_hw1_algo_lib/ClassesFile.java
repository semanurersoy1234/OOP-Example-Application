package ce204_hw1_algo_lib;

import ce204_hw1_algo_lib.Polygon;
import ce204_hw1_algo_lib.Shape2D;

interface Shape2D {
	int[] center = new int[2];
	void translate();
	void rotate();
	void rotate(double rotationAngle);
	int[] getCenter(int[] coordinates);
	void changeScale();
	void changeScale(double scaleSize);
	void changeScale(double scaleSize, double radius);
	void changeScale(double scaleSize, double height, double width);
	double getArea();
	double getArea(double radius);
	double getArea(double edge1, double edge2);
	double getPerimeterLength();
	double getPerimeterLength(double radius);
	double getPerimeterLength(double edge1, double edge2);
	double[] getBoundingRect(double Left, double Top, double Right, double Bottom);
}

interface EllipticalShape extends Shape2D {
	double semiMajorAxis = 3.5;
}

interface Polygon extends Shape2D {
	int[] getBoundingRect();
	double[][] getVertices();
}

interface SimplePolygon extends Polygon {
	double orientation = Math.sin(34);
	void rotate();
	int getOrientation();
}
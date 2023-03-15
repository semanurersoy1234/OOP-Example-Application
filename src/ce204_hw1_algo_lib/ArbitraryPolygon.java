package ce204_hw1_algo_lib;

public class ArbitraryPolygon implements Polygon {
	public double[][] points = new double[20][2];
	
	/**
     *	  @name Add Point (addPoint)
     *
     *	  @brief Add Point
     *
     *	  Add point to the Arbitrary Polygon
     *
     *	  @param  [in] x [\b double] x coordinate of point
     *	  
     *	  @param  [in] y [\b double] y coordinate of point
     *
     *	  @param  [in] numOfAddedPoints [\b int] Previously added points to the polygon. If you haven't add any then write 0.
     **/
	public void addPoint(double x, double y, int numOfAddedPoints) {
		points[numOfAddedPoints][0] = x;
		points[numOfAddedPoints][1] = y;
	}
	
	/**
     *	  @name Remove Point (removePoint)
     *
     *	  @brief Remove Point
     *
     *	  Remove(just write zeros so it will not affected) point from the Arbitrary Polygon
     *
     *	  @param  [in] indexOfPoint [\b double] Index of the point to be deleted
     **/
	public void removePoint(int indexOfPoint) {
		points[indexOfPoint][0] = 0;
		points[indexOfPoint][1] = 0;
	}
	
	/**
     *	  @name Rotate (rotate)
     *
     *	  @brief Rotate the arbitrary polygon
     *
     *	  Rotate the arbitrary polygon with given angle
     *
     *	  @param  [in] rotationAngle [\b double] Angle of rotation
     **/
	@Override
	public void rotate(double rotationAngle) {
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < 2; j++) {
				// For example sin(30) -> sin(pi / (180 / 30)) -> sin(pi / 6) -> sin(180 / 6) -> sin(30)
				points[i][j] *= Math.sin(3.14 / (180 / rotationAngle)); 
			}
		}
	}

	/**
     *	  @name Change Scale (changeScale)
     *
     *	  @brief Change Scale of the arbitrary polygon
     *
     *	  Change Scale of the arbitrary polygon with given size
     *
     *	  @param  [in] rotationAngle [\b double] Angle of rotation
     **/
	@Override
	public void changeScale(double scaleSize) {
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] *= scaleSize;
			}
		}
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimeterLength() {
		return 0;
	}
	
	/**
     *	  @name Get Vertices (getVertices)
     *
     *	  @brief Get Vertices
     *
     *	  Get Vertices of arbitrary polygon
     *
     *	  @retval [\b double[][]] Coordinate of points of arbitrary polygon
     **/
	@Override
	public double[][] getVertices() {
		return points;
	}

	@Override
	public void translate() {}

	@Override
	public void rotate() {}

	@Override
	public int[] getCenter(int[] coordinates) {return null;}

	@Override
	public void changeScale() {}

	@Override
	public void changeScale(double scaleSize, double radius) {}

	@Override
	public void changeScale(double scaleSize, double height, double width) {}

	@Override
	public double getArea(double radius) {return 0;}

	@Override
	public double getArea(double edge1, double edge2) {return 0;}

	@Override
	public double getPerimeterLength(double radius) {return 0;}

	@Override
	public double getPerimeterLength(double edge1, double edge2) {return 0;}

	@Override
	public double[] getBoundingRect(double Left, double Top, double Right, double Bottom) {return null;}

	@Override
	public int[] getBoundingRect() {return null;}
}
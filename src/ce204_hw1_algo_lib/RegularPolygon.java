package ce204_hw1_algo_lib;

public class RegularPolygon implements SimplePolygon {
	public int numPoints;
	double radius;
	
	/**
     *	  @name Change Num Points (changeNumPoints)
     *
     *	  @brief Change number of vertices
     *
     *	  Change number of vertices for the polygon
     *
     *	  @param  [in] numPoints [\b int] edge1 of the rectangle
     **/
	public void changeNumPoints(int numPoints) {
		this.numPoints = numPoints;
	}
	
	/**
     *	  @name Change Scale (changeScale)
     *
     *	  @brief Change Scale
     *
     *	  Change scale of the polygon
     *
     *	  @param  [in] scaleSize [\b double] Scaling multiplier of the polygon
     *	  
     *	  @param  [in] perimeterLength [\b double] perimeter Length of the polygon
     **/
	@Override
	public void changeScale(double scaleSize, double perimeterLength) {
		perimeterLength *= scaleSize;
	}
	
	/**
     *	  @name Get area (getArea)
     *
     *	  @brief Get area
     *
     *	  Get area of the polygon
     *
     *	  @param  [in] apothem [\b double] apothem of the polygon
     *
     *	  @param  [in] perimeterLength [\b double] perimeter Length of the polygon
     *
     *	  @retval [\b double] Area of the rectangle
     **/
	@Override
	public double getArea(double apothem, double perimeterLength) {
		return ((1/2) * apothem * perimeterLength);
	}
	
	/**
     *	  @name Get perimeter length (getPerimeterLength)
     *
     *	  @brief Get perimeter length
     *
     *	  Get perimeter length of the polygon
     *
     *	  @param  [in] oneEdgeSize [\b double] one Edge Size of the polygon
     *
     *	  @retval [\b double] perimeter length of the polygon
     **/
	@Override
	public double getPerimeterLength(double oneEdgeSize) {
		return oneEdgeSize * this.numPoints;
	}

	@Override
	public double[][] getVertices() {
		// we don't have coordinates for regular polygon
		return null;
	}

	@Override
	public int[] getBoundingRect() {return null;}

	@Override
	public void translate() {}

	@Override
	public void rotate(double rotationAngle) {}

	@Override
	public int[] getCenter(int[] coordinates) {return null;}

	@Override
	public void changeScale() {}

	@Override
	public void changeScale(double scaleSize) {}

	@Override
	public void changeScale(double scaleSize, double height, double width) {}

	@Override
	public double getArea() {return 0;}

	@Override
	public double getArea(double radius) {return 0;}

	@Override
	public double getPerimeterLength() {return 0;}

	@Override
	public double getPerimeterLength(double edge1, double edge2) {return 0;}

	@Override
	public double[] getBoundingRect(double Left, double Top, double Right, double Bottom) {return null;}

	@Override
	public void rotate() {}

	@Override
	public int getOrientation() {return 0;}
}

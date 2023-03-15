package ce204_hw1_algo_lib;

public class Rectangle implements SimplePolygon {
	double height;
	double width;
	
	/**
     *	  @name Change Scale (changeScale)
     *
     *	  @brief Change Scale
     *
     *	  Change scale of the rectangle
     *
     *	  @param  [in] scaleSize [\b double] Scaling multiplier of the rectangle
     *	  
     *	  @param  [in] height [\b double] height of the rectangle
     *
     *	  @param  [in] width [\b double] width of the rectangle
     **/
	@Override
	public void changeScale(double scaleSize, double height, double width) {
		height *= scaleSize;
		width *= scaleSize;
	}
	
	/**
     *	  @name Set Height (setHeight)
     *
     *	  @brief Set Height
     *
     *	  Set Height of the rectangle
     *
     *	  @param  [in] height [\b double] Height of the rectangle
     **/
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
     *	  @name Set Width (setWidth)
     *
     *	  @brief Set Width
     *
     *	  Set Width of the rectangle
     *
     *	  @param  [in] width [\b double] width of the rectangle
     **/
	public void setWidth(double width) {
		this.width = width;
	}

	/**
     *	  @name Get area (getArea)
     *
     *	  @brief Get area
     *
     *	  Get area of the rectangle
     *
     *	  @param  [in] edge1 [\b double] edge1 of the rectangle
     *
     *	  @param  [in] edge2 [\b double] edge2 of the rectangle
     *
     *	  @retval [\b double] Area of the rectangle
     **/
	@Override
	public double getArea(double edge1, double edge2) {
		return edge1 * edge2;
	}

	/**
     *	  @name Get perimeter length (getPerimeterLength)
     *
     *	  @brief Get perimeter length
     *
     *	  Get perimeter length of the rectangle
     *
     *	  @param  [in] edge1 [\b double] edge1 of the rectangle
     *
     *	  @param  [in] edge2 [\b double] edge2 of the rectangle
     *
     *	  @retval [\b double] perimeter length of the rectangle
     **/
	@Override
	public double getPerimeterLength(double edge1, double edge2) {
		return (edge1 * 2) + (edge2 * 2);
	}
	
	@Override
	public double[][] getVertices() {
		// we don't have coordinates for rectangle
		return null;
	}
	
	/**
     *	  @name Get Bounding Rect (getBoundingRect)
     *
     *	  @brief Get Bounding Rect
     *
     *	  Get distance between viewport and 2d shape
     *
     *	  @param  [in] Left [\b double] Left distance to viewport
     *	  
     *	  @param  [in] Top [\b double] Top distance to viewport
     *
     *	  @param  [in] Right [\b double] Right distance to viewport
     *
     *	  @param  [in] Bottom [\b double] Bottom distance to viewport
     *
     *	  @retval [\b double[]] Distances between viewport
     **/
	@Override
	public double[] getBoundingRect(double Left, double Top, double Right, double Bottom) {
		double[] arr = new double[4];
		// Since we don't have viewport we can set the distances to infinity
		Left = Double.NEGATIVE_INFINITY; Top = Double.POSITIVE_INFINITY;
		Right = Double.POSITIVE_INFINITY; Bottom = Double.NEGATIVE_INFINITY;
		arr[0] = Left; arr[1] = Top; arr[2] = Right; arr[3] = Bottom;
		return arr;
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
	public void changeScale(double scaleSize, double radius) {}

	@Override
	public double getArea() {return 0;}

	@Override
	public double getArea(double radius) {return 0;}

	@Override
	public double getPerimeterLength() {return 0;}

	@Override
	public double getPerimeterLength(double radius) {return 0;}

	@Override
	public void rotate() {}

	@Override
	public int getOrientation() {return 0;}
}
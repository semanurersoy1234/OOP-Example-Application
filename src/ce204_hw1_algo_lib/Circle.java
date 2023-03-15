package ce204_hw1_algo_lib;

public class Circle implements EllipticalShape {
	
	@Override
	public void rotate() {
		// we don't have coordinates for ellipse
	}
	
	/**
     *	  @name Change Scale (changeScale)
     *
     *	  @brief Change Scale
     *
     *	  Change scale of the circle
     *
     *	  @param  [in] scaleSize [\b double] Scaling multiplier of the ellipse
     *	  
     *	  @param  [in] radius [\b double] radius of the circle
     **/
	@Override
	public void changeScale(double scaleSize, double radius) {
		radius *= scaleSize;
	}
	
	/**
     *	  @name Get area (getArea)
     *
     *	  @brief Get area
     *
     *	  Get area of the circle
     *
     *	  @param  [in] radius [\b double] radius of the circle
     *
     *	  @retval [\b double] Area of the circle
     **/
	@Override
	public double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	/**
     *	  @name Get Perimeter Length (getPerimeterLength)
     *
     *	  @brief Get Perimeter Length
     *
     *	  Get Perimeter Length of the circle
     *
     *	  @param  [in] radius [\b double] radius of the circle
     *
     *	  @retval [\b double] Perimeter Length of the circle
     **/
	@Override
	public double getPerimeterLength(double radius) {
		return 2 * Math.PI * radius;
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
	
	/**
     *	  @name Get radius (getRadius)
     *
     *	  @brief Get radius
     *
     *	  Get radius of the circle
     *
     *	  @param  [in] radius [\b double] radius of the circle
     *
     *	  @retval [\b double] Radius of the circle
     **/
	public double getRadius(double radius) {
		return radius;
	}

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
	public double getArea(double edge1, double edge2) {return 0;}

	@Override
	public double getPerimeterLength() {return 0;}

	@Override
	public double getPerimeterLength(double edge1, double edge2) {return 0;}
}

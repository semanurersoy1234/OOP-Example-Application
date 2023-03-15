package ce204_hw1_algo_lib;

public class Ellipse implements EllipticalShape {
	double semiMinorAxis;
	double orientation = Math.sin(0);

	@Override
	public void rotate() {
		// we don't have coordinates for ellipse
	}
	
	/**
     *	  @name Change Scale (changeScale)
     *
     *	  @brief Change Scale
     *
     *	  Change scale of the ellipse
     *
     *	  @param  [in] scaleSize [\b double] Scaling multiplier of the ellipse
     *	  
     *	  @param  [in] semiMajorAxis [\b double] semiMajorAxis of the ellipse
     *
     *	  @param  [in] semiMinorAxis [\b double] semiMinorAxis of the ellipse
     **/
	@Override
	public void changeScale(double scaleSize, double semiMajorAxis, double semiMinorAxis) {
		semiMajorAxis *= scaleSize;
		semiMinorAxis *= scaleSize;
	}
	
	/**
     *	  @name Get area (getArea)
     *
     *	  @brief Get area
     *
     *	  Get area of the ellipse
     *
     *	  @param  [in] semiMajorAxis [\b double] semiMajorAxis of the ellipse
     *
     *	  @param  [in] semiMinorAxis [\b double] semiMinorAxis of the ellipse
     *
     *	  @retval [\b double] Area of the ellipse
     **/
	@Override
	public double getArea(double semiMajorAxis, double semiMinorAxis) {
		return Math.PI * semiMajorAxis * semiMinorAxis;
	}
	
	/**
     *	  @name Get perimeter length (getPerimeterLength)
     *
     *	  @brief Get perimeter length
     *
     *	  Get perimeter length of the ellipse
     *
     *	  @param  [in] semiMajorAxis [\b double] semiMajorAxis of the ellipse
     *
     *	  @param  [in] semiMinorAxis [\b double] semiMinorAxis of the ellipse
     *
     *	  @retval [\b double] Approximate perimeter length of the ellipse
     **/
	@Override
	public double getPerimeterLength(double semiMajorAxis, double semiMinorAxis) {
		// Based of used formula major axis shouldn't be bigger than 3 times of minor axis
		if (semiMajorAxis > (semiMinorAxis * 3)) { return -1; }
		return 2 * Math.PI * Math.sqrt((1/2) * (semiMajorAxis * semiMajorAxis + semiMinorAxis * semiMinorAxis));
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
     *	  @name Get orientation (getOrientation)
     *
     *	  @brief Get orientation
     *
     *	  Get orientation of the ellipse
     *
     *	  @retval [\b double] Orientation angle
     **/
	public double getOrientation() {
		return this.orientation;
	}
	
	/**
     *	  @name Get Semi Major Axis (getSemiMajorAxis)
     *
     *	  @brief Get Semi Major Axis
     *
     *	  Get semiMajorAxis of the ellipse
     *
     *	  @param  [in] semiMajorAxis [\b double] semiMajorAxis of the ellipse
     *
     *	  @retval [\b double] semiMajorAxis
     **/
	public double getSemiMajorAxis(double semiMajorAxis) {
		return semiMajorAxis;
	}
	
	/**
     *	  @name Get Semi Minor Axis (getSemiMinorAxis)
     *
     *	  @brief Get Semi Minor Axis
     *
     *	  Get semiMinorAxis of the ellipse
     *
     *	  @param  [in] semiMinorAxis [\b double] semiMinorAxis of the ellipse
     *
     *	  @retval [\b double] semiMinorAxis
     **/
	public double getSemiMinorAxis(double semiMinorAxis) {
		this.semiMinorAxis = semiMinorAxis;
		return this.semiMinorAxis;
	}
	
	/**
     *	  @name Get Focus (getFocus1)
     *
     *	  @brief Get Focus
     *
     *	  Get right focus of the ellipse
     *
     *	  @param  [in] centerCoord [\b double[]] Center coordinates of the ellipse
     *	  
     *	  @param  [in] semiMajorAxis [\b double] semiMajorAxis of the ellipse
     *
     *	  @param  [in] semiMinorAxis [\b double] semiMinorAxis of the ellipse
     *
     *	  @retval [\b double[]] Coordinate of right focus
     **/
	public double[] getFocus1(double[] centerCoord, double semiMajorAxis, double semiMinorAxis) {
		double focusLength = Math.sqrt((semiMajorAxis * semiMajorAxis) - (semiMinorAxis * semiMinorAxis));
		centerCoord[0] += focusLength;
		return centerCoord;
	}
	
	/**
     *	  @name Get Focus (getFocus2)
     *
     *	  @brief Get Focus
     *
     *	  Get left focus of the ellipse
     *
     *	  @param  [in] centerCoord [\b double[]] Center coordinates of the ellipse
     *	  
     *	  @param  [in] semiMajorAxis [\b double] semiMajorAxis of the ellipse
     *
     *	  @param  [in] semiMinorAxis [\b double] semiMinorAxis of the ellipse
     *
     *	  @retval [\b double[]] Coordinate of left focus
     **/
	public double[] getFocus2(double[] centerCoord, double semiMajorAxis, double semiMinorAxis) {
		double focusLength = Math.sqrt((semiMajorAxis * semiMajorAxis) - (semiMinorAxis * semiMinorAxis));
		centerCoord[0] -= focusLength;
		return centerCoord;
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
	public void changeScale(double scaleSize, double radius) {}

	@Override
	public double getArea() {return 0;}

	@Override
	public double getArea(double radius) {return 0;}

	@Override
	public double getPerimeterLength() {return 0;}

	@Override
	public double getPerimeterLength(double radius) {return 0;}
}

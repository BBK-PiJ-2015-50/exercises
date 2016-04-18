double xco, yco
boolean insidewidth, insideheight, insiderect1, insiderect2
boolean nomore = false
while (!nomore) {
	println ""
	println "ANOTHER RECTANGLE PROGRAM: is the 5th point inside the 2 reactangles?"
	println ""
	println "Co-ordinates for rectangle 1"
	println "Enter x co-ordinate for top left corner: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for top left corner: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt1 = new Point()
	pt1.x = xco
	pt1.y = yco
	println "Enter x co-ordinate for bottom right corner: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for bottom right corner: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt2 = new Point()
	pt2.x = xco
	pt2.y = yco
	Rectangle rect1 = new Rectangle()
	rect1.upLeft = pt1
	rect1.downRight = pt2
	println "Co-ordinates for rectangle 2"
	println "Enter x co-ordinate for top left corner: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for top left corner: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt3 = new Point()
	pt3.x = xco
	pt3.y = yco
	println "Enter x co-ordinate for bottom right corner: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for bottom right corner: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt4 = new Point()
	pt4.x = xco
	pt4.y = yco
	Rectangle rect2 = new Rectangle()
	rect2.upLeft = pt3
	rect2.downRight = pt4
	println "Enter x co-ordinate for 5th point: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for 5th point: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt5 = new Point()
	pt5.x = xco
	pt5.y = yco
	// check 5th point is within width & height of rectangle 1
	insidewidth = (pt5.x>=rect1.upLeft.x && pt5.x<=rect1.downRight.x)
	insideheight = (pt5.y>=rect1.downRight.y && pt5.y<=rect1.upLeft.y)
	insiderect1 = (insidewidth && insideheight)
	// check 5th point is within width & height of rectangle 2
	insidewidth = (pt5.x>=rect2.upLeft.x && pt5.x<=rect2.downRight.x)
	insideheight = (pt5.y>=rect2.downRight.y && pt5.y<=rect2.upLeft.y)
	insiderect2 = (insidewidth && insideheight)
	if (insiderect1 && insiderect2) {
		println "The 5th point is inside both rectangles"
	} else if (insiderect1) {
		println "The 5th point is only inside the 1st rectangle"
	} else if (insiderect2) {
		println "The 5th point is only inside the 2nd rectangle"
	} else {
		println "The 5th point is outside the rectangles"
	}
	println""
    println "Enter 0 to stop or 1 to run again with new co-ordinates"
    stop = Integer.parseInt(System.console().readLine())
    if (stop == 0) {
    	nomore = true
    }
}   

class Point {
	double x
  	double y
}
class Rectangle {
  	Point upLeft
  	Point downRight
}
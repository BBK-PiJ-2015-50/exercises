double xco, yco, width, height, area, perimeter
boolean nomore = false
while (!nomore) {
	println""
	println "RECTANGLE PROGRAM: calculates area & perimeter"
	println ""
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
	Rectangle rect = new Rectangle()
	rect.upLeft = pt1
	rect.downRight = pt2
	width = rect.downRight.x - rect.upLeft.x
	height = rect.upLeft.y - rect.downRight.y
	perimeter = 2.0 * (width + height)
	area = width * height
	println "Perimeter = " + perimeter + ", Area = " + area
	println ""
    println "Enter 0 to stop or 1 to try a new set of co-ordinates"
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
while (true) {
	println "ANOTHER RECTANGLE PROGRAM: is the 3rd point inside?"
	Point pt1 = new Point()
	println "Enter x co-ordinate for top left corner: "
	pt1.x = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for top left corner: "
	pt1.y = Double.parseDouble(System.console().readLine())
	Point pt2 = new Point()
	println "Enter x co-ordinate for bottom right corner: "
	pt2.x = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for bottom right corner: "
	pt2.y = Double.parseDouble(System.console().readLine())
	Rectangle rect = new Rectangle()
	rect.upLeft = pt1
	rect.downRight = pt2
	Point pt3 = new Point()
	println "Enter x co-ordinate for 3rd point: "
	pt3.x = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for 3rd point: "
	pt3.y = Double.parseDouble(System.console().readLine())
	// check 3rd point is within width & height of rectangle
	boolean insideWidth = ((pt3.x>=pt1.x) && (pt3.x<=pt2.x))
	boolean insideHeight = ((pt3.y>=pt1.y) && (pt3.y<=pt2.y))
	print "3rd point is "
	println ((insideWidth && insideHeight) ? "inside" : "outside")
	println""
    println "Enter 0 to stop or 1 to run again with new co-ordinates"
    if (Integer.parseInt(System.console().readLine()) == 0) {
    	break
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
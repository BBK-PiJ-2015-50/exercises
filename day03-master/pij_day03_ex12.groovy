double xco, yco, dist1, dist2, dist3
boolean nomore = false
while (!nomore) {
	println "Enter x co-ordinate for point 1: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for point 1: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt1 = new Point()
	pt1.x = xco
	pt1.y = yco
	println "Enter x co-ordinate for point 2: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for point 2: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt2 = new Point()
	pt2.x = xco
	pt2.y = yco
	println "Enter x co-ordinate for point 3: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for point 3: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt3 = new Point()
	pt3.x = xco
	pt3.y = yco
	dist1 = Math.sqrt((pt1.x*pt1.x) + (pt1.y*pt1.y))
	println "Point 1 distance = " + dist1
	dist2 = Math.sqrt((pt2.x*pt2.x) + (pt2.y*pt2.y))
	println "Point 2 distance = " + dist2
	dist3 = Math.sqrt((pt3.x*pt3.x) + (pt3.y*pt3.y))
	println "Point 3 distance = " + dist3
	if (dist1 < dist2 && dist1 < dist3) {
	    println "Point 1 is the closest"
	} else if (dist2 < dist1 && dist2 < dist3) {
	    println "Point 2 is the closest"	
	} else {
		println "Point 3 is the closest"
	}
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
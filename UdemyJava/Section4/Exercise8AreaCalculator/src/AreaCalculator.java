public class AreaCalculator {

    public static double area(double radius) {//should I call this method with 10d? etc.
        if (radius < 0) {
            return -1;//return a double?
        } else {
            double area = Math.PI*(radius*radius);
            return area;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            double area = (double) x*y;//casting needed?
            return area;
        }
    }

}

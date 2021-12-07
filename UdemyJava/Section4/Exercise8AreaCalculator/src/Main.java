public class Main {

    public static void main(String[] args) {
        double output = AreaCalculator.area(5.0);
        System.out.println(output);//should return 78.53975

        output = AreaCalculator.area(-1);
        System.out.println(output);//should return -1

        output = AreaCalculator.area(5.0,4.0);
        System.out.println(output);//should return 20.0

        output = AreaCalculator.area(-1.0,4.0);
        System.out.println(output);//should return -1
//-1 becomes -1.0 in output for error input
    }

}


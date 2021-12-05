public class Main {

    public static void main(String[] args) {
        System.out.println("should output false true true");
        boolean output = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(output);
        output = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(output);
        output = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(output);

    }

}

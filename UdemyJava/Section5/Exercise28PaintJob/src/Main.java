public class Main {
    public static void main(String[] args) {
        System.out.println("output should be -1\n" +
                "3\n" +
                "3\n" +
                "0\n" +
                "-1\n" +
                "5\n" +
                "14\n" +
                "3\n" +
                "3\n" +
                "5");

        System.out.println("\n");

        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));
        System.out.println(PaintJob.getBucketCount(1,1,1,5));

        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35));

        System.out.println(PaintJob.getBucketCount(3.4,1.5));
        System.out.println(PaintJob.getBucketCount(6.26,2.2));
        System.out.println(PaintJob.getBucketCount(3.26,0.75));
    }
}

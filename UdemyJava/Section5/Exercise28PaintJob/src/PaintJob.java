public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        //width, height, areaPerBucket, extraBuckets
        //return number of buckets that are still needed

        if (width < 0 || height < 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double totalBuckets = (width*height)/areaPerBucket;//type is still double?
            double missingBuckets = totalBuckets - extraBuckets;
            //what if missingBuckets is a negative number?
            if (missingBuckets <= 0) {
                return 0;
            } else {
                return (int) Math.ceil(missingBuckets);
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width < 0 || height < 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double bucketsDesired = (width*height)/areaPerBucket;
            return (int) Math.ceil(bucketsDesired);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area < 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double bucketsDesired = area/areaPerBucket;
            return (int) Math.ceil(bucketsDesired);
        }
    }

}
//write a program that calculates how many
//buckets of paint are needed to be purchased
//factor in additional buckets already present

//note Math.ceil used to round the double before converting to an int

//I wonder if I could call the method within the method if I place
//the method with the 2 desired inputs at the top, then 3, then 4

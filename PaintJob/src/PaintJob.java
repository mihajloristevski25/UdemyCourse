public class PaintJob {
   // single bucket cover 1.5;

    public static int getBucketCount(double width , double height, double areaPerBucket , int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        int buckets = (int) (Math.ceil(area / areaPerBucket));
        buckets = buckets - extraBuckets;

        return  buckets;
    }

    public static int getBucketCount(double width , double height,double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = width * height;
        int buckets = (int) (Math.ceil(area / areaPerBucket));
        return  buckets;
    }

    public static int getBucketCount(double area , double areaPerBucket){
        if(area <= 0 || areaPerBucket  <= 0){
            return -1;
        }
        int buckets = (int) (Math.ceil(area / areaPerBucket));
        return  buckets;
    }
}

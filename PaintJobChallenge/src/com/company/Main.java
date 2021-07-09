package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        System.out.println(getBucketCount(2.75, 3.25, 2.5));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    /*
    In the future (I'm too lazy right now :P )
    I want to remove the parameters and add user input, I'll make that my project for tomorrow or maybe today(?)
    But yeah, this took a few attempts so looks like my streak is gone :(
    It's fine though, one thing, make sure to remember Math.ceil()
    It's basically Math.round but it only goes up
    I've explained this in further detail down below
    Go me!
     */

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        /*
        Checking if the numbers are valid
         */
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        /*
        Initialising variables
        Making the area
        and finding the amount of buckets needed
        subtracting the amount of buckets needed by the extra buckets
         */
        double area = width*height;
        double amountOfBuckets = (area/areaPerBucket) - extraBuckets;
        System.out.println(amountOfBuckets);

        /*
        Math.ceil is basically Math.round but it only goes up
        Example:
        1. Math.ceil(.95) = 1
        2. Math.ceil(4.2) = 5
        3. Math.ceil(-2.2) = -2

        Returns the math.ceil version of the amount of buckets
         */
        return (int) Math.ceil(amountOfBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }

        /*
        Same thing being done here, just this time,
        we aren't subtracting the amount of buckets from the extra buckets
         */

        double area = width*height;
        double amountOfBuckets = (area/areaPerBucket);
        return (int) Math.ceil(amountOfBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }

        /*
        Again, same thing being done here, only that
        we aren't subtracting the amount of buckets from the extra buckets and
        the area has already been given so
        there's no need to make that int
         */

        double amountOfBuckets = (area/areaPerBucket);
        return (int) Math.ceil(amountOfBuckets);
    }
}

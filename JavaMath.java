public class JavaMath {
    public static void main(String[] args) {
        //max() ==> to find the max value between two numbers
        System.out.println(java.lang.Math.max(25, 19)); 
        
        //min() ==> to min btw two values
        System.out.println(java.lang.Math.min(25,19));

        // abs() ==> gets the absolute value of a negative num
        System.out.println(java.lang.Math.abs(-11));

        //random() ==> get random value from 0.0 - 0.99
        int randomValue = (int)(java.lang.Math.random() * 10);
        System.out.println("random value is: " + randomValue);

        //floor() ==> get the nearest integer value
        double floorValue = java.lang.Math.floor(java.lang.Math.random()*10);
        System.out.println("floor value is: " + floorValue);

        //ceil() ==> get the nearest integer value ====== similar to floor value
        double ceilValue = java.lang.Math.ceil(java.lang.Math.random()*10);
        System.out.println(ceilValue);
    }
}
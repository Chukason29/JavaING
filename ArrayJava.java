public class ArrayJava {
    public static void main(String[] args) {
        // The String type shows that all items in the array must be a string
        String[] friends = {"Tommyzan", "Wisdom", "Ikechuckwu"};

        //accessing arrays
        System.out.println(friends[1]);// ouputs  Wisdom
        //Looping through an array using foreach
        for(String i : friends){
            System.out.println(i + " ==> "+ i.length());
        }
        /***********************MULTIDIMENSIONAL ARRAYS**************************** */

        // declaring a multidimensional array
        int[][] evenNums = {{2,4,6,8,10}, {12,14,16,18,20,}};

        //accessing multidimensional array

        System.out.println(evenNums[0][4]);// outputs 10
        System.out.println(evenNums[1][1]);// outputs 14
    }
}
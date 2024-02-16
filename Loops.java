public class Loops {
    public static void main(String[] args) {
        /*
         While Loop is used when the number of iteration is unknown
        */
        String arrayString = "Chukwuebuka Alaegbu";
        String[] chaStrings = arrayString.split("");
        int i = 0;
        while (i < chaStrings.length) {
            if (chaStrings[i].equals("u")) {
                System.out.println("First index of \"u\" is: " + i);
                break;
            }
            i++;
        }
        //for loop at play
        for (int j = 0; j < chaStrings.length; j++) {
            if (chaStrings[j].equals("l")) {
                System.out.println("First index of \"l\" is: " +  j);
                break;
            }
        }

        //foreach loop
        String[] fruits = {"Mango", "Tangerine", "Apple"};
        int m = 1;
        for(String k : fruits){
            System.out.println("Fruit "+ m + " " + k);
            m++;
        }
    }
}

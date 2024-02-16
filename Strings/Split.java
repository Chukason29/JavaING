/*
    Split() method, split a given string to an array
 */
public class Split{
    public static void main (String args[]){
        String myName = "chukwuebuka alaegbu";
        String[] myNameString = myName.split("");
        for(int i = 0; i < myNameString.length; i++){
            System.out.print(myNameString[i]);
        }
        System.out.println(myName.length());
    }
}
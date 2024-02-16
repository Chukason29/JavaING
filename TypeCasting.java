// Type casting changes the type of a primitive variable to another type
/*
    HIERARCHY OF PRIMITIVE DATA TYPES
    byte -> short -> char -> int -> long -> float -> double
 */

/*
    Two types of type-casting
    1) Automatic ==> when casting from lower dataType to higher dataType
    2) Manual ==> when casting from higher dataType to lower dataType
 */
/*public class TypeCasting{
    public static void main (String args[]){
        int myNum = 49;
        double myDouble = myNum; //Automatic type casting cos from lower to higher
        System.out.println(myDouble); //output 49.0
    }
}*/

public class TypeCasting{
    public static void main (String args[]){
        double myDouble = 49.76d;
        int myNum = (int) myDouble; //manual type casting cos from higher to lower hence the (int)
        System.out.println(myNum); //output 49
    }
}
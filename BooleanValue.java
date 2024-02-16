public class BooleanValue {
    public static void main(String[] args) {
        boolean isGreat = true;
        int numValue = 75;
        if (isGreat) {
            System.out.println("It\'s so great");
        }else{
            System.out.println("Not so great");
        }
        System.out.println(numValue % 2 == 0 ? "even number" : "odd number");
    }
}
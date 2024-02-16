/**
 * SwitchClass
 */
public class SwitchClass {
    public static void main(String[] args) {
        String race = "Black";
        String continent = "";
        switch (race) {
            case "Black":
                continent = "Africa";
                break;
            case "Cacausian":
                continent = "Europe";
                break;
            case "Hispanic":
                continent = "Southern America";
                break;
            case "Arab":
                continent = "Asia";
                break;
            default :
                continent = "Antartica";
        }
        System.out.println(continent);
    }
}
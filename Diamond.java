public class Diamond {
    public static void main (String args[]){
        int num = 30;
        int subNum = num / 2;
        for(int i = 1; i <= num; i++){
            if(i <= subNum){
                for(int j = 0; j <= subNum-i; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print("' "); 
                }
            }else{
                for(int j = 0; j <= i-subNum; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k <= num-i; k++){
                    System.out.print("' "); 
                }
            }
            System.out.println(" ");
        }
    }
}
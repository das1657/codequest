import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       int x = input.nextInt();
       input.nextLine();
       
       for (int i = 0; i < x; i++){
           String num = input.nextLine();
           int sum = 0;
           
           for (int j = 0; j < 9; j++){
               sum += (Integer.parseInt(num.substring(j,j+1))*(10-j));
           }
           
           int othernum = sum;
           while(true){
               if ((othernum % 11) == 0){
                   break;
               } else {
                   othernum+=1;
               }
           }
           
           
           if(num.substring(9).equals("X")){
               //System.out.println("VALID");
               if ((othernum-sum) == 10){
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
           } else {
                if ((othernum-sum) == Integer.parseInt(num.substring(9))){
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
           }
           

           
           //System.out.println(othernum-sum);
       }
       
       
       
    }
         
}
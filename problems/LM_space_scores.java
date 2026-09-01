import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            
            String y = scanner.nextLine();
            int points = 0;
            for(int t = 0; t < y.length(); t++){
                
                if(y.substring(t,t+1).equals("A")||y.substring(t,t+1).equals("E")||y.substring(t,t+1).equals("I")||y.substring(t,t+1).equals("L")||y.substring(t,t+1).equals("N")||y.substring(t,t+1).equals("O")||y.substring(t,t+1).equals("R")||y.substring(t,t+1).equals("S")||y.substring(t,t+1).equals("T")||y.substring(t,t+1).equals("U")){
                    points+=1;
                    System.out.println(y.substring(t,t+1) + "=" + "1");
                }
                
                if(y.substring(t,t+1).equals("D")||y.substring(t,t+1).equals("G")){
                    points+=2;
                    System.out.println(y.substring(t,t+1) + "=" + "2");

                }
                
                if(y.substring(t,t+1).equals("B")||y.substring(t,t+1).equals("C")||y.substring(t,t+1).equals("M")||y.substring(t,t+1).equals("P")){
                    points+=3;
                    System.out.println(y.substring(t,t+1) + "=" + "3");

                }
                
                if(y.substring(t,t+1).equals("F")||y.substring(t,t+1).equals("H")||y.substring(t,t+1).equals("V")||y.substring(t,t+1).equals("W")||y.substring(t,t+1).equals("Y")){
                    points+=4;
                    System.out.println(y.substring(t,t+1) + "=" + "4");

                }
                
                if(y.substring(t,t+1).equals("K")){
                    points+=5;
                    System.out.println(y.substring(t,t+1) + "=" + "5");

                }
                
                if(y.substring(t,t+1).equals("J")||y.substring(t,t+1).equals("X")){
                    points+=8;
                    System.out.println(y.substring(t,t+1) + "=" + "8");

                }
                
                if(y.substring(t,t+1).equals("Q")||y.substring(t,t+1).equals("Z")){
                    points+=10;
                    System.out.println(y.substring(t,t+1) + "=" + "10");

                }
                
                
                
            }
            
        System.out.println("TOTAL=" + points);

            
            
        }
    }
}
import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < count; i++){
            String input = scanner.nextLine();
            String[] arr = input.split(" ");
            
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            
            String dir = arr[2];
            
            String[] steps = arr[3].split("");
            
            for(int g = 0; g < steps.length; g++){
                
                String curStep = steps[g];
                
                if(curStep.equals("A")){
                    if (dir.equals("N")){
                        y++;
                    }
                    
                    if (dir.equals("S")){
                        y--;
                    }
                    
                    if (dir.equals("E")){
                        x++;
                    }
                    
                    if (dir.equals("W")){
                        x--;
                    }
                }
                
                if(curStep.equals("R")){
                    if (dir.equals("N")){
                        dir = "E";
                    } else if (dir.equals("S")){
                        dir = "W";
                    } else if (dir.equals("E")){
                        dir = "S";
                    } else if (dir.equals("W")){
                        dir = "N";
                    } 
                    

                }
                
                if(curStep.equals("L")){
                    if (dir.equals("N")){
                        dir = "W";
                    } else                     if (dir.equals("S")){
                        dir = "E";
                    } else                     if (dir.equals("E")){
                        dir = "N";
                    } else                     if (dir.equals("W")){
                        dir = "S";
                    }
                    

                    

                    

                }
                
                
                
                
                
            }
            
            System.out.println(x + " " + y + " " + dir);
            
            
        }
    }
}
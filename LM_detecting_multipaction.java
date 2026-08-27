import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < testCases; i++){
            
            String lineOne = scanner.nextLine();
            String lineTwo = scanner.nextLine();
            
            String[] arr1 = lineOne.split(" ");
            String[] arr2 = lineTwo.split(" ");
            
            
            
            
            String[][] values = {arr1, arr2};
            
            //System.out.println(lineTwo);
            //System.out.println(values[1].length);
            
            
            
            int events = 0;
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            
            
            
            
            for (int j = 0; j < arr1.length; j++){
                //System.out.println(j);
                if ((Double.parseDouble(values[0][j]) >= .6) && (Double.parseDouble(values[0][j]) <= .85)){
                    if ((Double.parseDouble(values[1][j]) >= .6) && (Double.parseDouble(values[1][j]) <= .85)){
                        events += 1;
                        arrList.add(j);
                    }
                }
            }
            
            if (arrList.size() == 1){
                System.out.print("A multipaction event was detected at time index ");
            } else if(arrList.size() == 0){
                System.out.println("No multipaction events detected.");
            } else {
                System.out.print(events + " multipaction events were detected at time indices: ");
            }
            //System.out.print(events + " multipaction events were detected at time indices: ");
            
            for(int t = 0; t < arrList.size(); t++){
                System.out.print(arrList.get(t));
                
                if (t != arrList.size() - 1){
                    System.out.print(" ");
                } else {
                    System.out.println(".");
                }
                
            }
            
            
        }
    }
}
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
            String[] arr = y.split(" ");
            
            String output = (arr[0] + " ");
            
            String currentStep = "n";
            
            for(int g = 1; g < arr.length; g++){
                String step = arr[g];
                
                if (currentStep.equals("n")){
                    if (step.equals("C")){
                        output += "New>";
                        currentStep = "New";
                        
                        
                    } else {
                       output += "Invalid Command>"; 
                    }
                    continue;
                }
                
                if (currentStep.equals("New")){
                    if (step.equals("S")){
                        output += "Draft>";
                        currentStep = "Draft";
                    } else {
                        
                        output += "Invalid Command>"; 
                    }
                    continue;

                }
                
                if (currentStep.equals("Draft")){
                    if (step.equals("S")){
                        output += "Draft>";
                        currentStep = "Draft";
                    } else if (step.equals("B")){
                        output += "Preliminary Review>";
                        currentStep = "Preliminary Review";
                    } else {
                        output += "Invalid Command>"; 
                    }
                    continue;


                }
                
                if(currentStep.equals("Preliminary Review")){
                    if (step.equals("S")){
                        output += "Preliminary Review>";
                        currentStep = "Preliminary Review";
                    } else if (step.equals("R")){
                        output += "Waiting Preliminary>";
                        currentStep = "Waiting Preliminary";
                    } else if(step.equals("A")){
                        output += "Final Review>";
                        currentStep = "Final Review";  
                    } else if (step.equals("X")){
                        output += "Rejected>";
                        currentStep = "Rejected";
                    } else {
                        output += "Invalid Command>";
                    }
                    
                    continue;

                }
                
                if(currentStep.equals("Waiting Preliminary")){
                    if(step.equals("I")){
                        output += "Preliminary Review>";
                        currentStep = "Preliminary Review";
                    } else {
                        output += "Invalid Command>";
                        
                    }
                    continue;

                }
                
                if(currentStep.equals("Final Review")){
                    if (step.equals("S")){
                        output += "Final Review>";
                        currentStep = "Final Review"; 
                    } else if (step.equals("R")){
                        output += "Waiting Final>";
                        currentStep = "Waiting Final";
                    } else if (step.equals("A")){
                        output += "Approved>";
                        currentStep = "Approved";
                    } else if (step.equals("X")){
                        output += "Rejected>";
                        currentStep = "Rejected";
                    } else {
                        output += "Invalid Command>";
                    }
                    continue;

                }
                
                if (currentStep.equals("Waiting Final")){
                    if(step.equals("I")){
                        output += "Final Review>";
                        currentStep = "Final Review";
                    } else {
                        output += "Invalid Command>";
                        
                    }
                    
                    continue;

                }
                
                if (currentStep.equals("Rejected") || currentStep.equals("Approved")){
                    if (step.equals("N")){
                        output += "Customer Notified>";
                        currentStep = "Customer Notified";
                    } else {
                        output += "Invalid Command>";
                    }
                    continue;

                    
                }
                
                if (currentStep.equals("Customer Notified")){
                    output += "Invalid Command>";
                    continue;
                }
                
                
            }
            
            
            System.out.println(output.substring(0,output.length()-1));
            
            
            
        }
        
    }
}
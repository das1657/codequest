import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i = 0; i < x; i++){
            String mode = scanner.nextLine();
            String key = scanner.nextLine();
            String key2 = key.toUpperCase();
            int n = scanner.nextInt();
            scanner.nextLine();
            
            for(int j = 0; j < n; j++){
                String msg = scanner.nextLine();
                
                if (mode.equals("ENCRYPT")){
                    String newmsg = "";
                    for(int p = 0; p < msg.length(); p++){
                        //int index = 0;
                        
                        if (msg.substring(p,p+1).equals(" "))
                        {
                            newmsg += " ";
                            continue;
                        }
                        for(int z = 0; z < alphabet.length(); z++){
                            if(alphabet.substring(z,z+1).equals(msg.substring(p,p+1))){
                                newmsg += key.substring(z,z+1);
                            } else if(alphabet2.substring(z,z+1).equals(msg.substring(p,p+1))){
                                newmsg += key2.substring(z,z+1);
                            }
                            
                            
                        }
                        
                        
                        
                        
                    }
                    System.out.println(newmsg);
                    
                    
                }
                
                
                if (mode.equals("DECRYPT")){
                    String newmsg = "";
                    for(int p = 0; p < msg.length(); p++){
                        //int index = 0;
                        if (msg.substring(p,p+1).equals(" "))
                            {
                                newmsg += " ";
                                continue;
                            }
                        for(int z = 0; z < alphabet.length(); z++){
                            
                            if(key.substring(z,z+1).equals(msg.substring(p,p+1))){
                                newmsg += alphabet.substring(z,z+1);
                            } else if(key2.substring(z,z+1).equals(msg.substring(p,p+1))){
                                newmsg += alphabet2.substring(z,z+1);
                            } 
                            
                        }
                        
                        
                        
                        
                    }
                    System.out.println(newmsg);
                    
                    
                }
                
                
            }
            
        }
        
        
    }
}
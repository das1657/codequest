import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String in = scanner.nextLine();
            String[] splitIn = in.split(" ");
            int numBallots = Integer.parseInt(splitIn[0]);
            int numCandidates = Integer.parseInt(splitIn[1]);
            
            int tallies = 0;
            boolean done = false;
            
            ArrayList<String> ballots = new ArrayList<String>();
            
            for(int t = 0; t < numBallots; t++){
                String current = scanner.nextLine();
                
                ballots.add(current);
            }
            
            HashMap<String, Integer> candidateRanks = new HashMap<>();
            String[] splitCandidates = ballots.get(0).split("");
            for (int t = 0; t < splitCandidates.length; t++){
                candidateRanks.put(splitCandidates[t], 0);
            }
            
            while (done == false){
                //System.out.println(tallies);
                tallies++;
                for (int t = 0; t < splitCandidates.length; t++){
                    String currentCandidate = splitCandidates[t];
                    
                    if (candidateRanks.get(currentCandidate) == null){
                        continue;
                    }
                    
                    for (int c = 0; c < numBallots; c++){
                        String currentBallot = ballots.get(c);
                        String currentAnswer = currentBallot.substring(0,1);
                        
                        if (candidateRanks.get(currentAnswer) == null){
                            int count = 1;
                            currentAnswer = currentBallot.substring(count,count+1);
                            while(candidateRanks.get(currentAnswer) == null){
                                count++;
                                currentAnswer = currentBallot.substring(count,count+1);
                            }
                            
                        }
                        
                        if (currentAnswer.equals(currentCandidate)){
                            candidateRanks.put(currentCandidate, candidateRanks.get(currentCandidate)+1);
                        }
    
                    }
   
                }
                
                ArrayList<String> lowestKey = new ArrayList<String>();
                double lowestVal = Double.MAX_VALUE;
                
                String highestKey = "e";
                double highestVal = Double.MIN_VALUE;
                    
                for (Map.Entry<String, Integer> entry : candidateRanks.entrySet()) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    
                    if (((double)value/numBallots) > highestVal){
                        highestKey = key;
                        highestVal = (double)value/numBallots;
                    }
                    
                    if (((double)value/numBallots) < lowestVal){
                        lowestKey.clear();
                        lowestKey.add(key);
                        lowestVal = (double)value/numBallots;
                    } else if (((double)value/numBallots) == lowestVal){
                        lowestKey.add(key);
                    }
                    
                }
                
                if (highestVal > .5){
                    done = true;
                    String formattedPercentage = String.format("%.1f%%", highestVal * 100);
                    System.out.println("Candidate " + highestKey + " won with " + formattedPercentage + " of the vote after " + tallies + " tallies");
                } else {
                    
                    for (String key : lowestKey) {
                        candidateRanks.remove(key);
                    }
                    
                    //System.out.println(lowestKey);
                    
                    for (Map.Entry<String, Integer> entry : candidateRanks.entrySet()) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        candidateRanks.put(key, 0);
                        
                        
                    }

                }
                
            }
            
        }
    }
}
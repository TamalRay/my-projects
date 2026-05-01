import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        Random random =new Random();
           String[] choices = {"rock", "paper", "scissors"};
           
           int uc=0;
           int cc=0;
           for (int i = 1; i <= 5; i++) {
         System.out.println("\nRound " + i);

        System.out.print("Enter your choice (rock, paper, scissors): ");
        
        String u =sc.nextLine().toLowerCase();

         String c = choices[random.nextInt(3)];
        System.out.println("Computer choice "+ c);
         if (u.equals(c)) {
                System.out.println("Draw!");
            } 
            else if(u.equals("rock")&&c.equals("scissors") ||(u.equals("scissor"))&& 
            c.equals("paper")|| (u.equals("paper")) && c.equals("rock"))
             {
                System.out.println("You win this round!");
                uc++;
            } 
            else {
                System.out.println("Computer wins this round!");
                cc++;
            }
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + uc);
        System.out.println("Computer: " + cc);

        if (uc > cc) {
            System.out.println("🎉 You are the winner!");
        } 
        else if (cc > uc) {
            System.out.println("💻 Computer is the winner!");
        } 
        else {
            System.out.println("🤝 Match Draw!");
        }

        sc.close();
    }
}
        
        
        
        



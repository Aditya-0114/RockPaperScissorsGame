import java.util.Random;
import java.util.Scanner;



public class spac {
    public static final String ROCK="ROCK";
    public static final String PAPER="PAPER";
    public static final String SCISSORS="SCISSORS";
    public static final String QUIT="QUIT";
    int m=0;

    public static void main(String[] args){ 
      
        System.out.println("Enter any of the following");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println("Type quit if you want to quit the game.");
        System.out.println();

        String playerMove=getPlayerMove();
        String computerMove=getComputerMove();
        if(playerMove.equals(computerMove)){
            System.out.println("Game is tie!");
        }
        else if(playerMove.equals(spac.ROCK)){
            System.out.println(computerMove.equals(spac.PAPER)?"Computer Wins!":"Player Wins!");
        }
        else if(playerMove.equals(spac.PAPER)){
            System.out.println(computerMove.equals(spac.SCISSORS)?"Computer Wins!":"Player Wins!");
        }
        else{
            System.out.println(computerMove.equals(spac.ROCK)?"Computer Wins!":"Player Wins!");
        }

    }

    public static String getComputerMove(){
        String computermove;
        Random random=new Random();
        int input=random.nextInt(2)+1;
        if(input==1){
            computermove=spac.ROCK;
        }
        else if(input==2){
            computermove=spac.PAPER;
        }
        else{
            computermove=spac.SCISSORS;
        }
        System.out.println("Computer move is: "+computermove);
        System.out.println();
        return computermove;
    }

    public static String getPlayerMove(){
        try (Scanner in = new Scanner(System.in)) {
            String input=in.next();
            String playermove=input.toUpperCase();
            System.out.println("Player move is: "+playermove);
            return playermove;
        }
    }
}

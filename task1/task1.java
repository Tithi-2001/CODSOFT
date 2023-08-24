// Number game
import java.util.*;
public class task1{
  public static int point=0;
    public static void  guessNum(int num,int count){
        Scanner sc=new Scanner(System.in);
          System.out.print("Enter your Guess: ");
          int GuessNum=sc.nextInt();
          if(GuessNum==num){
            point=point+10;
            System.out.println("You guess Correct");
            return;
          }
          if(count==5){
            System.out.println("No More attempts! You lost the Game.");
            return;
          }
          if(num>GuessNum){
            System.out.println("That is too low! Try Again!");
            count++;
            point=point-2;
            guessNum(num,count);
          }
          if(num<GuessNum){
            System.out.println("That is too high! Try Again!");
            count++;
            point=point-2;
            guessNum(num,count);
          }
          
    }
    public static void playAgain(){
      Random randomNum=new Random();
          int num=randomNum.nextInt(100)+1;
          guessNum(num,1);
          System.out.println("Want to play again?(YES/NO) ");
            Scanner sc=new Scanner(System.in);
            String ans=sc.nextLine();
            String s1="yes";
            String s2="no";

            if(s1.equals(ans.toLowerCase())==true){
              playAgain();
            }
            if(s2.equals(ans.toLowerCase())==true){
              System.out.println("Total Score: ");
              System.out.println(point);
              return;
            }
    }
   
   
    public static void main(String args[]){
          System.out.println("I have chossen a random number betweem 0-100.\nGuess the number.\nYou have total 5 attempts!");
          playAgain();
          }
          
          
    }

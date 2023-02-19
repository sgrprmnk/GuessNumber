import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber=(int) (Math.random()*100)+1;
        System.out.println(randomNumber);
        boolean isWin=false;
        System.out.println("You have to guess a Number from 1 to 100");
        System.out.println("Try to guess the NUmber ");
        Scanner scanner=new Scanner(System.in);
        for (int i = 10; i >0 ; i--) {
            System.out.println("You have "+i +" guess left to guess, Choose Again: ");
            int guess=scanner.nextInt();

            if (guess>randomNumber)
                System.out.println("It's higher than Guess Number");
            else if (guess<randomNumber)
                System.out.println("It's smaller than Guess Number");
            else
            {
                isWin=true;
                break;
            }
        }
if (isWin)
    System.out.println("Congratulations! ...You WIN! ");
else {
    System.out.println("GAME OVER ...YOU LOOSE!");
    System.out.println("The Number was: "+randomNumber);
}
    }
}
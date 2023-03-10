import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = (int)Math.random();
        System.out.println("Guess your difficulty : ");
        System.out.println("Enter 3 for easy ");
        System.err.println("Enter 2 for medium");
        System.out.println("Enter 1 for Hard");

        int n = sc.nextInt();
        int guess = n*5;
        while(guess >0){
            int a = sc.nextInt();
            if(a>b){
                System.out.println("nah ! Little bit less");
            }else if(a<b){
                System.out.println("nah ! Little bit higher");
            }else if(a==b){
                System.out.println("perfet! its correct");
                guess = 0;
            }
            guess --;
        }

    }
}

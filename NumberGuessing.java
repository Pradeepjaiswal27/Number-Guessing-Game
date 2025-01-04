package Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int rNum=rd.nextInt(100)+1;
		
		int guess=0;
		int attempts=0;
		while(guess!=rNum) {
			System.out.println("Enter the guessed number: ");
			guess=sc.nextInt();
			attempts++;
			
			if(guess > rNum) {
				System.out.println("you guesse greater number");
			}else if(guess< rNum) {
				System.out.println("you guess lower number");
			}else {
				System.out.println("you guess the right number");
				System.out.println("you won this game in "+attempts+" attempts");
			}
		}

	}

}

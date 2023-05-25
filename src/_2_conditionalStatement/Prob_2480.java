package _2_conditionalStatement;

import java.util.Scanner;

public class Prob_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();		
		
		if(num1 == num2 && num2 == num3)
			System.out.println(10000 + num1 * 1000);
		else if(num1 == num2)
			System.out.println(1000 + num1 * 100);
		else if(num2 == num3)
			System.out.println(1000 + num2 * 100);
		else if(num3 == num1)
			System.out.println(1000 + num3 * 100);
		else {
			if(num1 > num2 && num1 > num3)
				System.out.println(num1 * 100);
			else if(num2 >= num1 && num2 >= num3)
				System.out.println(num2 * 100);
			else
				System.out.println(num3 * 100);
		}
		
		
	}

}

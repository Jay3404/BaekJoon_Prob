package _2_conditionalStatement;

import java.util.Scanner;

public class Prob_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int index = 0;
		
		while(num3 > 60) {
			index++;
			num3 -= 60;
		}
		
		num2 += num3;
		if (num2 >= 60) {
			num2 -= 60;
			num1++;
		}
		
		num1 += index;
		if(num1 >= 24) {
			num1 -= 24;
		}
		
		System.out.println(num1 + " " + num2);
		
	}

}

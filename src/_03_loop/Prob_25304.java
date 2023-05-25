package _03_loop;

import java.util.Scanner;

public class Prob_25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = sc.nextInt();
		int[] numArr = new int[count * 2];
		int sum = 0;
		
		for(int i = 0; i < count * 2; i++) {
			numArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < count * 2; i += 2) {
			sum += numArr[i] * numArr[i + 1];
		}
		
		if(sum == num)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
	}

}

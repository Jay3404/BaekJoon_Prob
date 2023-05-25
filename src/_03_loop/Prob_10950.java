package _03_loop;

import java.util.Scanner;

public class Prob_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numArr = new int[num * 2];
		
		for(int i = 0; i < num * 2; i++) {
			numArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num * 2; i += 2) {
			System.out.println(numArr[i] + numArr[i + 1]);
		}
		
	}

}

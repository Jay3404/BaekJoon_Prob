package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_5597 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] intArr = new int[30];
		int num = 0;
		String num0 = "";
		String num1 = "";
		
		for(int i = 0; i < 28; i++) {
			num = Integer.parseInt(reader.readLine());
			intArr[num - 1] = num; 
		}
		
		for(int i = 0; i < 30; i++) {
			if(intArr[i] == 0)
				sb.append(i + 1).append(" ");
			
		}
		
		String[] strArr = sb.toString().split(" ");
		
		if(Integer.parseInt(strArr[0]) > Integer.parseInt(strArr[1])) {
			num0 = strArr[1];
			num1 = strArr[0];
		}else {
			num1 = strArr[1];
			num0 = strArr[0];
		}
			
		
		writer.write(num0 + "\n" + num1 );

		
		writer.flush();
		writer.close();

		reader.close();
		
	}

}

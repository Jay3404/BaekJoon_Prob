package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_10813 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = reader.readLine();
		String[] strArr = str.split(" ");
		
		int length = Integer.parseInt(strArr[0]);
		int index = Integer.parseInt(strArr[1]);
		int num1 = 0;
		
		int[] intArr = new int[Integer.parseInt(strArr[0])];
		
		for(int i = 0; i < length; i++) {
			intArr[i] = i+1;
		}
		
		for(int i = 0; i < index; i++) {
			str = reader.readLine();
			num1 = intArr[Integer.parseInt(str.split(" ")[0]) - 1];
			intArr[Integer.parseInt(str.split(" ")[0]) - 1] = intArr[Integer.parseInt(str.split(" ")[1]) - 1];
			intArr[Integer.parseInt(str.split(" ")[1]) - 1] = num1;
			
		}
		
		for(int i = 0; i < length; i++) {
			writer.write(Integer.toString(intArr[i]));
			writer.write(" ");
		}
		
		writer.flush();
		writer.close();

		reader.close();
		
	}

}

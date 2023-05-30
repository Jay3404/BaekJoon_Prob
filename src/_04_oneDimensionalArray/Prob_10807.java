package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_10807 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(reader.readLine());
        String str = reader.readLine();
        int answer = Integer.parseInt(reader.readLine());
        int result = 0;
 
        String[] strArr = str.split(" ");
        int[] intArr = new int[index];
        
        for(int i = 0; i < index; i++) {
        	intArr[i] = Integer.parseInt(strArr[i]);
        	if(intArr[i] == answer) {
        		result++;
        	}
        }
        
        writer.write(Integer.toString(result));
        
        writer.flush();
        writer.close();
        
        reader.close();
        
    }
}

package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Prob_10810 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
        
    	String[] strArr = reader.readLine().split(" ");
    	int length = Integer.parseInt(strArr[0]);
    	int index = Integer.parseInt(strArr[1]);

    	int[] intArr = new int[length];
    	
    	String str = "";
    	
    	for(int i = 0; i < index; i++) {
    		strArr = reader.readLine().split(" ");
    		for(int j = Integer.parseInt(strArr[0]); j <= Integer.parseInt(strArr[1]); j++){
    			intArr[j - 1] = Integer.parseInt(strArr[2]);
    		}
    	}
    	
    	for(int i = 0; i < length; i++) {
    		sb.append(intArr[i]).append(" ");
    	}
    
        writer.write(sb.toString());
        
        writer.flush();
        writer.close();
        
        reader.close();
        
    }
}

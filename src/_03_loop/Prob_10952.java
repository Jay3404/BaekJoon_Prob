package _03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_10952 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            
            String input = "";
            StringBuilder sb = new StringBuilder();
            int index = 0;
            
            while(true) {
            	input = reader.readLine();
            	if(input.charAt(0) == '0' && input.charAt(2) == '0')
            		break;
            	else {
            		index++;
            		sb.append(input).append(" ");
            	}
            	
            }
            
            String[] strArr = sb.toString().split(" ");
            int[] intArr = new int[index * 2];
            
            for(int i = 0; i < index * 2; i++) {
            	intArr[i] = Integer.parseInt(strArr[i]);
            }
            
            for(int i = 0; i < index * 2; i += 2) {
            	writer.write(Integer.toString(intArr[i] + intArr[i+1]));
            	writer.write("\n");
            }
            
            writer.flush();
            writer.close();
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

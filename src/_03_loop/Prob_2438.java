package _03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_2438 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int input = Integer.parseInt(reader.readLine());
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < input; i++) {
            	
            	for(int j = input - 1; j > i; j-- ) {
            		writer.write(" ");
            	}
                sb.append("*");
                writer.write(sb.toString());
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

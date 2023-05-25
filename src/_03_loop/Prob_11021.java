package _03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_11021 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            int input = Integer.parseInt(reader.readLine());
            String[] strArr = new String[input * 2];
            StringBuilder sb = new StringBuilder();
            int answer = 0;
            
            for(int i = 0; i < input; i++) {
                sb.append(reader.readLine()).append(" ");
            }
            strArr = sb.toString().split(" ");
            
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            for(int i = 0; i < input * 2; i += 2) {
                answer = Integer.parseInt(strArr[i]) + Integer.parseInt(strArr[i + 1]);
                writer.write("Case #" + Integer.toString(i / 2 + 1) + ": " + Integer.toString(answer));
                writer.newLine();
            }
            
            writer.flush();
            writer.close();
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

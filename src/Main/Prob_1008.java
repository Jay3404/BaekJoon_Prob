package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Prob_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader reader = null;
        try {
        	
        	reader = new BufferedReader(new InputStreamReader(System.in));

        	
            String[] elements = reader.readLine().split(" ");
            
            BigDecimal num1 = new BigDecimal(elements[0]);
            BigDecimal num2 = new BigDecimal(elements[1]);
            
            @SuppressWarnings("deprecation")
			BigDecimal result = num1.divide(num2, 9, BigDecimal.ROUND_HALF_UP);
            
            
            System.out.println(result);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}

}

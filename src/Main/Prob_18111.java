package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
				
    	BufferedReader reader = null;
    	try {
           
            reader = new BufferedReader(new InputStreamReader(System.in));
            
            int[] array = new int[3];
            String[] elements = reader.readLine().split(" ");
            
            for (int i = 0; i < 3; i++) {
                array[i] = Integer.parseInt(elements[i]);
            }
            int min = 256;
            int max = 0;
            int diff = 0;
            int time = 0;
            int index = 0;
            
            int[] blockArr = new int[array[0] * array[1]];
            
            for(int i = 0; i < array[0]; i++) {
            	String[] block1 = reader.readLine().split(" ");
            	for(int j = 0; j < array[1]; j++) {
            		blockArr[index++] = Integer.parseInt(block1[j]);
            	}
            }
           
            for (int i : blockArr) {
            	if (i > max)
            		max = i;
            	if (i < min)
            		min = i;
            }
            index = max - min + 1;
            int max1 = max;
            
            int[] answer = new int[index];
            int[] needBlock = new int[index];
            
            for(int i = 0; (i < index); i++) {
            
            	for(int j : blockArr) {
            		
            		if(max - j > 0) {
            			time += max - j;
            			diff -= max - j;
            		}else {
            			time += (j - max) * 2;
            			diff += j - max;
            		}
            	}
            
            	answer[i] = time;
            	needBlock[i] = diff + array[2];
            	time = 0;
            	diff = 0;
            	max--;
            }
            
            
            min = Integer.MAX_VALUE;
            time = 0;
            for(int i = 0; i < index; i ++) {
            	if(needBlock[i] >= 0) {
            		if(answer[i] < min) {
            			min = answer[i];
            			time = i;
            		}
            	}
            }
            System.out.println(min + " " + (max1 - time) );
           
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
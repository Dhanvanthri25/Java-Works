import java.util.*;
public class ArrayMinMax 
{

public static void main(String[] args) 
{
        int[] arr = { 23, 560, 70, 89, 12, 45 };
	  int min = arr[0]; 
        int max = arr[0]; 

        
for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value in array: " + min);
        System.out.println("Maximum value in array: " + max);
    }
}

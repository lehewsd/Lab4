package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {

	public void sortArray(int[] array) {
		try {
			int x = 0;
			int[] copArr = array;
			int[] finArr =  new int[array.length];
			
			Arrays.sort(copArr, 0, array.length-1);
			
			for(int i = array.length; i > 0; i--) {
				finArr[array.length - i] = copArr[i];
			}
		}
		catch (IllegalArgumentException exception){
			System.out.println(exception);
		}
	}
	public static void main(String[] args) {	
	}
}

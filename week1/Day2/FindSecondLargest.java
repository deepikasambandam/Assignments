package week1.Day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,17};
		Arrays.sort(data);
		int len= data.length;
		//System.out.println(len);
		//int secondLargest = len-1;		
		System.out.println(data[len-2]);
		

	}

}

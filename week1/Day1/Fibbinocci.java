package week1.Day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum =1;
		System.out.print(firstNum+" ");
		System.out.print(secondNum+" ");
		for(int sum=1;sum<=56;sum=firstNum+secondNum) {
			System.out.print(sum+" ");
			firstNum=secondNum;
			secondNum=sum;
					
		}
	}

}

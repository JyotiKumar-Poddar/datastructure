package javabasic;

import java.io.IOException;
import java.util.Scanner;

/**
 * Example to add two large numbers using java.math.BigInteger 
 * @author jyotipoddar
 *
 */
public class SumOfLargeNumbers {

	//TODO:  more test cases need to be executed.
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int numberOfInput = Integer.parseInt(scan.next());
		String[] inputNumber = new String[numberOfInput];

		for (int i = 0; i < numberOfInput; i++) {
			inputNumber[i] = scan.next();
		}
		scan.close();

		/*BigInteger bigIntegerSum = new BigInteger("0");
		for (int i = 0; i < inputNumber.length; i++) {
			BigInteger temp=new BigInteger(inputNumber[i]);
			bigIntegerSum=bigIntegerSum.add(temp);
			
		}
		System.out.println(bigIntegerSum.toString());
*/
	     
		// Adding two number using conventional approach
		
		char temp[]=inputNumber[0].toCharArray();
		
		for(int i=1;i<=inputNumber.length-1;i++){
			temp=add(temp, inputNumber[i].toCharArray());
		}
		System.out.println(String.valueOf(temp));
		
	}

	private static char[] add(char[] a1, char[] a2) {
		// start from right hand side
		int reminder = 0;
		StringBuilder temp = new StringBuilder();
		int secondIteration=0;
		if(a1.length>a2.length){
			secondIteration=a1.length-a2.length;
		}else{
			secondIteration=a2.length-a2.length;
		}
		int i = a1.length-1;
		int j = a2.length-1;
	    
		for (; i >= 0 &&  j>=0; i--,j--) {
			int sum = Integer.parseInt(String.valueOf(a1[i]))+ Integer.parseInt(String.valueOf(a2[j])) + reminder;
			reminder = getSum(temp, sum);
			
		}
		for(int p=secondIteration-1;p>=0;p--){
			int sum = Integer.parseInt(String.valueOf(a1[p])) + reminder;
			reminder = getSum(temp, sum);
		}
		
		return temp.reverse().toString().toCharArray();
	}

	/**
	 * Method to calculate the sum
	 * @param temp
	 * @param sum
	 * @return
	 */
	public static int getSum(StringBuilder temp, int sum) {
		int reminder;
		int mod;
		if (sum > 10) {
			reminder = sum / 10;
			mod = sum % 10;
			temp.append(mod);
		} else if (sum == 10) {
			reminder = sum / 10;
			mod = sum % 10;
			temp.append(mod);
		} else {
			reminder = 0;
			temp.append(sum);
		}
		return reminder;
	}
}

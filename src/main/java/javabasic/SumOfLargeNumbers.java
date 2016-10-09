package javabasic;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Example to add two large numbers using java.math.BigInteger 
 * @author jyotipoddar
 *
 */
public class SumOfLargeNumbers {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int numberOfInput = Integer.parseInt(scan.next());
		String[] inputNumber = new String[numberOfInput];

		for (int i = 0; i < numberOfInput; i++) {
			inputNumber[i] = scan.next();
		}
		scan.close();

		BigInteger bigIntegerSum = new BigInteger("0");
		for (int i = 0; i < inputNumber.length; i++) {
			BigInteger temp=new BigInteger(inputNumber[i]);
			bigIntegerSum=bigIntegerSum.add(temp);
			
		}
		System.out.println(bigIntegerSum.toString());

	}
}

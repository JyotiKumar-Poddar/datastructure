package javabasic;

import java.util.Scanner;
/**
 * 
 * program to print the stair case in reverse direction
 * 
 * @author jyotipoddar
 *
 */
public class StaircasePrint {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
        	for (int j = 0; j < n; j++) {
				if(i+j+1>=n){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
        	System.out.println();
        }
        in.close();
    }
}

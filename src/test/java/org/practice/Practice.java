package org.practice;

public class Practice {
	public static void main(String[] args) {
		
		int num=153,rem=0,res=0;
		while (num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
	System.out.println(res);	
	}

}

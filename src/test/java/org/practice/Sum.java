package org.practice;

public class Sum {
	public static void main(String[] args) {
		
		int num=123,rem=0,res=0;
		while (num>0) {
			rem=num%10;
			res=rem+res;
			num=num/10;
					
		}
		System.out.println(res);
	}

}

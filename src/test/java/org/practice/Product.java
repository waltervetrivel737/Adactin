package org.practice;

public class Product {
	public static void main(String[] args) {
		
		int num=124,rem=0,res=1;
		while (num>0) {
			rem=num%10;
			res=res*rem;
			num=num/10;
		}
	System.out.println(res);
	}

}

package org.practice;

public class Palindrome {
	public static void main(String[] args) {
		
		int num=121,rem=0,res=0,temp;
		temp =num;
		while (num>0) {
			
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		if (temp==res) {
			System.out.println("pldrpm");
		}
		else {
			System.out.println("not plndrm");
		}
	}
	

}

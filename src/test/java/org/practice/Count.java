package org.practice;

public class Count {
	public static void main(String[] args) {
		
		int num=1234,rem=0,count=0;
		while (num>0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}

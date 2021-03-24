package org.kee;

public class PomManager {
	
	private static PomManager pm;
	private Kee k;
	private kee2 k2;
	
	public static PomManager getPm() {
		return (pm==null) ? pm=new PomManager():pm;
	}
	public Kee getK() {
		return (k==null)? k=new Kee():k;
	}
	public kee2 getK2() {
		return (k2==null) ? k2=new kee2():k2;
	}
	
}

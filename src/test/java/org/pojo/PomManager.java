package org.pojo;

import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class PomManager extends BaseClass {

	private PomManager() {
		// TODO Auto-generated constructor stub
	}
	private static PomManager pom;
	private Selecthotlpojo selthtl;
	private Searchhotelpojo srchhotl;
	private Personaldetlspojo persnldtls;
	private Loginpojo lgnpojo;
	private Confirmpojo cnfmpojo;

	public static PomManager getPom() {
		return (pom == null) ? pom = new PomManager() : pom;
	}

	public Selecthotlpojo getSelthtl() {
		return (selthtl == null) ? selthtl = new Selecthotlpojo() : selthtl;
	}

	public Searchhotelpojo getSrchhotl() {
		return (srchhotl == null) ? srchhotl = new Searchhotelpojo() : srchhotl;
	}

	public Personaldetlspojo getPersnldtls() {
		return (persnldtls == null) ? persnldtls = new Personaldetlspojo() : persnldtls;
	}

	public Loginpojo getLgnpojo() {
		return (lgnpojo == null) ? lgnpojo = new Loginpojo() : lgnpojo;
	}

	public Confirmpojo getCnfimpojo() {
		return (cnfmpojo == null) ? cnfmpojo = new Confirmpojo() : cnfmpojo;
	}

}

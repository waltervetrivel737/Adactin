package org.utilis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	
	public static void togenrtJvmreport(String jsonpath) {
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Jvmreports");
		Configuration con=new Configuration(f, "");
		con.addClassifications("platform", "windows");
		con.addClassifications("browser", "chrome");
		List<String> li=new ArrayList<String>();
		li.add(jsonpath);
		ReportBuilder rept=new ReportBuilder(li, con);
		rept.generateReports();

	}
	
	

}

package org.stepdefinetion;

import java.io.IOException;


import org.utilis.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class HooksClass extends BaseClass {
	
	@Before
	public void beforeexecution() {
		tolaunch();
		tomax();
		towait();
	}
	@After
	public void afterexcution() throws IOException {
		totakescreenshort("src\\test\\resources\\Screenshort\\page1.png");
		toclose();

	}

}

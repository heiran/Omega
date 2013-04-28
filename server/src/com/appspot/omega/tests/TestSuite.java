package com.appspot.omega.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class TestSuite extends TestCase{

	public static Test suite() {
		TestSuite suite = new TestSuite();
		
		
		suite.addTestSuite(hääledErakonnaLõikes.class);
		suite.addTestSuite(hääledPiirkonnaLõikes.class);
		suite.addTestSuite(nimejärgiOtsing.class);
		suite.addTestSuite(hääledKandidaadiLõikes.class);
		suite.addTestSuite(hääledRiigiLõikes.class);
		suite.addTestSuite(hääledErakonnaLõikes.class);
		suite.addTestSuite(hääledPiirkonnaLõikes_autend.class);
		suite.addTestSuite(hääledKandidaadiLõikes_autend.class);
		suite.addTestSuite(hääledRiigiLõikes_autend.class);
		suite.addTestSuite(nimejärgiOtsing_autend.class);
		suite.addTestSuite(lisaKandidaadina.class);
		suite.addTestSuite(haaletamineHaaleEemaldamine.class);
		return suite;
	}

	public static void main(String[] args) {
		TestRunner.run(lisaKandidaadina.class);
	}
}

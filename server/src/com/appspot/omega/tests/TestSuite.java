package com.appspot.omega.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class TestSuite extends TestCase{

	public static Test suite() {
		TestSuite suite = new TestSuite();
		
		
		suite.addTestSuite(h��ledErakonnaL�ikes.class);
		suite.addTestSuite(h��ledPiirkonnaL�ikes.class);
		suite.addTestSuite(nimej�rgiOtsing.class);
		suite.addTestSuite(h��ledKandidaadiL�ikes.class);
		suite.addTestSuite(h��ledRiigiL�ikes.class);
		suite.addTestSuite(h��ledErakonnaL�ikes.class);
		suite.addTestSuite(h��ledPiirkonnaL�ikes_autend.class);
		suite.addTestSuite(h��ledKandidaadiL�ikes_autend.class);
		suite.addTestSuite(h��ledRiigiL�ikes_autend.class);
		suite.addTestSuite(nimej�rgiOtsing_autend.class);
		suite.addTestSuite(lisaKandidaadina.class);
		suite.addTestSuite(haaletamineHaaleEemaldamine.class);
		return suite;
	}

	public static void main(String[] args) {
		TestRunner.run(lisaKandidaadina.class);
	}
}

/**
 */
package fca.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>fca</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FcaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new FcaTests("fca Tests");
		suite.addTestSuite(FcaTest.class);
		suite.addTestSuite(ReglaUnoTest.class);
		suite.addTestSuite(ConfiguracionTest.class);
		suite.addTestSuite(AjusteTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcaTests(String name) {
		super(name);
	}

} //FcaTests

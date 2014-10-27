/**
 */
package grafo.tests;

import grafo.Carateristica;
import grafo.GrafoFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Carateristica</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarateristicaTest extends TestCase {

	/**
	 * The fixture for this Carateristica test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Carateristica fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarateristicaTest.class);
	}

	/**
	 * Constructs a new Carateristica test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarateristicaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Carateristica test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Carateristica fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Carateristica test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Carateristica getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrafoFactory.eINSTANCE.createCarateristica());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CarateristicaTest

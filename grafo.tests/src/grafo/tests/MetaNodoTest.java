/**
 */
package grafo.tests;

import grafo.GrafoFactory;
import grafo.MetaNodo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meta Nodo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaNodoTest extends CarateristicaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetaNodoTest.class);
	}

	/**
	 * Constructs a new Meta Nodo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaNodoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Meta Nodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MetaNodo getFixture() {
		return (MetaNodo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GrafoFactory.eINSTANCE.createMetaNodo());
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

} //MetaNodoTest

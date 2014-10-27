/**
 */
package grafo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see grafo.GrafoPackage
 * @generated
 */
public interface GrafoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrafoFactory eINSTANCE = grafo.impl.GrafoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grafo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grafo</em>'.
	 * @generated
	 */
	Grafo createGrafo();

	/**
	 * Returns a new object of class '<em>Nodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodo</em>'.
	 * @generated
	 */
	Nodo createNodo();

	/**
	 * Returns a new object of class '<em>Enlace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enlace</em>'.
	 * @generated
	 */
	Enlace createEnlace();

	/**
	 * Returns a new object of class '<em>Meta Nodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Nodo</em>'.
	 * @generated
	 */
	MetaNodo createMetaNodo();

	/**
	 * Returns a new object of class '<em>Carateristica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carateristica</em>'.
	 * @generated
	 */
	Carateristica createCarateristica();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GrafoPackage getGrafoPackage();

} //GrafoFactory

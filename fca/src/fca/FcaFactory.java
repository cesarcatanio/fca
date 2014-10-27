/**
 */
package fca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fca.FcaPackage
 * @generated
 */
public interface FcaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FcaFactory eINSTANCE = fca.impl.FcaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fca</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fca</em>'.
	 * @generated
	 */
	Fca createFca();

	/**
	 * Returns a new object of class '<em>Regla Uno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regla Uno</em>'.
	 * @generated
	 */
	ReglaUno createReglaUno();

	/**
	 * Returns a new object of class '<em>Configuracion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuracion</em>'.
	 * @generated
	 */
	Configuracion createConfiguracion();

	/**
	 * Returns a new object of class '<em>Ajuste</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ajuste</em>'.
	 * @generated
	 */
	Ajuste createAjuste();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FcaPackage getFcaPackage();

} //FcaFactory

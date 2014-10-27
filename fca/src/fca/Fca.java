/**
 */
package fca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fca.Fca#getReglaUno <em>Regla Uno</em>}</li>
 *   <li>{@link fca.Fca#getConfiguracion <em>Configuracion</em>}</li>
 * </ul>
 * </p>
 *
 * @see fca.FcaPackage#getFca()
 * @model
 * @generated
 */
public interface Fca extends EObject {
	/**
	 * Returns the value of the '<em><b>Regla Uno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regla Uno</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regla Uno</em>' reference.
	 * @see #setReglaUno(ReglaUno)
	 * @see fca.FcaPackage#getFca_ReglaUno()
	 * @model
	 * @generated
	 */
	ReglaUno getReglaUno();

	/**
	 * Sets the value of the '{@link fca.Fca#getReglaUno <em>Regla Uno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regla Uno</em>' reference.
	 * @see #getReglaUno()
	 * @generated
	 */
	void setReglaUno(ReglaUno value);

	/**
	 * Returns the value of the '<em><b>Configuracion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuracion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuracion</em>' reference.
	 * @see #setConfiguracion(Configuracion)
	 * @see fca.FcaPackage#getFca_Configuracion()
	 * @model
	 * @generated
	 */
	Configuracion getConfiguracion();

	/**
	 * Sets the value of the '{@link fca.Fca#getConfiguracion <em>Configuracion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuracion</em>' reference.
	 * @see #getConfiguracion()
	 * @generated
	 */
	void setConfiguracion(Configuracion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crearGrafo();
	
	String[][] getMatriz();
	void setMatriz(String[][] matriz);

} // Fca

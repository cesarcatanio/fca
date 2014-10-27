/**
 */
package fca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuracion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fca.Configuracion#getSerie <em>Serie</em>}</li>
 *   <li>{@link fca.Configuracion#getRuta <em>Ruta</em>}</li>
 * </ul>
 * </p>
 *
 * @see fca.FcaPackage#getConfiguracion()
 * @model
 * @generated
 */
public interface Configuracion extends EObject {
	/**
	 * Returns the value of the '<em><b>Serie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie</em>' attribute.
	 * @see #setSerie(Integer)
	 * @see fca.FcaPackage#getConfiguracion_Serie()
	 * @model
	 * @generated
	 */
	Integer getSerie();

	/**
	 * Sets the value of the '{@link fca.Configuracion#getSerie <em>Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serie</em>' attribute.
	 * @see #getSerie()
	 * @generated
	 */
	void setSerie(Integer value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see fca.FcaPackage#getConfiguracion_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link fca.Configuracion#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exportar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void importar();

} // Configuracion

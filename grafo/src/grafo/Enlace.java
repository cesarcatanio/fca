/**
 */
package grafo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enlace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafo.Enlace#getInicio <em>Inicio</em>}</li>
 *   <li>{@link grafo.Enlace#getObjetivo <em>Objetivo</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafo.GrafoPackage#getEnlace()
 * @model
 * @generated
 */
public interface Enlace extends Carateristica {
	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' reference.
	 * @see #setInicio(Nodo)
	 * @see grafo.GrafoPackage#getEnlace_Inicio()
	 * @model required="true"
	 * @generated
	 */
	Nodo getInicio();

	/**
	 * Sets the value of the '{@link grafo.Enlace#getInicio <em>Inicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' reference.
	 * @see #getInicio()
	 * @generated
	 */
	void setInicio(Nodo value);

	/**
	 * Returns the value of the '<em><b>Objetivo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objetivo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objetivo</em>' reference.
	 * @see #setObjetivo(Nodo)
	 * @see grafo.GrafoPackage#getEnlace_Objetivo()
	 * @model required="true"
	 * @generated
	 */
	Nodo getObjetivo();

	/**
	 * Sets the value of the '{@link grafo.Enlace#getObjetivo <em>Objetivo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objetivo</em>' reference.
	 * @see #getObjetivo()
	 * @generated
	 */
	void setObjetivo(Nodo value);

} // Enlace

/**
 */
package grafo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafo.MetaNodo#getNodo <em>Nodo</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafo.GrafoPackage#getMetaNodo()
 * @model
 * @generated
 */
public interface MetaNodo extends Carateristica {
	/**
	 * Returns the value of the '<em><b>Nodo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodo</em>' reference.
	 * @see #setNodo(Nodo)
	 * @see grafo.GrafoPackage#getMetaNodo_Nodo()
	 * @model
	 * @generated
	 */
	Nodo getNodo();

	/**
	 * Sets the value of the '{@link grafo.MetaNodo#getNodo <em>Nodo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodo</em>' reference.
	 * @see #getNodo()
	 * @generated
	 */
	void setNodo(Nodo value);

} // MetaNodo

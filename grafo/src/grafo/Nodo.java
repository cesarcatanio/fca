/**
 */
package grafo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafo.Nodo#getListaNodosAsociados <em>Lista Nodos Asociados</em>}</li>
 *   <li>{@link grafo.Nodo#getMetaNodo <em>Meta Nodo</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafo.GrafoPackage#getNodo()
 * @model
 * @generated
 */
public interface Nodo extends Carateristica {
	/**
	 * Returns the value of the '<em><b>Lista Nodos Asociados</b></em>' reference list.
	 * The list contents are of type {@link grafo.Nodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Nodos Asociados</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Nodos Asociados</em>' reference list.
	 * @see grafo.GrafoPackage#getNodo_ListaNodosAsociados()
	 * @model
	 * @generated
	 */
	EList<Nodo> getListaNodosAsociados();

	/**
	 * Returns the value of the '<em><b>Meta Nodo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Nodo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Nodo</em>' reference.
	 * @see #setMetaNodo(MetaNodo)
	 * @see grafo.GrafoPackage#getNodo_MetaNodo()
	 * @model
	 * @generated
	 */
	MetaNodo getMetaNodo();

	/**
	 * Sets the value of the '{@link grafo.Nodo#getMetaNodo <em>Meta Nodo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Nodo</em>' reference.
	 * @see #getMetaNodo()
	 * @generated
	 */
	void setMetaNodo(MetaNodo value);

} // Nodo

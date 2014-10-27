/**
 */
package grafo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafo.Grafo#getListaNodos <em>Lista Nodos</em>}</li>
 *   <li>{@link grafo.Grafo#getListaEnlaces <em>Lista Enlaces</em>}</li>
 *   <li>{@link grafo.Grafo#getListaMetaNodos <em>Lista Meta Nodos</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafo.GrafoPackage#getGrafo()
 * @model
 * @generated
 */
public interface Grafo extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Nodos</b></em>' containment reference list.
	 * The list contents are of type {@link grafo.Nodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Nodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Nodos</em>' containment reference list.
	 * @see grafo.GrafoPackage#getGrafo_ListaNodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nodo> getListaNodos();

	/**
	 * Returns the value of the '<em><b>Lista Enlaces</b></em>' containment reference list.
	 * The list contents are of type {@link grafo.Enlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Enlaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Enlaces</em>' containment reference list.
	 * @see grafo.GrafoPackage#getGrafo_ListaEnlaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enlace> getListaEnlaces();

	/**
	 * Returns the value of the '<em><b>Lista Meta Nodos</b></em>' containment reference list.
	 * The list contents are of type {@link grafo.MetaNodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Meta Nodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Meta Nodos</em>' containment reference list.
	 * @see grafo.GrafoPackage#getGrafo_ListaMetaNodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaNodo> getListaMetaNodos();

} // Grafo

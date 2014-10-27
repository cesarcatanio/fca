/**
 */
package fca;


import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regla Uno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fca.ReglaUno#getAjuste <em>Ajuste</em>}</li>
 * </ul>
 * </p>
 *
 * @see fca.FcaPackage#getReglaUno()
 * @model
 * @generated
 */
public interface ReglaUno extends EObject {
	/**
	 * obtener la lista de columnas editadas;
	 * @return
	 */
	EList<Integer> getListaColumnasEditadas();
	/**
	 * Returns the value of the '<em><b>Ajuste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajuste</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajuste</em>' reference.
	 * @see #setAjuste(Ajuste)
	 * @see fca.FcaPackage#getReglaUno_Ajuste()
	 * @model
	 * @generated
	 */
	Ajuste getAjuste();

	/**
	 * Sets the value of the '{@link fca.ReglaUno#getAjuste <em>Ajuste</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajuste</em>' reference.
	 * @see #getAjuste()
	 * @generated
	 */
	void setAjuste(Ajuste value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String[][] analizarUno(String[][] matriz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String[][] analizarDos(String[][] matriz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int buscarSuperFila(String[][] matriz, int fila);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int bucarNumeroEnArreglo(int numero, int[] arreglo);
	
	/**
	 * @param columnas
	 * @param atributosEditados
	 * @return
	 */
	int compararArregloVsArrayList(int[] columnas, ArrayList<Integer> atributosEditados);

} // ReglaUno

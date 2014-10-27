/**
 */
package fca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ajuste</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fca.FcaPackage#getAjuste()
 * @model
 * @generated
 */
public interface Ajuste extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String[][] eliminarFila(String[][] matriz, int fila);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String[][] eliminarColumna(String[][] matriz, int columna);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int contarAtributosFila(String[] fila);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String combinarObjetoAtributo(int fila, int columna, String[][] matriz);
	
	/**
	 * @param matriz
	 * @param fila
	 * @return
	 */
	String[] obtenerFila(String[][] matriz, int fila);
	
	/**
	 * @param fila
	 * @return
	 */
	int[] obtenerColumnasDeLaFila(String[] fila);
	
	/**
	 * @param matriz
	 * Elimina las filas sin atributos
	 * @return 
	 */
	String[][] ajustarFilas(String[][] matriz);
	
	/**
	 * @param matriz
	 * Elimina las columnas sin objetos
	 * @return 
	 */
	String[][] ajustarColumnas(String[][] matriz);
	
	/**
	 * @param matriz
	 * @param columna
	 * @return
	 * obtine la columna seleccionada
	 */
	String[] obtenerColumna(String[][] matriz, int columna );
	
	/**
	 * @param columna
	 * @return
	 * cuenta los objetos que hay en una columna
	 */
	int contarObjetosColumna(String[] columna);
	
	/**
	 * @return
	 */
	String[][] ajustarMatriz(String[][] matriz);

} // Ajuste

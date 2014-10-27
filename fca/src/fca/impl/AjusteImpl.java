/**
 */
package fca.impl;

import fca.Ajuste;
import fca.Configuracion;
import fca.Fca;
import fca.FcaPackage;
import fca.ReglaUno;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import javax.xml.soap.SAAJResult;

import org.eclipse.core.internal.registry.OffsetTable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ajuste</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class AjusteImpl extends MinimalEObjectImpl.Container implements Ajuste {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AjusteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FcaPackage.Literals.AJUSTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[][] eliminarFila(String[][] matriz, int fila) {
		if (fila < 0 || fila >= matriz.length) {
			return null;
		}

		int f = matriz.length;
		int c = matriz[0].length;
		int k = 0;
		String[][] matrizAuxiliar = new String[f - 1][c];

		for (int i = 0; i < matrizAuxiliar.length; i++) {
			if (i == fila) {
				k++;
			}
			for (int j = 0; j < c; j++) {
				matrizAuxiliar[i][j] = matriz[k][j];
			}
			k++;
		}
		return matrizAuxiliar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[][] eliminarColumna(String[][] matriz, int columna) {
		int f = matriz.length;
		int c = matriz[0].length;

		String[][] matrizAuxiliar = new String[f][c - 1];

		if (columna == 0) {
			for (int i = 0; i < f; i++) {
				for (int j = 0; j < c; j++) {
					matrizAuxiliar[i][j] = matriz[i][j + 1];
					if (j + 1 < c) {
						return matrizAuxiliar;
					}
				}
			}
		} else if (columna == c-1) {
			for (int i = 0; i < f; i++) {
				for (int j = 0; j < matrizAuxiliar[0].length; j++) {
					matrizAuxiliar[i][j] = matriz[i][j];
				}
			}
			return matrizAuxiliar;
		} else if(columna > 0 && columna < c-1 ){
			int k = 0;
			for (int i = 0; i < f; i++) {
				for (int j = 0; j < c; j++) {
					if (k < c) {
						if (k == columna) {
							k++;
						}
						matrizAuxiliar[i][j] = matriz[i][k];
						k++;
					}
				}
				k = 0;
			}
			return matrizAuxiliar;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int contarAtributosFila(String[] fila) {
		int atributos = 0;
		for (int i = 1; i < fila.length; i++) {
			if (!(fila[i].equalsIgnoreCase(""))) {
				atributos++;
			}
		}
		return atributos;
	}



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String combinarObjetoAtributo(int fila, int columna,
			String[][] matriz) {
		matriz[0][columna] += "/" + matriz[fila][0];
		return matriz[0][columna];
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case FcaPackage.AJUSTE___ELIMINAR_FILA:
			// malo
			eliminarFila(null, operationID);
			return null;
		case FcaPackage.AJUSTE___ELIMINAR_COLUMNA:
			eliminarColumna(null, operationID);
			return null;
		case FcaPackage.AJUSTE___CONTAR_ATRIBUTOS_FILA:
			contarAtributosFila(null);
			return null;
		case FcaPackage.AJUSTE___CONTAR_OBJETOS_COLUMNA:
			contarObjetosColumna(null);
			return null;
		case FcaPackage.AJUSTE___COMBINAR_OBJETO_ATRIBUTO:
			combinarObjetoAtributo(operationID, operationID, null);
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fca.Ajuste#obtenerFila(java.lang.String[][], int)
	 */
	@Override
	public String[] obtenerFila(String[][] matriz, int fila) {
		String[] filaObtenida = new String[matriz[0].length];
		for (int j = 0; j < matriz[0].length; j++) {
			filaObtenida[j] = matriz[fila][j];
		}
		return filaObtenida;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fca.Ajuste#obtenerColumnasDeLaFila(java.lang.String[])
	 */
	@Override
	public int[] obtenerColumnasDeLaFila(String[] fila) {
		int[] columnas = new int[contarAtributosFila(fila)];
		int k = 0;
		for (int i = 1; i < fila.length; i++) {
			if (!(fila[i].equalsIgnoreCase(""))) {
				columnas[k] = i;
				k++;
			}
		}
		return columnas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fca.Ajuste#ajustarFilas(java.lang.String[][])
	 */
	@Override
	public String[][] ajustarFilas(String[][] matriz) {
		String[] fila;
		for (int i = 1; i < matriz.length; i++) {
			fila = obtenerFila(matriz, i);
			if (contarAtributosFila(fila) == 0) {
				matriz = eliminarFila(matriz, i);
				i--;
			}
		}
		return matriz;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fca.Ajuste#ajustarColumnas(java.lang.String[][])
	 */
	@Override
	public String[][] ajustarColumnas(String[][] matriz) {
		String[] columna;
		for (int j = 1; j < matriz[0].length; j++) {
			columna = obtenerColumna(matriz, j);
			if (contarObjetosColumna(columna) == 0) {
				matriz = eliminarColumna(matriz, j);
				j--;
			}
		}
		return matriz;

	}

	@Override
	public String[] obtenerColumna(String[][] matriz, int columna) {
		String[] columnaObtenida = new String[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			columnaObtenida[i] = matriz[i][columna];
		}
		return columnaObtenida;
	}



	@Override
	public String[][] ajustarMatriz(String[][] matriz) {

		return ajustarFilas(ajustarColumnas(matriz));
	}



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	
	public int contarObjetosColumna(String[] columna) {
		int objetos = 0;
		for (int i = 1; i < columna.length; i++) {
			if (!(columna[i].equalsIgnoreCase("") || columna[i] == null)) {
				objetos++;
			}
		}
		return objetos;
	}

} // AjusteImpl

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
	public String combinarAtributoObjeto(int fila, int columna,
			String[][] matriz) {
		matriz[fila][0] += "/" + matriz[0][columna];
		return matriz[fila][0];
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
	public int[] obtenerColumnasDeLaFila(String[] columna) {
		int[] filas = new int[contarObjetosColumna(columna)];
		int k = 0;
		for (int i = 1; i < columna.length; i++) {
			if (!(columna[i].equalsIgnoreCase(""))) {
				filas[k] = i;
				k++;
			}
		}
		return filas;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see fca.Ajuste#obtenerColumnasDeLaFila(java.lang.String[])
	 */
	@Override
	public int[] obtenerFilasDeLaColumna(String[] fila) {
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
//		imprimirArreglo(columnaObtenida,'v');
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
	
	/**
	 * Matriz Prueba
	 */
	public String[][] obtenerMatrizPrueba(int tipo) {
		
		if (tipo == 1) {
			String[][] matrizPrueba = new String[11][11];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP1";

			// atributos
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[0][j] = "" + j;
			}
			// objetos
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[i][0] = "" + ((char) (i + 64));
			}

			// atributos 1,7,10 sin ningun objeto
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[1][i] = "";
				matrizPrueba[10][i] = "";
			}

			// relaciónn objeto 1 atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[1][j] = "";
			}

			// relación objeto 2 con los atributos 2,3,4
			matrizPrueba[2][2] = "x";
			matrizPrueba[2][3] = "x";
			matrizPrueba[2][4] = "x";

			// relación objeto 3 con los atributos 4,5,6
			matrizPrueba[3][4] = "x";
			matrizPrueba[3][5] = "x";
			matrizPrueba[3][6] = "x";

			// relación objeto 4 con los atributos 2,4
			matrizPrueba[4][2] = "x";
			matrizPrueba[4][4] = "x";

			// relaciónn objeto 5 con los atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[5][j] = "";
			}

			// relaciónn objeto 6 con el atributo 2
			matrizPrueba[6][2] = "x";

			// relaciónn objeto 7 con los atributos 2,3,4,5,6
			matrizPrueba[7][2] = "x";
			matrizPrueba[7][3] = "x";
			matrizPrueba[7][4] = "x";
			matrizPrueba[7][5] = "x";
			matrizPrueba[7][6] = "x";

			// relaciónn objeto 8 con los atributos 4,6
			matrizPrueba[8][4] = "x";
			matrizPrueba[8][6] = "x";

			// relaciónn objeto 9 con los atributos 4,6
			matrizPrueba[9][8] = "x";
			matrizPrueba[9][9] = "x";

			// relaciónn objeto 10 con los atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[10][j] = "";
			}
			
			return matrizPrueba;
		}
		if (tipo == 2) {
			String[][] matrizPrueba = new String[11][11];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP2";

			// atributos
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[0][j] = "" + j;
			}
			// objetos
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[i][0] = "" + ((char) (i + 64));
			}

			// atributos 1,7,10 sin ningun objeto
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[1][i] = "";
				matrizPrueba[10][i] = "";
			}

			// relaciónn objeto 1 atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[1][j] = "";
			}

			// relación objeto 2 con los atributos 2,3,4
			matrizPrueba[2][2] = "x";
			matrizPrueba[2][3] = "x";
			matrizPrueba[2][4] = "x";

			// relación objeto 3 con los atributos 4,5,6
			matrizPrueba[3][4] = "x";
			matrizPrueba[3][5] = "x";
			matrizPrueba[3][6] = "x";

			// relación objeto 4 con los atributos 2,4
			matrizPrueba[4][2] = "x";
			matrizPrueba[4][4] = "x";

			// relaciónn objeto 5 con los atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[5][j] = "";
			}

			// relaciónn objeto 6 con el atributo 2
			matrizPrueba[6][2] = "x";

			// relaciónn objeto 7 con los atributos 2,3,4,5,6
			matrizPrueba[7][2] = "x";
			matrizPrueba[7][3] = "x";
			matrizPrueba[7][4] = "x";
			matrizPrueba[7][5] = "x";
			matrizPrueba[7][6] = "x";

			// relaciónn objeto 8 con los atributos 4,6
			matrizPrueba[8][4] = "x";
			matrizPrueba[8][6] = "x";

			// relaciónn objeto 9 con los atributos 4,6
			matrizPrueba[9][8] = "x";
			matrizPrueba[9][9] = "x";

			// relaciónn objeto 10 con los atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[10][j] = "";
			}
			
			return matrizPrueba;
		}
		
		if (tipo == 3) {
			
			String[][] matrizPrueba = new String[8][6];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP3";

			// atributos
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[0][j] = "" + j;
			}
			// objetos
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[i][0] = "" + ((char) (i + 64));
			}

			//relaciones
			
			//T1			
			matrizPrueba[1][2]="x";
			matrizPrueba[1][4]="x";
			
			//T2
			matrizPrueba[2][2]="x";
			matrizPrueba[2][5]="x";
			
			//T3
			matrizPrueba[3][3]="x";
			
			//T4
			matrizPrueba[4][1]="x";
			matrizPrueba[4][2]="x";
			matrizPrueba[4][3]="x";
			
			//T5
			matrizPrueba[5][4]="x";
			
			//T6
			matrizPrueba[6][2]="x";
			matrizPrueba[6][3]="x";
			
			//T7
			matrizPrueba[7][5]="x";
			
			return matrizPrueba;
		}	
		if (tipo == 4) {
			String[][] matrizPrueba = new String[16][16];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP4";

			// atributos
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[0][j] = "" + j;
			}
			// objetos
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[i][0] = "" + ((char) (i + 64));
			}

			// atributos 1,7,10 sin ningun objeto
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[1][i] = "";
				matrizPrueba[10][i] = "";
			}

			// relaciónn objeto 1 atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[1][j] = "";
			}

			// relación objeto 2 con los atributos 2,3,4
			matrizPrueba[2][2] = "x";
			matrizPrueba[2][3] = "x";
			matrizPrueba[2][4] = "x";

			// relación objeto 3 con los atributos 4,5,6
			matrizPrueba[3][4] = "x";
			matrizPrueba[3][5] = "x";
			matrizPrueba[3][6] = "x";

			// relación objeto 4 con los atributos 2,4
			matrizPrueba[4][2] = "x";
			matrizPrueba[4][4] = "x";

			// relaciónn objeto 5 con los atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[5][j] = "";
			}

			// relaciónn objeto 6 con el atributo 2
			matrizPrueba[6][2] = "x";

			// relaciónn objeto 7 con los atributos 2,3,4,5,6
			matrizPrueba[7][2] = "x";
			matrizPrueba[7][3] = "x";
			matrizPrueba[7][4] = "x";
			matrizPrueba[7][5] = "x";
			matrizPrueba[7][6] = "x";

			// relaciónn objeto 8 con los atributos 4,6
			matrizPrueba[8][4] = "x";
			matrizPrueba[8][6] = "x";

			// relaciónn objeto 9 con los atributos 4,6
			matrizPrueba[9][8] = "x";
			matrizPrueba[9][9] = "x";

			// relaciónn objeto 10 con los atributos ninguno
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[10][j] = "";
			}
			
			// relación objeto 11 con los atributos 10,11
			matrizPrueba[11][11] = "x";
			matrizPrueba[11][12] = "x";
			
			// relación objeto 12 con los atributos 12 
			matrizPrueba[12][12] = "x";
			
			// relación objeto 13 con los atributos 13,14
			matrizPrueba[13][13] = "x";
			matrizPrueba[13][14] = "x";
			
			// relación objeto 15 con los atributos 15
			matrizPrueba[15][15] = "x";			
			
			return matrizPrueba;
		}
		if (tipo == 5) {
			String[][] matrizPrueba = new String[8][6];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP5";

			// atributos
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[0][j] = "" + ((char) (j + 64));
			}
			// objetos
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[i][0] = "T" + i;
			}
			
			//Relaciones 
			
			//T1
			matrizPrueba[1][2] = "x";
			matrizPrueba[1][4] = "x";
			
			//T2
			matrizPrueba[2][2] = "x";
			matrizPrueba[2][5] = "x";
			
			//T3
			matrizPrueba[3][3] = "x";
			
			//T4
			matrizPrueba[4][1] = "x";
			matrizPrueba[4][2] = "x";
			matrizPrueba[4][3] = "x";
			
			//T5
			matrizPrueba[5][4] = "x";
			
			//T6
			matrizPrueba[6][2] = "x";
			matrizPrueba[6][3] = "x";
			
			//T7
			matrizPrueba[7][2] = "x";
			
			return matrizPrueba;
		}
		if (tipo == 6) {
			String[][] matrizPrueba = new String[5][5];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP6";

			// atributos
			for (int j = 1; j < matrizPrueba[0].length; j++) {
				matrizPrueba[0][j] = "" + ((char) (j + 64));
			}
			// objetos
			for (int i = 1; i < matrizPrueba.length; i++) {
				matrizPrueba[i][0] = "" + i;
			}
			
			//Relaciones 
			
			//1
			matrizPrueba[1][1] = "x";
			
			//2
			matrizPrueba[2][1] = "x";
			matrizPrueba[2][2] = "x";
			
			//3
			matrizPrueba[3][1] = "x";
			matrizPrueba[3][2] = "x";
			matrizPrueba[3][3] = "x";
			
			//4
			matrizPrueba[4][1] = "x";
			matrizPrueba[4][2] = "x";
			matrizPrueba[4][3] = "x";
			matrizPrueba[4][4] = "x";
			
			return matrizPrueba;
		}
		return null;
	}
	
	
	/**
	 * imprime la matriz por consola
	 */
	public void imprimirMatriz(String[][] matriz){
		//imprime la matriz por consola
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				System.out.print("(" + matriz[i][j] + ")");
				if (i != matriz.length)
					System.out.print("\t");
			}
			System.out.println("");

		}
		
	}


	@Override
	public void imprimirArreglo(String[] arreglo, char orientacion) {
		// TODO Auto-generated method stub
		if (orientacion == 'h') {
			System.out.println("[");
			for (int i = 0; i < arreglo.length; i++) {
				System.out.print("(" + arreglo[i] + ")");
				System.out.print("\t");
			}
			System.out.println("]");
		}else if (orientacion == 'v'){
			System.out.println("---");
			for (int i = 0; i < arreglo.length; i++) {
				System.out.print("(" + arreglo[i] + ")");
				System.out.print("\n");
			}
			System.out.println("---");
		}
		
		
	}

	@Override
	public String[] convertirArrayListIntergerAArregloString(
			ArrayList<Integer> arrayListInteger) {
		
		String[] arreglo = new String[arrayListInteger.size()];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = ""+arrayListInteger.get(i);
		}
		return arreglo;
	}

	@Override
	public String[][] convertirMatrizIntergerAString(int[][] matriz) {
		// TODO Auto-generated method stub
		String[][] matrizAuxiliar = new String[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizAuxiliar[i][j] = ""+matriz[i][j];
			}
		}
		return matrizAuxiliar;
	}

	@Override
	public String[][] agregarColumnas(String[][] matriz, int cantidad) {
		
		String[][] matrizAuxiliar = new String[matriz.length][matriz.length+cantidad];
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizAuxiliar[i][j]= matriz[i][j];
			}
		}
		
		for (int i = 0; i < matrizAuxiliar.length; i++) {
			for (int j = matriz[0].length; j < matrizAuxiliar[0].length; j++) {
//				if (matrizAuxiliar[i][j] == null) {
					matrizAuxiliar[i][j] = "";
//				}
				
				
			}
		}
		
		
//		System.out.println(matrizAuxiliar[0].length);
		return matrizAuxiliar;
	}
	

	
	

} // AjusteImpl

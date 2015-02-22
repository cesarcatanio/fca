/**
 */
package fca.impl;

import fca.Ajuste;
import fca.FcaPackage;
import fca.ReglaUno;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Regla Uno</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fca.impl.ReglaUnoImpl#getAjuste <em>Ajuste</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReglaUnoImpl extends MinimalEObjectImpl.Container implements
		ReglaUno {

	/**
	 * obtengo los atributos modificadas hasta el momento
	 */
	private ArrayList<Integer> atributosEditados = new ArrayList<Integer>();
	
	/**
	 * obtengo los objetos modificadas hasta el momento
	 */
	private ArrayList<Integer> objetosEditados = new ArrayList<Integer>();
	
	/**
	 * superFilas
	 */
	private ArrayList<Integer> superFilas = new ArrayList<Integer>();
	

	/**
	 * Lista de las columnas editadas
	 */
	private EList<Integer> listaColumnasEditadas;
	/**
	 * The cached value of the '{@link #getAjuste() <em>Ajuste</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAjuste()
	 * @generated
	 * @ordered
	 */
	protected Ajuste ajuste;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReglaUnoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FcaPackage.Literals.REGLA_UNO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ajuste getAjuste() {
		if (ajuste != null && ajuste.eIsProxy()) {
			InternalEObject oldAjuste = (InternalEObject) ajuste;
			ajuste = (Ajuste) eResolveProxy(oldAjuste);
			if (ajuste != oldAjuste) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FcaPackage.REGLA_UNO__AJUSTE, oldAjuste, ajuste));
			}
		}
		return ajuste;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ajuste basicGetAjuste() {
		return ajuste;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAjuste(Ajuste newAjuste) {
		Ajuste oldAjuste = ajuste;
		ajuste = newAjuste;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FcaPackage.REGLA_UNO__AJUSTE, oldAjuste, ajuste));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[][] analizarUno(String[][] matriz) {
		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();
		ArrayList<Integer> atributosEditadosAux = new ArrayList<Integer>();
		for (int i = 1; i < matriz.length; i++) {
			String[] fila = ajusteImpl.obtenerFila(matriz, i);
			
			if (ajusteImpl.contarAtributosFila(fila) == 1) {
				int columna = ajusteImpl.obtenerColumnasDeLaFila(fila)[0];
				if (buscarNumeroEnArrayList(columna, atributosEditadosAux) == -1 && buscarNumeroEnArrayList(i, objetosEditados) == -1) {
					matriz[0][columna] = ajusteImpl.combinarObjetoAtributo(i, columna, matriz);
					atributosEditadosAux.add(columna);	
					matriz = ajusteImpl.eliminarFila(matriz, i);	
					objetosEditados = ajustarFilas(objetosEditados, i);
					i--;
				}				
			}
		}
		atributosEditados = atributosEditadosAux;
	
		return matriz;
	}
	
	
	@Override
	public String[][] analizarUnoB(String[][] matriz) {
		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();
		ArrayList<Integer> objetosEditadosAux = new ArrayList<Integer>();
		matriz = ajusteImpl.ajustarMatriz(matriz);
		String[] columna;
		
		for (int i = 1; i < matriz[0].length; i++) {
			columna = ajusteImpl.obtenerColumna(matriz, i);
			if (ajusteImpl.contarObjetosColumna(columna) == 1) {
				int fila = ajusteImpl.obtenerFilasDeLaColumna(columna)[0];
				if (buscarNumeroEnArrayList(fila, objetosEditadosAux) == -1) {
					
					matriz[fila][0] = ajusteImpl.combinarAtributoObjeto(fila, i, matriz);
					matriz = ajusteImpl.eliminarColumna(matriz, i);
					objetosEditadosAux.add(fila);

					i--;
				}
			}
		}
		
		objetosEditados = objetosEditadosAux;
		return matriz;
	}

	public ArrayList<Integer> obtenerFilasTocadas(String[][] matriz){
		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();
		matriz = ajusteImpl.ajustarMatriz(matriz);
		ArrayList<Integer> filasTocadas = new ArrayList<>();
		String[] columna;
		for (int i = 1; i < matriz[0].length; i++) {
			columna = ajusteImpl.obtenerColumna(matriz, i);
			if (ajusteImpl.contarObjetosColumna(columna) == 1) {
				int fila = ajusteImpl.obtenerFilasDeLaColumna(columna)[0];
				if (buscarNumeroEnArrayList(fila, filasTocadas) == -1) {
					matriz[fila][0] = ajusteImpl.combinarAtributoObjeto(fila, i, matriz);
					matriz = ajusteImpl.eliminarColumna(matriz, i);
					filasTocadas.add(fila);
					i--;
				}
			}
		}
		return filasTocadas;
	}

	public String[][] analizarDosC(String[][] matriz){
		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();
		matriz = analizarDosB(matriz);		
		
		int[][] cantidadAtributosPorObjeto = ordenarPorIndice(obtenerCantidadObjeto(matriz));
		String[][] matrizAux = matriz;
		int k = matrizAux[0].length-1;
		int c = 1;
		
		for (int i = 1; i < cantidadAtributosPorObjeto.length; i++) {
			String[] filaA = ajusteImpl.obtenerFila(matriz, cantidadAtributosPorObjeto[i][1]);
			
				for (int j = i+1; j < cantidadAtributosPorObjeto.length; j++) {
					String[] filaB = ajusteImpl.obtenerFila(matriz,cantidadAtributosPorObjeto[j][1]);

					ArrayList<Integer> atributosIguales = buscarSuperFila(filaA,filaB);
					
					if (atributosIguales != null) {
								
								int a = cantidadAtributosPorObjeto[i][1];
								
								int b = cantidadAtributosPorObjeto[j][1];
								
								matrizAux = ajusteImpl.agregarColumnas(matrizAux, c);
								k++;
								c++;
								System.out.println("Fila:["+b+"] Esta relacionada con la Fila:["+a+"]");
								matrizAux[0][k] = matrizAux[a][0];
								matrizAux[b][k] = "x";
								
								for (int l = 0; l < matrizAux[b].length; l++) {
									for (int l2 = 0; l2 < atributosIguales.size(); l2++) {
										if (atributosIguales.get(l2) == l) {
											matrizAux[b][l] = "";
										}
									}									
								}
								
								break;
					}			
				}			
		}		
		
		return ajusteImpl.eliminarColumna(matrizAux,k+1);
	}
	


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[][] analizarDos(String[][] matriz) {
		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();

		matriz = analizarDosB(matriz);
		
	
		
		int[][] cantidadAtributosPorObjeto = ordenarPorIndice(obtenerCantidadObjeto(matriz));
		String[][] superFilas = new String[matriz.length][4];
		for (int i = 1; i < cantidadAtributosPorObjeto.length; i++) {
			String[] filaA = ajusteImpl.obtenerFila(matriz, cantidadAtributosPorObjeto[i][1]);
			
				for (int j = i+1; j < cantidadAtributosPorObjeto.length; j++) {
					String[] filaB = ajusteImpl.obtenerFila(matriz,cantidadAtributosPorObjeto[j][1]);
				
					
					if (buscarSuperFila(filaA,filaB)!= null) {
								
								int a = cantidadAtributosPorObjeto[i][1];
								int b = cantidadAtributosPorObjeto[j][1];
								superFilas[i][0] = matriz[a][0];
								
								superFilas[i][1] = matriz[b][0];
								superFilas[i][2] = ""+a;
								superFilas[i][3] = ""+b;
//								
//								matriz = ajusteImpl.agregarColumnas(matriz, 1);
//								matriz[0][matriz[0].length] = matriz[a][0];
								break;
						
					}else {
						int a = cantidadAtributosPorObjeto[i][1];
						superFilas[i][0] = matriz[a][0];
						superFilas[i][1] = "no";
						superFilas[i][2] = ""+a;
						superFilas[i][3] = ""+-1;
						
						
					}
					
					 
				}			
		}		
		superFilas[0][0] = "fila";
		superFilas[0][1] = "superFila";
		superFilas[0][2] = "fila#";
		superFilas[0][3] = "superFila#";
		int a = cantidadAtributosPorObjeto[cantidadAtributosPorObjeto.length-1][1];
		superFilas[cantidadAtributosPorObjeto.length-1][0]=""+matriz[a][0];
		superFilas[cantidadAtributosPorObjeto.length-1][1]="no";
		superFilas[cantidadAtributosPorObjeto.length-1][2]=""+a;
		superFilas[cantidadAtributosPorObjeto.length-1][3]=""+-1;
		
		return superFilas;
	}

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[][] analizarDosB(String[][] matriz) {

		
		matriz = analizarUno(analizarUnoB(matriz));

		return matriz;
	}
	
	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArrayList<Integer> buscarSuperFila(String[] filaA, String[] filaB) {
		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();
		int contador = 0;
		ArrayList<Integer> columnasIguales = new ArrayList<Integer>();
		
		for (int i = 1; i < filaA.length; i++) {
			if (filaA[i].equalsIgnoreCase(filaB[i]) && !(filaA[i].equals(""))) {
				contador++;
				columnasIguales.add(i);
			}
		}
	
		
		if (contador == ajusteImpl.contarAtributosFila(filaA) && contador != 0) {
			
			return columnasIguales;
		}
		return null;	
		
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int bucarNumeroEnArreglo(int numero, int[] arreglo){
		for (int i = 0; i < arreglo.length; i++) {
			if (numero == arreglo[i]) {
				return numero;
			}
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FcaPackage.REGLA_UNO__AJUSTE:
			if (resolve)
				return getAjuste();
			return basicGetAjuste();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FcaPackage.REGLA_UNO__AJUSTE:
			setAjuste((Ajuste) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FcaPackage.REGLA_UNO__AJUSTE:
			setAjuste((Ajuste) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FcaPackage.REGLA_UNO__AJUSTE:
			return ajuste != null;
		}
		return super.eIsSet(featureID);
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
		case FcaPackage.REGLA_UNO___ANALIZAR_UNO:
			analizarUno(null);
			return null;
		case FcaPackage.REGLA_UNO___ANALIZAR_DOS:
			analizarDos(null);
			return null;
		case FcaPackage.REGLA_UNO___BUSCAR_SUPER_FILA:
			buscarSuperFila(null, null);
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public EList<Integer> getListaColumnasEditadas() {
		// TODO Auto-generated method stub
		return listaColumnasEditadas;
	}

	@Override
	public int compararArregloVsArrayList(int[] columnas, ArrayList<Integer> a) {

		for (int i = 0; i < columnas.length; i++) {
			if (buscarNumeroEnArrayList(columnas[i], a) == -1) {
				return columnas[i];
			}
		}
		return -1;
	}

	int buscarNumeroEnArrayList(int n, ArrayList<Integer> a) {
	

		for (int i = 0; i < a.size(); i++) {
			
			if (n == a.get(i)) {

				return a.get(i);
				
			}
		}

		return -1;
		

	}
	int buscarNumeroEnArreglo(int n, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				return i;
			}
		}
		return -1;

	}

	@Override
	public ArrayList<Integer> ajustarFilas(ArrayList<Integer> arrayList,int fila) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			if (fila < arrayList.get(i)) {
				arrayList.set(i, arrayList.get(i)-1);
			}
		}
		return arrayList;
	}

	@Override
	public int[][] obtenerCantidadObjeto(String[][] matriz) {

		Ajuste ajusteImpl = FcaFactoryImpl.eINSTANCE.createAjuste();
		int[][] cantidadAtributosObjeto = new int[matriz.length][2];
		int cantidad = 0;
		for (int i = 1; i < matriz.length; i++) {
			cantidad = ajusteImpl.contarAtributosFila(matriz[i]);
			cantidadAtributosObjeto[i][0] = cantidad;
			cantidadAtributosObjeto[i][1] = i;
		}
		return cantidadAtributosObjeto;		
	}
	
	public int[][] ordenarPorIndice(int [][] matriz){
        int i, j, aux,auxF;
        for(i=1;i<=matriz.length-1;i++){
             for(j=1;j<=matriz.length-i-1;j++){
                  if(matriz[j+1][0]<matriz[j][0]){
                     aux=matriz[j+1][0];
                     
                     auxF=matriz[j+1][1];
                     
                     matriz[j+1][0]=matriz[j][0];
                     
                     matriz[j+1][1]=matriz[j][1];
                     
                     matriz[j][0]=aux;
                     
                     matriz[j][1]=auxF;
                  
                  }
             }
        }
		return matriz;
	}



	


} // ReglaUnoImpl

/**
 */
package fca.tests;

import javax.xml.soap.SAAJResult;
//si hay cambios

import fca.Ajuste;
import fca.FcaFactory;
import fca.impl.AjusteImpl;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Ajuste</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link fca.Ajuste#eliminarFila() <em>Eliminar Fila</em>}</li>
 * <li>{@link fca.Ajuste#eliminarColumna() <em>Eliminar Columna</em>}</li>
 * <li>{@link fca.Ajuste#contarAtributosFila() <em>Contar Atributos Fila</em>}</li>
 * <li>{@link fca.Ajuste#contarObjetosColumna() <em>Contar Objetos Columna</em>}
 * </li>
 * <li>{@link fca.Ajuste#combinarObjetoAtributo() <em>Combinar Objeto Atributo
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AjusteTest extends TestCase {

	/**
	 * The fixture for this Ajuste test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected Ajuste fixture = null;
	
	ReglaUnoTest reglaUnoTest;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AjusteTest.class);
	}

	/**
	 * Constructs a new Ajuste test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AjusteTest(String name) {
		super(name);

	}

	/**
	 * Sets the fixture for this Ajuste test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Ajuste fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ajuste test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Ajuste getFixture() {

		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FcaFactory.eINSTANCE.createAjuste());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link fca.Ajuste#eliminarFila() <em>Eliminar Fila</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fca.Ajuste#eliminarFila()
	 * @generated
	 */
	public void testEliminarFila() {
		System.out.println("<testEliminarFila>");

		int fila = 4;
		int filaPrueba = 3;
		String[][] matriz = new String[5][5];
		String expected = "";
		String actual = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
				if (i == fila) {
					matriz[fila][j] = "y";
				}
			}
		}

		expected = "x";
		actual = fixture.eliminarFila(matriz, fila)[filaPrueba][0];

		assertEquals(expected, actual);

		System.out.println("</testEliminarFila>");
	}

	/**
	 * Tests the '{@link fca.Ajuste#eliminarColumna() <em>Eliminar Columna</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fca.Ajuste#eliminarColumna()
	 * @generated
	 */
	public void testEliminarColumna() {
		System.out.println("<testEliminarColumna>");

		String[][] mp = fixture.obtenerMatrizPrueba(3);
		System.out.println("inicio");
		fixture.imprimirMatriz(mp);
		System.out.println("resultado");
		fixture.imprimirMatriz(fixture.eliminarColumna(mp, 1));
		String expected ="" ;
		String actual ="" ;
		
		assertEquals(expected, actual);

		System.out.println("</testEliminarColumna>");
	}

	/**
	 * Tests the '{@link fca.Ajuste#contarAtributosFila()
	 * <em>Contar Atributos Fila</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fca.Ajuste#contarAtributosFila()
	 * @generated
	 */
	public void testContarAtributosFila() {
		System.out.println("<testContarAtributosFila>");

		int fila = 0;
		String[][] matriz = new String[5][5];
		int expected = 0;
		int actual = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "";
				if (i == fila && (j == 2 || j == 1 || j == 0)) {
					matriz[fila][j] = "x";
				}
			}
		}

		expected = 2;
		actual = fixture.contarAtributosFila(fixture.obtenerFila(matriz, fila));
		assertEquals(expected, actual);
		System.out.println(expected + "vs" + actual);

		System.out.println("</testContarAtributosFila>");
	}

	/**
	 * Tests the '{@link fca.Ajuste#contarObjetosColumna()
	 * <em>Contar Objetos Columna</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fca.Ajuste#contarObjetosColumna()
	 * @generated
	 */
	public void testContarObjetosColumna() {
		System.out.println("<testContarObjetosColumna>");

		String[][] mp = fixture.obtenerMatrizPrueba(3);
		fixture.imprimirMatriz(mp);
		String[] columna =fixture.obtenerColumna(mp, 1);
		fixture.imprimirArreglo(columna, 'v');
		
		

		int expected = fixture.contarObjetosColumna(columna);
		int actual = 1;
		System.out.println(expected + "vs" + actual);
		assertEquals(expected, actual);

		System.out.println("</testContarObjetosColumna>");
	}

	/**
	 * Tests the '{@link fca.Ajuste#combinarObjetoAtributo()
	 * <em>Combinar Objeto Atributo</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see fca.Ajuste#combinarObjetoAtributo()
	 * @generated
	 */
	public void testCombinarAtributoObjeto() {
		System.out.println("<testCombinarAtributoObjeto>");

		int fila = 3;
		int columna = 2;
		String[][] matriz = new String[5][5];
		String expected = "";
		String actual = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
				if (i == fila && j == 0) {
					matriz[fila][j] = "y";
				}
				if (i == 0 && j == columna) {

					matriz[i][columna] = "z";
				}
			}
		}

		expected = "y/z";
		actual = fixture.combinarAtributoObjeto(fila, columna, matriz);

		assertEquals(expected, actual);
		System.out.println("exp:" + expected + " vs " + "act:" + actual);
		System.out.println("</testCombinarAtributoObjeto>");
	}
	
	/**
	 * Tests the '{@link fca.Ajuste#combinarObjetoAtributo()
	 * <em>Combinar Objeto Atributo</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see fca.Ajuste#combinarObjetoAtributo()
	 * @generated
	 */
	public void testCombinarObjetoAtributo() {
		System.out.println("<testCombinarObjetoAtributo>");

		int fila = 3;
		int columna = 2;
		String[][] matriz = new String[5][5];
		String expected = "";
		String actual = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
				if (i == fila && j == 0) {
					matriz[fila][j] = "y";
				}
				if (i == 0 && j == columna) {

					matriz[i][columna] = "z";
				}
			}
		}

		expected = "z/y";
		actual = fixture.combinarObjetoAtributo(fila, columna, matriz);

		assertEquals(expected, actual);
		System.out.println("exp:" + expected + " vs " + "act:" + actual);
		System.out.println("</testCombinarObjetoAtributo>");
	}

	public void testObtenerFila() {
		System.out.println("<testObtenerFila>");

		int fila = 0;
		String[][] matriz = new String[5][5];
		String expected = "";
		String actual = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
				if (i == fila) {
					matriz[fila][j] = "y";
				}
			}
		}

		expected = "y";
		actual = fixture.obtenerFila(matriz, fila)[0];

		assertEquals(expected, actual);

		System.out.println("</testObtenerFila>");
	}

	public void testObtenerColumna() {
		System.out.println("<testObtenerColumna>");

		int columna = 4;
		String[][] matriz = new String[5][5];
		String expected = "";
		String actual = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
				if (j == columna) {
					matriz[i][columna] = "y";
				}
			}
		}

		expected = "y";
		actual = fixture.obtenerColumna(matriz, columna)[0];

		assertEquals(expected, actual);

		System.out.println("</testObtenerColumna>");
	}

	public void testObtenerColumnasDeLaFila() {
		System.out.println("<testObtenerColumnasDeLaFila>");

		int fila = 3;
		String[][] matriz = new String[5][5];
		int expected = 0;
		int actual = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "";
				if (i == fila && (j == 2 || j == 3)) {
					matriz[fila][j] = "x";
				}
			}
		}

		expected = 2;
		actual = fixture.obtenerColumnasDeLaFila(fixture.obtenerFila(matriz,
				fila))[0];

		assertEquals(expected, actual);

		System.out.println("</testObtenerColumnasDeLaFila>");
	}
	
	public void testObtenerFilasDeLaColumna() {
		System.out.println("<testObtenerFilasDeLaColumna>");

	

		String[][] mp = fixture.obtenerMatrizPrueba(3);
		fixture.imprimirMatriz(mp);
		String[] columna =fixture.obtenerColumna(mp, 1);
		fixture.imprimirArreglo(columna, 'v');
		
		int[] filasDeLaColumna = fixture.obtenerFilasDeLaColumna(columna);
		String[] filas = new String[filasDeLaColumna.length];
		for (int i = 0; i < filasDeLaColumna.length; i++) {
			filas[i]=""+filasDeLaColumna[i];
		}
		fixture.imprimirArreglo(filas, 'h');
		
		int expected = 1;
		int actual = 1;
		System.out.println(expected + "vs" + actual);
		assertEquals(expected, actual);

	

		System.out.println("</testObtenerFilasDeLaColumna>");
	}

	public void testAjustarFilas() {
		System.out.println("<testAjustarFilas>");

		int fila = 4;
		String[][] matriz = new String[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
			}
		}
		for (int j = 0; j < matriz[0].length; j++) {
			matriz[fila][j] = "";
			matriz[3][j] = "";
			matriz[2][j] = "";
			matriz[1][j] = "";
		}

		int actual = fixture.ajustarFilas(matriz).length;
		int expected = 1;
		System.out.println(actual + "vs" + expected);
		assertEquals(expected, actual);

		System.out.println("</testAjustarFilas>");
	}

	public void testAjustarColumnas() {
		System.out.println("<testAjustarColumnas>");

		int columna = 4;
		String[][] matriz = new String[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][columna] = "";
			matriz[i][3] = "";
			matriz[i][2] = "";
			matriz[i][1] = "";

		}

		int actual = fixture.ajustarColumnas(matriz)[0].length;
		int expected = 1;
		System.out.println(actual + "vs" + expected);
		assertEquals(expected, actual);

		System.out.println("</testAjustarColumnas>");
	}

	public void testAjustarMatriz() {
		System.out.println("<testAjustarMatriz>");
		
		String[][] mp = fixture.obtenerMatrizPrueba(2);
		System.out.println(mp.length+"*"+mp[0].length);
		
		fixture.imprimirMatriz(mp);


		String expected = "B"+"F"+"I"+"8"+"2"+"6"+"8";
		
		String[][] ma = fixture.ajustarMatriz(mp);
		String actual = ma[1][0]+ma[4][0]+ma[7][0]+(ma.length)+ma[0][1]+ma[0][5]+(ma[0].length);
		
		fixture.imprimirMatriz(ma);
		System.out.println(expected+"vs"+actual);
			
		assertEquals(expected, actual);

		System.out.println("</testAjustarMatriz>");
	}
	
	public void testAgregarColumnas() {
		System.out.println("<testAgregarColumnas>");
		
		String[][] mp = fixture.obtenerMatrizPrueba(4);	
		
		fixture.imprimirMatriz(mp);
		for (int i = 0; i < mp.length; i++) {
			mp = fixture.agregarColumnas(mp, 1);
		}
		
//		mp = fixture.agregarColumnas(mp, 3);
		fixture.imprimirMatriz(mp);

		String expected = "si";
		
		String actual = "si";
		
		System.out.println(expected+"vs"+actual);
			
		assertEquals(expected, actual);

		System.out.println("</testAgregarColumnas>");
	}
	


} // AjusteTest

/**
 */
package fca.tests;

import fca.FcaFactory;
import fca.ReglaUno;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Regla Uno</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link fca.ReglaUno#analizarUno() <em>Analizar Uno</em>}</li>
 * <li>{@link fca.ReglaUno#analizarDos() <em>Analizar Dos</em>}</li>
 * <li>{@link fca.ReglaUno#buscarSuperFila() <em>Buscar Super Fila</em>}</li>
 * <li>{@link fca.ReglaUno#bucarNumeroEnArreglo() <em>Analizar Dos</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReglaUnoTest extends TestCase {

	public String[][] obtenerMatrizPrueba(int tipo) {
	
		if (tipo == 1) {
			String[][] matrizPrueba = new String[11][11];
			for (int i = 0; i < matrizPrueba.length; i++) {
				for (int j = 0; j < matrizPrueba[0].length; j++) {
					matrizPrueba[i][j] = "";
				}
			}
			matrizPrueba[0][0] = "MP";

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
			
			//imprime la matriz por consola
			for (int i = 0; i < matrizPrueba.length; i++) {

				for (int j = 0; j < matrizPrueba[0].length; j++) {

					System.out.print("(" + matrizPrueba[i][j] + ")");
					if (i != matrizPrueba[0].length)
						System.out.print("\t");
				}
				System.out.println("");

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
			matrizPrueba[0][0] = "MP";

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
			
			//imprime la matriz por consola
			for (int i = 0; i < matrizPrueba.length; i++) {

				for (int j = 0; j < matrizPrueba[0].length; j++) {

					System.out.print("(" + matrizPrueba[i][j] + ")");
					if (i != matrizPrueba[0].length)
						System.out.print("\t");
				}
				System.out.println("");

			}
			return matrizPrueba;
		}

		

		return null;
	}

	/**
	 * The fixture for this Regla Uno test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReglaUno fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReglaUnoTest.class);
	}

	/**
	 * Constructs a new Regla Uno test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReglaUnoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Regla Uno test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(ReglaUno fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Regla Uno test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReglaUno getFixture() {
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
		setFixture(FcaFactory.eINSTANCE.createReglaUno());
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
	 * Tests the '{@link fca.ReglaUno#analizarUno() <em>Analizar Uno</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fca.ReglaUno#analizarUno()
	 * @generated
	 */
	public void testAnalizarUno() {
		obtenerMatrizPrueba(2);
		System.out.println("<testAnalizarUno>");
		int fila = 1;
		int fila2 = 3;
		int columna = 3;
		int columna2 = 4;
		String[][] matriz = new String[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = "x";
			}
		}
		for (int j = 0; j < matriz[0].length; j++) {
			matriz[fila][j] = "";
			matriz[fila2][j] = "";
		}
		for (int i = 0; i < matriz.length; i++) {
			if (i == fila) {
				matriz[i][0] = "f";
				matriz[0][columna] = "c";
				matriz[i][columna] = "x";
			}
			if (i == fila2) {
				matriz[i][0] = "f";
				matriz[0][columna2] = "c";
				matriz[i][columna2] = "x";
			}
		}
		String expected = matriz[0][columna] + "/" + matriz[fila][0] + "|"
				+ matriz[0][columna2] + "/" + matriz[fila2][0];
		String actual = fixture.analizarUno(matriz)[0][columna] + "|"
				+ fixture.analizarUno(matriz)[0][columna2];
		System.out.println(expected + " vs " + actual);
		assertEquals(expected, actual);

		System.out.println("</testAnalizarUno>");
	}

	/**
	 * Tests the '{@link fca.ReglaUno#analizarDos() <em>Analizar Dos</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fca.ReglaUno#analizarDos()
	 * @generated
	 */
	public void testAnalizarDos() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link fca.ReglaUno#buscarSuperFila()
	 * <em>Buscar Super Fila</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fca.ReglaUno#buscarSuperFila()
	 * @generated
	 */
	public void testBuscarSuperFila() {
		System.out.println("<testBuscarSuperFila>");
		int fila = 3;
		int superFila = 1;
		int fila2 = 2;
		String[][] matriz = new String[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = "";
			}
		}

		for (int j = 0; j < matriz[0].length; j++) {
			if (j == 0 || j == 1 || j == 2) {
				matriz[fila][j] = "x";
			}
			if (j == 0 || j == 1 || j == 2 || j == 3) {
				matriz[superFila][j] = "x";
			}
			if (j == 0 || j == 1 || j == 2 || j == 3 || j == 4) {
				matriz[fila2][j] = "x";
			}

		}

		int expected = superFila;
		int actual = fixture.buscarSuperFila(matriz, fila);

		System.out.println(expected + " vs " + actual);

		assertEquals(expected, actual);
		System.out.println("</testBuscarSuperFila>");
	}

	/**
	 * Tests the '{@link fca.ReglaUno#bucarNumeroEnArreglo()
	 * <em>Bucar Numero En Arreglo</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see fca.ReglaUno#bucarNumeroEnArreglo()
	 * @generated
	 */
	public void testBucarNumeroEnArreglo() {
		System.out.println("<testBucarNumeroEnArreglo>");
		int numero = 3;

		int[] arreglo = new int[5];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = i;
		}

		int expected = numero;
		int actual = fixture.bucarNumeroEnArreglo(numero, arreglo);

		System.out.println(expected + " vs " + actual);

		assertEquals(expected, actual);
		System.out.println("</testBucarNumeroEnArreglo>");
	}

} // ReglaUnoTest

package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

//import org.eclipse.swt.internal.win32.PROPERTYKEY;


//import com.sun.org.apache.xerces.internal.impl.xpath.XPath.LocationPath;

/**
 * @author u
 * Clase Logica: representa la logica FCA
 */
public class Logicaf {

	
	/**
	 * Matriz: Contiene la matriz a analizar por medio de FCA.
	 */
	String[][] matriz;
	/**
	 * Columnas: Contiene las columnas que han sido editas por medio del analisis FCA.
	 */
	ArrayList<Integer> columnasEditadas;
	
	/**
	 * Serie del grafo a generar.
	 */
	public int serie = 0;

	/**
	 * Constructor de la clase logica
	 */
	public Logicaf() {
	

	}
	
	/**
	 * obtiene la serie del grafo.
	 * @return serie 
	 */
	public int getSerie(){
		return serie;
	}
	/**
	 * asigna la serie del grafo
	 * @param serie
	 */
	public void setSerie(int serie){
		this.serie = serie;
	}

	/**
	 * @param matriz
	 * Gestor de metodos
	 */
	public void ejecutarLogica(String[][] matriz) {

		quitarEspacios(matriz);
		this.matriz = matriz;
		columnasEditadas = new ArrayList<>();
		analizarFCAUno();
	}

	/**
	 * @param matrizIn
	 * quita los espacios en blanco de la matriz
	 */
	public void quitarEspacios(String[][] matrizIn) {
		for (int i = 1; i < matrizIn.length; i++) {
			for (int j = 1; j < matrizIn[0].length; j++) {
					if (matrizIn[i][j].contains(" ")) {
						matrizIn[i][j] = matrizIn[i][j].trim();
					}
				

			}
		}
	}

	/**
	 * analisis fca
	 */
	public void analizarFCAUno() {
		crearReglaUno();
//		aplicarReglaDos();
	}

	public void probar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				System.out.println("[" + matriz[i][j] + "]");
			}
		}

	}

	/**
	 * @param fila
	 * elimina una fila de la matriz
	 */
	public void eliminarFila(int fila) {
		int filas = matriz.length;
		int columnas = matriz[0].length;

		String[][] matrizAuxiliar = new String[filas - 1][columnas];

		int i = 0;
		int n = 0;
		if (fila == filas - 1) {
			while (i < filas - 1) {
				for (int j = 0; j < columnas; j++) {
					System.out.println("i:" + n + " j:" + j + " = " + "i:" + i
							+ " j:" + j);
					matrizAuxiliar[i][j] = matriz[i][j];
				}
				i++;
			}
		} else {

			while (i < filas) {

				if (i == fila) {
					i = fila + 1;
				}
				for (int j = 0; j < columnas; j++) {
					System.out.println("n:" + n + " j:" + j + " = " + "i:" + i
							+ " j:" + j);
					matrizAuxiliar[n][j] = matriz[i][j];
				}
				n++;
				i++;
			}
		}

		matriz = null;
		matriz = matrizAuxiliar;
	}

	public void eliminarFila2(int fila){
		int f = matriz.length;
		int c = matriz[0].length;
		int k = 0;
		String[][] matrizAuxiliar = new String[f - 1][c];
		for (int i = 0; i < matrizAuxiliar.length; i++) {
			for (int j = 0; j < c; j++) {
				
				if (f == fila) {
					k++;
				}
				matrizAuxiliar[i][j] = matriz[k][j];
			}
			k++;
		}
		matriz=matrizAuxiliar;
		
	}
	/**
	 * @param fila
	 * @return
	 * busca una fila con una sola columna
	 */
	public int buscarFilaConUnSoloDato(int fila) {
		int contador = 0;
		int columna = 0;

		for (int j = 1; j < matriz[0].length; j++) {

			if (!matriz[fila][j].equals("")) {
				contador++;
				columna = j;
			}
		}
		if (contador == 1) {
			int dato = columna;
			return dato;
		}
		return -1;
	}

	/**
	 * une una fila con una columna
	 */
	public void crearReglaUno() {
		int i = 1;
		while (i < matriz.length) {
			System.out.println("i:" + i);
			int objetoAtributo = buscarFilaConUnSoloDato(i);
			if (objetoAtributo != -1) {
				int columna = objetoAtributo;

				matriz[0][columna] += "/" + matriz[i][0];
				columnasEditadas.add(columna);

				System.out.println("ObjetoAtributo:" + matriz[0][columna]);
				eliminarFila(i);
				System.out.println("fila eliminada:" + i);
				// probar();
				i--;
			}

			i++;
			System.out.println("i:" + i + " < filas:" + matriz.length);
		}

	}

	/**
	 * @param fila
	 * @return
	 * cuenta los elementos de una fila
	 */
	public ArrayList<Integer> contarElementosFila(int fila) {
		int j = 1;
		ArrayList<Integer> datos = new ArrayList<>();
		while (j < matriz[0].length) {
			System.out.println("matriz[fila][j]:" + matriz[fila][j] + "["
					+ fila + "," + j + "]");
			if (!matriz[fila][j].equals("")) {
				datos.add(j);
			}
			j++;
		}
		return datos;
	}

	/**
	 * @param filaUno
	 * @param filaDos
	 * @return
	 * compara los componentes de una fila que este dentro de otra
	 */
	public ArrayList<Integer> compararUnaFilaDentroDeOtra(int filaUno,
			int filaDos) {
		ArrayList<Integer> datos = new ArrayList<>();
		for (int j = 1; j < matriz[0].length; j++) {

			if (matriz[filaUno][j] != null && matriz[filaDos][j] != null) {
				if (matriz[filaUno][j].equals(matriz[filaDos][j])
						&& !matriz[filaUno][j].equals("")) {

					datos.add(j);
				}
			}

		}
		if (datos.size() == contarElementosFila(filaUno).size()) {
			return datos;
		}
		return null;
	}
	/**
	 * @param fila
	 * busca si la fila esta contenida en otra fila 
	 */
	public int buscarSuperFila(int fila){
		int f = matriz.length;
		int c = matriz[0].length;
		int k = 0;
		int a = 0;
		for (int i = 1; i < f; i++) {
			for (int j = 1; j < c; j++) {
				if (i != fila && !matriz[fila][j].equals("")) {
					if (matriz[i][j].equals(matriz[fila][j])) {
						k++;
						a = j;
					}
				}
			}
			if (k == contarElementosFila(fila).size()) {
				return i;
			}
		}
		return -1;
		
	}
	public ArrayList<Integer> obtenerColumnas(int fila){
		int c = matriz.length;
		ArrayList<Integer> datos = new ArrayList<>();
		for (int j = 1; j < c; j++) {
			if (!matriz[fila][j].equals("")) {
				datos.add(j);
			}
		}
		return datos;
	}
	public boolean verificarColumnasEditadas(int columna){
		int c = matriz[0].length;
		for (int j = 0; j < c; j++) {
			for (int k = 0; k < columnasEditadas.size(); k++) {
				if (j == columnasEditadas.get(k)) {
					return true;
				}
			}
			
		}
		return false;
		
	}
	
	public void aplicarReglaDos(){
		int f = matriz.length;
		int c = matriz[0].length;
		for (int i = 1; i < f; i++) {
			if (buscarSuperFila(i) != -1) {
				for (int j = 0; j < obtenerColumnas(i).size(); j++) {
					if (!verificarColumnasEditadas(obtenerColumnas(i).get(j))) {
						matriz[0][obtenerColumnas(i).get(j)] += "/" + matriz[i][0];
						eliminarFila(i);
					}
				}
			}
			
			
		}
	}

//	public String[][] crearObjetoAtributoAPartirDeObjetoDentroDeOtroObjeto() {
//		int k = 0;
//		int n = 0;
//		for (int i = 1; i < matriz.length; i++) {
//			for (int j = 1; j < matriz.length; j++) {
//				if (compararUnaFilaDentroDeOtra(i, j) != null && i != j) {
//					while (k < compararUnaFilaDentroDeOtra(i, j).size()) {
//						while (n < columnasEditadas.size()) {
//							if (compararUnaFilaDentroDeOtra(i, j).get(k) != columnasEditadas
//									.get(n)) {
//								matriz[0][compararUnaFilaDentroDeOtra(i, j)
//										.get(k)] += "/" + matriz[i][0];
//								eliminarFila(i);
//								columnasEditadas.add(j);
//							}
//							n++;
//						}
//						k++;
//					}
//				}
//			}
//		}
//		return matriz;
//
//	}
//	<?xml version="1.0" encoding="UTF-8"?>
//	<grafo:Grafo xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:grafo="http:///grafo.ecore"/>

	public String capturarHead() {
		String head = "<?xml version=*1.0* encoding=*UTF-8*?>\n<grafo:Grafo xmi:version=*2.0* xmlns:xmi=*http:";
		head += "//www.omg.org/XMI* xmlns:grafo=*http:///grafo.ecore* >";

		head = head.replace('*', '"');

		return head;
	}

	public String crearNodos() {
		String listaNodos = "";
		String inicioNodo = "\n<listaNodos nombre=*";
		String nombreNodo = "";
		String finNodo = "*/>";

		String nodoInicio = inicioNodo + "inicio" + finNodo;
		String nodoFin = inicioNodo + "fin" + finNodo;

		// nodo inicio agregado a la lista de nodos donde inicia el grafo
		listaNodos += nodoInicio;

		// toma nodos columna 0
		for (int i = 1; i < matriz.length; i++) {
			nombreNodo = matriz[i][0];
			listaNodos = listaNodos + inicioNodo + nombreNodo + finNodo;
			nombreNodo = "";
		}

		// toma nodos fila 0
		for (int i = 1; i < matriz[0].length; i++) {
			nombreNodo = matriz[0][i];
			listaNodos = listaNodos + inicioNodo + nombreNodo + finNodo;
			nombreNodo = "";
		}

		// nodo fin agregado a la lista de nodos donde converge el grafo
		listaNodos += nodoFin;

		listaNodos = listaNodos.replace('*', '"');
		return listaNodos;
	}

	// de fila a columna
	public String crearEnlacesFilaColumna() {
		String listaEnlaces = "";
		String inicioEnlace = "\n<listaEnlaces nombre=*";
		String nombreEnlace = "";
		String sourceEnlace = "* inicio=*" + "//@listaNodos.";
		String targetEnlace = "* objetivo=*//@listaNodos.";
		String finEnlace = "*/>";

		for (int i = 1; i < matriz.length; i++) {
			for (int j = 1; j < matriz[0].length; j++) {
				nombreEnlace = matriz[i][j];
				if (!nombreEnlace.equals("")) {
					sourceEnlace = sourceEnlace + (j - 1);
					// objetivo a la columna 0
					targetEnlace = targetEnlace + (i + matriz[0].length - 2);
					listaEnlaces = listaEnlaces + inicioEnlace + nombreEnlace
							+ sourceEnlace + targetEnlace + finEnlace;
				}
				nombreEnlace = "";
				sourceEnlace = "* inicio=*" + "//@listaNodos.";
				targetEnlace = "* objetivo=*//@listaNodos.";
			}
		}
		listaEnlaces = listaEnlaces.replace('*', '"');
		return listaEnlaces;
	}

	// de columna a fila
	public String crearEnlaces(int tipoPintar) {
		String listaEnlaces = "";
		String inicioEnlace = "\n<listaEnlaces nombre=*";
		String nombreEnlace = "";
		String sourceEnlace = "* inicio=*" + "//@listaNodos.";
		String targetEnlace = "* objetivo=*//@listaNodos.";
		String finEnlace = "*/>";
		String listaEnlaces1 = "";
		String listaEnlaces2 = "";
		String color = "";
		if (tipoPintar == 0) {
			for (int i = 1; i < matriz.length; i++) {
				color = Integer.toString(i);
				for (int j = 1; j < matriz[0].length; j++) {
					// nombreEnlace = " ";
					if (!matriz[i][j].equals("")) {

						// if (!nombreEnlace.equals("")) {
						// inicio en la columna 0
						// sourceEnlace = sourceEnlace + (i - 1);
						sourceEnlace = sourceEnlace + (i);
						// objetivo a la fila '0
						// targetEnlace = targetEnlace + (j + matriz.length - 2);
						targetEnlace = targetEnlace + (j + matriz.length - 1);
						listaEnlaces1 = listaEnlaces + inicioEnlace;
						listaEnlaces2 = sourceEnlace + targetEnlace + finEnlace;
//						if (i == 0 || j == matriz[0].length ) {
//							listaEnlaces = listaEnlaces + inicioEnlace
//									+ sourceEnlace + targetEnlace + finEnlace;
//						}
					}
					listaEnlaces = listaEnlaces1 + color + listaEnlaces2;
					System.out.println("color" + color);
					sourceEnlace = "* inicio=*" + "//@listaNodos.";
					targetEnlace = "* objetivo=*//@listaNodos.";
				}
			}
		}
		if (tipoPintar == 1) {
			for (int i = 1; i < matriz.length; i++) {
				for (int j = 1; j < matriz[0].length; j++) {
					color = matriz[i][j];
					if (!color.equals("")) {
						// if (!nombreEnlace.equals("")) {
						// inicio en la columna 0
						// sourceEnlace = sourceEnlace + (i - 1);
						sourceEnlace = sourceEnlace + (i);
						// objetivo a la fila '0
						// targetEnlace = targetEnlace + (j + matriz.length - 2);
						targetEnlace = targetEnlace + (j + matriz.length - 1);
						listaEnlaces1 = listaEnlaces + inicioEnlace;
						listaEnlaces2 = sourceEnlace + targetEnlace + finEnlace;
//						if (i == 0 || j == matriz[0].length ) {
//							listaEnlaces = listaEnlaces + inicioEnlace
//									+ sourceEnlace + targetEnlace + finEnlace;
//						}
					}
					listaEnlaces = listaEnlaces1 + color + listaEnlaces2;
					System.out.println("color" + color);
					sourceEnlace = "* inicio=*" + "//@listaNodos.";
					targetEnlace = "* objetivo=*//@listaNodos.";
				}
			}
		}
		

		// enlace de nodoInicio a el resto de objetos
		for (int i = 1; i < matriz.length; i++) {
			nombreEnlace = " ";
			sourceEnlace = sourceEnlace + 0;
			targetEnlace = targetEnlace + (i);
			listaEnlaces = listaEnlaces + inicioEnlace + nombreEnlace
					+ sourceEnlace + targetEnlace + finEnlace;
			sourceEnlace = "* inicio=*" + "//@listaNodos.";
			targetEnlace = "* objetivo=*//@listaNodos.";
		}

		//nombrar los enlaces
		for (int j = 1; j < matriz[0].length; j++) {
			nombreEnlace = " ";
			sourceEnlace = sourceEnlace + (j + matriz.length - 1);
			// objetivo a la fila '0
			// targetEnlace = targetEnlace + (j + matriz.length - 2);
			targetEnlace = targetEnlace
					+ (matriz[0].length + matriz.length - 1);
			System.out.println(targetEnlace);
			listaEnlaces = listaEnlaces + inicioEnlace + nombreEnlace
					+ sourceEnlace + targetEnlace + finEnlace;
			sourceEnlace = "* inicio=*" + "//@listaNodos.";
			targetEnlace = "* objetivo=*//@listaNodos.";
		}

		listaEnlaces = listaEnlaces.replace('*', '"');
		return listaEnlaces;
	}

	public void exportarMatriz(String matrizIn[][], String ruta) {

		System.out.println(ruta);
		File archivo = new File(ruta + ".txt");
		FileWriter escritor;
		String linea = "";

		try {
			escritor = new FileWriter(archivo);

			for (int i = 0; i < matrizIn.length; i++) {
				for (int j = 0; j < matrizIn[0].length; j++) {
					if (matrizIn[i][j].equals("")) {
						linea += " " + ",";
					} else {
						linea += matrizIn[i][j] + ",";
					}

				}
				linea += "\n";
				escritor.write(linea);
				linea = "";
			}
			escritor.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String[][] importarMatriz(String ruta) {

		String matrizOut[][] = null;
		File archivo;
		FileReader lector;
		BufferedReader buffer;
		int numFilas;
		try {

			archivo = new File(ruta);
			lector = new FileReader(archivo);
			buffer = new BufferedReader(lector);
			String lineaUno = buffer.readLine();
			String partes[] = lineaUno.split(",");
			int numCol = partes.length;

			numFilas = 0;

			while (lineaUno != null) {
				numFilas++;
				lineaUno = buffer.readLine();
			}
			buffer.close();
			lector.close();
			;

			matrizOut = new String[numFilas][numCol];
			lector = new FileReader(archivo);
			buffer = new BufferedReader(lector);

			for (int i = 0; i < numFilas; i++) {
				lineaUno = buffer.readLine();

				if (lineaUno != null) {

					partes = lineaUno.split(",");

					for (int j = 0; j < numCol; j++) {

						matrizOut[i][j] = partes[j];
					}
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return matrizOut;
	}

	public void crearFinInicio() {
		String inicio = "<listaNodos nombre=*inicio*/>";
		String fin = "<listaNodos nombre=*fin*/>";
		inicio = inicio.replace('*', '"');
		fin = fin.replace('*', '"');
	}

	public void crearGrafo(int tipoPintar) {

		String ruta1;
		File carpeta;
		File directorios[];
		String ruta2;
		String ruta = "";
		String nombre = "";
		String fin = "\n</grafo:Grafo>";

		try {
			ruta1 = "./../../../runtime-EclipseApplication/";

			carpeta = new File("./../../../runtime-EclipseApplication/");
			directorios = carpeta.listFiles();
			ruta2 = directorios[1].getName() + "/src/";
			ruta = ruta1 + ruta2;
			
		} catch (Exception e) {
//			ruta = "/home/juandavid/runtime-EclipseApplication/grafo/src/";
			ruta = "/home/u/Documentos/proyecto/proyecto/runtime-EclipseApplication/grafo/src/";
		}
		
		 String nombre1= "default";
		 String nombre2= "";
		 String nombre3= ".grafo";
		 if (serie!=0) {
			nombre2= nombre2+serie;
		}
		 nombre = nombre1+nombre2+nombre3;
		 System.out.println(nombre);
		//System.out.println(ruta);

		try {
			FileWriter fileWriter;
			fileWriter = new FileWriter(ruta + nombre);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(capturarHead() + crearNodos() + crearEnlaces(tipoPintar)
					+ fin);
			bufferedWriter.newLine();
			bufferedWriter.close();
//			System.out.println("superruta:" +carpeta.getAbsolutePath());
//			System.out.println(ruta1);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void exportarXML(String path, int tipoPintar) {

		String fin = "\n</vista.grafo:Grafo>";

		FileWriter fileWriter;

		try {
			fileWriter = new FileWriter(path + ".vista");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(capturarHead() + crearNodos() + crearEnlaces(tipoPintar)
					+ fin);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}


	
	public String[][] compararMatrices(String[][] matrizUno, String[][] matrizDos) {
		String[][] matriz = matrizUno;
		for (int i = 1; i < matrizUno.length; i++) {
			for (int j = 1; j < matrizUno[0].length; j++) {
				if (!matrizUno[i][j].equals(" ") && matrizDos[i][j].equals(" ")) {
					matriz[i][j] = "a";
					System.out.println("a:["+i+","+j+"]");
				}
				if (!matrizUno[i][j].equals(" ") && !matrizDos.equals(" ")) {
					matriz[i][j] = "=";
					System.out.println("=:["+i+","+j+"]");
				}
				if (matrizUno[i][j].equals(" ") && !matrizDos[i][j].equals(" ")) {
					matriz[i][j] = "b";
					System.out.println("b:["+i+","+j+"]");
				}
			}
		}
		return matriz;
	}
	public ArrayList<String> leerEcore(String ruta) {

		ArrayList<String> components= new ArrayList<String>();
		File archivo;
		FileReader lector;
		BufferedReader buffer;
		
		try {

			archivo = new File(ruta);
			lector = new FileReader(archivo);
			buffer = new BufferedReader(lector);
			String lineaUno = buffer.readLine();
			String div[];

			

			while (lineaUno != null) {
				lineaUno=lineaUno.trim();
				if (lineaUno.contains("<eClassifiers"))
				{
					div=lineaUno.split(" ");
					components.add(backMetaItem(div));
				}
				lineaUno = buffer.readLine();
			}
			buffer.close();
			lector.close();
		}catch(Exception e){
			System.out.println("Archivo Incorrecto");;
		}
		return components;
	}
	
	public String backMetaItem(String arreglo[]){
		
		String metaItem="";
		
		if(arreglo[2].toString().endsWith(">")){
			metaItem=arreglo[2].substring(6, arreglo[2].length()-2);
		}
		else{
			metaItem=arreglo[2].substring(6, arreglo[2].length()-1);
		}
		
		return metaItem;
	}
			

}

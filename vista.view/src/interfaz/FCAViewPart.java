package interfaz;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import logica.Logica;
import logica.Logicaf;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;

public class FCAViewPart extends ViewPart {

	public static final String ID = "interfaz.FCAViewPart"; //$NON-NLS-1$
	
	public Logicaf logica= new Logicaf();

	Composite parent;
	Composite container;
	ToolBar toolBar;

	int aw = 0;
	int ah = 0;
	int tipoPintar = 0;

	Composite compositeNuevaMatriz;
	Composite compositeCrearMatriz;
	Composite compositeMatriz;
//	ScrolledComposite scrolledCompositeMatriz;
	String[][] matriz;
	Text[][] matrizText;
	Text text_F;
	Text text_C;

	Composite compositeComparar;
	Composite compositeMatrizA;
	Composite compositeMatrizB;
	Text[][] matrizTextA;
	String[][] matrizA;
	Text[][] matrizTextB;
	String[][] matrizB;

	Composite compositeCaracteristicas;
	
	Composite compositeZachman;
	Text[][] matrizTextZachman;
	
	Composite compositePrueba;
	ScrolledComposite scrolledCompositePrueba;
	Text textPrueba;
	
	ArrayList<String>leng1;
	ArrayList<String>leng2;
//	Text[][] cells;
	
	static final int FILAS_ZACHMAN = 6;
	static final int COLUMNAS_ZACHMAN = 7;
	static final int ESPACIO_TEXT_X_ZACHMAN = 0;
	static final int ESPACIO_TEXT_Y_ZACHMAN = 0;
	static final int ANCHO_TEXT_ZACHMAN = 160;
	static final int ALTO_TEXT_ZACHMAN = 80;

	public FCAViewPart() {

	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		container = new Composite(parent, SWT.NONE);
		container.setLayout(null);
		
	

		toolBar = new ToolBar(container, SWT.FLAT | SWT.RIGHT);
		toolBar.setBounds(0, 0, 1005, 32);

		ToolItem tltmNuevaMatriz = new ToolItem(toolBar, SWT.NONE);
		tltmNuevaMatriz.setSelection(true);
		tltmNuevaMatriz.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				compositeNuevaMatriz.setVisible(true);
				compositeCrearMatriz.setVisible(true);

				compositeMatriz.setVisible(false);
				compositeComparar.setVisible(false);

				aw = 700;
				ah = 300;
				redimensionarComposite(compositeCrearMatriz, aw, ah);
			}
		});
		tltmNuevaMatriz.setText("Nueva Matriz");
		tltmNuevaMatriz
				.setToolTipText("Despliega los atributos para \ncrear una nueva matriz");

		ToolItem tltmComparar = new ToolItem(toolBar, SWT.NONE);
		tltmComparar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				negarComposites();
				redimensionarComposite(compositeComparar,
						compositeComparar.getBounds().width,
						compositeComparar.getBounds().height);
				compositeComparar.setVisible(true);
				compositeMatrizA.setVisible(true);
				compositeMatrizB.setVisible(true);

				Logica logica = new Logica();
				String ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/zachman.txt";
				String matrizOut[][] = logica.importarMatriz(ruta);

				crearMatrizA(matrizOut.length, matrizOut[0].length);
				crearMatrizB(matrizOut.length, matrizOut[0].length);

				for (int i = 0; i < matrizOut.length; i++) {
					for (int j = 0; j < matrizOut[0].length; j++) {
						matrizTextA[i][j].setText(matrizOut[i][j]);
						matrizTextB[i][j].setText(matrizOut[i][j]);
					}
				}
				asignarToolTipTextZachman(matrizTextA);
				asignarToolTipTextZachman(matrizTextB);

			}
		});
		tltmComparar.setText("Comparar");
		tltmComparar
				.setToolTipText("Despliega dos matrices zachman \npara comparar similitudes");

		ToolItem tltmCaracteristicas = new ToolItem(toolBar, SWT.NONE);
		tltmCaracteristicas.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				negarComposites();
				compositeCaracteristicas.setVisible(true);

			}
		});
		tltmCaracteristicas.setText("Caracteristicas");
		tltmCaracteristicas
				.setToolTipText("Despliega las posibles caracteristicas \nde usuario");

		ToolItem tltmImportar = new ToolItem(toolBar, SWT.BORDER);
		tltmImportar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				negarComposites();
				renovarCompositeMatriz();

				String ruta = "";
				Logica logica = new Logica();
				JFileChooser chooser = new JFileChooser();

				if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

					ruta = chooser.getSelectedFile().getAbsolutePath();
					String matrizOut[][] = logica.importarMatriz(ruta);

					crearMatriz(matrizOut.length, matrizOut[0].length);

					for (int k = 0; k < matrizOut.length; k++) {
						for (int l = 0; l < matrizOut[0].length; l++) {
							matrizText[k][l].setText(matrizOut[k][l]);
						}
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"Debe seleccionar un archivo");
				}
				compositeNuevaMatriz.setVisible(true);
				compositeMatriz.setVisible(true);
			}
		});
		tltmImportar.setText("Importar");
		tltmImportar
				.setToolTipText("Accion, que permite importar (abrir) una matriz");

		ToolItem tltmExportar = new ToolItem(toolBar, SWT.NONE);
		tltmExportar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Logica logica = new Logica();
				String ruta = "";
				JFileChooser chooser = new JFileChooser();
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					ruta = chooser.getSelectedFile().getAbsolutePath();

					logica.exportarMatriz(capturarDatosMatrizText(), ruta);
				} else {
					JOptionPane.showMessageDialog(null,
							"Debe especificar una ruta");
				}
			}
		});
		tltmExportar.setText("Exportar");
		tltmExportar
				.setToolTipText("Accion, que permite exportar (guardar) una matriz");
		
				ToolItem tltmGrafo = new ToolItem(toolBar, SWT.NONE);
				tltmGrafo.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String[][] matriz = capturarDatosMatrizText();
						// Instanciamos la logica
						Logica logica = new Logica();
						logica.ejecutarLogica(matriz);
						// Generamos el grafo
						tipoPintar = 0;
						logica.crearGrafo(tipoPintar);
						JOptionPane.showMessageDialog(null,
								"Se ha generado el Diagrama");
						// Diagram diagram = ;

					}
				});
				tltmGrafo.setText("Crear Grafo");
				tltmGrafo
						.setToolTipText("Accion, que permite apartir de la matriz crear\n un grafo-telaraña de manera grafica");

				ToolItem tltmZachman = new ToolItem(toolBar, SWT.NONE);
				tltmZachman.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						negarComposites();
						compositeZachman.setVisible(true);
						
						matrizTextZachman = new Text[FILAS_ZACHMAN][COLUMNAS_ZACHMAN];
						
						crearMatrizZachman(
								FILAS_ZACHMAN, 
								COLUMNAS_ZACHMAN, 
								ESPACIO_TEXT_X_ZACHMAN, 
								ESPACIO_TEXT_Y_ZACHMAN, 
								ANCHO_TEXT_ZACHMAN, 
								ALTO_TEXT_ZACHMAN, 
								compositeZachman,
								matrizTextZachman);
						
						asignarToolTipTextZachman(matrizTextZachman);
						asignarClasificadoresZachman(matrizTextZachman);
						asignarContenidoZachman(matrizTextZachman);
						
						formatoDeText(matrizTextZachman);
					}
				});
				tltmZachman.setText("Zachman");
				tltmZachman
				.setToolTipText("Accion, permite visualizar clasificar el lenguaje UML\n mediante la taxonomia zachman");

		ToolItem tltmPrueba = new ToolItem(toolBar, 0);
		// tltmArchivo.setSelection(true);
		tltmPrueba.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// for (int i = 0; i <
				// PlatformUI.getWorkbench().getViewRegistry()
				// .getCategories().length; i++) {
				// System.out.println(""
				// + PlatformUI.getWorkbench().getViewRegistry()
				// .getCategories()[i].getId());
				// }
				// for (int i = 0; i <
				// PlatformUI.getWorkbench().getViewRegistry()
				// .getCategories().length; i++) {
				// if (PlatformUI.getWorkbench().getViewRegistry()
				// .getCategories()[i].getId().equals("grafo.view")) {
				// System.out.println(""
				// + PlatformUI.getWorkbench().getViewRegistry()
				// .getCategories()[i].getId()+""+i);
				// IViewCategory ivc =
				// PlatformUI.getWorkbench().getViewRegistry()
				// .getCategories()[i];
				//
				// for (int j = 0; j < ivc.getViews().length; j++) {
				// String a = ivc.getViews()[j].getId();
				// System.out.println(a);
				// }
				//
				//
				// }
				//
				// }
				
				

				negarComposites();
				compositePrueba.setVisible(true);
				scrolledCompositePrueba.setVisible(true);
				textPrueba.setVisible(true);
				

			}
		});
		tltmPrueba.setText("Prueba");
		tltmPrueba
				.setToolTipText("Archivo, este menu contine \nlas acciones principales de la aplicación");
		/**
		 * // tltmArchivo.addSelectionListener(tltmNuevaMatriz.getSelection());
		 * 
		 * // Menu menuArchivo = new Menu(toolBar); //
		 * toolBar.setMenu(menuArchivo);
		 * 
		 * // menuArchivo.setVisible(true); //
		 * menuArchivo.addMenuListener(tltmGrafo.getSelection()); // MenuItem
		 * menuItem = new MenuItem("MenuItem");
		 * 
		 */

		compositeNuevaMatriz = new Composite(container, SWT.NONE);
		compositeNuevaMatriz.setBounds(0, 32, 594, 428);
		compositeNuevaMatriz.setLayout(null);

		compositeCrearMatriz = new Composite(compositeNuevaMatriz, SWT.NONE);
		compositeCrearMatriz.setBounds(0, 0, 594, 230);
		compositeCrearMatriz.setLayout(null);

		Button btnCrearMatriz = new Button(compositeCrearMatriz, SWT.NONE);
		btnCrearMatriz.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				negarComposites();
				int f = Integer.parseInt(text_F.getText());
				int c = Integer.parseInt(text_C.getText());

				compositeNuevaMatriz.setVisible(true);
				renovarCompositeMatriz();
				compositeMatriz.setVisible(true);
				compositeCrearMatriz.setVisible(false);

				crearMatriz(f, c);
//				redimensionarScrolledComposite();
			}
		});
		btnCrearMatriz.setBounds(10, 74, 145, 30);
		btnCrearMatriz.setText("Crear Matriz");
		btnCrearMatriz
				.setToolTipText("Accion, crea una matriz \ncon el numero de filas y columnas indicadas");

		text_F = new Text(compositeCrearMatriz, SWT.BORDER);
		text_F.setBounds(105, 10, 50, 27);

		text_C = new Text(compositeCrearMatriz, SWT.BORDER);
		text_C.setBounds(105, 40, 50, 27);

		Label lbl_F = new Label(compositeCrearMatriz, SWT.NONE);
		lbl_F.setBounds(10, 10, 75, 17);
		lbl_F.setText("Filas");
		lbl_F.setToolTipText("Ingrese el numero de filas que desea en la matriz");

		Label lbl_C = new Label(compositeCrearMatriz, SWT.NONE);
		lbl_C.setBounds(10, 40, 75, 17);
		lbl_C.setText("Columnas");
		lbl_C.setToolTipText("Ingrese el numero de columnas que desea en la matriz");
		
				compositeMatriz = new Composite(compositeNuevaMatriz, SWT.NONE);
				compositeMatriz.setBounds(0, 0, 594, 428);
				compositeMatriz.setLayout(null);
				/*
				scrolledCompositeMatriz = new ScrolledComposite(compositeMatriz, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
				scrolledCompositeMatriz.setLocation(0, 0);
				scrolledCompositeMatriz.setSize(551, 196);
				scrolledCompositeMatriz.setExpandHorizontal(true);
				scrolledCompositeMatriz.setExpandVertical(true);
				*/
				
		compositeComparar = new Composite(container, SWT.NONE);
		compositeComparar.setLocation(0, 32);
		compositeComparar.setSize(1005, 428);

		compositeMatrizA = new Composite(compositeComparar, SWT.NONE);
		compositeMatrizA.setLocation(0, 0);
		compositeMatrizA.setSize(500, 200);
		compositeMatrizA.setLayout(null);

		compositeMatrizB = new Composite(compositeComparar, SWT.NONE);
		compositeMatrizB.setLocation(505, 0);
		compositeMatrizB.setSize(500, 200);
		compositeMatrizB.setLayout(null);

		Button btnComparar = new Button(compositeComparar, SWT.NONE);
		btnComparar.setLocation(450, 205);
		btnComparar.setSize(105, 30);
		btnComparar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("c");
				Logica logica = new Logica();

				String[][] matrizA = capturarDatosMatrizTextA();
				String[][] matrizB = capturarDatosMatrizTextB();

				String[][] matriz = logica.compararMatrices(matrizA, matrizB);
				crearMatriz(matriz.length, matriz[0].length);
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[0].length; j++) {
						matrizText[i][j].setText(matriz[i][j]);
					}
				}
				tipoPintar = 1;
				logica.ejecutarLogica(matriz);
				logica.crearGrafo(tipoPintar);
				JOptionPane.showMessageDialog(null, "Comparción realizada");
			}
		});
		btnComparar.setText("Comparar");
		btnComparar.setToolTipText("Accion, compara dos matrices");

		compositeCaracteristicas = new Composite(container, SWT.NONE);
		compositeCaracteristicas.setBounds(0, 32, 595, 373);

		Label lblUsuario = new Label(compositeCaracteristicas, SWT.NONE);
		lblUsuario.setLocation(10, 10);
		lblUsuario.setSize(70, 17);
		lblUsuario.setText("Usuario");

		Label lblSintaxis = new Label(compositeCaracteristicas, SWT.NONE);
		lblSintaxis.setLocation(230, 10);
		lblSintaxis.setSize(70, 17);
		lblSintaxis.setText("Sintaxis");

		final Combo comboUsuario = new Combo(compositeCaracteristicas, SWT.NONE);
		comboUsuario.setLocation(10, 40);
		comboUsuario.setSize(200, 30);
		comboUsuario.add("Usuario del lenguaje");
		comboUsuario.add("experto del lenguaje");

		final Combo comboSintaxis = new Combo(compositeCaracteristicas,
				SWT.NONE);
		comboSintaxis.setBounds(230, 40, 200, 30);
		comboSintaxis.add("Sintaxis Concreta");
		comboSintaxis.add("Sintaxis Abstracta");
		comboSintaxis.add("Herramienta");

		Button btnAceptar = new Button(compositeCaracteristicas, SWT.NONE);
		btnAceptar.setBounds(175, 80, 91, 29);
		btnAceptar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				negarComposites();
				renovarCompositeMatriz();

				int itemCountUsuario = comboUsuario.getSelectionIndex();
				int itemCountSintasix = comboSintaxis.getSelectionIndex();
				Logica logica = new Logica();
				String ruta = "";

				// Usuario
				if (itemCountUsuario == 0 && itemCountSintasix == 0) {

					ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/00.txt";
					String matrizOut[][] = logica.importarMatriz(ruta);
					crearMatriz(matrizOut.length, matrizOut[0].length);
					matriz = matrizOut;
					llenarMatrizText();

				}
				if (itemCountUsuario == 0 && itemCountSintasix == 1) {

					ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/01.txt";
					String matrizOut[][] = logica.importarMatriz(ruta);
					crearMatriz(matrizOut.length, matrizOut[0].length);
					matriz = matrizOut;
					llenarMatrizText();
				}
				if (itemCountUsuario == 0 && itemCountSintasix == 2) {
					ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/02.txt";
					String matrizOut[][] = logica.importarMatriz(ruta);
					crearMatriz(matrizOut.length, matrizOut[0].length);
					matriz = matrizOut;
					llenarMatrizText();
				}

				// Experto
				if (itemCountUsuario == 1 && itemCountSintasix == 0) {
					ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/10.txt";
					String matrizOut[][] = logica.importarMatriz(ruta);
					crearMatriz(matrizOut.length, matrizOut[0].length);
					matriz = matrizOut;
					llenarMatrizText();
				}
				if (itemCountUsuario == 1 && itemCountSintasix == 1) {
					ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/11.txt";
					String matrizOut[][] = logica.importarMatriz(ruta);
					crearMatriz(matrizOut.length, matrizOut[0].length);
					matriz = matrizOut;
					llenarMatrizText();
				}
				if (itemCountUsuario == 1 && itemCountSintasix == 2) {
					ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/12.txt";
					String matrizOut[][] = logica.importarMatriz(ruta);
					crearMatriz(matrizOut.length, matrizOut[0].length);
					matriz = matrizOut;

					llenarMatrizText();
				}
				compositeNuevaMatriz.setVisible(true);
				compositeMatriz.setVisible(true);
			}
		});
		btnAceptar.setText("Aceptar");
		btnAceptar.setToolTipText("Crea el perfil del usuario");
		
		Group group = new Group(compositeCaracteristicas, SWT.NONE);
		group.setLayout(null);
		group.setText("Opciones");
		group.setBounds(375, 200, 156, 104);
		
		Button cLenguajes = new Button(group, SWT.NONE);
		cLenguajes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e)  {
				crearMatriz(leng1.size(),leng2.size());
				llenarMatriz(leng1, leng2);
				
//				matrizText = cells;
//				compositeMatriz.setVisible(true);
				
				negarComposites();
				compositeNuevaMatriz.setVisible(true);
				compositeMatriz.setVisible(true);
//				ubicarMatrizText(scrolledCompositeMatriz,matrizText);
//				scrolledCompositeMatriz.setVisible(true);
				renovarCompositeMatriz();
				

				
//				redimensionarScrolledComposite();
			}
		});
		cLenguajes.setText("Cargar Lenguajes");
		cLenguajes.setBounds(10, 24, 135, 27);
		
		Button compararLenguajes = new Button(group, SWT.NONE);
		compararLenguajes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		compararLenguajes.setText("Comparar");
		compararLenguajes.setBounds(10, 57, 135, 27);
		
		Group group_1 = new Group(compositeCaracteristicas, SWT.NONE);
		group_1.setLayout(null);
		group_1.setText("Selección de  Lenguajes");
		group_1.setBounds(10, 200, 331, 104);
		
		Label label = new Label(group_1, SWT.NONE);
		label.setText("Filas");
		label.setBounds(10, 29, 62, 15);
		
		Label label_1 = new Label(group_1, SWT.NONE);
		label_1.setText("Columnas");
		label_1.setBounds(10, 68, 62, 15);
		
		final Label lblLeng1 = new Label(group_1, SWT.NONE);
		lblLeng1.setBounds(222, 29, 99, 27);
		
		final Label lblLeng2 = new Label(group_1, SWT.NONE);
		lblLeng2.setBounds(222, 68, 99, 27);
		
		Button sFila = new Button(group_1, SWT.NONE);
		sFila.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String ruta="";
				JFileChooser chooser = new JFileChooser();
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					 ruta=chooser.getSelectedFile().getAbsolutePath();
					 leng1=logica.leerEcore(ruta);
					 lblLeng1.setText(new File(ruta).getName());
					 
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe especificar una ruta");
				}
			}
		});
		sFila.setText("Seleccionar...");
		sFila.setBounds(92, 29, 110, 27);
		
		Button sColumna = new Button(group_1, SWT.NONE);
		sColumna.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String ruta="";
				JFileChooser chooser = new JFileChooser();
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					 ruta=chooser.getSelectedFile().getAbsolutePath();
					 leng2=logica.leerEcore(ruta);
					 lblLeng2.setText(new File(ruta).getName());
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe especificar una ruta");
				}
			}
		});
		sColumna.setText("Seleccionar...");
		sColumna.setBounds(92, 68, 110, 27);
		
		
		
		compositePrueba = new Composite(container, SWT.NONE);
		compositePrueba.setLocation(0, 32);
		compositePrueba.setSize(200, 200);
		compositePrueba.setVisible(false);
		
		scrolledCompositePrueba = new ScrolledComposite(compositePrueba, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledCompositePrueba.setBounds(0, 0, 69, 69);
		scrolledCompositePrueba.setExpandHorizontal(true);
		scrolledCompositePrueba.setExpandVertical(true);
		scrolledCompositePrueba.setVisible(false);
		
		textPrueba = new Text(compositePrueba, SWT.BORDER);
		textPrueba.setSize(300, 27);
		textPrueba.setVisible(false);
		
		compositeZachman = new Composite(container, SWT.NONE);
		compositeZachman.setBounds(0, 32, 600, 428);
		compositeZachman.setLayout(null);

		createActions();
		initializeToolBar();
		initializeMenu();
		negarComposites();
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	public void crearMatrizLenguajes(int f, int c) {
		matrizText = new Text[f][c];
		int x = 0; 
		int y = 0;
		int w = 100;
		int h = 30;
		int p=0;
		
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {

				Text text = new Text(compositeMatriz, SWT.BORDER);
				text.setBounds(x, y, w, h);
//				text.setSize(2, 2);
				x+= w;

				matrizText[i][j] = text;
			}
			p=x;
			x = 0;
			
			y = y + h;
		}
		
		
		matrizText[0][0].setText("FCA");
	}
	
	public void llenarMatriz(ArrayList<String> leng1,ArrayList<String> leng2 ){
		for (int i = 1; i < leng1.size(); i++) {
			matrizText[0][i].setText(leng1.get(i));
			matrizText[i][0].setText(leng2.get(i));
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////
	
	public void crearMatrizZachman(int f, int c,int x,int y, int w, int h,Composite composite,Text[][] matrizText) {

		int n = 0;

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {

				Text text = new Text(composite, SWT.BORDER);
				
				text.setBounds(x, y, w, h);
				text.setToolTipText("" + n);
				x = x + w;

				matrizText[i][j] = text;
				aw += x;
				n++;
			}
			x = 0;
			y = y + h;
			ah += y;
		}
		redimensionarComposite(composite, aw, ah);
	}

	public void redimensionarComposite(Composite composite, int w, int h) {
		composite.setBounds(composite.getBounds().x, composite.getBounds().y,
				w, h);
		if (composite.getParent() != null
				&& !composite.equals(parent.getParent())) {
			composite = composite.getParent();
			redimensionarComposite(composite, w, h);
		}

	}
	/*
	public void redimensionarScrolledComposite(){
		scrolledCompositeMatriz = new ScrolledComposite(compositeMatriz, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledCompositeMatriz.setSize(600,600);
		scrolledCompositeMatriz.setExpandHorizontal(true);
		scrolledCompositeMatriz.setExpandVertical(true);
		scrolledCompositeMatriz.setVisible(true);
		System.out.println("scrolledCompositeMatriz:"+"x"+scrolledCompositeMatriz.getSize().x+"y"+scrolledCompositeMatriz.getSize().y);
	}
*/
	public void negarComposites() {
		compositeNuevaMatriz.setVisible(false);
		compositeCrearMatriz.setVisible(false);
		compositeMatriz.setVisible(false);
//		scrolledCompositeMatriz.setVisible(false);

		compositeComparar.setVisible(false);
		compositeMatrizA.setVisible(false);
		compositeMatrizB.setVisible(false);

		compositeCaracteristicas.setVisible(false);
	}

	public void renovarCompositeMatriz() {
		if (compositeMatriz != null) {
			Composite composite_aux = new Composite(
					compositeMatriz.getParent(), compositeMatriz.getStyle());
			composite_aux.setBounds(compositeMatriz.getBounds());
			composite_aux.setLayout(compositeMatriz.getLayout());
			compositeMatriz = composite_aux;
		}

	}
	
	public void ubicarMatrizText(ScrolledComposite ubicacion, Text[][] matrizText){
		for (int i = 0; i < matrizText.length; i++) {
			for (int j = 0; j < matrizText[0].length; j++) {
				matrizText[i][j].setParent(ubicacion);
			}
		}
	}

	public void crearMatriz(int f, int c) {

		matrizText = new Text[f][c];

		int x = 0;
		int y = 0;
		int w = 70;
		int h = 30;
		int n = 0;

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {

				Text text = new Text(compositeMatriz, SWT.BORDER);
//				Text text = new Text(scrolledCompositeMatriz, SWT.BORDER);
				
				text.setBounds(x, y, w, h);
				text.setToolTipText("" + n);
				x = x + w;

				matrizText[i][j] = text;
				aw += x;
				n++;
			}
			x = 0;
			y = y + h;
			ah += y;
		}
		redimensionarComposite(compositeMatriz, aw, ah);
	}

	public void llenarMatrizText() {
		for (int i = 0; i < matrizText.length; i++) {
			for (int j = 0; j < matrizText[0].length; j++) {
				matrizText[i][j].setText(matriz[i][j]);
			}
		}
	}

	public String[][] capturarDatosMatrizText() {

		String[][] matriz = new String[matrizText.length][matrizText[0].length];

		for (int i = 0; i < matrizText.length; i++) {
			for (int j = 0; j < matrizText[0].length; j++) {
				matriz[i][j] = matrizText[i][j].getText();
			}
		}
		return matriz;

	}

	public void crearMatrizA(int f, int c) {
		matrizTextA = new Text[f][c];
		int x = 0;
		int y = 0;
		int w = 70;
		int h = 30;
		aw = 0;
		ah = 0;

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {

				Text text = new Text(compositeMatrizA, SWT.BORDER);
				text.setBounds(x, y, w, h);
				x = x + w;

				matrizTextA[i][j] = text;
			}
			x = 0;
			y = y + h;
		}
		matrizTextA[0][0].setText("Matriz A");
	}

	public String[][] capturarDatosMatrizTextA() {

		String[][] matrizA = new String[matrizTextA.length][matrizTextA[0].length];

		for (int i = 0; i < matrizTextA.length; i++) {
			for (int j = 0; j < matrizTextA[0].length; j++) {
				matrizA[i][j] = matrizTextA[i][j].getText();
			}
		}
		return matrizA;

	}

	public void crearMatrizB(int f, int c) {
		matrizTextB = new Text[f][c];
		int x = 0;
		int y = 0;
		int w = 70;
		int h = 30;

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {

				Text text = new Text(compositeMatrizB, SWT.BORDER);
				text.setBounds(x, y, w, h);
				x = x + w;

				matrizTextB[i][j] = text;
			}
			x = 0;
			y = y + h;
		}
		matrizTextB[0][0].setText("Matriz B");
	}

	public String[][] capturarDatosMatrizTextB() {

		String[][] matrizB = new String[matrizTextB.length][matrizTextB[0].length];

		for (int i = 0; i < matrizTextB.length; i++) {
			for (int j = 0; j < matrizTextB[0].length; j++) {
				matrizB[i][j] = matrizTextB[i][j].getText();
			}
		}
		return matrizB;

	}

	public void asignarToolTipTextZachman(Text[][] text) {
		// for (int i = 0; i < text.length; i++) {
		// for (int j = 0; j < text[0].length; j++) {
		// text[i][j].setToolTipText("");
		// }
		// }
		text[0][0].setToolTipText("zachman");

		text[1][0].setToolTipText("Contexto");
		text[2][0].setToolTipText("Concepto");
		text[3][0].setToolTipText("Logico");
		text[4][0].setToolTipText("Fisico");
		text[5][0].setToolTipText("Detallado");

		text[0][1].setToolTipText("¿Por qué?");
		text[0][2].setToolTipText("¿Como?");
		text[0][3].setToolTipText("¿Qué?");
		text[0][4].setToolTipText("¿Quien?");
		text[0][5].setToolTipText("¿Cuando?");
		text[0][6].setToolTipText("¿Dondé?");
	}
	
	public void asignarClasificadoresZachman(Text[][] text){
		text[0][0].setText("The Zachman Framework");
		
		//filas
		text[1][0].setText("Scope \n(Contextual) \nPlanner");
		text[2][0].setText("Bussines Model \n(Contextual) \nOwner");
		text[3][0].setText("System Model \n(Logical) \nDesigner");
		text[4][0].setText("Technology Model \n(Physical) \nBuilder	");
		text[5][0].setText("Detailed Representations \n(Out-of-contex) \nDesigner");

		//columnas
		text[0][1].setText("Data What (Things)");
		text[0][2].setText("Function How (Process)");
		text[0][3].setText("Network Where (Location)");
		text[0][4].setText("People Who (People)");
		text[0][5].setText("Time When (Time)");
		text[0][6].setText("Motivation Why (Motivation)");
		
	}
	public void asignarContenidoZachman(Text[][] text){
		text[0][0].setText("The Zachman Framework");
		//Fila 1
		text[1][1].setText("");
		text[1][2].setText("");
		text[1][3].setText("");
		text[1][4].setText("");
		text[1][5].setText("");
		text[1][6].setText("");
		
		//Fila 2
		text[2][1].setText("");
		text[2][2].setText("");
		text[2][3].setText("");
		text[2][4].setText("");
		text[2][5].setText("");
		text[2][6].setText("");
		
		//Fila 3
		text[3][1].setText("");
		text[3][2].setText("");
		text[3][3].setText("");
		text[3][4].setText("");
		text[3][5].setText("");
		text[3][6].setText("");
		
		//Fila 4
		text[4][1].setText("");
		text[4][2].setText("");
		text[4][3].setText("");
		text[4][4].setText("");
		text[4][5].setText("");
		text[4][6].setText("");
		
		//Fila 5
		text[5][1].setText("");
		text[5][2].setText("");
		text[5][3].setText("");
		text[5][4].setText("");
		text[5][5].setText("");
		text[5][6].setText("");
	}
	
	public void formatoDeText(Text[][] text){
		for (int i = 0; i < text.length; i++) {
			for (int j = 0; j < text[0].length; j++) {
				//formato de la fila 0
				if (i == 0) {
					
				}
				//formato de la columna 0
				else if (j == 0) {
					
				}
				//formato del resto de la matriz
				else{
					
				}

			}
		}
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions

	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars()
				.getToolBarManager();

	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
}

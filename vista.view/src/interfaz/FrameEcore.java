package interfaz;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import logica.Logicaf;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Group;

public class FrameEcore extends ViewPart {

	public static final String ID = "interfaz.FrameEcore"; //$NON-NLS-1$
	public Logicaf logica= new Logicaf();
	Text[][] cells;
	Composite compositeMatriz;
	Composite composite_1;
	ArrayList<String>leng1;
	ArrayList<String>leng2;
	Label lblLeng1;
	Label lblLeng2;

//	Contenedor de todos los componentes en la ventana
	Composite parent;
	

	public FrameEcore() {
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayout(null);
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setBounds(0, 0, 570, 447);
		
		TabFolder tabFolder = new TabFolder(composite, SWT.NONE);
		tabFolder.setBounds(0, 0, 570, 447);
		
		TabItem tbtmTab = new TabItem(tabFolder, SWT.NONE);
		tbtmTab.setText("Comparar Lenguajes");
		
		composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmTab.setControl(composite_1);
		composite_1.setLayout(null);
		
		TabItem tbtmTab_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmTab_1.setText("Tab2");
		
		TabItem tbtmTab_2 = new TabItem(tabFolder, SWT.NONE);
		tbtmTab_2.setText("tab3");
		
		compositeMatriz = new Composite(composite_1, SWT.NONE);
		compositeMatriz.setBounds(24, 130, 507, 257);
		
		Group grpOpciones = new Group(composite_1, SWT.NONE);
		grpOpciones.setText("Opciones");
		grpOpciones.setBounds(375, 10, 156, 104);
		grpOpciones.setLayout(null);
		
		Button btnCargarLenguajes = new Button(grpOpciones, SWT.NONE);
		btnCargarLenguajes.setBounds(10, 24, 135, 27);
		btnCargarLenguajes.setText("Cargar Lenguajes");
		
		
		
		Button btnComparar = new Button(grpOpciones, SWT.NONE);
		btnComparar.setBounds(10, 57, 135, 27);
		btnComparar.setText("Comparar");
		
		Group grpCargarLenguajes = new Group(composite_1, SWT.NONE);
		grpCargarLenguajes.setText("Selección de  Lenguajes");
		grpCargarLenguajes.setBounds(24, 10, 331, 104);
		grpCargarLenguajes.setLayout(null);
		
		Label lblFilas = new Label(grpCargarLenguajes, SWT.NONE);
		lblFilas.setBounds(10, 29, 62, 15);
		lblFilas.setText("Filas");
		
		Label lblColumnas = new Label(grpCargarLenguajes, SWT.NONE);
		lblColumnas.setBounds(10, 68, 62, 15);
		lblColumnas.setText("Columnas");
		
		Button btnSeleccionarFil = new Button(grpCargarLenguajes, SWT.NONE);
		btnSeleccionarFil.addSelectionListener(new SelectionAdapter() {
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
		btnSeleccionarFil.setBounds(92, 29, 110, 27);
		btnSeleccionarFil.setText("Seleccionar...");
		
		Button btnSeleccionar = new Button(grpCargarLenguajes, SWT.NONE);
		btnSeleccionar.addSelectionListener(new SelectionAdapter() {
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
		btnSeleccionar.setBounds(92, 68, 110, 27);
		btnSeleccionar.setText("Seleccionar...");
		
		lblLeng1 = new Label(grpCargarLenguajes, SWT.NONE);
		lblLeng1.setBounds(222, 29, 99, 27);
		
		lblLeng2 = new Label(grpCargarLenguajes, SWT.NONE);
		lblLeng2.setBounds(222, 68, 99, 27);
		btnCargarLenguajes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				crearMatriz(leng1.size(),leng2.size());
				llenarMatriz(leng1, leng2);
			}
		});
		
		
		createActions();
		initializeToolBar();
		initializeMenu();
	}

	public void dispose() {
		
		super.dispose();
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
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	public void crearMatriz(int f, int c) {
		cells = new Text[f][c];
		int x = 0; 
		int y = 0;
		int w = 100;
		int h = 30;
		int p=0;
		
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {

				Text text = new Text(compositeMatriz, SWT.BORDER);
				text.setBounds(x, y, w, h);
				x+= w;

				cells[i][j] = text;
			}
			p=x;
			x = 0;
			
			y = y + h;
		}
		redimensionarComposite(compositeMatriz, x+30, y+30);
		
		cells[0][0].setText("FCA");
	}
	
	public void llenarMatriz(ArrayList<String> leng1,ArrayList<String> leng2 ){
		for (int i = 1; i < leng1.size(); i++) {
			cells[0][i].setText(leng1.get(i));
			cells[i][0].setText(leng2.get(i));
		}
	}
	
	public void redimensionarComposite(Composite composite, int w, int h) {
		composite.setBounds(composite.getBounds().x, composite.getBounds().y,
				w, h);
		if (composite.getParent() != null
				) {
			composite = composite.getParent();
			redimensionarComposite(composite, w, h);
		}

	}
}

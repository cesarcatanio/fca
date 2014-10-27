package interfaz;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Text;

public class Matriz extends ViewPart {

	public static final String ID = "interfaz.Matriz"; //$NON-NLS-1$
	private Text[][] matrizText;
	Composite composite;
	Composite container;
	int aw = 600;
	int ah = 600;
	int f = 7;
	int c = 6;
	

	public Matriz() {
		setTitleToolTip("Zachman");
		iniciar();
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(null);
		{
			composite = new Composite(container, SWT.NONE);
			composite.setBounds(0, 0, 64, 64);
			composite.setLayout(null);
			
		}

		createActions();
		initializeToolBar();
		initializeMenu();
	}
	public void iniciar(){
		
		crearMatriz(f, c);
	}
	
	public void redimensionarComposite(Composite composite, int w, int h) {
		composite.setBounds(composite.getBounds().x, composite.getBounds().y,
				w, h);
		if (composite.getParent() != null
				&& !composite.equals(container.getParent())) {
			composite = composite.getParent();
			redimensionarComposite(composite, w, h);
		}

	}
	
	public void crearMatriz(int f, int c) {

		matrizText = new Text[f][c];

		int x = 0;
		int y = 0;
		int w = 70;
		int h = 70;
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

package grafo.diagram.navigator;

import grafo.diagram.part.GrafoVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GrafoNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GrafoNavigatorItem) {
			GrafoNavigatorItem item = (GrafoNavigatorItem) element;
			return GrafoVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

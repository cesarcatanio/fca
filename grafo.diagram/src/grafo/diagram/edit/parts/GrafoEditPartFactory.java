package grafo.diagram.edit.parts;

import grafo.diagram.part.GrafoVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class GrafoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GrafoVisualIDRegistry.getVisualID(view)) {

			case GrafoEditPart.VISUAL_ID:
				return new GrafoEditPart(view);

			case NodoEditPart.VISUAL_ID:
				return new NodoEditPart(view);

			case NodoNombreEditPart.VISUAL_ID:
				return new NodoNombreEditPart(view);

			case MetaNodoEditPart.VISUAL_ID:
				return new MetaNodoEditPart(view);

			case MetaNodoNombreEditPart.VISUAL_ID:
				return new MetaNodoNombreEditPart(view);

			case EnlaceEditPart.VISUAL_ID:
				return new EnlaceEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}

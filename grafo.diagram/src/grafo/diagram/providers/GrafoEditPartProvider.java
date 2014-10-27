package grafo.diagram.providers;

import grafo.diagram.edit.parts.GrafoEditPart;
import grafo.diagram.edit.parts.GrafoEditPartFactory;
import grafo.diagram.part.GrafoVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class GrafoEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public GrafoEditPartProvider() {
		super(new GrafoEditPartFactory(), GrafoVisualIDRegistry.TYPED_INSTANCE,
				GrafoEditPart.MODEL_ID);
	}

}

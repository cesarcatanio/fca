package grafo.diagram.providers.assistants;

import grafo.diagram.providers.GrafoElementTypes;
import grafo.diagram.providers.GrafoModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GrafoModelingAssistantProviderOfGrafoEditPart extends
		GrafoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GrafoElementTypes.Nodo_2001);
		types.add(GrafoElementTypes.MetaNodo_2002);
		return types;
	}

}

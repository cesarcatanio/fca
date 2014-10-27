package grafo.diagram.edit.policies;

import grafo.diagram.providers.GrafoElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EnlaceItemSemanticEditPolicy extends
		GrafoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnlaceItemSemanticEditPolicy() {
		super(GrafoElementTypes.Enlace_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}

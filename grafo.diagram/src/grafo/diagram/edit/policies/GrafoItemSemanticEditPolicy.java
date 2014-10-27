package grafo.diagram.edit.policies;

import grafo.diagram.edit.commands.MetaNodoCreateCommand;
import grafo.diagram.edit.commands.NodoCreateCommand;
import grafo.diagram.providers.GrafoElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class GrafoItemSemanticEditPolicy extends
		GrafoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GrafoItemSemanticEditPolicy() {
		super(GrafoElementTypes.Grafo_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GrafoElementTypes.Nodo_2001 == req.getElementType()) {
			return getGEFWrapper(new NodoCreateCommand(req));
		}
		if (GrafoElementTypes.MetaNodo_2002 == req.getElementType()) {
			return getGEFWrapper(new MetaNodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

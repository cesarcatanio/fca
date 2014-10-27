package grafo.diagram.edit.commands;

import grafo.Enlace;
import grafo.Grafo;
import grafo.Nodo;
import grafo.diagram.edit.policies.GrafoBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EnlaceReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public EnlaceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Enlace) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Nodo && newEnd instanceof Nodo)) {
			return false;
		}
		Nodo target = getLink().getObjetivo();
		if (!(getLink().eContainer() instanceof Grafo)) {
			return false;
		}
		Grafo container = (Grafo) getLink().eContainer();
		return GrafoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEnlace_4003(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Nodo && newEnd instanceof Nodo)) {
			return false;
		}
		Nodo source = getLink().getInicio();
		if (!(getLink().eContainer() instanceof Grafo)) {
			return false;
		}
		Grafo container = (Grafo) getLink().eContainer();
		return GrafoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEnlace_4003(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setInicio(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setObjetivo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Enlace getLink() {
		return (Enlace) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Nodo getOldSource() {
		return (Nodo) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Nodo getNewSource() {
		return (Nodo) newEnd;
	}

	/**
	 * @generated
	 */
	protected Nodo getOldTarget() {
		return (Nodo) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Nodo getNewTarget() {
		return (Nodo) newEnd;
	}
}

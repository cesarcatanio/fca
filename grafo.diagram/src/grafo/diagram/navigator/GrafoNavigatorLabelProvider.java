package grafo.diagram.navigator;

import grafo.Enlace;
import grafo.diagram.edit.parts.EnlaceEditPart;
import grafo.diagram.edit.parts.GrafoEditPart;
import grafo.diagram.edit.parts.MetaNodoEditPart;
import grafo.diagram.edit.parts.MetaNodoNombreEditPart;
import grafo.diagram.edit.parts.NodoEditPart;
import grafo.diagram.edit.parts.NodoNombreEditPart;
import grafo.diagram.part.GrafoDiagramEditorPlugin;
import grafo.diagram.part.GrafoVisualIDRegistry;
import grafo.diagram.providers.GrafoElementTypes;
import grafo.diagram.providers.GrafoParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GrafoNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GrafoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GrafoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GrafoNavigatorItem
				&& !isOwnView(((GrafoNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GrafoNavigatorGroup) {
			GrafoNavigatorGroup group = (GrafoNavigatorGroup) element;
			return GrafoDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GrafoNavigatorItem) {
			GrafoNavigatorItem navigatorItem = (GrafoNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GrafoVisualIDRegistry.getVisualID(view)) {
		case GrafoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///grafo.ecore?Grafo", GrafoElementTypes.Grafo_1000); //$NON-NLS-1$
		case NodoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///grafo.ecore?Nodo", GrafoElementTypes.Nodo_2001); //$NON-NLS-1$
		case MetaNodoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///grafo.ecore?MetaNodo", GrafoElementTypes.MetaNodo_2002); //$NON-NLS-1$
		case EnlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///grafo.ecore?Enlace", GrafoElementTypes.Enlace_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GrafoDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GrafoElementTypes.isKnownElementType(elementType)) {
			image = GrafoElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GrafoNavigatorGroup) {
			GrafoNavigatorGroup group = (GrafoNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GrafoNavigatorItem) {
			GrafoNavigatorItem navigatorItem = (GrafoNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GrafoVisualIDRegistry.getVisualID(view)) {
		case GrafoEditPart.VISUAL_ID:
			return getGrafo_1000Text(view);
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001Text(view);
		case MetaNodoEditPart.VISUAL_ID:
			return getMetaNodo_2002Text(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGrafo_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNodo_2001Text(View view) {
		IParser parser = GrafoParserProvider.getParser(
				GrafoElementTypes.Nodo_2001,
				view.getElement() != null ? view.getElement() : view,
				GrafoVisualIDRegistry.getType(NodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrafoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetaNodo_2002Text(View view) {
		IParser parser = GrafoParserProvider
				.getParser(GrafoElementTypes.MetaNodo_2002,
						view.getElement() != null ? view.getElement() : view,
						GrafoVisualIDRegistry
								.getType(MetaNodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrafoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnlace_4003Text(View view) {
		Enlace domainModelElement = (Enlace) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			GrafoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GrafoEditPart.MODEL_ID.equals(GrafoVisualIDRegistry
				.getModelID(view));
	}

}

package grafo.diagram.part;

import grafo.Enlace;
import grafo.Grafo;
import grafo.GrafoPackage;
import grafo.MetaNodo;
import grafo.Nodo;
import grafo.diagram.edit.parts.EnlaceEditPart;
import grafo.diagram.edit.parts.GrafoEditPart;
import grafo.diagram.edit.parts.MetaNodoEditPart;
import grafo.diagram.edit.parts.NodoEditPart;
import grafo.diagram.providers.GrafoElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class GrafoDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GrafoNodeDescriptor> getSemanticChildren(View view) {
		switch (GrafoVisualIDRegistry.getVisualID(view)) {
		case GrafoEditPart.VISUAL_ID:
			return getGrafo_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoNodeDescriptor> getGrafo_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Grafo modelElement = (Grafo) view.getElement();
		LinkedList<GrafoNodeDescriptor> result = new LinkedList<GrafoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaNodos().iterator(); it
				.hasNext();) {
			Nodo childElement = (Nodo) it.next();
			int visualID = GrafoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NodoEditPart.VISUAL_ID) {
				result.add(new GrafoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListaMetaNodos().iterator(); it
				.hasNext();) {
			MetaNodo childElement = (MetaNodo) it.next();
			int visualID = GrafoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MetaNodoEditPart.VISUAL_ID) {
				result.add(new GrafoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getContainedLinks(View view) {
		switch (GrafoVisualIDRegistry.getVisualID(view)) {
		case GrafoEditPart.VISUAL_ID:
			return getGrafo_1000ContainedLinks(view);
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001ContainedLinks(view);
		case MetaNodoEditPart.VISUAL_ID:
			return getMetaNodo_2002ContainedLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getIncomingLinks(View view) {
		switch (GrafoVisualIDRegistry.getVisualID(view)) {
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001IncomingLinks(view);
		case MetaNodoEditPart.VISUAL_ID:
			return getMetaNodo_2002IncomingLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getOutgoingLinks(View view) {
		switch (GrafoVisualIDRegistry.getVisualID(view)) {
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001OutgoingLinks(view);
		case MetaNodoEditPart.VISUAL_ID:
			return getMetaNodo_2002OutgoingLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getGrafo_1000ContainedLinks(
			View view) {
		Grafo modelElement = (Grafo) view.getElement();
		LinkedList<GrafoLinkDescriptor> result = new LinkedList<GrafoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Enlace_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getNodo_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getMetaNodo_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getEnlace_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getNodo_2001IncomingLinks(View view) {
		Nodo modelElement = (Nodo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GrafoLinkDescriptor> result = new LinkedList<GrafoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getMetaNodo_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getEnlace_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getNodo_2001OutgoingLinks(View view) {
		Nodo modelElement = (Nodo) view.getElement();
		LinkedList<GrafoLinkDescriptor> result = new LinkedList<GrafoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getMetaNodo_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrafoLinkDescriptor> getEnlace_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GrafoLinkDescriptor> getContainedTypeModelFacetLinks_Enlace_4003(
			Grafo container) {
		LinkedList<GrafoLinkDescriptor> result = new LinkedList<GrafoLinkDescriptor>();
		for (Iterator<?> links = container.getListaEnlaces().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enlace) {
				continue;
			}
			Enlace link = (Enlace) linkObject;
			if (EnlaceEditPart.VISUAL_ID != GrafoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodo dst = link.getObjetivo();
			Nodo src = link.getInicio();
			result.add(new GrafoLinkDescriptor(src, dst, link,
					GrafoElementTypes.Enlace_4003, EnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrafoLinkDescriptor> getIncomingTypeModelFacetLinks_Enlace_4003(
			Nodo target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrafoLinkDescriptor> result = new LinkedList<GrafoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GrafoPackage.eINSTANCE
					.getEnlace_Objetivo()
					|| false == setting.getEObject() instanceof Enlace) {
				continue;
			}
			Enlace link = (Enlace) setting.getEObject();
			if (EnlaceEditPart.VISUAL_ID != GrafoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodo src = link.getInicio();
			result.add(new GrafoLinkDescriptor(src, target, link,
					GrafoElementTypes.Enlace_4003, EnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrafoLinkDescriptor> getOutgoingTypeModelFacetLinks_Enlace_4003(
			Nodo source) {
		Grafo container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Grafo) {
				container = (Grafo) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GrafoLinkDescriptor> result = new LinkedList<GrafoLinkDescriptor>();
		for (Iterator<?> links = container.getListaEnlaces().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enlace) {
				continue;
			}
			Enlace link = (Enlace) linkObject;
			if (EnlaceEditPart.VISUAL_ID != GrafoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodo dst = link.getObjetivo();
			Nodo src = link.getInicio();
			if (src != source) {
				continue;
			}
			result.add(new GrafoLinkDescriptor(src, dst, link,
					GrafoElementTypes.Enlace_4003, EnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<GrafoNodeDescriptor> getSemanticChildren(View view) {
			return GrafoDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<GrafoLinkDescriptor> getContainedLinks(View view) {
			return GrafoDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<GrafoLinkDescriptor> getIncomingLinks(View view) {
			return GrafoDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<GrafoLinkDescriptor> getOutgoingLinks(View view) {
			return GrafoDiagramUpdater.getOutgoingLinks(view);
		}
	};

}

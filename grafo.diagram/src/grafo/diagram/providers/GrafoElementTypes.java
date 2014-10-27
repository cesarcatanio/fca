package grafo.diagram.providers;

import grafo.GrafoPackage;
import grafo.diagram.edit.parts.EnlaceEditPart;
import grafo.diagram.edit.parts.GrafoEditPart;
import grafo.diagram.edit.parts.MetaNodoEditPart;
import grafo.diagram.edit.parts.NodoEditPart;
import grafo.diagram.part.GrafoDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GrafoElementTypes {

	/**
	 * @generated
	 */
	private GrafoElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GrafoDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Grafo_1000 = getElementType("grafo.diagram.Grafo_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Nodo_2001 = getElementType("grafo.diagram.Nodo_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MetaNodo_2002 = getElementType("grafo.diagram.MetaNodo_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enlace_4003 = getElementType("grafo.diagram.Enlace_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Grafo_1000, GrafoPackage.eINSTANCE.getGrafo());

			elements.put(Nodo_2001, GrafoPackage.eINSTANCE.getNodo());

			elements.put(MetaNodo_2002, GrafoPackage.eINSTANCE.getMetaNodo());

			elements.put(Enlace_4003, GrafoPackage.eINSTANCE.getEnlace());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Grafo_1000);
			KNOWN_ELEMENT_TYPES.add(Nodo_2001);
			KNOWN_ELEMENT_TYPES.add(MetaNodo_2002);
			KNOWN_ELEMENT_TYPES.add(Enlace_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GrafoEditPart.VISUAL_ID:
			return Grafo_1000;
		case NodoEditPart.VISUAL_ID:
			return Nodo_2001;
		case MetaNodoEditPart.VISUAL_ID:
			return MetaNodo_2002;
		case EnlaceEditPart.VISUAL_ID:
			return Enlace_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return grafo.diagram.providers.GrafoElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return grafo.diagram.providers.GrafoElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return grafo.diagram.providers.GrafoElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}

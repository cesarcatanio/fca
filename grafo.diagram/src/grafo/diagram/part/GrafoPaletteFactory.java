package grafo.diagram.part;

import grafo.diagram.providers.GrafoElementTypes;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GrafoPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGrafo1Group());
	}

	/**
	 * Creates "grafo" palette tool group
	 * @generated
	 */
	private PaletteContainer createGrafo1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Grafo1Group_title);
		paletteContainer.setId("createGrafo1Group"); //$NON-NLS-1$
		paletteContainer.add(createNodo1CreationTool());
		paletteContainer.add(createEnlace2CreationTool());
		paletteContainer.add(createMetaNodo3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodo1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Nodo1CreationTool_title,
				Messages.Nodo1CreationTool_desc,
				Collections.singletonList(GrafoElementTypes.Nodo_2001));
		entry.setId("createNodo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrafoElementTypes
				.getImageDescriptor(GrafoElementTypes.Nodo_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnlace2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Enlace2CreationTool_title,
				Messages.Enlace2CreationTool_desc,
				Collections.singletonList(GrafoElementTypes.Enlace_4003));
		entry.setId("createEnlace2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrafoElementTypes
				.getImageDescriptor(GrafoElementTypes.Enlace_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetaNodo3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MetaNodo3CreationTool_title,
				Messages.MetaNodo3CreationTool_desc,
				Collections.singletonList(GrafoElementTypes.MetaNodo_2002));
		entry.setId("createMetaNodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrafoElementTypes
				.getImageDescriptor(GrafoElementTypes.MetaNodo_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}

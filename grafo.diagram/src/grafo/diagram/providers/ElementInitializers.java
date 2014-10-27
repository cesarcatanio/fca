package grafo.diagram.providers;

import grafo.diagram.part.GrafoDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GrafoDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GrafoDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}

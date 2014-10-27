package grafo.diagram.providers;

import grafo.GrafoPackage;
import grafo.diagram.edit.parts.MetaNodoNombreEditPart;
import grafo.diagram.edit.parts.NodoNombreEditPart;
import grafo.diagram.parsers.MessageFormatParser;
import grafo.diagram.part.GrafoVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GrafoParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser nodoNombre_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNodoNombre_5001Parser() {
		if (nodoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GrafoPackage.eINSTANCE
					.getCarateristica_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoNombre_5001Parser = parser;
		}
		return nodoNombre_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser metaNodoNombre_5002Parser;

	/**
	 * @generated
	 */
	private IParser getMetaNodoNombre_5002Parser() {
		if (metaNodoNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GrafoPackage.eINSTANCE
					.getCarateristica_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			metaNodoNombre_5002Parser = parser;
		}
		return metaNodoNombre_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case NodoNombreEditPart.VISUAL_ID:
			return getNodoNombre_5001Parser();
		case MetaNodoNombreEditPart.VISUAL_ID:
			return getMetaNodoNombre_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GrafoVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GrafoVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GrafoElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

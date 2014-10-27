/**
 */
package grafo.impl;

import grafo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafoFactoryImpl extends EFactoryImpl implements GrafoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrafoFactory init() {
		try {
			GrafoFactory theGrafoFactory = (GrafoFactory)EPackage.Registry.INSTANCE.getEFactory(GrafoPackage.eNS_URI);
			if (theGrafoFactory != null) {
				return theGrafoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrafoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrafoPackage.GRAFO: return createGrafo();
			case GrafoPackage.NODO: return createNodo();
			case GrafoPackage.ENLACE: return createEnlace();
			case GrafoPackage.META_NODO: return createMetaNodo();
			case GrafoPackage.CARATERISTICA: return createCarateristica();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grafo createGrafo() {
		GrafoImpl grafo = new GrafoImpl();
		return grafo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo createNodo() {
		NodoImpl nodo = new NodoImpl();
		return nodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enlace createEnlace() {
		EnlaceImpl enlace = new EnlaceImpl();
		return enlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaNodo createMetaNodo() {
		MetaNodoImpl metaNodo = new MetaNodoImpl();
		return metaNodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carateristica createCarateristica() {
		CarateristicaImpl carateristica = new CarateristicaImpl();
		return carateristica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafoPackage getGrafoPackage() {
		return (GrafoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrafoPackage getPackage() {
		return GrafoPackage.eINSTANCE;
	}

} //GrafoFactoryImpl

/**
 */
package grafo.impl;

import grafo.Carateristica;
import grafo.Enlace;
import grafo.Grafo;
import grafo.GrafoFactory;
import grafo.GrafoPackage;
import grafo.MetaNodo;
import grafo.Nodo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrafoPackageImpl extends EPackageImpl implements GrafoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grafoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaNodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carateristicaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see grafo.GrafoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrafoPackageImpl() {
		super(eNS_URI, GrafoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GrafoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrafoPackage init() {
		if (isInited) return (GrafoPackage)EPackage.Registry.INSTANCE.getEPackage(GrafoPackage.eNS_URI);

		// Obtain or create and register package
		GrafoPackageImpl theGrafoPackage = (GrafoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrafoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrafoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGrafoPackage.createPackageContents();

		// Initialize created meta-data
		theGrafoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrafoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrafoPackage.eNS_URI, theGrafoPackage);
		return theGrafoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrafo() {
		return grafoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafo_ListaNodos() {
		return (EReference)grafoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafo_ListaEnlaces() {
		return (EReference)grafoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrafo_ListaMetaNodos() {
		return (EReference)grafoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodo() {
		return nodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodo_ListaNodosAsociados() {
		return (EReference)nodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodo_MetaNodo() {
		return (EReference)nodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnlace() {
		return enlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlace_Inicio() {
		return (EReference)enlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlace_Objetivo() {
		return (EReference)enlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaNodo() {
		return metaNodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaNodo_Nodo() {
		return (EReference)metaNodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarateristica() {
		return carateristicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarateristica_Nombre() {
		return (EAttribute)carateristicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarateristica_Texto() {
		return (EAttribute)carateristicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarateristica_Color() {
		return (EAttribute)carateristicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrafoFactory getGrafoFactory() {
		return (GrafoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		grafoEClass = createEClass(GRAFO);
		createEReference(grafoEClass, GRAFO__LISTA_NODOS);
		createEReference(grafoEClass, GRAFO__LISTA_ENLACES);
		createEReference(grafoEClass, GRAFO__LISTA_META_NODOS);

		nodoEClass = createEClass(NODO);
		createEReference(nodoEClass, NODO__LISTA_NODOS_ASOCIADOS);
		createEReference(nodoEClass, NODO__META_NODO);

		enlaceEClass = createEClass(ENLACE);
		createEReference(enlaceEClass, ENLACE__INICIO);
		createEReference(enlaceEClass, ENLACE__OBJETIVO);

		metaNodoEClass = createEClass(META_NODO);
		createEReference(metaNodoEClass, META_NODO__NODO);

		carateristicaEClass = createEClass(CARATERISTICA);
		createEAttribute(carateristicaEClass, CARATERISTICA__NOMBRE);
		createEAttribute(carateristicaEClass, CARATERISTICA__TEXTO);
		createEAttribute(carateristicaEClass, CARATERISTICA__COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodoEClass.getESuperTypes().add(this.getCarateristica());
		enlaceEClass.getESuperTypes().add(this.getCarateristica());
		metaNodoEClass.getESuperTypes().add(this.getCarateristica());

		// Initialize classes, features, and operations; add parameters
		initEClass(grafoEClass, Grafo.class, "Grafo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrafo_ListaNodos(), this.getNodo(), null, "listaNodos", null, 0, -1, Grafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafo_ListaEnlaces(), this.getEnlace(), null, "listaEnlaces", null, 0, -1, Grafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrafo_ListaMetaNodos(), this.getMetaNodo(), null, "listaMetaNodos", null, 0, -1, Grafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoEClass, Nodo.class, "Nodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodo_ListaNodosAsociados(), this.getNodo(), null, "listaNodosAsociados", null, 0, -1, Nodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodo_MetaNodo(), this.getMetaNodo(), null, "metaNodo", null, 0, 1, Nodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enlaceEClass, Enlace.class, "Enlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnlace_Inicio(), this.getNodo(), null, "inicio", null, 1, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnlace_Objetivo(), this.getNodo(), null, "objetivo", null, 1, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaNodoEClass, MetaNodo.class, "MetaNodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaNodo_Nodo(), this.getNodo(), null, "nodo", null, 0, 1, MetaNodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carateristicaEClass, Carateristica.class, "Carateristica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarateristica_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Carateristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarateristica_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Carateristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarateristica_Color(), ecorePackage.getEString(), "color", null, 0, 1, Carateristica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GrafoPackageImpl

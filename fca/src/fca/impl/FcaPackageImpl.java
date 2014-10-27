/**
 */
package fca.impl;

import fca.Ajuste;
import fca.Configuracion;
import fca.Fca;
import fca.FcaFactory;
import fca.FcaPackage;
import fca.ReglaUno;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FcaPackageImpl extends EPackageImpl implements FcaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fcaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reglaUnoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuracionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ajusteEClass = null;

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
	 * @see fca.FcaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FcaPackageImpl() {
		super(eNS_URI, FcaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FcaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FcaPackage init() {
		if (isInited) return (FcaPackage)EPackage.Registry.INSTANCE.getEPackage(FcaPackage.eNS_URI);

		// Obtain or create and register package
		FcaPackageImpl theFcaPackage = (FcaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FcaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FcaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFcaPackage.createPackageContents();

		// Initialize created meta-data
		theFcaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFcaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FcaPackage.eNS_URI, theFcaPackage);
		return theFcaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFca() {
		return fcaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFca_ReglaUno() {
		return (EReference)fcaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFca_Configuracion() {
		return (EReference)fcaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFca__CrearGrafo() {
		return fcaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReglaUno() {
		return reglaUnoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReglaUno_Ajuste() {
		return (EReference)reglaUnoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReglaUno__AnalizarUno() {
		return reglaUnoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReglaUno__AnalizarDos() {
		return reglaUnoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReglaUno__BuscarSuperFila() {
		return reglaUnoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguracion() {
		return configuracionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguracion_Serie() {
		return (EAttribute)configuracionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguracion_Ruta() {
		return (EAttribute)configuracionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguracion__Exportar() {
		return configuracionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguracion__Importar() {
		return configuracionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAjuste() {
		return ajusteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAjuste__EliminarFila() {
		return ajusteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAjuste__EliminarColumna() {
		return ajusteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAjuste__ContarAtributosFila() {
		return ajusteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAjuste__ContarObjetosColumna() {
		return ajusteEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAjuste__CombinarObjetoAtributo() {
		return ajusteEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcaFactory getFcaFactory() {
		return (FcaFactory)getEFactoryInstance();
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
		fcaEClass = createEClass(FCA);
		createEReference(fcaEClass, FCA__REGLA_UNO);
		createEReference(fcaEClass, FCA__CONFIGURACION);
		createEOperation(fcaEClass, FCA___CREAR_GRAFO);

		reglaUnoEClass = createEClass(REGLA_UNO);
		createEReference(reglaUnoEClass, REGLA_UNO__AJUSTE);
		createEOperation(reglaUnoEClass, REGLA_UNO___ANALIZAR_UNO);
		createEOperation(reglaUnoEClass, REGLA_UNO___ANALIZAR_DOS);
		createEOperation(reglaUnoEClass, REGLA_UNO___BUSCAR_SUPER_FILA);

		configuracionEClass = createEClass(CONFIGURACION);
		createEAttribute(configuracionEClass, CONFIGURACION__SERIE);
		createEAttribute(configuracionEClass, CONFIGURACION__RUTA);
		createEOperation(configuracionEClass, CONFIGURACION___EXPORTAR);
		createEOperation(configuracionEClass, CONFIGURACION___IMPORTAR);

		ajusteEClass = createEClass(AJUSTE);
		createEOperation(ajusteEClass, AJUSTE___ELIMINAR_FILA);
		createEOperation(ajusteEClass, AJUSTE___ELIMINAR_COLUMNA);
		createEOperation(ajusteEClass, AJUSTE___CONTAR_ATRIBUTOS_FILA);
		createEOperation(ajusteEClass, AJUSTE___CONTAR_OBJETOS_COLUMNA);
		createEOperation(ajusteEClass, AJUSTE___COMBINAR_OBJETO_ATRIBUTO);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(fcaEClass, Fca.class, "Fca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFca_ReglaUno(), this.getReglaUno(), null, "reglaUno", null, 0, 1, Fca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFca_Configuracion(), this.getConfiguracion(), null, "configuracion", null, 0, 1, Fca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFca__CrearGrafo(), null, "crearGrafo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reglaUnoEClass, ReglaUno.class, "ReglaUno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReglaUno_Ajuste(), this.getAjuste(), null, "ajuste", null, 0, 1, ReglaUno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReglaUno__AnalizarUno(), null, "analizarUno", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReglaUno__AnalizarDos(), null, "analizarDos", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReglaUno__BuscarSuperFila(), null, "buscarSuperFila", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configuracionEClass, Configuracion.class, "Configuracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguracion_Serie(), ecorePackage.getEIntegerObject(), "serie", null, 0, 1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguracion_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, Configuracion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConfiguracion__Exportar(), null, "exportar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConfiguracion__Importar(), null, "importar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ajusteEClass, Ajuste.class, "Ajuste", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAjuste__EliminarFila(), null, "eliminarFila", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAjuste__EliminarColumna(), null, "eliminarColumna", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAjuste__ContarAtributosFila(), null, "contarAtributosFila", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAjuste__ContarObjetosColumna(), null, "contarObjetosColumna", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAjuste__CombinarObjetoAtributo(), null, "combinarObjetoAtributo", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FcaPackageImpl

/**
 */
package grafo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see grafo.GrafoFactory
 * @model kind="package"
 * @generated
 */
public interface GrafoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grafo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///grafo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grafo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrafoPackage eINSTANCE = grafo.impl.GrafoPackageImpl.init();

	/**
	 * The meta object id for the '{@link grafo.impl.GrafoImpl <em>Grafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.GrafoImpl
	 * @see grafo.impl.GrafoPackageImpl#getGrafo()
	 * @generated
	 */
	int GRAFO = 0;

	/**
	 * The feature id for the '<em><b>Lista Nodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO__LISTA_NODOS = 0;

	/**
	 * The feature id for the '<em><b>Lista Enlaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO__LISTA_ENLACES = 1;

	/**
	 * The feature id for the '<em><b>Lista Meta Nodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO__LISTA_META_NODOS = 2;

	/**
	 * The number of structural features of the '<em>Grafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafo.impl.CarateristicaImpl <em>Carateristica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.CarateristicaImpl
	 * @see grafo.impl.GrafoPackageImpl#getCarateristica()
	 * @generated
	 */
	int CARATERISTICA = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARATERISTICA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARATERISTICA__TEXTO = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARATERISTICA__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Carateristica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARATERISTICA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carateristica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARATERISTICA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafo.impl.NodoImpl <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.NodoImpl
	 * @see grafo.impl.GrafoPackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__NOMBRE = CARATERISTICA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__TEXTO = CARATERISTICA__TEXTO;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__COLOR = CARATERISTICA__COLOR;

	/**
	 * The feature id for the '<em><b>Lista Nodos Asociados</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__LISTA_NODOS_ASOCIADOS = CARATERISTICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Nodo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__META_NODO = CARATERISTICA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = CARATERISTICA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_OPERATION_COUNT = CARATERISTICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafo.impl.EnlaceImpl <em>Enlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.EnlaceImpl
	 * @see grafo.impl.GrafoPackageImpl#getEnlace()
	 * @generated
	 */
	int ENLACE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__NOMBRE = CARATERISTICA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__TEXTO = CARATERISTICA__TEXTO;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__COLOR = CARATERISTICA__COLOR;

	/**
	 * The feature id for the '<em><b>Inicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__INICIO = CARATERISTICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objetivo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__OBJETIVO = CARATERISTICA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_FEATURE_COUNT = CARATERISTICA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_OPERATION_COUNT = CARATERISTICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafo.impl.MetaNodoImpl <em>Meta Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.MetaNodoImpl
	 * @see grafo.impl.GrafoPackageImpl#getMetaNodo()
	 * @generated
	 */
	int META_NODO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NODO__NOMBRE = CARATERISTICA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NODO__TEXTO = CARATERISTICA__TEXTO;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NODO__COLOR = CARATERISTICA__COLOR;

	/**
	 * The feature id for the '<em><b>Nodo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NODO__NODO = CARATERISTICA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NODO_FEATURE_COUNT = CARATERISTICA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_NODO_OPERATION_COUNT = CARATERISTICA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link grafo.Grafo <em>Grafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grafo</em>'.
	 * @see grafo.Grafo
	 * @generated
	 */
	EClass getGrafo();

	/**
	 * Returns the meta object for the containment reference list '{@link grafo.Grafo#getListaNodos <em>Lista Nodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Nodos</em>'.
	 * @see grafo.Grafo#getListaNodos()
	 * @see #getGrafo()
	 * @generated
	 */
	EReference getGrafo_ListaNodos();

	/**
	 * Returns the meta object for the containment reference list '{@link grafo.Grafo#getListaEnlaces <em>Lista Enlaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Enlaces</em>'.
	 * @see grafo.Grafo#getListaEnlaces()
	 * @see #getGrafo()
	 * @generated
	 */
	EReference getGrafo_ListaEnlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link grafo.Grafo#getListaMetaNodos <em>Lista Meta Nodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Meta Nodos</em>'.
	 * @see grafo.Grafo#getListaMetaNodos()
	 * @see #getGrafo()
	 * @generated
	 */
	EReference getGrafo_ListaMetaNodos();

	/**
	 * Returns the meta object for class '{@link grafo.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see grafo.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for the reference list '{@link grafo.Nodo#getListaNodosAsociados <em>Lista Nodos Asociados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Nodos Asociados</em>'.
	 * @see grafo.Nodo#getListaNodosAsociados()
	 * @see #getNodo()
	 * @generated
	 */
	EReference getNodo_ListaNodosAsociados();

	/**
	 * Returns the meta object for the reference '{@link grafo.Nodo#getMetaNodo <em>Meta Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Nodo</em>'.
	 * @see grafo.Nodo#getMetaNodo()
	 * @see #getNodo()
	 * @generated
	 */
	EReference getNodo_MetaNodo();

	/**
	 * Returns the meta object for class '{@link grafo.Enlace <em>Enlace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enlace</em>'.
	 * @see grafo.Enlace
	 * @generated
	 */
	EClass getEnlace();

	/**
	 * Returns the meta object for the reference '{@link grafo.Enlace#getInicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inicio</em>'.
	 * @see grafo.Enlace#getInicio()
	 * @see #getEnlace()
	 * @generated
	 */
	EReference getEnlace_Inicio();

	/**
	 * Returns the meta object for the reference '{@link grafo.Enlace#getObjetivo <em>Objetivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objetivo</em>'.
	 * @see grafo.Enlace#getObjetivo()
	 * @see #getEnlace()
	 * @generated
	 */
	EReference getEnlace_Objetivo();

	/**
	 * Returns the meta object for class '{@link grafo.MetaNodo <em>Meta Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Nodo</em>'.
	 * @see grafo.MetaNodo
	 * @generated
	 */
	EClass getMetaNodo();

	/**
	 * Returns the meta object for the reference '{@link grafo.MetaNodo#getNodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nodo</em>'.
	 * @see grafo.MetaNodo#getNodo()
	 * @see #getMetaNodo()
	 * @generated
	 */
	EReference getMetaNodo_Nodo();

	/**
	 * Returns the meta object for class '{@link grafo.Carateristica <em>Carateristica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carateristica</em>'.
	 * @see grafo.Carateristica
	 * @generated
	 */
	EClass getCarateristica();

	/**
	 * Returns the meta object for the attribute '{@link grafo.Carateristica#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see grafo.Carateristica#getNombre()
	 * @see #getCarateristica()
	 * @generated
	 */
	EAttribute getCarateristica_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link grafo.Carateristica#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see grafo.Carateristica#getTexto()
	 * @see #getCarateristica()
	 * @generated
	 */
	EAttribute getCarateristica_Texto();

	/**
	 * Returns the meta object for the attribute '{@link grafo.Carateristica#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see grafo.Carateristica#getColor()
	 * @see #getCarateristica()
	 * @generated
	 */
	EAttribute getCarateristica_Color();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrafoFactory getGrafoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link grafo.impl.GrafoImpl <em>Grafo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.GrafoImpl
		 * @see grafo.impl.GrafoPackageImpl#getGrafo()
		 * @generated
		 */
		EClass GRAFO = eINSTANCE.getGrafo();

		/**
		 * The meta object literal for the '<em><b>Lista Nodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFO__LISTA_NODOS = eINSTANCE.getGrafo_ListaNodos();

		/**
		 * The meta object literal for the '<em><b>Lista Enlaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFO__LISTA_ENLACES = eINSTANCE.getGrafo_ListaEnlaces();

		/**
		 * The meta object literal for the '<em><b>Lista Meta Nodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFO__LISTA_META_NODOS = eINSTANCE.getGrafo_ListaMetaNodos();

		/**
		 * The meta object literal for the '{@link grafo.impl.NodoImpl <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.NodoImpl
		 * @see grafo.impl.GrafoPackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '<em><b>Lista Nodos Asociados</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODO__LISTA_NODOS_ASOCIADOS = eINSTANCE.getNodo_ListaNodosAsociados();

		/**
		 * The meta object literal for the '<em><b>Meta Nodo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODO__META_NODO = eINSTANCE.getNodo_MetaNodo();

		/**
		 * The meta object literal for the '{@link grafo.impl.EnlaceImpl <em>Enlace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.EnlaceImpl
		 * @see grafo.impl.GrafoPackageImpl#getEnlace()
		 * @generated
		 */
		EClass ENLACE = eINSTANCE.getEnlace();

		/**
		 * The meta object literal for the '<em><b>Inicio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE__INICIO = eINSTANCE.getEnlace_Inicio();

		/**
		 * The meta object literal for the '<em><b>Objetivo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE__OBJETIVO = eINSTANCE.getEnlace_Objetivo();

		/**
		 * The meta object literal for the '{@link grafo.impl.MetaNodoImpl <em>Meta Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.MetaNodoImpl
		 * @see grafo.impl.GrafoPackageImpl#getMetaNodo()
		 * @generated
		 */
		EClass META_NODO = eINSTANCE.getMetaNodo();

		/**
		 * The meta object literal for the '<em><b>Nodo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_NODO__NODO = eINSTANCE.getMetaNodo_Nodo();

		/**
		 * The meta object literal for the '{@link grafo.impl.CarateristicaImpl <em>Carateristica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.CarateristicaImpl
		 * @see grafo.impl.GrafoPackageImpl#getCarateristica()
		 * @generated
		 */
		EClass CARATERISTICA = eINSTANCE.getCarateristica();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARATERISTICA__NOMBRE = eINSTANCE.getCarateristica_Nombre();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARATERISTICA__TEXTO = eINSTANCE.getCarateristica_Texto();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARATERISTICA__COLOR = eINSTANCE.getCarateristica_Color();

	}

} //GrafoPackage

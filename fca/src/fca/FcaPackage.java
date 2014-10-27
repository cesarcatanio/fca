/**
 */
package fca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fca.FcaFactory
 * @model kind="package"
 * @generated
 */
public interface FcaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fca.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FcaPackage eINSTANCE = fca.impl.FcaPackageImpl.init();

	/**
	 * The meta object id for the '{@link fca.impl.FcaImpl <em>Fca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fca.impl.FcaImpl
	 * @see fca.impl.FcaPackageImpl#getFca()
	 * @generated
	 */
	int FCA = 0;

	/**
	 * The feature id for the '<em><b>Regla Uno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCA__REGLA_UNO = 0;

	/**
	 * The feature id for the '<em><b>Configuracion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCA__CONFIGURACION = 1;

	/**
	 * The number of structural features of the '<em>Fca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCA_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Crear Grafo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCA___CREAR_GRAFO = 0;

	/**
	 * The number of operations of the '<em>Fca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fca.impl.ReglaUnoImpl <em>Regla Uno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fca.impl.ReglaUnoImpl
	 * @see fca.impl.FcaPackageImpl#getReglaUno()
	 * @generated
	 */
	int REGLA_UNO = 1;

	/**
	 * The feature id for the '<em><b>Ajuste</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_UNO__AJUSTE = 0;

	/**
	 * The number of structural features of the '<em>Regla Uno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_UNO_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Analizar Uno</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_UNO___ANALIZAR_UNO = 0;

	/**
	 * The operation id for the '<em>Analizar Dos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_UNO___ANALIZAR_DOS = 1;

	/**
	 * The operation id for the '<em>Buscar Super Fila</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_UNO___BUSCAR_SUPER_FILA = 2;

	/**
	 * The number of operations of the '<em>Regla Uno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_UNO_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link fca.impl.ConfiguracionImpl <em>Configuracion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fca.impl.ConfiguracionImpl
	 * @see fca.impl.FcaPackageImpl#getConfiguracion()
	 * @generated
	 */
	int CONFIGURACION = 2;

	/**
	 * The feature id for the '<em><b>Serie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__SERIE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION__RUTA = 1;

	/**
	 * The number of structural features of the '<em>Configuracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Exportar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION___EXPORTAR = 0;

	/**
	 * The operation id for the '<em>Importar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION___IMPORTAR = 1;

	/**
	 * The number of operations of the '<em>Configuracion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURACION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link fca.impl.AjusteImpl <em>Ajuste</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fca.impl.AjusteImpl
	 * @see fca.impl.FcaPackageImpl#getAjuste()
	 * @generated
	 */
	int AJUSTE = 3;

	/**
	 * The number of structural features of the '<em>Ajuste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Eliminar Fila</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE___ELIMINAR_FILA = 0;

	/**
	 * The operation id for the '<em>Eliminar Columna</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE___ELIMINAR_COLUMNA = 1;

	/**
	 * The operation id for the '<em>Contar Atributos Fila</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE___CONTAR_ATRIBUTOS_FILA = 2;

	/**
	 * The operation id for the '<em>Contar Objetos Columna</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE___CONTAR_OBJETOS_COLUMNA = 3;

	/**
	 * The operation id for the '<em>Combinar Objeto Atributo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE___COMBINAR_OBJETO_ATRIBUTO = 4;

	/**
	 * The number of operations of the '<em>Ajuste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AJUSTE_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link fca.Fca <em>Fca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fca</em>'.
	 * @see fca.Fca
	 * @generated
	 */
	EClass getFca();

	/**
	 * Returns the meta object for the reference '{@link fca.Fca#getReglaUno <em>Regla Uno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regla Uno</em>'.
	 * @see fca.Fca#getReglaUno()
	 * @see #getFca()
	 * @generated
	 */
	EReference getFca_ReglaUno();

	/**
	 * Returns the meta object for the reference '{@link fca.Fca#getConfiguracion <em>Configuracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuracion</em>'.
	 * @see fca.Fca#getConfiguracion()
	 * @see #getFca()
	 * @generated
	 */
	EReference getFca_Configuracion();

	/**
	 * Returns the meta object for the '{@link fca.Fca#crearGrafo() <em>Crear Grafo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crear Grafo</em>' operation.
	 * @see fca.Fca#crearGrafo()
	 * @generated
	 */
	EOperation getFca__CrearGrafo();

	/**
	 * Returns the meta object for class '{@link fca.ReglaUno <em>Regla Uno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regla Uno</em>'.
	 * @see fca.ReglaUno
	 * @generated
	 */
	EClass getReglaUno();

	/**
	 * Returns the meta object for the reference '{@link fca.ReglaUno#getAjuste <em>Ajuste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ajuste</em>'.
	 * @see fca.ReglaUno#getAjuste()
	 * @see #getReglaUno()
	 * @generated
	 */
	EReference getReglaUno_Ajuste();

	/**
	 * Returns the meta object for the '{@link fca.ReglaUno#analizarUno() <em>Analizar Uno</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analizar Uno</em>' operation.
	 * @see fca.ReglaUno#analizarUno()
	 * @generated
	 */
	EOperation getReglaUno__AnalizarUno();

	/**
	 * Returns the meta object for the '{@link fca.ReglaUno#analizarDos() <em>Analizar Dos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analizar Dos</em>' operation.
	 * @see fca.ReglaUno#analizarDos()
	 * @generated
	 */
	EOperation getReglaUno__AnalizarDos();

	/**
	 * Returns the meta object for the '{@link fca.ReglaUno#buscarSuperFila() <em>Buscar Super Fila</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buscar Super Fila</em>' operation.
	 * @see fca.ReglaUno#buscarSuperFila()
	 * @generated
	 */
	EOperation getReglaUno__BuscarSuperFila();

	/**
	 * Returns the meta object for class '{@link fca.Configuracion <em>Configuracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuracion</em>'.
	 * @see fca.Configuracion
	 * @generated
	 */
	EClass getConfiguracion();

	/**
	 * Returns the meta object for the attribute '{@link fca.Configuracion#getSerie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serie</em>'.
	 * @see fca.Configuracion#getSerie()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EAttribute getConfiguracion_Serie();

	/**
	 * Returns the meta object for the attribute '{@link fca.Configuracion#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see fca.Configuracion#getRuta()
	 * @see #getConfiguracion()
	 * @generated
	 */
	EAttribute getConfiguracion_Ruta();

	/**
	 * Returns the meta object for the '{@link fca.Configuracion#exportar() <em>Exportar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exportar</em>' operation.
	 * @see fca.Configuracion#exportar()
	 * @generated
	 */
	EOperation getConfiguracion__Exportar();

	/**
	 * Returns the meta object for the '{@link fca.Configuracion#importar() <em>Importar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Importar</em>' operation.
	 * @see fca.Configuracion#importar()
	 * @generated
	 */
	EOperation getConfiguracion__Importar();

	/**
	 * Returns the meta object for class '{@link fca.Ajuste <em>Ajuste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ajuste</em>'.
	 * @see fca.Ajuste
	 * @generated
	 */
	EClass getAjuste();

	/**
	 * Returns the meta object for the '{@link fca.Ajuste#eliminarFila() <em>Eliminar Fila</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Fila</em>' operation.
	 * @see fca.Ajuste#eliminarFila()
	 * @generated
	 */
	EOperation getAjuste__EliminarFila();

	/**
	 * Returns the meta object for the '{@link fca.Ajuste#eliminarColumna() <em>Eliminar Columna</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eliminar Columna</em>' operation.
	 * @see fca.Ajuste#eliminarColumna()
	 * @generated
	 */
	EOperation getAjuste__EliminarColumna();

	/**
	 * Returns the meta object for the '{@link fca.Ajuste#contarAtributosFila() <em>Contar Atributos Fila</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contar Atributos Fila</em>' operation.
	 * @see fca.Ajuste#contarAtributosFila()
	 * @generated
	 */
	EOperation getAjuste__ContarAtributosFila();

	/**
	 * Returns the meta object for the '{@link fca.Ajuste#contarObjetosColumna() <em>Contar Objetos Columna</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contar Objetos Columna</em>' operation.
	 * @see fca.Ajuste#contarObjetosColumna()
	 * @generated
	 */
	EOperation getAjuste__ContarObjetosColumna();

	/**
	 * Returns the meta object for the '{@link fca.Ajuste#combinarObjetoAtributo() <em>Combinar Objeto Atributo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Combinar Objeto Atributo</em>' operation.
	 * @see fca.Ajuste#combinarObjetoAtributo()
	 * @generated
	 */
	EOperation getAjuste__CombinarObjetoAtributo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FcaFactory getFcaFactory();

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
		 * The meta object literal for the '{@link fca.impl.FcaImpl <em>Fca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fca.impl.FcaImpl
		 * @see fca.impl.FcaPackageImpl#getFca()
		 * @generated
		 */
		EClass FCA = eINSTANCE.getFca();

		/**
		 * The meta object literal for the '<em><b>Regla Uno</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCA__REGLA_UNO = eINSTANCE.getFca_ReglaUno();

		/**
		 * The meta object literal for the '<em><b>Configuracion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCA__CONFIGURACION = eINSTANCE.getFca_Configuracion();

		/**
		 * The meta object literal for the '<em><b>Crear Grafo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FCA___CREAR_GRAFO = eINSTANCE.getFca__CrearGrafo();

		/**
		 * The meta object literal for the '{@link fca.impl.ReglaUnoImpl <em>Regla Uno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fca.impl.ReglaUnoImpl
		 * @see fca.impl.FcaPackageImpl#getReglaUno()
		 * @generated
		 */
		EClass REGLA_UNO = eINSTANCE.getReglaUno();

		/**
		 * The meta object literal for the '<em><b>Ajuste</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGLA_UNO__AJUSTE = eINSTANCE.getReglaUno_Ajuste();

		/**
		 * The meta object literal for the '<em><b>Analizar Uno</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGLA_UNO___ANALIZAR_UNO = eINSTANCE.getReglaUno__AnalizarUno();

		/**
		 * The meta object literal for the '<em><b>Analizar Dos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGLA_UNO___ANALIZAR_DOS = eINSTANCE.getReglaUno__AnalizarDos();

		/**
		 * The meta object literal for the '<em><b>Buscar Super Fila</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGLA_UNO___BUSCAR_SUPER_FILA = eINSTANCE.getReglaUno__BuscarSuperFila();

		/**
		 * The meta object literal for the '{@link fca.impl.ConfiguracionImpl <em>Configuracion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fca.impl.ConfiguracionImpl
		 * @see fca.impl.FcaPackageImpl#getConfiguracion()
		 * @generated
		 */
		EClass CONFIGURACION = eINSTANCE.getConfiguracion();

		/**
		 * The meta object literal for the '<em><b>Serie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION__SERIE = eINSTANCE.getConfiguracion_Serie();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURACION__RUTA = eINSTANCE.getConfiguracion_Ruta();

		/**
		 * The meta object literal for the '<em><b>Exportar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURACION___EXPORTAR = eINSTANCE.getConfiguracion__Exportar();

		/**
		 * The meta object literal for the '<em><b>Importar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURACION___IMPORTAR = eINSTANCE.getConfiguracion__Importar();

		/**
		 * The meta object literal for the '{@link fca.impl.AjusteImpl <em>Ajuste</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fca.impl.AjusteImpl
		 * @see fca.impl.FcaPackageImpl#getAjuste()
		 * @generated
		 */
		EClass AJUSTE = eINSTANCE.getAjuste();

		/**
		 * The meta object literal for the '<em><b>Eliminar Fila</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AJUSTE___ELIMINAR_FILA = eINSTANCE.getAjuste__EliminarFila();

		/**
		 * The meta object literal for the '<em><b>Eliminar Columna</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AJUSTE___ELIMINAR_COLUMNA = eINSTANCE.getAjuste__EliminarColumna();

		/**
		 * The meta object literal for the '<em><b>Contar Atributos Fila</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AJUSTE___CONTAR_ATRIBUTOS_FILA = eINSTANCE.getAjuste__ContarAtributosFila();

		/**
		 * The meta object literal for the '<em><b>Contar Objetos Columna</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AJUSTE___CONTAR_OBJETOS_COLUMNA = eINSTANCE.getAjuste__ContarObjetosColumna();

		/**
		 * The meta object literal for the '<em><b>Combinar Objeto Atributo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AJUSTE___COMBINAR_OBJETO_ATRIBUTO = eINSTANCE.getAjuste__CombinarObjetoAtributo();

	}

} //FcaPackage

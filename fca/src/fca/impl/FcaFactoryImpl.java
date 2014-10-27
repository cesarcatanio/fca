/**
 */
package fca.impl;

import fca.*;

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
public class FcaFactoryImpl extends EFactoryImpl implements FcaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FcaFactory init() {
		try {
			FcaFactory theFcaFactory = (FcaFactory)EPackage.Registry.INSTANCE.getEFactory(FcaPackage.eNS_URI);
			if (theFcaFactory != null) {
				return theFcaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FcaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcaFactoryImpl() {
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
			case FcaPackage.FCA: return createFca();
			case FcaPackage.REGLA_UNO: return createReglaUno();
			case FcaPackage.CONFIGURACION: return createConfiguracion();
			case FcaPackage.AJUSTE: return createAjuste();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fca createFca() {
		FcaImpl fca = new FcaImpl();
		return fca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReglaUno createReglaUno() {
		ReglaUnoImpl reglaUno = new ReglaUnoImpl();
		return reglaUno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuracion createConfiguracion() {
		ConfiguracionImpl configuracion = new ConfiguracionImpl();
		return configuracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ajuste createAjuste() {
		AjusteImpl ajuste = new AjusteImpl();
		return ajuste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcaPackage getFcaPackage() {
		return (FcaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FcaPackage getPackage() {
		return FcaPackage.eINSTANCE;
	}

} //FcaFactoryImpl

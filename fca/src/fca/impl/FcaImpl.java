/**
 */
package fca.impl;

import fca.Configuracion;
import fca.Fca;
import fca.FcaPackage;
import fca.ReglaUno;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fca.impl.FcaImpl#getReglaUno <em>Regla Uno</em>}</li>
 *   <li>{@link fca.impl.FcaImpl#getConfiguracion <em>Configuracion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FcaImpl extends MinimalEObjectImpl.Container implements Fca {
	/**
	 * The cached value of the '{@link #getReglaUno() <em>Regla Uno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglaUno()
	 * @generated
	 * @ordered
	 */
	protected ReglaUno reglaUno;

	/**
	 * The cached value of the '{@link #getConfiguracion() <em>Configuracion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguracion()
	 * @generated
	 * @ordered
	 */
	protected Configuracion configuracion;
	
	private String[][] matriz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FcaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FcaPackage.Literals.FCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReglaUno getReglaUno() {
		if (reglaUno != null && reglaUno.eIsProxy()) {
			InternalEObject oldReglaUno = (InternalEObject)reglaUno;
			reglaUno = (ReglaUno)eResolveProxy(oldReglaUno);
			if (reglaUno != oldReglaUno) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FcaPackage.FCA__REGLA_UNO, oldReglaUno, reglaUno));
			}
		}
		return reglaUno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReglaUno basicGetReglaUno() {
		return reglaUno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReglaUno(ReglaUno newReglaUno) {
		ReglaUno oldReglaUno = reglaUno;
		reglaUno = newReglaUno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FcaPackage.FCA__REGLA_UNO, oldReglaUno, reglaUno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuracion getConfiguracion() {
		if (configuracion != null && configuracion.eIsProxy()) {
			InternalEObject oldConfiguracion = (InternalEObject)configuracion;
			configuracion = (Configuracion)eResolveProxy(oldConfiguracion);
			if (configuracion != oldConfiguracion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FcaPackage.FCA__CONFIGURACION, oldConfiguracion, configuracion));
			}
		}
		return configuracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuracion basicGetConfiguracion() {
		return configuracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguracion(Configuracion newConfiguracion) {
		Configuracion oldConfiguracion = configuracion;
		configuracion = newConfiguracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FcaPackage.FCA__CONFIGURACION, oldConfiguracion, configuracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void crearGrafo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FcaPackage.FCA__REGLA_UNO:
				if (resolve) return getReglaUno();
				return basicGetReglaUno();
			case FcaPackage.FCA__CONFIGURACION:
				if (resolve) return getConfiguracion();
				return basicGetConfiguracion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FcaPackage.FCA__REGLA_UNO:
				setReglaUno((ReglaUno)newValue);
				return;
			case FcaPackage.FCA__CONFIGURACION:
				setConfiguracion((Configuracion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FcaPackage.FCA__REGLA_UNO:
				setReglaUno((ReglaUno)null);
				return;
			case FcaPackage.FCA__CONFIGURACION:
				setConfiguracion((Configuracion)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FcaPackage.FCA__REGLA_UNO:
				return reglaUno != null;
			case FcaPackage.FCA__CONFIGURACION:
				return configuracion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FcaPackage.FCA___CREAR_GRAFO:
				crearGrafo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String[][] getMatriz() {
		// TODO Auto-generated method stub
		return matriz;
	}

	@Override
	public void setMatriz(String[][] matriz) {
		// TODO Auto-generated method stub
		this.matriz = matriz;
	}

} //FcaImpl

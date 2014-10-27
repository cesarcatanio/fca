/**
 */
package grafo.impl;

import grafo.Enlace;
import grafo.GrafoPackage;
import grafo.Nodo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enlace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grafo.impl.EnlaceImpl#getInicio <em>Inicio</em>}</li>
 *   <li>{@link grafo.impl.EnlaceImpl#getObjetivo <em>Objetivo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnlaceImpl extends CarateristicaImpl implements Enlace {
	/**
	 * The cached value of the '{@link #getInicio() <em>Inicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInicio()
	 * @generated
	 * @ordered
	 */
	protected Nodo inicio;

	/**
	 * The cached value of the '{@link #getObjetivo() <em>Objetivo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetivo()
	 * @generated
	 * @ordered
	 */
	protected Nodo objetivo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafoPackage.Literals.ENLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo getInicio() {
		if (inicio != null && inicio.eIsProxy()) {
			InternalEObject oldInicio = (InternalEObject)inicio;
			inicio = (Nodo)eResolveProxy(oldInicio);
			if (inicio != oldInicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafoPackage.ENLACE__INICIO, oldInicio, inicio));
			}
		}
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo basicGetInicio() {
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicio(Nodo newInicio) {
		Nodo oldInicio = inicio;
		inicio = newInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafoPackage.ENLACE__INICIO, oldInicio, inicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo getObjetivo() {
		if (objetivo != null && objetivo.eIsProxy()) {
			InternalEObject oldObjetivo = (InternalEObject)objetivo;
			objetivo = (Nodo)eResolveProxy(oldObjetivo);
			if (objetivo != oldObjetivo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafoPackage.ENLACE__OBJETIVO, oldObjetivo, objetivo));
			}
		}
		return objetivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo basicGetObjetivo() {
		return objetivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetivo(Nodo newObjetivo) {
		Nodo oldObjetivo = objetivo;
		objetivo = newObjetivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafoPackage.ENLACE__OBJETIVO, oldObjetivo, objetivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafoPackage.ENLACE__INICIO:
				if (resolve) return getInicio();
				return basicGetInicio();
			case GrafoPackage.ENLACE__OBJETIVO:
				if (resolve) return getObjetivo();
				return basicGetObjetivo();
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
			case GrafoPackage.ENLACE__INICIO:
				setInicio((Nodo)newValue);
				return;
			case GrafoPackage.ENLACE__OBJETIVO:
				setObjetivo((Nodo)newValue);
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
			case GrafoPackage.ENLACE__INICIO:
				setInicio((Nodo)null);
				return;
			case GrafoPackage.ENLACE__OBJETIVO:
				setObjetivo((Nodo)null);
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
			case GrafoPackage.ENLACE__INICIO:
				return inicio != null;
			case GrafoPackage.ENLACE__OBJETIVO:
				return objetivo != null;
		}
		return super.eIsSet(featureID);
	}

} //EnlaceImpl

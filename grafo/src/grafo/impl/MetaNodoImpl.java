/**
 */
package grafo.impl;

import grafo.GrafoPackage;
import grafo.MetaNodo;
import grafo.Nodo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Nodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grafo.impl.MetaNodoImpl#getNodo <em>Nodo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaNodoImpl extends CarateristicaImpl implements MetaNodo {
	/**
	 * The cached value of the '{@link #getNodo() <em>Nodo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodo()
	 * @generated
	 * @ordered
	 */
	protected Nodo nodo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaNodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafoPackage.Literals.META_NODO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo getNodo() {
		if (nodo != null && nodo.eIsProxy()) {
			InternalEObject oldNodo = (InternalEObject)nodo;
			nodo = (Nodo)eResolveProxy(oldNodo);
			if (nodo != oldNodo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafoPackage.META_NODO__NODO, oldNodo, nodo));
			}
		}
		return nodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo basicGetNodo() {
		return nodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodo(Nodo newNodo) {
		Nodo oldNodo = nodo;
		nodo = newNodo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafoPackage.META_NODO__NODO, oldNodo, nodo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafoPackage.META_NODO__NODO:
				if (resolve) return getNodo();
				return basicGetNodo();
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
			case GrafoPackage.META_NODO__NODO:
				setNodo((Nodo)newValue);
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
			case GrafoPackage.META_NODO__NODO:
				setNodo((Nodo)null);
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
			case GrafoPackage.META_NODO__NODO:
				return nodo != null;
		}
		return super.eIsSet(featureID);
	}

} //MetaNodoImpl

/**
 */
package grafo.impl;

import grafo.GrafoPackage;
import grafo.MetaNodo;
import grafo.Nodo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grafo.impl.NodoImpl#getListaNodosAsociados <em>Lista Nodos Asociados</em>}</li>
 *   <li>{@link grafo.impl.NodoImpl#getMetaNodo <em>Meta Nodo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodoImpl extends CarateristicaImpl implements Nodo {
	/**
	 * The cached value of the '{@link #getListaNodosAsociados() <em>Lista Nodos Asociados</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaNodosAsociados()
	 * @generated
	 * @ordered
	 */
	protected EList<Nodo> listaNodosAsociados;

	/**
	 * The cached value of the '{@link #getMetaNodo() <em>Meta Nodo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaNodo()
	 * @generated
	 * @ordered
	 */
	protected MetaNodo metaNodo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafoPackage.Literals.NODO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nodo> getListaNodosAsociados() {
		if (listaNodosAsociados == null) {
			listaNodosAsociados = new EObjectResolvingEList<Nodo>(Nodo.class, this, GrafoPackage.NODO__LISTA_NODOS_ASOCIADOS);
		}
		return listaNodosAsociados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaNodo getMetaNodo() {
		if (metaNodo != null && metaNodo.eIsProxy()) {
			InternalEObject oldMetaNodo = (InternalEObject)metaNodo;
			metaNodo = (MetaNodo)eResolveProxy(oldMetaNodo);
			if (metaNodo != oldMetaNodo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafoPackage.NODO__META_NODO, oldMetaNodo, metaNodo));
			}
		}
		return metaNodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaNodo basicGetMetaNodo() {
		return metaNodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaNodo(MetaNodo newMetaNodo) {
		MetaNodo oldMetaNodo = metaNodo;
		metaNodo = newMetaNodo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafoPackage.NODO__META_NODO, oldMetaNodo, metaNodo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafoPackage.NODO__LISTA_NODOS_ASOCIADOS:
				return getListaNodosAsociados();
			case GrafoPackage.NODO__META_NODO:
				if (resolve) return getMetaNodo();
				return basicGetMetaNodo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrafoPackage.NODO__LISTA_NODOS_ASOCIADOS:
				getListaNodosAsociados().clear();
				getListaNodosAsociados().addAll((Collection<? extends Nodo>)newValue);
				return;
			case GrafoPackage.NODO__META_NODO:
				setMetaNodo((MetaNodo)newValue);
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
			case GrafoPackage.NODO__LISTA_NODOS_ASOCIADOS:
				getListaNodosAsociados().clear();
				return;
			case GrafoPackage.NODO__META_NODO:
				setMetaNodo((MetaNodo)null);
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
			case GrafoPackage.NODO__LISTA_NODOS_ASOCIADOS:
				return listaNodosAsociados != null && !listaNodosAsociados.isEmpty();
			case GrafoPackage.NODO__META_NODO:
				return metaNodo != null;
		}
		return super.eIsSet(featureID);
	}

} //NodoImpl

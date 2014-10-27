/**
 */
package grafo.impl;

import grafo.Enlace;
import grafo.Grafo;
import grafo.GrafoPackage;
import grafo.MetaNodo;
import grafo.Nodo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grafo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grafo.impl.GrafoImpl#getListaNodos <em>Lista Nodos</em>}</li>
 *   <li>{@link grafo.impl.GrafoImpl#getListaEnlaces <em>Lista Enlaces</em>}</li>
 *   <li>{@link grafo.impl.GrafoImpl#getListaMetaNodos <em>Lista Meta Nodos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrafoImpl extends MinimalEObjectImpl.Container implements Grafo {
	/**
	 * The cached value of the '{@link #getListaNodos() <em>Lista Nodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaNodos()
	 * @generated
	 * @ordered
	 */
	protected EList<Nodo> listaNodos;

	/**
	 * The cached value of the '{@link #getListaEnlaces() <em>Lista Enlaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaEnlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Enlace> listaEnlaces;

	/**
	 * The cached value of the '{@link #getListaMetaNodos() <em>Lista Meta Nodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaMetaNodos()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaNodo> listaMetaNodos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrafoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafoPackage.Literals.GRAFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nodo> getListaNodos() {
		if (listaNodos == null) {
			listaNodos = new EObjectContainmentEList<Nodo>(Nodo.class, this, GrafoPackage.GRAFO__LISTA_NODOS);
		}
		return listaNodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enlace> getListaEnlaces() {
		if (listaEnlaces == null) {
			listaEnlaces = new EObjectContainmentEList<Enlace>(Enlace.class, this, GrafoPackage.GRAFO__LISTA_ENLACES);
		}
		return listaEnlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaNodo> getListaMetaNodos() {
		if (listaMetaNodos == null) {
			listaMetaNodos = new EObjectContainmentEList<MetaNodo>(MetaNodo.class, this, GrafoPackage.GRAFO__LISTA_META_NODOS);
		}
		return listaMetaNodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrafoPackage.GRAFO__LISTA_NODOS:
				return ((InternalEList<?>)getListaNodos()).basicRemove(otherEnd, msgs);
			case GrafoPackage.GRAFO__LISTA_ENLACES:
				return ((InternalEList<?>)getListaEnlaces()).basicRemove(otherEnd, msgs);
			case GrafoPackage.GRAFO__LISTA_META_NODOS:
				return ((InternalEList<?>)getListaMetaNodos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafoPackage.GRAFO__LISTA_NODOS:
				return getListaNodos();
			case GrafoPackage.GRAFO__LISTA_ENLACES:
				return getListaEnlaces();
			case GrafoPackage.GRAFO__LISTA_META_NODOS:
				return getListaMetaNodos();
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
			case GrafoPackage.GRAFO__LISTA_NODOS:
				getListaNodos().clear();
				getListaNodos().addAll((Collection<? extends Nodo>)newValue);
				return;
			case GrafoPackage.GRAFO__LISTA_ENLACES:
				getListaEnlaces().clear();
				getListaEnlaces().addAll((Collection<? extends Enlace>)newValue);
				return;
			case GrafoPackage.GRAFO__LISTA_META_NODOS:
				getListaMetaNodos().clear();
				getListaMetaNodos().addAll((Collection<? extends MetaNodo>)newValue);
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
			case GrafoPackage.GRAFO__LISTA_NODOS:
				getListaNodos().clear();
				return;
			case GrafoPackage.GRAFO__LISTA_ENLACES:
				getListaEnlaces().clear();
				return;
			case GrafoPackage.GRAFO__LISTA_META_NODOS:
				getListaMetaNodos().clear();
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
			case GrafoPackage.GRAFO__LISTA_NODOS:
				return listaNodos != null && !listaNodos.isEmpty();
			case GrafoPackage.GRAFO__LISTA_ENLACES:
				return listaEnlaces != null && !listaEnlaces.isEmpty();
			case GrafoPackage.GRAFO__LISTA_META_NODOS:
				return listaMetaNodos != null && !listaMetaNodos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GrafoImpl

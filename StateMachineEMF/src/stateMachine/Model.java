/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.Model#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Statemachines</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachine.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statemachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachines</em>' containment reference list.
	 * @see stateMachine.StateMachinePackage#getModel_Statemachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getStatemachines();

} // Model

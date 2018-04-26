/**
 * generated by Xtext 2.12.0
 */
package org.xtext.icam.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.icam.stateMachine.model#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @see org.xtext.icam.stateMachine.StateMachinePackage#getmodel()
 * @model
 * @generated
 */
public interface model extends EObject
{
  /**
   * Returns the value of the '<em><b>Statemachine</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.icam.stateMachine.StateMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statemachine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statemachine</em>' containment reference list.
   * @see org.xtext.icam.stateMachine.StateMachinePackage#getmodel_Statemachine()
   * @model containment="true"
   * @generated
   */
  EList<StateMachine> getStatemachine();

} // model
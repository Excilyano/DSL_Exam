/**
 */
package fr.imta.dsl.evaluation.exe4.exe4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.dsl.evaluation.exe4.exe4.Content#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.dsl.evaluation.exe4.exe4.Exe4Package#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject
{
  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.dsl.evaluation.exe4.exe4.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see fr.imta.dsl.evaluation.exe4.exe4.Exe4Package#getContent_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // Content

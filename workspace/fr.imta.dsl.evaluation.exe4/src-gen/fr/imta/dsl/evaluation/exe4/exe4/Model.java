/**
 */
package fr.imta.dsl.evaluation.exe4.exe4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.dsl.evaluation.exe4.exe4.Model#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.dsl.evaluation.exe4.exe4.Exe4Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
   * The list contents are of type {@link fr.imta.dsl.evaluation.exe4.exe4.Frame}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frames</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frames</em>' containment reference list.
   * @see fr.imta.dsl.evaluation.exe4.exe4.Exe4Package#getModel_Frames()
   * @model containment="true"
   * @generated
   */
  EList<Frame> getFrames();

} // Model

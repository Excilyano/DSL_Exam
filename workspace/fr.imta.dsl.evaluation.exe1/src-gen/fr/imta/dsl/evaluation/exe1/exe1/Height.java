/**
 */
package fr.imta.dsl.evaluation.exe1.exe1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Height</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Height#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getHeight()
 * @model
 * @generated
 */
public interface Height extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getHeight_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Height#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Height

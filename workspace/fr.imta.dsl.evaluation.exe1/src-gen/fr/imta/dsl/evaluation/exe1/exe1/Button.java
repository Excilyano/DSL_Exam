/**
 */
package fr.imta.dsl.evaluation.exe1.exe1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Button#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getButton()
 * @model
 * @generated
 */
public interface Button extends Component
{
  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference.
   * @see #setDest(Frame)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getButton_Dest()
   * @model
   * @generated
   */
  Frame getDest();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Button#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(Frame value);

} // Button

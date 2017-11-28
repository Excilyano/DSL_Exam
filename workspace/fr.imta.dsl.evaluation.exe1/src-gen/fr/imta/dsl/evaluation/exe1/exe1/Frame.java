/**
 */
package fr.imta.dsl.evaluation.exe1.exe1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getName <em>Name</em>}</li>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getFrame()
 * @model
 * @generated
 */
public interface Frame extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getFrame_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(Title)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getFrame_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(Width)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getFrame_Width()
   * @model containment="true"
   * @generated
   */
  Width getWidth();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(Width value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' containment reference.
   * @see #setHeight(Height)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getFrame_Height()
   * @model containment="true"
   * @generated
   */
  Height getHeight();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getHeight <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' containment reference.
   * @see #getHeight()
   * @generated
   */
  void setHeight(Height value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(Content)
   * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Package#getFrame_Content()
   * @model containment="true"
   * @generated
   */
  Content getContent();

  /**
   * Sets the value of the '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(Content value);

} // Frame

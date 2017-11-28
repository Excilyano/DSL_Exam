/**
 */
package fr.imta.dsl.evaluation.exe1.exe1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.imta.dsl.evaluation.exe1.exe1.Exe1Factory
 * @model kind="package"
 * @generated
 */
public interface Exe1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "exe1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imta.fr/dsl/evaluation/exe1/Exe1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "exe1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Exe1Package eINSTANCE = fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ModelImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Frames</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FRAMES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.FrameImpl <em>Frame</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.FrameImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getFrame()
   * @generated
   */
  int FRAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__TITLE = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__HEIGHT = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__CONTENT = 4;

  /**
   * The number of structural features of the '<em>Frame</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.TitleImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getTitle()
   * @generated
   */
  int TITLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.WidthImpl <em>Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.WidthImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getWidth()
   * @generated
   */
  int WIDTH = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH__VALUE = 0;

  /**
   * The number of structural features of the '<em>Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.HeightImpl <em>Height</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.HeightImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getHeight()
   * @generated
   */
  int HEIGHT = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Height</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ContentImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getContent()
   * @generated
   */
  int CONTENT = 5;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__COMPONENTS = 0;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ComponentImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.LabelImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getLabel()
   * @generated
   */
  int LABEL = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__VALUE = COMPONENT__VALUE;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ButtonImpl
   * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getButton()
   * @generated
   */
  int BUTTON = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__VALUE = COMPONENT__VALUE;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__DEST = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.dsl.evaluation.exe1.exe1.Model#getFrames <em>Frames</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Frames</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Model#getFrames()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Frames();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame <em>Frame</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Frame</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Frame
   * @generated
   */
  EClass getFrame();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Frame#getName()
   * @see #getFrame()
   * @generated
   */
  EAttribute getFrame_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Frame#getTitle()
   * @see #getFrame()
   * @generated
   */
  EReference getFrame_Title();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Frame#getWidth()
   * @see #getFrame()
   * @generated
   */
  EReference getFrame_Width();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Frame#getHeight()
   * @see #getFrame()
   * @generated
   */
  EReference getFrame_Height();

  /**
   * Returns the meta object for the containment reference '{@link fr.imta.dsl.evaluation.exe1.exe1.Frame#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Frame#getContent()
   * @see #getFrame()
   * @generated
   */
  EReference getFrame_Content();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.dsl.evaluation.exe1.exe1.Title#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Title#getName()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Name();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Width <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Width</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Width
   * @generated
   */
  EClass getWidth();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.dsl.evaluation.exe1.exe1.Width#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Width#getValue()
   * @see #getWidth()
   * @generated
   */
  EAttribute getWidth_Value();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Height <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Height</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Height
   * @generated
   */
  EClass getHeight();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.dsl.evaluation.exe1.exe1.Height#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Height#getValue()
   * @see #getHeight()
   * @generated
   */
  EAttribute getHeight_Value();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imta.dsl.evaluation.exe1.exe1.Content#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Content#getComponents()
   * @see #getContent()
   * @generated
   */
  EReference getContent_Components();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link fr.imta.dsl.evaluation.exe1.exe1.Component#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Component#getValue()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Value();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for class '{@link fr.imta.dsl.evaluation.exe1.exe1.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the reference '{@link fr.imta.dsl.evaluation.exe1.exe1.Button#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest</em>'.
   * @see fr.imta.dsl.evaluation.exe1.exe1.Button#getDest()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Dest();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Exe1Factory getExe1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ModelImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Frames</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FRAMES = eINSTANCE.getModel_Frames();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.FrameImpl <em>Frame</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.FrameImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getFrame()
     * @generated
     */
    EClass FRAME = eINSTANCE.getFrame();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAME__NAME = eINSTANCE.getFrame_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME__TITLE = eINSTANCE.getFrame_Title();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME__WIDTH = eINSTANCE.getFrame_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME__HEIGHT = eINSTANCE.getFrame_Height();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME__CONTENT = eINSTANCE.getFrame_Content();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.TitleImpl <em>Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.TitleImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getTitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.getTitle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__NAME = eINSTANCE.getTitle_Name();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.WidthImpl <em>Width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.WidthImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getWidth()
     * @generated
     */
    EClass WIDTH = eINSTANCE.getWidth();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDTH__VALUE = eINSTANCE.getWidth_Value();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.HeightImpl <em>Height</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.HeightImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getHeight()
     * @generated
     */
    EClass HEIGHT = eINSTANCE.getHeight();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEIGHT__VALUE = eINSTANCE.getHeight_Value();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ContentImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__COMPONENTS = eINSTANCE.getContent_Components();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ComponentImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__VALUE = eINSTANCE.getComponent_Value();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.LabelImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '{@link fr.imta.dsl.evaluation.exe1.exe1.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.ButtonImpl
     * @see fr.imta.dsl.evaluation.exe1.exe1.impl.Exe1PackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__DEST = eINSTANCE.getButton_Dest();

  }

} //Exe1Package

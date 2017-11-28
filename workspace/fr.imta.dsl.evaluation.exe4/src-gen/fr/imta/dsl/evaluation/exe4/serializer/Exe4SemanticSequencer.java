package fr.imta.dsl.evaluation.exe4.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imta.dsl.evaluation.exe4.exe4.Button;
import fr.imta.dsl.evaluation.exe4.exe4.Content;
import fr.imta.dsl.evaluation.exe4.exe4.Exe4Package;
import fr.imta.dsl.evaluation.exe4.exe4.Frame;
import fr.imta.dsl.evaluation.exe4.exe4.Height;
import fr.imta.dsl.evaluation.exe4.exe4.Label;
import fr.imta.dsl.evaluation.exe4.exe4.Model;
import fr.imta.dsl.evaluation.exe4.exe4.Title;
import fr.imta.dsl.evaluation.exe4.exe4.Width;
import fr.imta.dsl.evaluation.exe4.services.Exe4GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Exe4SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Exe4GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Exe4Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Exe4Package.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getComponentRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.CONTENT:
				if(context == grammarAccess.getContentRule()) {
					sequence_Content(context, (Content) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.FRAME:
				if(context == grammarAccess.getFrameRule()) {
					sequence_Frame(context, (Frame) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.HEIGHT:
				if(context == grammarAccess.getHeightRule()) {
					sequence_Height(context, (Height) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.LABEL:
				if(context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.TITLE:
				if(context == grammarAccess.getTitleRule()) {
					sequence_Title(context, (Title) semanticObject); 
					return; 
				}
				else break;
			case Exe4Package.WIDTH:
				if(context == grammarAccess.getWidthRule()) {
					sequence_Width(context, (Width) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=STRING dest=[Frame|ID])
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exe4Package.Literals.COMPONENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exe4Package.Literals.COMPONENT__VALUE));
			if(transientValues.isValueTransient(semanticObject, Exe4Package.Literals.BUTTON__DEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exe4Package.Literals.BUTTON__DEST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getButtonAccess().getDestFrameIDTerminalRuleCall_3_0_1(), semanticObject.getDest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     components+=Component+
	 */
	protected void sequence_Content(EObject context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=Title width=Width height=Height content=Content)
	 */
	protected void sequence_Frame(EObject context, Frame semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Height(EObject context, Height semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exe4Package.Literals.HEIGHT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exe4Package.Literals.HEIGHT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeightAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exe4Package.Literals.COMPONENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exe4Package.Literals.COMPONENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     frames+=Frame*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Title(EObject context, Title semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exe4Package.Literals.TITLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exe4Package.Literals.TITLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTitleAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Width(EObject context, Width semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Exe4Package.Literals.WIDTH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Exe4Package.Literals.WIDTH__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWidthAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}

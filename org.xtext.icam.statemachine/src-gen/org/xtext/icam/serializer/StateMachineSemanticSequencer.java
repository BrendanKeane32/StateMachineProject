/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.icam.services.StateMachineGrammarAccess;
import org.xtext.icam.stateMachine.Command;
import org.xtext.icam.stateMachine.Condition;
import org.xtext.icam.stateMachine.DeclaredParameter;
import org.xtext.icam.stateMachine.Event;
import org.xtext.icam.stateMachine.FloatType;
import org.xtext.icam.stateMachine.Modifier;
import org.xtext.icam.stateMachine.State;
import org.xtext.icam.stateMachine.StateMachine;
import org.xtext.icam.stateMachine.StateMachinePackage;
import org.xtext.icam.stateMachine.StringType;
import org.xtext.icam.stateMachine.Test;
import org.xtext.icam.stateMachine.Transition;
import org.xtext.icam.stateMachine.VarName;
import org.xtext.icam.stateMachine.model;

@SuppressWarnings("all")
public class StateMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StateMachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StateMachinePackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case StateMachinePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case StateMachinePackage.DECLARED_PARAMETER:
				sequence_DeclaredParameter(context, (DeclaredParameter) semanticObject); 
				return; 
			case StateMachinePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case StateMachinePackage.FLOAT_TYPE:
				sequence_Type(context, (FloatType) semanticObject); 
				return; 
			case StateMachinePackage.MODIFIER:
				sequence_Modifier(context, (Modifier) semanticObject); 
				return; 
			case StateMachinePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StateMachinePackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			case StateMachinePackage.STRING_TYPE:
				sequence_Type(context, (StringType) semanticObject); 
				return; 
			case StateMachinePackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case StateMachinePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case StateMachinePackage.VAR_NAME:
				sequence_VarName(context, (VarName) semanticObject); 
				return; 
			case StateMachinePackage.MODEL:
				sequence_model(context, (model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.COMMAND__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.CONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.CONDITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeclaredParameter returns DeclaredParameter
	 *
	 * Constraint:
	 *     name=VarName
	 */
	protected void sequence_DeclaredParameter(ISerializationContext context, DeclaredParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.DECLARED_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.DECLARED_PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclaredParameterAccess().getNameVarNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (returnType=Type name=ID (tests+=Test tests+=Test*)?)
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Modifier returns Modifier
	 *
	 * Constraint:
	 *     visibility+=Visibility
	 */
	protected void sequence_Modifier(ISerializationContext context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         events+=Event* 
	 *         commands+=Command+ 
	 *         states+=State* 
	 *         initialstates=[State|ID] 
	 *         finalstates=[State|ID]
	 *     )
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID actions+=[Command|ID]* transitions+=Transition*)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (types+=Type args+=DeclaredParameter)
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (event=[Event|ID] state=[State|ID] condition=Condition?)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns FloatType
	 *
	 * Constraint:
	 *     type='Float'
	 */
	protected void sequence_Type(ISerializationContext context, FloatType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns StringType
	 *
	 * Constraint:
	 *     type='String'
	 */
	protected void sequence_Type(ISerializationContext context, StringType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeStringKeyword_0_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VarName returns VarName
	 *
	 * Constraint:
	 *     value=A_VARNAME
	 */
	protected void sequence_VarName(ISerializationContext context, VarName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.VAR_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.VAR_NAME__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarNameAccess().getValueA_VARNAMETerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     model returns model
	 *
	 * Constraint:
	 *     statemachine+=StateMachine+
	 */
	protected void sequence_model(ISerializationContext context, model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

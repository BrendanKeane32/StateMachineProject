/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class StateMachineGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.model");
		private final Assignment cStatemachineAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatemachineStateMachineParserRuleCall_0 = (RuleCall)cStatemachineAssignment.eContents().get(0);
		
		//model:
		//	statemachine+=StateMachine*;
		@Override public ParserRule getRule() { return rule; }
		
		//statemachine+=StateMachine*
		public Assignment getStatemachineAssignment() { return cStatemachineAssignment; }
		
		//StateMachine
		public RuleCall getStatemachineStateMachineParserRuleCall_0() { return cStatemachineStateMachineParserRuleCall_0; }
	}
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMachineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEventsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEventsEventParserRuleCall_3_0 = (RuleCall)cEventsAssignment_3.eContents().get(0);
		private final Assignment cCommandsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCommandsCommandParserRuleCall_4_0 = (RuleCall)cCommandsAssignment_4.eContents().get(0);
		private final Assignment cStatesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStatesStateParserRuleCall_5_0 = (RuleCall)cStatesAssignment_5.eContents().get(0);
		private final Keyword cInitialKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cInitialstatesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cInitialstatesStateCrossReference_7_0 = (CrossReference)cInitialstatesAssignment_7.eContents().get(0);
		private final RuleCall cInitialstatesStateIDTerminalRuleCall_7_0_1 = (RuleCall)cInitialstatesStateCrossReference_7_0.eContents().get(1);
		private final Keyword cFinalKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cFinalstatesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final CrossReference cFinalstatesStateCrossReference_9_0 = (CrossReference)cFinalstatesAssignment_9.eContents().get(0);
		private final RuleCall cFinalstatesStateIDTerminalRuleCall_9_0_1 = (RuleCall)cFinalstatesStateCrossReference_9_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//StateMachine:
		//	'machine' name=ID '{'
		//	events+=Event*
		//	commands+=Command+
		//	states+=State*
		//	'initial' initialstates=[State]
		//	'final' finalstates=[State]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'machine' name=ID '{' events+=Event* commands+=Command+ states+=State* 'initial' initialstates=[State] 'final'
		//finalstates=[State] '}'
		public Group getGroup() { return cGroup; }
		
		//'machine'
		public Keyword getMachineKeyword_0() { return cMachineKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//events+=Event*
		public Assignment getEventsAssignment_3() { return cEventsAssignment_3; }
		
		//Event
		public RuleCall getEventsEventParserRuleCall_3_0() { return cEventsEventParserRuleCall_3_0; }
		
		//commands+=Command+
		public Assignment getCommandsAssignment_4() { return cCommandsAssignment_4; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_4_0() { return cCommandsCommandParserRuleCall_4_0; }
		
		//states+=State*
		public Assignment getStatesAssignment_5() { return cStatesAssignment_5; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_5_0() { return cStatesStateParserRuleCall_5_0; }
		
		//'initial'
		public Keyword getInitialKeyword_6() { return cInitialKeyword_6; }
		
		//initialstates=[State]
		public Assignment getInitialstatesAssignment_7() { return cInitialstatesAssignment_7; }
		
		//[State]
		public CrossReference getInitialstatesStateCrossReference_7_0() { return cInitialstatesStateCrossReference_7_0; }
		
		//ID
		public RuleCall getInitialstatesStateIDTerminalRuleCall_7_0_1() { return cInitialstatesStateIDTerminalRuleCall_7_0_1; }
		
		//'final'
		public Keyword getFinalKeyword_8() { return cFinalKeyword_8; }
		
		//finalstates=[State]
		public Assignment getFinalstatesAssignment_9() { return cFinalstatesAssignment_9; }
		
		//[State]
		public CrossReference getFinalstatesStateCrossReference_9_0() { return cFinalstatesStateCrossReference_9_0; }
		
		//ID
		public RuleCall getFinalstatesStateIDTerminalRuleCall_9_0_1() { return cFinalstatesStateIDTerminalRuleCall_9_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReturnTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cReturnTypeTypeParserRuleCall_0_0 = (RuleCall)cReturnTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTestsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTestsTestParserRuleCall_2_1_0 = (RuleCall)cTestsAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cTestsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cTestsTestParserRuleCall_2_2_1_0 = (RuleCall)cTestsAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Event:
		//	returnType=Type name=ID ('(' tests+=Test (',' tests+=Test)* ')')? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//returnType=Type name=ID ('(' tests+=Test (',' tests+=Test)* ')')? ';'
		public Group getGroup() { return cGroup; }
		
		//returnType=Type
		public Assignment getReturnTypeAssignment_0() { return cReturnTypeAssignment_0; }
		
		//Type
		public RuleCall getReturnTypeTypeParserRuleCall_0_0() { return cReturnTypeTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('(' tests+=Test (',' tests+=Test)* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//tests+=Test
		public Assignment getTestsAssignment_2_1() { return cTestsAssignment_2_1; }
		
		//Test
		public RuleCall getTestsTestParserRuleCall_2_1_0() { return cTestsTestParserRuleCall_2_1_0; }
		
		//(',' tests+=Test)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//tests+=Test
		public Assignment getTestsAssignment_2_2_1() { return cTestsAssignment_2_2_1; }
		
		//Test
		public RuleCall getTestsTestParserRuleCall_2_2_1_0() { return cTestsTestParserRuleCall_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class TestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Test");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypesTypeParserRuleCall_0_0 = (RuleCall)cTypesAssignment_0.eContents().get(0);
		private final Assignment cArgsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArgsDeclaredParameterParserRuleCall_1_0 = (RuleCall)cArgsAssignment_1.eContents().get(0);
		
		//Test:
		//	types+=Type args+=DeclaredParameter;
		@Override public ParserRule getRule() { return rule; }
		
		//types+=Type args+=DeclaredParameter
		public Group getGroup() { return cGroup; }
		
		//types+=Type
		public Assignment getTypesAssignment_0() { return cTypesAssignment_0; }
		
		//Type
		public RuleCall getTypesTypeParserRuleCall_0_0() { return cTypesTypeParserRuleCall_0_0; }
		
		//args+=DeclaredParameter
		public Assignment getArgsAssignment_1() { return cArgsAssignment_1; }
		
		//DeclaredParameter
		public RuleCall getArgsDeclaredParameterParserRuleCall_1_0() { return cArgsDeclaredParameterParserRuleCall_1_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommandKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Command:
		//	'command' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'command' name=ID
		public Group getGroup() { return cGroup; }
		
		//'command'
		public Keyword getCommandKeyword_0() { return cCommandKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ModifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Modifier");
		private final Assignment cVisibilityAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVisibilityVisibilityEnumRuleCall_0 = (RuleCall)cVisibilityAssignment.eContents().get(0);
		
		//Modifier:
		//	visibility+=Visibility;
		@Override public ParserRule getRule() { return rule; }
		
		//visibility+=Visibility
		public Assignment getVisibilityAssignment() { return cVisibilityAssignment; }
		
		//Visibility
		public RuleCall getVisibilityVisibilityEnumRuleCall_0() { return cVisibilityVisibilityEnumRuleCall_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cActionsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cActionsAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cActionsCommandCrossReference_2_2_0 = (CrossReference)cActionsAssignment_2_2.eContents().get(0);
		private final RuleCall cActionsCommandIDTerminalRuleCall_2_2_0_1 = (RuleCall)cActionsCommandCrossReference_2_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cTransitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionsTransitionParserRuleCall_3_0 = (RuleCall)cTransitionsAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//State:
		//	'state' name=ID ('actions' '{' actions+=[Command]+ '}')?
		//	transitions+=Transition*
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'state' name=ID ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition* 'end'
		public Group getGroup() { return cGroup; }
		
		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('actions' '{' actions+=[Command]+ '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'actions'
		public Keyword getActionsKeyword_2_0() { return cActionsKeyword_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1() { return cLeftCurlyBracketKeyword_2_1; }
		
		//actions+=[Command]+
		public Assignment getActionsAssignment_2_2() { return cActionsAssignment_2_2; }
		
		//[Command]
		public CrossReference getActionsCommandCrossReference_2_2_0() { return cActionsCommandCrossReference_2_2_0; }
		
		//ID
		public RuleCall getActionsCommandIDTerminalRuleCall_2_2_0_1() { return cActionsCommandIDTerminalRuleCall_2_2_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_3() { return cTransitionsAssignment_3; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_3_0() { return cTransitionsTransitionParserRuleCall_3_0; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEventEventCrossReference_1_0 = (CrossReference)cEventAssignment_1.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_1_0_1 = (RuleCall)cEventEventCrossReference_1_0.eContents().get(1);
		private final Keyword cThenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cStateStateCrossReference_3_0 = (CrossReference)cStateAssignment_3.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_3_0_1 = (RuleCall)cStateStateCrossReference_3_0.eContents().get(1);
		private final Keyword cIfKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cConditionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cConditionConditionParserRuleCall_5_0 = (RuleCall)cConditionAssignment_5.eContents().get(0);
		
		//Transition:
		//	'on' event=[Event] 'then' state=[State] 'if' condition=Condition?;
		@Override public ParserRule getRule() { return rule; }
		
		//'on' event=[Event] 'then' state=[State] 'if' condition=Condition?
		public Group getGroup() { return cGroup; }
		
		//'on'
		public Keyword getOnKeyword_0() { return cOnKeyword_0; }
		
		//event=[Event]
		public Assignment getEventAssignment_1() { return cEventAssignment_1; }
		
		//[Event]
		public CrossReference getEventEventCrossReference_1_0() { return cEventEventCrossReference_1_0; }
		
		//ID
		public RuleCall getEventEventIDTerminalRuleCall_1_0_1() { return cEventEventIDTerminalRuleCall_1_0_1; }
		
		//'then'
		public Keyword getThenKeyword_2() { return cThenKeyword_2; }
		
		//state=[State]
		public Assignment getStateAssignment_3() { return cStateAssignment_3; }
		
		//[State]
		public CrossReference getStateStateCrossReference_3_0() { return cStateStateCrossReference_3_0; }
		
		//ID
		public RuleCall getStateStateIDTerminalRuleCall_3_0_1() { return cStateStateIDTerminalRuleCall_3_0_1; }
		
		//'if'
		public Keyword getIfKeyword_4() { return cIfKeyword_4; }
		
		//condition=Condition?
		public Assignment getConditionAssignment_5() { return cConditionAssignment_5; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_5_0() { return cConditionConditionParserRuleCall_5_0; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Condition");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Condition:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class DeclaredParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.DeclaredParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameVarNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//DeclaredParameter:
		//	name=VarName (INT '.' INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=VarName (INT '.' INT)?
		public Group getGroup() { return cGroup; }
		
		//name=VarName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//VarName
		public RuleCall getNameVarNameParserRuleCall_0_0() { return cNameVarNameParserRuleCall_0_0; }
		
		//(INT '.' INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_2() { return cINTTerminalRuleCall_1_2; }
	}
	public class VarNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.VarName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVarNameAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueA_VARNAMETerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//VarName:
		//	{VarName} value=A_VARNAME;
		@Override public ParserRule getRule() { return rule; }
		
		//{VarName} value=A_VARNAME
		public Group getGroup() { return cGroup; }
		
		//{VarName}
		public Action getVarNameAction_0() { return cVarNameAction_0; }
		
		//value=A_VARNAME
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//A_VARNAME
		public RuleCall getValueA_VARNAMETerminalRuleCall_1_0() { return cValueA_VARNAMETerminalRuleCall_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cStringTypeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cTypeAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cTypeStringKeyword_0_1_0 = (Keyword)cTypeAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cFloatTypeAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cTypeFloatKeyword_1_1_0 = (Keyword)cTypeAssignment_1_1.eContents().get(0);
		
		//Type:
		//	{StringType} type="String" | {FloatType} type="Float";
		@Override public ParserRule getRule() { return rule; }
		
		//{StringType} type="String" | {FloatType} type="Float"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{StringType} type="String"
		public Group getGroup_0() { return cGroup_0; }
		
		//{StringType}
		public Action getStringTypeAction_0_0() { return cStringTypeAction_0_0; }
		
		//type="String"
		public Assignment getTypeAssignment_0_1() { return cTypeAssignment_0_1; }
		
		//"String"
		public Keyword getTypeStringKeyword_0_1_0() { return cTypeStringKeyword_0_1_0; }
		
		//{FloatType} type="Float"
		public Group getGroup_1() { return cGroup_1; }
		
		//{FloatType}
		public Action getFloatTypeAction_1_0() { return cFloatTypeAction_1_0; }
		
		//type="Float"
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//"Float"
		public Keyword getTypeFloatKeyword_1_1_0() { return cTypeFloatKeyword_1_1_0; }
	}
	
	public class VisibilityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.Visibility");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFinalEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFinalFinalKeyword_0_0 = (Keyword)cFinalEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInitialEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInitialInitialKeyword_1_0 = (Keyword)cInitialEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Visibility:
		//	Final='final' | Initial='initial';
		public EnumRule getRule() { return rule; }
		
		//Final='final' | Initial='initial'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Final='final'
		public EnumLiteralDeclaration getFinalEnumLiteralDeclaration_0() { return cFinalEnumLiteralDeclaration_0; }
		
		//'final'
		public Keyword getFinalFinalKeyword_0_0() { return cFinalFinalKeyword_0_0; }
		
		//Initial='initial'
		public EnumLiteralDeclaration getInitialEnumLiteralDeclaration_1() { return cInitialEnumLiteralDeclaration_1; }
		
		//'initial'
		public Keyword getInitialInitialKeyword_1_0() { return cInitialInitialKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final StateMachineElements pStateMachine;
	private final EventElements pEvent;
	private final TestElements pTest;
	private final CommandElements pCommand;
	private final ModifierElements pModifier;
	private final VisibilityElements eVisibility;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final ConditionElements pCondition;
	private final DeclaredParameterElements pDeclaredParameter;
	private final VarNameElements pVarName;
	private final TerminalRule tA_VARNAME;
	private final TypeElements pType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public StateMachineGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStateMachine = new StateMachineElements();
		this.pEvent = new EventElements();
		this.pTest = new TestElements();
		this.pCommand = new CommandElements();
		this.pModifier = new ModifierElements();
		this.eVisibility = new VisibilityElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pCondition = new ConditionElements();
		this.pDeclaredParameter = new DeclaredParameterElements();
		this.pVarName = new VarNameElements();
		this.tA_VARNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.icam.StateMachine.A_VARNAME");
		this.pType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.icam.StateMachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//model:
	//	statemachine+=StateMachine*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//StateMachine:
	//	'machine' name=ID '{'
	//	events+=Event*
	//	commands+=Command+
	//	states+=State*
	//	'initial' initialstates=[State]
	//	'final' finalstates=[State]
	//	'}';
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}
	
	//Event:
	//	returnType=Type name=ID ('(' tests+=Test (',' tests+=Test)* ')')? ';';
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//Test:
	//	types+=Type args+=DeclaredParameter;
	public TestElements getTestAccess() {
		return pTest;
	}
	
	public ParserRule getTestRule() {
		return getTestAccess().getRule();
	}
	
	//Command:
	//	'command' name=ID;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Modifier:
	//	visibility+=Visibility;
	public ModifierElements getModifierAccess() {
		return pModifier;
	}
	
	public ParserRule getModifierRule() {
		return getModifierAccess().getRule();
	}
	
	//enum Visibility:
	//	Final='final' | Initial='initial';
	public VisibilityElements getVisibilityAccess() {
		return eVisibility;
	}
	
	public EnumRule getVisibilityRule() {
		return getVisibilityAccess().getRule();
	}
	
	//State:
	//	'state' name=ID ('actions' '{' actions+=[Command]+ '}')?
	//	transitions+=Transition*
	//	'end';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	'on' event=[Event] 'then' state=[State] 'if' condition=Condition?;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Condition:
	//	name=ID;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//DeclaredParameter:
	//	name=VarName (INT '.' INT)?;
	public DeclaredParameterElements getDeclaredParameterAccess() {
		return pDeclaredParameter;
	}
	
	public ParserRule getDeclaredParameterRule() {
		return getDeclaredParameterAccess().getRule();
	}
	
	//VarName:
	//	{VarName} value=A_VARNAME;
	public VarNameElements getVarNameAccess() {
		return pVarName;
	}
	
	public ParserRule getVarNameRule() {
		return getVarNameAccess().getRule();
	}
	
	//terminal A_VARNAME:
	//	'a'..'z' 'a'..'z'+;
	public TerminalRule getA_VARNAMERule() {
		return tA_VARNAME;
	}
	
	//Type:
	//	{StringType} type="String" | {FloatType} type="Float";
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

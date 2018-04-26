/*
 * generated by Xtext 2.12.0
 */
grammar InternalStateMachine;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.icam.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.icam.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.icam.services.StateMachineGrammarAccess;

}

@parser::members {

 	private StateMachineGrammarAccess grammarAccess;

    public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "model";
   	}

   	@Override
   	protected StateMachineGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulemodel
entryRulemodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_rulemodel=rulemodel
	{ $current=$iv_rulemodel.current; }
	EOF;

// Rule model
rulemodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getStatemachineStateMachineParserRuleCall_0());
			}
			lv_statemachine_0_0=ruleStateMachine
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"statemachine",
					lv_statemachine_0_0,
					"org.xtext.icam.StateMachine.StateMachine");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	iv_ruleStateMachine=ruleStateMachine
	{ $current=$iv_ruleStateMachine.current; }
	EOF;

// Rule StateMachine
ruleStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='machine'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getMachineKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_3_0());
				}
				lv_events_3_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"events",
						lv_events_3_0,
						"org.xtext.icam.StateMachine.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getCommandsCommandParserRuleCall_4_0());
				}
				lv_commands_4_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"commands",
						lv_commands_4_0,
						"org.xtext.icam.StateMachine.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0());
				}
				lv_states_5_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"states",
						lv_states_5_0,
						"org.xtext.icam.StateMachine.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='initial'
		{
			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getInitialKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getInitialeventsStateCrossReference_7_0());
				}
			)
		)
		otherlv_8='final'
		{
			newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getFinalKeyword_8());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
				}
				otherlv_9=RULE_ID
				{
					newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getFinaleventsStateCrossReference_9_0());
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='event'
		{
			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='command'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommandRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleModifier
entryRuleModifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModifierRule()); }
	iv_ruleModifier=ruleModifier
	{ $current=$iv_ruleModifier.current; }
	EOF;

// Rule Modifier
ruleModifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModifierAccess().getVisibilityVisibilityEnumRuleCall_0());
			}
			lv_visibility_0_0=ruleVisibility
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModifierRule());
				}
				add(
					$current,
					"visibility",
					lv_visibility_0_0,
					"org.xtext.icam.StateMachine.Visibility");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getModifierModifierParserRuleCall_0_0());
				}
				lv_modifier_0_0=ruleModifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"modifier",
						lv_modifier_0_0,
						"org.xtext.icam.StateMachine.Modifier");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='actions'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getStateAccess().getActionsCommandCrossReference_3_2_0());
					}
				)
			)+
			otherlv_6='}'
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
				}
				lv_transitions_7_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_7_0,
						"org.xtext.icam.StateMachine.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='end'
		{
			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEndKeyword_5());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='on'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOnKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0());
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getThenKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
				}
			)
		)
		otherlv_4='if'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getIfKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5());
		}
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Rule Visibility
ruleVisibility returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='final'
			{
				$current = grammarAccess.getVisibilityAccess().getFinalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getFinalEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='initial'
			{
				$current = grammarAccess.getVisibilityAccess().getInitialEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getInitialEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
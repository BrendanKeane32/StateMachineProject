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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_A_VARNAME", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'initial'", "'final'", "'}'", "'('", "','", "')'", "';'", "'command'", "'state'", "'actions'", "'end'", "'on'", "'then'", "'if'", "'.'", "'String'", "'Float'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int RULE_A_VARNAME=6;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



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




    // $ANTLR start "entryRulemodel"
    // InternalStateMachine.g:65:1: entryRulemodel returns [EObject current=null] : iv_rulemodel= rulemodel EOF ;
    public final EObject entryRulemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodel = null;


        try {
            // InternalStateMachine.g:65:46: (iv_rulemodel= rulemodel EOF )
            // InternalStateMachine.g:66:2: iv_rulemodel= rulemodel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemodel=rulemodel();

            state._fsp--;

             current =iv_rulemodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodel"


    // $ANTLR start "rulemodel"
    // InternalStateMachine.g:72:1: rulemodel returns [EObject current=null] : ( (lv_statemachine_0_0= ruleStateMachine ) )* ;
    public final EObject rulemodel() throws RecognitionException {
        EObject current = null;

        EObject lv_statemachine_0_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:78:2: ( ( (lv_statemachine_0_0= ruleStateMachine ) )* )
            // InternalStateMachine.g:79:2: ( (lv_statemachine_0_0= ruleStateMachine ) )*
            {
            // InternalStateMachine.g:79:2: ( (lv_statemachine_0_0= ruleStateMachine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachine.g:80:3: (lv_statemachine_0_0= ruleStateMachine )
            	    {
            	    // InternalStateMachine.g:80:3: (lv_statemachine_0_0= ruleStateMachine )
            	    // InternalStateMachine.g:81:4: lv_statemachine_0_0= ruleStateMachine
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatemachineStateMachineParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statemachine_0_0=ruleStateMachine();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statemachine",
            	    					lv_statemachine_0_0,
            	    					"org.xtext.icam.StateMachine.StateMachine");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodel"


    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:101:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:101:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:102:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:108:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_commands_4_0= ruleCommand ) )+ ( (lv_states_5_0= ruleState ) )* otherlv_6= 'initial' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'final' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_events_3_0 = null;

        EObject lv_commands_4_0 = null;

        EObject lv_states_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:114:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_commands_4_0= ruleCommand ) )+ ( (lv_states_5_0= ruleState ) )* otherlv_6= 'initial' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'final' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalStateMachine.g:115:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_commands_4_0= ruleCommand ) )+ ( (lv_states_5_0= ruleState ) )* otherlv_6= 'initial' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'final' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalStateMachine.g:115:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_commands_4_0= ruleCommand ) )+ ( (lv_states_5_0= ruleState ) )* otherlv_6= 'initial' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'final' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalStateMachine.g:116:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* ( (lv_commands_4_0= ruleCommand ) )+ ( (lv_states_5_0= ruleState ) )* otherlv_6= 'initial' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'final' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getMachineKeyword_0());
            		
            // InternalStateMachine.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:142:3: ( (lv_events_3_0= ruleEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=29 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateMachine.g:143:4: (lv_events_3_0= ruleEvent )
            	    {
            	    // InternalStateMachine.g:143:4: (lv_events_3_0= ruleEvent )
            	    // InternalStateMachine.g:144:5: lv_events_3_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_3_0,
            	    						"org.xtext.icam.StateMachine.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalStateMachine.g:161:3: ( (lv_commands_4_0= ruleCommand ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachine.g:162:4: (lv_commands_4_0= ruleCommand )
            	    {
            	    // InternalStateMachine.g:162:4: (lv_commands_4_0= ruleCommand )
            	    // InternalStateMachine.g:163:5: lv_commands_4_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getCommandsCommandParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_commands_4_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_4_0,
            	    						"org.xtext.icam.StateMachine.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalStateMachine.g:180:3: ( (lv_states_5_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachine.g:181:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalStateMachine.g:181:4: (lv_states_5_0= ruleState )
            	    // InternalStateMachine.g:182:5: lv_states_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"org.xtext.icam.StateMachine.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getInitialKeyword_6());
            		
            // InternalStateMachine.g:203:3: ( (otherlv_7= RULE_ID ) )
            // InternalStateMachine.g:204:4: (otherlv_7= RULE_ID )
            {
            // InternalStateMachine.g:204:4: (otherlv_7= RULE_ID )
            // InternalStateMachine.g:205:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getInitialstatesStateCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getFinalKeyword_8());
            		
            // InternalStateMachine.g:220:3: ( (otherlv_9= RULE_ID ) )
            // InternalStateMachine.g:221:4: (otherlv_9= RULE_ID )
            {
            // InternalStateMachine.g:221:4: (otherlv_9= RULE_ID )
            // InternalStateMachine.g:222:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getFinalstatesStateCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEvent"
    // InternalStateMachine.g:241:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachine.g:241:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachine.g:242:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStateMachine.g:248:1: ruleEvent returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_returnType_0_0 = null;

        EObject lv_tests_3_0 = null;

        EObject lv_tests_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:254:2: ( ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) )
            // InternalStateMachine.g:255:2: ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            {
            // InternalStateMachine.g:255:2: ( ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            // InternalStateMachine.g:256:3: ( (lv_returnType_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')' )? otherlv_7= ';'
            {
            // InternalStateMachine.g:256:3: ( (lv_returnType_0_0= ruleType ) )
            // InternalStateMachine.g:257:4: (lv_returnType_0_0= ruleType )
            {
            // InternalStateMachine.g:257:4: (lv_returnType_0_0= ruleType )
            // InternalStateMachine.g:258:5: lv_returnType_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEventAccess().getReturnTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_returnType_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"org.xtext.icam.StateMachine.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:276:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:293:3: (otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:294:4: otherlv_2= '(' ( (lv_tests_3_0= ruleTest ) ) (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalStateMachine.g:298:4: ( (lv_tests_3_0= ruleTest ) )
                    // InternalStateMachine.g:299:5: (lv_tests_3_0= ruleTest )
                    {
                    // InternalStateMachine.g:299:5: (lv_tests_3_0= ruleTest )
                    // InternalStateMachine.g:300:6: lv_tests_3_0= ruleTest
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTestsTestParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_tests_3_0=ruleTest();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"tests",
                    							lv_tests_3_0,
                    							"org.xtext.icam.StateMachine.Test");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:317:4: (otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachine.g:318:5: otherlv_4= ',' ( (lv_tests_5_0= ruleTest ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEventAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalStateMachine.g:322:5: ( (lv_tests_5_0= ruleTest ) )
                    	    // InternalStateMachine.g:323:6: (lv_tests_5_0= ruleTest )
                    	    {
                    	    // InternalStateMachine.g:323:6: (lv_tests_5_0= ruleTest )
                    	    // InternalStateMachine.g:324:7: lv_tests_5_0= ruleTest
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getTestsTestParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_tests_5_0=ruleTest();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tests",
                    	    								lv_tests_5_0,
                    	    								"org.xtext.icam.StateMachine.Test");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEventAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTest"
    // InternalStateMachine.g:355:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalStateMachine.g:355:45: (iv_ruleTest= ruleTest EOF )
            // InternalStateMachine.g:356:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalStateMachine.g:362:1: ruleTest returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) ) ( (lv_args_1_0= ruleDeclaredParameter ) ) ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:368:2: ( ( ( (lv_types_0_0= ruleType ) ) ( (lv_args_1_0= ruleDeclaredParameter ) ) ) )
            // InternalStateMachine.g:369:2: ( ( (lv_types_0_0= ruleType ) ) ( (lv_args_1_0= ruleDeclaredParameter ) ) )
            {
            // InternalStateMachine.g:369:2: ( ( (lv_types_0_0= ruleType ) ) ( (lv_args_1_0= ruleDeclaredParameter ) ) )
            // InternalStateMachine.g:370:3: ( (lv_types_0_0= ruleType ) ) ( (lv_args_1_0= ruleDeclaredParameter ) )
            {
            // InternalStateMachine.g:370:3: ( (lv_types_0_0= ruleType ) )
            // InternalStateMachine.g:371:4: (lv_types_0_0= ruleType )
            {
            // InternalStateMachine.g:371:4: (lv_types_0_0= ruleType )
            // InternalStateMachine.g:372:5: lv_types_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTestAccess().getTypesTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_types_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_0_0,
            						"org.xtext.icam.StateMachine.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:389:3: ( (lv_args_1_0= ruleDeclaredParameter ) )
            // InternalStateMachine.g:390:4: (lv_args_1_0= ruleDeclaredParameter )
            {
            // InternalStateMachine.g:390:4: (lv_args_1_0= ruleDeclaredParameter )
            // InternalStateMachine.g:391:5: lv_args_1_0= ruleDeclaredParameter
            {

            					newCompositeNode(grammarAccess.getTestAccess().getArgsDeclaredParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleDeclaredParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					add(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.icam.StateMachine.DeclaredParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleCommand"
    // InternalStateMachine.g:412:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalStateMachine.g:412:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalStateMachine.g:413:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalStateMachine.g:419:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:425:2: ( (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateMachine.g:426:2: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateMachine.g:426:2: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateMachine.g:427:3: otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalStateMachine.g:431:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:432:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:432:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:433:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:453:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:453:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:454:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:460:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:466:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // InternalStateMachine.g:467:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // InternalStateMachine.g:467:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // InternalStateMachine.g:468:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachine.g:472:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:473:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:473:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:474:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:490:3: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:491:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalStateMachine.g:499:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStateMachine.g:500:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalStateMachine.g:500:5: (otherlv_4= RULE_ID )
                    	    // InternalStateMachine.g:501:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:517:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStateMachine.g:518:4: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:518:4: (lv_transitions_6_0= ruleTransition )
            	    // InternalStateMachine.g:519:5: lv_transitions_6_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_6_0,
            	    						"org.xtext.icam.StateMachine.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:544:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:544:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:545:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:551:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' ( (lv_condition_5_0= ruleCondition ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_condition_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:557:2: ( (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' ( (lv_condition_5_0= ruleCondition ) )? ) )
            // InternalStateMachine.g:558:2: (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' ( (lv_condition_5_0= ruleCondition ) )? )
            {
            // InternalStateMachine.g:558:2: (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' ( (lv_condition_5_0= ruleCondition ) )? )
            // InternalStateMachine.g:559:3: otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' ( (lv_condition_5_0= ruleCondition ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOnKeyword_0());
            		
            // InternalStateMachine.g:563:3: ( (otherlv_1= RULE_ID ) )
            // InternalStateMachine.g:564:4: (otherlv_1= RULE_ID )
            {
            // InternalStateMachine.g:564:4: (otherlv_1= RULE_ID )
            // InternalStateMachine.g:565:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getThenKeyword_2());
            		
            // InternalStateMachine.g:580:3: ( (otherlv_3= RULE_ID ) )
            // InternalStateMachine.g:581:4: (otherlv_3= RULE_ID )
            {
            // InternalStateMachine.g:581:4: (otherlv_3= RULE_ID )
            // InternalStateMachine.g:582:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getIfKeyword_4());
            		
            // InternalStateMachine.g:597:3: ( (lv_condition_5_0= ruleCondition ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachine.g:598:4: (lv_condition_5_0= ruleCondition )
                    {
                    // InternalStateMachine.g:598:4: (lv_condition_5_0= ruleCondition )
                    // InternalStateMachine.g:599:5: lv_condition_5_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_5_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_5_0,
                    						"org.xtext.icam.StateMachine.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCondition"
    // InternalStateMachine.g:620:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalStateMachine.g:620:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalStateMachine.g:621:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalStateMachine.g:627:1: ruleCondition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:633:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachine.g:634:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachine.g:634:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:635:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:635:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:636:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConditionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalStateMachine.g:655:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // InternalStateMachine.g:655:58: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // InternalStateMachine.g:656:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;

             current =iv_ruleDeclaredParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalStateMachine.g:662:1: ruleDeclaredParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleVarName ) ) (this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT )? ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:668:2: ( ( ( (lv_name_0_0= ruleVarName ) ) (this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT )? ) )
            // InternalStateMachine.g:669:2: ( ( (lv_name_0_0= ruleVarName ) ) (this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT )? )
            {
            // InternalStateMachine.g:669:2: ( ( (lv_name_0_0= ruleVarName ) ) (this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT )? )
            // InternalStateMachine.g:670:3: ( (lv_name_0_0= ruleVarName ) ) (this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT )?
            {
            // InternalStateMachine.g:670:3: ( (lv_name_0_0= ruleVarName ) )
            // InternalStateMachine.g:671:4: (lv_name_0_0= ruleVarName )
            {
            // InternalStateMachine.g:671:4: (lv_name_0_0= ruleVarName )
            // InternalStateMachine.g:672:5: lv_name_0_0= ruleVarName
            {

            					newCompositeNode(grammarAccess.getDeclaredParameterAccess().getNameVarNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleVarName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclaredParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.icam.StateMachine.VarName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:689:3: (this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStateMachine.g:690:4: this_INT_1= RULE_INT otherlv_2= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				newLeafNode(this_INT_1, grammarAccess.getDeclaredParameterAccess().getINTTerminalRuleCall_1_0());
                    			
                    otherlv_2=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclaredParameterAccess().getFullStopKeyword_1_1());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_3, grammarAccess.getDeclaredParameterAccess().getINTTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleVarName"
    // InternalStateMachine.g:707:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalStateMachine.g:707:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalStateMachine.g:708:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalStateMachine.g:714:1: ruleVarName returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_A_VARNAME ) ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:720:2: ( ( () ( (lv_value_1_0= RULE_A_VARNAME ) ) ) )
            // InternalStateMachine.g:721:2: ( () ( (lv_value_1_0= RULE_A_VARNAME ) ) )
            {
            // InternalStateMachine.g:721:2: ( () ( (lv_value_1_0= RULE_A_VARNAME ) ) )
            // InternalStateMachine.g:722:3: () ( (lv_value_1_0= RULE_A_VARNAME ) )
            {
            // InternalStateMachine.g:722:3: ()
            // InternalStateMachine.g:723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarNameAccess().getVarNameAction_0(),
            					current);
            			

            }

            // InternalStateMachine.g:729:3: ( (lv_value_1_0= RULE_A_VARNAME ) )
            // InternalStateMachine.g:730:4: (lv_value_1_0= RULE_A_VARNAME )
            {
            // InternalStateMachine.g:730:4: (lv_value_1_0= RULE_A_VARNAME )
            // InternalStateMachine.g:731:5: lv_value_1_0= RULE_A_VARNAME
            {
            lv_value_1_0=(Token)match(input,RULE_A_VARNAME,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getVarNameAccess().getValueA_VARNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.icam.StateMachine.A_VARNAME");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleType"
    // InternalStateMachine.g:751:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalStateMachine.g:751:45: (iv_ruleType= ruleType EOF )
            // InternalStateMachine.g:752:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalStateMachine.g:758:1: ruleType returns [EObject current=null] : ( ( () ( (lv_type_1_0= 'String' ) ) ) | ( () ( (lv_type_3_0= 'Float' ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:764:2: ( ( ( () ( (lv_type_1_0= 'String' ) ) ) | ( () ( (lv_type_3_0= 'Float' ) ) ) ) )
            // InternalStateMachine.g:765:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) | ( () ( (lv_type_3_0= 'Float' ) ) ) )
            {
            // InternalStateMachine.g:765:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) | ( () ( (lv_type_3_0= 'Float' ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateMachine.g:766:3: ( () ( (lv_type_1_0= 'String' ) ) )
                    {
                    // InternalStateMachine.g:766:3: ( () ( (lv_type_1_0= 'String' ) ) )
                    // InternalStateMachine.g:767:4: () ( (lv_type_1_0= 'String' ) )
                    {
                    // InternalStateMachine.g:767:4: ()
                    // InternalStateMachine.g:768:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:774:4: ( (lv_type_1_0= 'String' ) )
                    // InternalStateMachine.g:775:5: (lv_type_1_0= 'String' )
                    {
                    // InternalStateMachine.g:775:5: (lv_type_1_0= 'String' )
                    // InternalStateMachine.g:776:6: lv_type_1_0= 'String'
                    {
                    lv_type_1_0=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_type_1_0, grammarAccess.getTypeAccess().getTypeStringKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_0, "String");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:790:3: ( () ( (lv_type_3_0= 'Float' ) ) )
                    {
                    // InternalStateMachine.g:790:3: ( () ( (lv_type_3_0= 'Float' ) ) )
                    // InternalStateMachine.g:791:4: () ( (lv_type_3_0= 'Float' ) )
                    {
                    // InternalStateMachine.g:791:4: ()
                    // InternalStateMachine.g:792:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getFloatTypeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalStateMachine.g:798:4: ( (lv_type_3_0= 'Float' ) )
                    // InternalStateMachine.g:799:5: (lv_type_3_0= 'Float' )
                    {
                    // InternalStateMachine.g:799:5: (lv_type_3_0= 'Float' )
                    // InternalStateMachine.g:800:6: lv_type_3_0= 'Float'
                    {
                    lv_type_3_0=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getTypeAccess().getTypeFloatKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_0, "Float");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleVisibility"
    // InternalStateMachine.g:817:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:823:2: ( ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) ) )
            // InternalStateMachine.g:824:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) )
            {
            // InternalStateMachine.g:824:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachine.g:825:3: (enumLiteral_0= 'final' )
                    {
                    // InternalStateMachine.g:825:3: (enumLiteral_0= 'final' )
                    // InternalStateMachine.g:826:4: enumLiteral_0= 'final'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getFinalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getFinalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:833:3: (enumLiteral_1= 'initial' )
                    {
                    // InternalStateMachine.g:833:3: (enumLiteral_1= 'initial' )
                    // InternalStateMachine.g:834:4: enumLiteral_1= 'initial'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getInitialEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getInitialEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060604000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});

}
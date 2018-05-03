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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'initial'", "'final'", "'}'", "'event'", "'command'", "'state'", "'actions'", "'end'", "'on'", "'then'", "'if'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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

                if ( (LA1_0==11) ) {
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
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:142:3: ( (lv_events_3_0= ruleEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
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

                if ( (LA3_0==17) ) {
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

                if ( (LA4_0==13) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==18) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==14||LA4_0==18) ) {
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

            otherlv_6=(Token)match(input,13,FOLLOW_4); 

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

            otherlv_8=(Token)match(input,14,FOLLOW_4); 

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

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

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
    // InternalStateMachine.g:248:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:254:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateMachine.g:255:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateMachine.g:255:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateMachine.g:256:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalStateMachine.g:260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:261:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:262:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCommand"
    // InternalStateMachine.g:282:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalStateMachine.g:282:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalStateMachine.g:283:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalStateMachine.g:289:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:295:2: ( (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateMachine.g:296:2: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateMachine.g:296:2: (otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateMachine.g:297:3: otherlv_0= 'command' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getCommandKeyword_0());
            		
            // InternalStateMachine.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:303:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleModifier"
    // InternalStateMachine.g:323:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // InternalStateMachine.g:323:49: (iv_ruleModifier= ruleModifier EOF )
            // InternalStateMachine.g:324:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalStateMachine.g:330:1: ruleModifier returns [EObject current=null] : ( (lv_visibility_0_0= ruleVisibility ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:336:2: ( ( (lv_visibility_0_0= ruleVisibility ) ) )
            // InternalStateMachine.g:337:2: ( (lv_visibility_0_0= ruleVisibility ) )
            {
            // InternalStateMachine.g:337:2: ( (lv_visibility_0_0= ruleVisibility ) )
            // InternalStateMachine.g:338:3: (lv_visibility_0_0= ruleVisibility )
            {
            // InternalStateMachine.g:338:3: (lv_visibility_0_0= ruleVisibility )
            // InternalStateMachine.g:339:4: lv_visibility_0_0= ruleVisibility
            {

            				newCompositeNode(grammarAccess.getModifierAccess().getVisibilityVisibilityEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_visibility_0_0=ruleVisibility();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModifierRule());
            				}
            				add(
            					current,
            					"visibility",
            					lv_visibility_0_0,
            					"org.xtext.icam.StateMachine.Visibility");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:359:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:359:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:360:2: iv_ruleState= ruleState EOF
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
    // InternalStateMachine.g:366:1: ruleState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModifier ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_modifier_0_0 = null;

        EObject lv_transitions_7_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:372:2: ( ( ( (lv_modifier_0_0= ruleModifier ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' ) )
            // InternalStateMachine.g:373:2: ( ( (lv_modifier_0_0= ruleModifier ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' )
            {
            // InternalStateMachine.g:373:2: ( ( (lv_modifier_0_0= ruleModifier ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end' )
            // InternalStateMachine.g:374:3: ( (lv_modifier_0_0= ruleModifier ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? ( (lv_transitions_7_0= ruleTransition ) )* otherlv_8= 'end'
            {
            // InternalStateMachine.g:374:3: ( (lv_modifier_0_0= ruleModifier ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:375:4: (lv_modifier_0_0= ruleModifier )
                    {
                    // InternalStateMachine.g:375:4: (lv_modifier_0_0= ruleModifier )
                    // InternalStateMachine.g:376:5: lv_modifier_0_0= ruleModifier
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getModifierModifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_modifier_0_0=ruleModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					add(
                    						current,
                    						"modifier",
                    						lv_modifier_0_0,
                    						"org.xtext.icam.StateMachine.Modifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalStateMachine.g:397:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStateMachine.g:398:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStateMachine.g:398:4: (lv_name_2_0= RULE_ID )
            // InternalStateMachine.g:399:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:415:3: (otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:416:4: otherlv_3= 'actions' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalStateMachine.g:424:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStateMachine.g:425:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalStateMachine.g:425:5: (otherlv_5= RULE_ID )
                    	    // InternalStateMachine.g:426:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getStateAccess().getActionsCommandCrossReference_3_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:442:3: ( (lv_transitions_7_0= ruleTransition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStateMachine.g:443:4: (lv_transitions_7_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:443:4: (lv_transitions_7_0= ruleTransition )
            	    // InternalStateMachine.g:444:5: lv_transitions_7_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_transitions_7_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_7_0,
            	    						"org.xtext.icam.StateMachine.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getEndKeyword_5());
            		

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
    // InternalStateMachine.g:469:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:469:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:470:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateMachine.g:476:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' otherlv_5= '(' otherlv_6= ')' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalStateMachine.g:482:2: ( (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' otherlv_5= '(' otherlv_6= ')' ) )
            // InternalStateMachine.g:483:2: (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' otherlv_5= '(' otherlv_6= ')' )
            {
            // InternalStateMachine.g:483:2: (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' otherlv_5= '(' otherlv_6= ')' )
            // InternalStateMachine.g:484:3: otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'then' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'if' otherlv_5= '(' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOnKeyword_0());
            		
            // InternalStateMachine.g:488:3: ( (otherlv_1= RULE_ID ) )
            // InternalStateMachine.g:489:4: (otherlv_1= RULE_ID )
            {
            // InternalStateMachine.g:489:4: (otherlv_1= RULE_ID )
            // InternalStateMachine.g:490:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getThenKeyword_2());
            		
            // InternalStateMachine.g:505:3: ( (otherlv_3= RULE_ID ) )
            // InternalStateMachine.g:506:4: (otherlv_3= RULE_ID )
            {
            // InternalStateMachine.g:506:4: (otherlv_3= RULE_ID )
            // InternalStateMachine.g:507:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getIfKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "ruleVisibility"
    // InternalStateMachine.g:534:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:540:2: ( ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) ) )
            // InternalStateMachine.g:541:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) )
            {
            // InternalStateMachine.g:541:2: ( (enumLiteral_0= 'final' ) | (enumLiteral_1= 'initial' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:542:3: (enumLiteral_0= 'final' )
                    {
                    // InternalStateMachine.g:542:3: (enumLiteral_0= 'final' )
                    // InternalStateMachine.g:543:4: enumLiteral_0= 'final'
                    {
                    enumLiteral_0=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getFinalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getFinalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:550:3: (enumLiteral_1= 'initial' )
                    {
                    // InternalStateMachine.g:550:3: (enumLiteral_1= 'initial' )
                    // InternalStateMachine.g:551:4: enumLiteral_1= 'initial'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}
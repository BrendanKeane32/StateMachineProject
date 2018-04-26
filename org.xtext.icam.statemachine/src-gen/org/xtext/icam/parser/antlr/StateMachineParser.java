/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.icam.parser.antlr.internal.InternalStateMachineParser;
import org.xtext.icam.services.StateMachineGrammarAccess;

public class StateMachineParser extends AbstractAntlrParser {

	@Inject
	private StateMachineGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStateMachineParser createParser(XtextTokenStream stream) {
		return new InternalStateMachineParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "model";
	}

	public StateMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

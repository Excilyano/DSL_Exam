/*
* generated by Xtext
*/
package fr.imta.dsl.evaluation.exe1.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.imta.dsl.evaluation.exe1.services.Exe1GrammarAccess;

public class Exe1Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Exe1GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.imta.dsl.evaluation.exe1.parser.antlr.internal.InternalExe1Parser createParser(XtextTokenStream stream) {
		return new fr.imta.dsl.evaluation.exe1.parser.antlr.internal.InternalExe1Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public Exe1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Exe1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

/*
* generated by Xtext
*/
package fr.imta.dsl.evaluation.exe1.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Exe1AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/imta/dsl/evaluation/exe1/parser/antlr/internal/InternalExe1.tokens");
	}
}

/*
 * generated by Xtext
 */
package fr.imta.dsl.evaluation.exe1.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractExe1Validator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.imta.dsl.evaluation.exe1.exe1.Exe1Package.eINSTANCE);
		return result;
	}
}
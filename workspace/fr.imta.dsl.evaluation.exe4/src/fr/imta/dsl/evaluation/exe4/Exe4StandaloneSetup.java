/*
* generated by Xtext
*/
package fr.imta.dsl.evaluation.exe4;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Exe4StandaloneSetup extends Exe4StandaloneSetupGenerated{

	public static void doSetup() {
		new Exe4StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


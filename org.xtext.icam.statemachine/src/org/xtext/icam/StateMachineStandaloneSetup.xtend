/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StateMachineStandaloneSetup extends StateMachineStandaloneSetupGenerated {

	def static void doSetup() {
		new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
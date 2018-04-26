/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.icam.StateMachineRuntimeModule
import org.xtext.icam.StateMachineStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class StateMachineIdeSetup extends StateMachineStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new StateMachineRuntimeModule, new StateMachineIdeModule))
	}
	
}
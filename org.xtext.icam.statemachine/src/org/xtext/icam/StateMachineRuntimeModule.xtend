/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class StateMachineRuntimeModule extends AbstractStateMachineRuntimeModule {
	
	def protected getFileExtensions() {
		'sm'
	}
	
	def protected getLanguageName() {
		'org.xtext.icam.StateMachine'
	}
	
	override bindIQualifiedNameProvider() {
		DefaultDeclarativeQualifiedNameProvider
	}
}

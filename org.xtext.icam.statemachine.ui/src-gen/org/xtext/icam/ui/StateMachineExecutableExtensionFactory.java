/*
 * generated by Xtext 2.12.0
 */
package org.xtext.icam.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.icam.statemachine.ui.internal.StatemachineActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StateMachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StatemachineActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StatemachineActivator.getInstance().getInjector(StatemachineActivator.ORG_XTEXT_ICAM_STATEMACHINE);
	}
	
}

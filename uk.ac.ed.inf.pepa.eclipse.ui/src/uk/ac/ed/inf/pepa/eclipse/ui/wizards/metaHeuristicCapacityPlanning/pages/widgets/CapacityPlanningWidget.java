package uk.ac.ed.inf.pepa.eclipse.ui.wizards.metaHeuristicCapacityPlanning.pages.widgets;

import uk.ac.ed.inf.pepa.eclipse.ui.dialogs.IValidationCallback;

public abstract class CapacityPlanningWidget {
	
	protected IValidationCallback cb;
	protected String value;
	protected String key;
	
	
	public CapacityPlanningWidget(String key, String value, IValidationCallback cb) {
		this.key = key;
		this.value = value;
		this.cb = cb;
	
	}
	
	public abstract boolean isValid();

	public abstract void setValue();
}

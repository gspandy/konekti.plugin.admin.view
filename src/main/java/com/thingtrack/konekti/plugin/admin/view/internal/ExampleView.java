package com.thingtrack.konekti.plugin.admin.view.internal;


import com.thingtrack.konekti.domain.kernel.exception.KonektiException;
import com.thingtrack.konekti.domain.ui.IPageLayout;
import com.thingtrack.konekti.domain.ui.IViewDescriptor;
import com.vaadin.ui.AbstractComponentContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class ExampleView implements IViewDescriptor {

	@Override
	public AbstractComponentContainer createView() throws KonektiException {
		
		Layout layout = new VerticalLayout();
		
		Button button = new Button("Button Example");
		
		button.addListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
//				button.getApplication().getMainWindow().showNotification("Test!");
			}
		});
		layout.addComponent(button);
		return (AbstractComponentContainer) layout;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId() {
		return "konekti.plugin.admin.view.example";
	}

	@Override
	public String getIcon() {
		return null;
	}

	@Override
	public String getLabel() {
		return "Example view";
	}

	@Override
	public String getToolTip() {
		return getLabel();
	}

	@Override
	public boolean getAllowMultiple() {
		return false;
	}

	@Override
	public int getLocation() {
		return IPageLayout.CENTER;
	}

	@Override
	public boolean getMoveable() {
		return false;
	}

	@Override
	public boolean getCloseable() {
		return true;
	}

}

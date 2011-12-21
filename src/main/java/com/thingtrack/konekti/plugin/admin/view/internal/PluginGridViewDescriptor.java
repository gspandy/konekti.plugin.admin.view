/*******************************************************************************
 * Copyright 2011 Thingtrack
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.thingtrack.konekti.plugin.admin.view.internal;


import com.thingtrack.konekti.domain.kernel.exception.KonektiException;
import com.thingtrack.konekti.domain.ui.IPageLayout;
import com.thingtrack.konekti.domain.ui.IViewDescriptor;
import com.vaadin.ui.AbstractComponentContainer;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

public class PluginGridViewDescriptor implements IViewDescriptor {

	public String getDescription() {
		return "Listar los plugins instalados en la plataforma";
	}

	public String getId() {
		return "konekti-plugin-admin-view-plugin-grid";
	}

	public String getIcon() {
		return null;
	}

	public String getLabel() {
		return "Consola de plugins";
	}

	public String getToolTip() {
		return "Listar los plugins instalados en la plataforma";
	}

	public boolean getAllowMultiple() {
		return false;
	}

	public int getLocation() {
		return IPageLayout.CENTER;
	}

	public boolean getMoveable() {
		return false;
	}

	public boolean getCloseable() {
		return false;
	}

	public AbstractComponentContainer createView() throws KonektiException  {
		
		Layout layout = new VerticalLayout();
		Label label = new Label("Esto es la vista para visualizar los plugins instalados");
		layout.addComponent(label);
		
		return (AbstractComponentContainer) layout;
		
	}

}

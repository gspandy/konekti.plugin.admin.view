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
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

public class UserGridViewDescriptor implements IViewDescriptor {

	public void createView(Layout viewlayout) throws KonektiException {
		
		Label label = new Label("Esto es la vista para visualizar los usuarios dados de alta");
		viewlayout.addComponent(label);
	}

	public String getDescription() {
		return "Gestion de los usuarios dados de alta";
	}

	public String getId() {
		return "konekti-plugin-admin-view-user-grid";
	}

	public Object getIcon() {
		return null;
	}

	public String getLabel() {
		return "Consola de usuarios";
	}

	public String getToolTip() {
		return "Gestion de los usuarios dados de alta";
	}

	public boolean getAllowMultiple() {
		return false;
	}

	public int getLocation() {
		return IPageLayout.RIGHT;
	}

	public boolean getMoveable() {
		return false;
	}

	public boolean getCloseable() {
		return false;
	}

}

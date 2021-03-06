/*******************************************************************************
 * Copyright (c) 2010 Oak Ridge National Laboratory.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package org.eclipse.nebula.visualization.internal.widgets.introspection;

import org.eclipse.nebula.visualization.widgets.figures.AbstractScaledWidgetFigure;

/**The introspector for widget inherited from {@link AbstractScaledWidgetFigure}.
 * @author Xihui Chen
 *
 */
public class ScaleWidgetIntrospector extends DefaultWidgetIntrospector {
	public static String[] SCALE_WIDGET_NON_PROPERTIES = new String[]{
		"scale",
		"opaque"
	};
	@Override
	public String[] getNonProperties() {
	
		return concatenateStringArrays(super.getNonProperties(), SCALE_WIDGET_NON_PROPERTIES);
	}
	
}

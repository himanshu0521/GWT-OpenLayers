/**
 * 
 */
package com.eg.gwt.openLayers.client.geometry;

import com.eg.gwt.openLayers.client.JSObject;

/**
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class LinearRingImpl {

    public static native JSObject create(JSObject points)/*-{
        return new $wnd.com.eg.gwt.openLayers.client.relay.createLinearRing(points);
    }-*/;
}

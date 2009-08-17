package org.gwtopenmaps.openlayers.client;

import org.gwtopenmaps.openlayers.client.event.Events;
import org.gwtopenmaps.openlayers.client.util.JSObject;
import org.gwtopenmaps.openlayers.client.util.JSObjectWrapper;

/**
 * Wrapper object for OpenLayer objects.
 *
 * @author Erdem Gunay
 * @author Edwin Commandeur
 * 
 */
public class OpenLayersObjectWrapper extends JSObjectWrapper {
   
	protected OpenLayersObjectWrapper(JSObject openLayersObject)
	{
		super(openLayersObject);
	}

	public static OpenLayersObjectWrapper narrowToOpenLayersObjectWrapper(JSObject element)
	{
		return (element == null)?null: new OpenLayersObjectWrapper(element);
	}

	/**
	 *
	 * @return Events - see {@link org.gwtopenmaps.openlayers.client.event.Events},
	 *  	null if the object does not fire events via event system.
	 */
	public Events getEvents() {
		//intentionally defined here instead of in OpenLayersEObjectWrapper
		// so you can always do Xxx.getEvents().register("eventname", ...)
		return Events.narrowToEvents(OpenLayersObjectWrapperImpl.getEvents(getJSObject()));
	}

	/**
	 * Each OpenLayers object has a CLASS_NAME property.
	 *
	 * @return String - fully qualified OpenLayers class name
	 */
	public String getClassName(){
		return OpenLayersObjectWrapperImpl.getClassName(getJSObject());
	}
}

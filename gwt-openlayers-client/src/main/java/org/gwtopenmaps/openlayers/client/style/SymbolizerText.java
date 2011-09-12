package org.gwtopenmaps.openlayers.client.style;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * 
 * @author Maciej Jezierski - Pinocchio
 * A symbolizer used to render text labels for features
 */
public class SymbolizerText extends Symbolizer {

	public SymbolizerText(JSObject config) {
		super(SymbolizerTextImpl.create(config));
	}
	
	public SymbolizerText() {
		super(SymbolizerTextImpl.create());
	}
	
	public void setLabel(String label) {
		SymbolizerTextImpl.setLabel(this.getJSObject(), label);
	}
	
	public String getLabel() {
		return SymbolizerTextImpl.getLabel(this.getJSObject());
	}
	
	public void setFontFamily(String fontFamily) {
		SymbolizerTextImpl.setFontFamily(this.getJSObject(), fontFamily);
	}
	
	public String getFontFamily() {
		return SymbolizerTextImpl.getFontFamily(this.getJSObject());
	}
	
	public void setFontSize(String fontSize) {
		SymbolizerTextImpl.setFontSize(this.getJSObject(), fontSize);
	}
	
	public String getFontSize() {
		return SymbolizerTextImpl.getFontSize(this.getJSObject());
	}
	
	public void setFontWeight(String fontWeight) {
		SymbolizerTextImpl.setFontWeight(this.getJSObject(), fontWeight);
	}
	
	public String getFontWeight() {
		return SymbolizerTextImpl.getFontWeight(this.getJSObject());
	}
	
	public void setFontStyle(String fontStyle) {
		SymbolizerTextImpl.setFontStyle(this.getJSObject(), fontStyle);
	}
	
	public String getFontStyle() {
		return SymbolizerTextImpl.getFontStyle(this.getJSObject());
	}

}
package Presentacion;

import java.beans.Beans;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Internacionalizacion {
	////////////////////////////////////////////////////////////////////////////
	//
	// Constructor
	//
	////////////////////////////////////////////////////////////////////////////
	private Internacionalizacion() {
		// do not instantiate
	}
	////////////////////////////////////////////////////////////////////////////
	//
	// Bundle access
	//
	////////////////////////////////////////////////////////////////////////////
	private static final String BUNDLE_NAME = "Presentacion.Internacionalizacion"; //$NON-NLS-1$
	private static ResourceBundle RESOURCE_BUNDLE = loadBundle();
	private static ResourceBundle loadBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}
	private static String idioma;
	////////////////////////////////////////////////////////////////////////////
	//
	// Strings access
	//
	////////////////////////////////////////////////////////////////////////////
	public static String getString(String key) {
		try {
			ResourceBundle bundle = Beans.isDesignTime() ? loadBundle() : RESOURCE_BUNDLE;
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!";
		}
	}
	
	private static Locale getLocale(String appIdioma){
		Locale locale=new Locale("es");
		if (appIdioma.equals("ingles")) {
			locale = new Locale("en");
			idioma="ingles";
		}
		
		if(appIdioma.contentEquals("espanol")) {
			locale = new Locale("es");
			idioma="espanol";
		}
		return locale;
	}
	
	public static void setIdioma(String idioma){
		RESOURCE_BUNDLE= ResourceBundle.getBundle(BUNDLE_NAME, getLocale(idioma));
	}
	
	public static String getIdioma(){
		return idioma;
	}
}

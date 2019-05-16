package myOnlineShop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductSpec {
	
	private Map properties;
	public boolean outlet;

	  public ProductSpec(Map properties) {
	    if (properties == null) {
	      this.properties = new HashMap();
	    } else {
	      this.properties = new HashMap(properties);
	    }
	  }

	  public void setOutlet (boolean outlet) {
			 this.outlet = outlet;
		  }
		  
		  public boolean isOutlet() {
			  return outlet;
		  }
		  
	  public Object getProperty(String propertyName) {
	    return properties.get(propertyName);
	  }

	  public Map getProperties() {
	    return properties;
	  }

	  public boolean matches(ProductSpec otherSpec) {
	    for (Iterator i = otherSpec.getProperties().keySet().iterator(); 
	         i.hasNext(); ) {
	      String propertyName = (String)i.next();
	      if (!properties.get(propertyName).equals(
	           otherSpec.getProperty(propertyName))) {
	        return false;
	      }
	    }
	    return true;
	  }
}

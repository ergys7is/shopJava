package myOnlineShop;

public enum Accesorie {
	BELT, WATCH, HAT, GLOVES;
	
	  public String toString() {
	    switch(this) {
	      case BELT:    return "Belt";
	      case WATCH:   return "Watch";
	      case HAT: 	return "Hat";
	      case GLOVES:  return "Gloves";
	      default:      return "Unspecified";
	    }
	  }
}

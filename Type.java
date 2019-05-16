package myOnlineShop;

public enum Type {
	FOOTWEAR, CLOTHING, ACCESORIE;
	
	  public String toString() {
	    switch(this) {
	      case FOOTWEAR:   return "Footwear";
	      case CLOTHING:   return "Clothing";
	      case ACCESORIE: return "Accesorie";
	      default:         return "Unspecified";
	    }
	  }
}

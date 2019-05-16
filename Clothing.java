package myOnlineShop;

public enum Clothing {
	JACKET, SHIRT, SHORT, TROUSERS;
	
	  public String toString() {
	    switch(this) {
	      case JACKET:  return "Jacket";
	      case SHIRT:   return "Shirt";
	      case SHORT: 	return "Short";
	      case TROUSERS: return "Trousers";
	      default:      return "Unspecified";
	    }
	  }
}

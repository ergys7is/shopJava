package myOnlineShop;

public enum Brand {
NIKE, ADIDAS, REEBOK, TIMBERLAND, ZARA, SALEWA, LASPORTIVA, VERSACE, ARMANI;
	
	public String toString() {
	 switch(this) {
	 case NIKE:  		return "Nike";
     case ADIDAS:    	return "Adidas";
     case REEBOK: 		return "Reebok";
     case TIMBERLAND:   return "Timberland";
     case ZARA: 		return "Zara";
     case SALEWA:   	return "Salewa";
     case LASPORTIVA: 	return "La Sportiva";
     case VERSACE:   	return "Versace";
     case ARMANI: 		return "Armani";
     default:       	return "Unspecified";
	   }
	 }
}

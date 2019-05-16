package myOnlineShop;

public enum Group {
	MENS, LADIES, KIDS, SPORTS, OUTDOOR;
	
	public String toString() {
	 switch(this) {
	 case MENS:  	return "Mens";
     case LADIES:   return "Ladies";
     case KIDS: 	return "Kids";
     case SPORTS:   return "Sports";
     case OUTDOOR: 	return "Outdoor";
     default:       return "Unspecified";
	   }
	 }
}

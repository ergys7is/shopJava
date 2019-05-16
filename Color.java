package myOnlineShop;

public enum Color {
BLACK, WHITE, RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK;
	
	public String toString() {
	 switch(this) {
	 case BLACK:  	return "Black";
     case WHITE:    return "White";
     case RED: 		return "Red";
     case GREEN:    return "Green";
     case BLUE: 	return "Blue";
     case YELLOW:   return "Yellow";
     case ORANGE: 	return "Orange";
     case PURPLE:   return "Purple";
     case PINK: 	return "Pink";
     default:       return "Unspecified";
	   }
	 }
}

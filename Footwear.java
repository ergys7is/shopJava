package myOnlineShop;

public enum Footwear {
	RUNNING, FOOTBALL, WALKING, CLIMBING;
	
	  public String toString() {
	    switch(this) {
	      case RUNNING:  	return "Running shoes";
	      case FOOTBALL:    return "Football shoes";
	      case WALKING: 	return "Walking shoes";
	      case CLIMBING: 	return "Climbing shoes";
	      default:      	return "Unspecified";
	    }
	  }
}

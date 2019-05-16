package myOnlineShop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindAndBuyProdTester {

	public static void main(String[] args) {
	    Inventory inventory = new Inventory();
	    initializeInventory(inventory);

	    Map properties = new HashMap();
	    properties.put("group", Group.MENS);
	    properties.put("type", Type.CLOTHING);
	    properties.put("clothing", Clothing.JACKET);
	    properties.put("outlet", true);
	    
	    ProductSpec whatILike = new ProductSpec(properties);
	    
	    List matchingProducts = inventory.search(whatILike);
	    if (!matchingProducts.isEmpty()) {
	      System.out.println("Hey, you might like these products:");
	      for (Iterator i = matchingProducts.iterator(); i.hasNext(); ) {
	        Product product = (Product)i.next();
	        ProductSpec spec = product.getSpec();
	        Object prodObj = spec.getProperty("type");       
	        String prodType = prodObj.toString().toLowerCase();
	        Object prodObj2 = spec.getProperty(prodType);
	        String prodType2 = prodObj2.toString();
	        System.out.println("We have a " + prodType2 +
	          " with the following properties:");
	        for (Iterator j = spec.getProperties().keySet().iterator(); 
	             j.hasNext(); ) {
	          String propertyName = (String)j.next();
	          if (propertyName.equals("prodType"))
	            continue;
	          System.out.println("    " + propertyName + ": " +
	            spec.getProperty(propertyName));
	        }
	        System.out.println("  The serial number of this " + prodType2 + " is " + 
	  	          product.getSerialNumber() + ".");
	        System.out.println("  You can have this " + prodType2 + " for" + " " + 
	          product.getPrice() + " euros." + "\n---");
	      }
	    } else {
	      System.out.println("Sorry, we have nothing for you.");
	    }
	    System.out.println("Please, choose the serial number "
	    		+ "of the product you want to buy and put the money.");
	    double moneyReturned = inventory.pay("103", 1500);
	    System.out.println("We will redristibute back to you " + moneyReturned + " euro.");
	  }

	  private static void initializeInventory(Inventory inventory) {
	    Map properties = new HashMap();
	    
	    properties.put("group", Group.MENS);
	    properties.put("type", Type.CLOTHING);
	    properties.put("clothing", Clothing.JACKET);
	    properties.put("outlet", true);
	    inventory.addProduct("101", 300, new ProductSpec(properties));

	    properties.put("group", Group.MENS);
	    properties.put("type", Type.CLOTHING);
	    properties.put("clothing", Clothing.JACKET);
	    properties.put("outlet", true);
	    inventory.addProduct("103", 315, new ProductSpec(properties));
	    
	    properties.put("group", Group.MENS);
	    properties.put("type", Type.CLOTHING);
	    properties.put("clothing", Clothing.JACKET);
	    properties.put("outlet", false);
	    inventory.addProduct("111", 415, new ProductSpec(properties));

	    properties.put("group", Group.MENS);
	    properties.put("type", Type.CLOTHING);
	    properties.put("clothing", Clothing.JACKET);
	    properties.put("outlet", true);
	    properties.put("color", Color.RED);
	    inventory.addProduct("105", 327, new ProductSpec(properties));
	    inventory.addProduct("107", 330, new ProductSpec(properties));
	 
	    properties.put("group", Group.SPORTS);
	    properties.put("type", Type.FOOTWEAR);
	    properties.put("footwear", Footwear.CLIMBING);
	    properties.put("outlet", false);
	    properties.put("color", Color.BLUE);
	    inventory.addProduct("109", 422, new ProductSpec(properties));
	  }
}
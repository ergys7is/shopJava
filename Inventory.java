package myOnlineShop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Product> inventory;

	  public Inventory() {
	    inventory = new LinkedList<Product>();
	  }

	  public void addProduct(String serialNumber, double price,
	                            ProductSpec spec) {
	    Product product = new Product(serialNumber, price, spec);
	    inventory.add(product);
	  }

	  public Product get(String serialNumber) {
	    for (Iterator i = inventory.iterator(); i.hasNext(); ) {
	      Product product = (Product)i.next();
	      if (product.getSerialNumber().equals(serialNumber)) {
	        return product;
	      }
	    }
	    return null;
	  }

	  public List<Product> search(ProductSpec searchSpec) {
	    List<Product> matchingProducts = new LinkedList<Product>();
	    for (Iterator<Product> i = inventory.iterator(); i.hasNext(); ) {
	      Product product = (Product)i.next();
	      if (product.getSpec().matches(searchSpec))
	        matchingProducts.add(product);
	    }
	    return matchingProducts;
	  }
	  
	  public double pay(String serialNumber, double insertMoney) {
		  Product productToBuy = get(serialNumber);
		  double priceOfTheProduct = productToBuy.getPrice();
		  double moneyReturned = insertMoney - priceOfTheProduct; 
		  return moneyReturned;
	  }
}
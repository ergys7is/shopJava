package myOnlineShop;

public class Product {

	private String serialNumber;
	 private double price;
	 private ProductSpec spec;

	  public Product(String serialNumber, double price, ProductSpec spec) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = spec;
	  }

	  public String getSerialNumber() {
	    return serialNumber;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(double newPrice) {
	    this.price = newPrice;
	  }

	  public ProductSpec getSpec() {
	    return spec;
	  }
}

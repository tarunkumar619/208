package LinkedListPractice;

public class product {
     private int ProductId;
     private String name;
     private String type;
     private double price;
     
     
     
	public product(int productId, String name, String type, double price) {
	
		ProductId = productId;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "product [ProductId=" + ProductId + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}


	public int getProductId() {
		return ProductId;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
     
     
     
}

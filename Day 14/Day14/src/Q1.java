//Question:
//
//	define a class "Order" with:
//
//	enum Type
//	{
//		BUY,SELL;
//	}
//	private int quantity;
//	private double price;
//	private Type type;
//
//	
//	define setter and getter methods for all the fields.
//
//	create 5 objects of this class and stored them inside list.
//
//	using stream api:
//
//	1) count how many orders are for "SELL"
//
//		hint:- use "filter" method of stream to check whether type is SELL and "count" method to count.
//
//	2) calculate sum of all the prices
//
//		hint:- use "mapToDouble" method of stream to convert price of each and every object and "sum" method to calculate total of all the prices.
//
//	3) calculate sum of all the quantities.
//
//		hint:- use "mapToInt" method of stream to convert qty of each and every object and "sum" method to calculate total of all the quantities.
//
//
//	

import java.util.ArrayList;
import java.util.List;

class Order
{
	 enum Type
	 {
		 BUY,SELL;
	 }
	 
		private int quantity;
		private double price;
		private Type type;
		
		
		public int getQuantity() {
			return quantity;
		}
		
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		
		public double getPrice() {
			return price;
		}
		
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public Type getType() {
			return type;
		}
		
		
		public void setType(Type type) {
			this.type = type;
		}


		@Override
		public String toString() {
			return "Order [quantity=" + quantity + ", price=" + price + ", type=" + type + "]";
		}
		
		
		
		
}
public class Q1 {

	public static void main(String[] args) {
		
	List<Order>list=new ArrayList<Order>();
	
	Order o1=new Order();
	o1.setPrice(1000);
	o1.setQuantity(10);
	//o1.setType(type.BUY);	
	o1.setType(Order.Type.BUY);
	
	Order o2=new Order();
	o2.setPrice(1200);
	o2.setQuantity(20);
	o2.setType(Order.Type.SELL);
	
	Order o3=new Order();
	o3.setPrice(1300);
	o3.setQuantity(30);
	o3.setType(Order.Type.SELL);
	
	list.add(o1);
	list.add(o2);
	list.add(o3);
	
	System.out.println(list.stream().filter(a->a.getType().equals(Order.Type.SELL)).count());
	System.out.println(list.stream().mapToDouble(b->b.getPrice()).sum());
	System.out.println(list.stream().mapToInt(c->c.getQuantity()).sum());
	
	}

}
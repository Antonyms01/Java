//2) on the developer side:
//	create a generic class which can accept any type
//		with setters , getters and toString methods.
//	create necessary jar files and  documentation.
//
//on client side 
//	create the object of above generic class and invoke its setters , getters and display the object.
//	
	
	
	package devpro;

public class Generic <T,S>{
	private T num;
	private S name;
	
	public T getNum() {
		return num;
	}
	public S getName() {
		return name;
	}
	public void setName(S name, T num) {
		this.name = name;
		this.num=num;
	}
	@Override
	public String toString() {
		return "Generic [num=" + num + ", name=" + name + "]";
	}
	


	
	
	
	
}

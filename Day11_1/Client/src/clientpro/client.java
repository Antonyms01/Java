//2) on the developer side:
//	create a generic class which can accept any type
//		with setters , getters and toString methods.
//	create necessary jar files and  documentation.
//
//on client side 
//	create the object of above generic class and invoke its setters , getters and display the object.
//	

package clientpro;

import devpro.Generic;

public class client {

	public static void main(String[] args) {
		Generic<Integer,String> g=new Generic<Integer,String>();
	}

}

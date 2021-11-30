
/**
 * Illegal modifier for the class PrivateClass; only public, abstract & final are permitted
 * @author pavankari
 *
 */
class PrivateClass { 
	 
	 int i=1;
	  private class InnerPrivateClass {
		 
		  InnerPrivateClass(){
			 
			  System.out.println("InnerPrivateClass" + (i++));
		  }
		 
	 }
	  
	  InnerPrivateClass innerPrivateClass = new InnerPrivateClass();
	 
		
		  public static void main(String[] args) {
		   
			  PrivateClass privateClass = new PrivateClass();
			  privateClass.new InnerPrivateClass();
		  
		  }
		 

}

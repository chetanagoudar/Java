
  package demos;
  
  
  class SimpleGeneric1 <T extends Number>{
	  T obj;
	  public void showObjectType() 
	  {
		  System.out.println("Object type is " + obj.getClass().getName());
	  }
	  public SimpleGeneric1(T obj) {
		 
		  this.obj =  obj;
	  }
  
  }
  
  
  public class Wildcards {
  
  public static void main(String[] args) { // TODO Auto-generated method stub
	  SimpleGeneric1<Integer> a = new SimpleGeneric1<Integer>(10);
	  SimpleGeneric1<Double> b = new SimpleGeneric1<Double>(32.38475);
	 
	  
	  a.showObjectType();
	  b.showObjectType();
	  
  
  }
  
  }
 
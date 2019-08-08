package demos;

 class SimpleGeneric <T>{
	 T obj;
	 public void showObjectType() {
		 System.out.println("Object type is " + obj.getClass());
	 }
	public SimpleGeneric(T obj) {
		super();
		this.obj = obj;
	}
	
}

public class genericExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGeneric<String>  genClass = new SimpleGeneric<String>("Input");

		genClass.showObjectType();

	}

}

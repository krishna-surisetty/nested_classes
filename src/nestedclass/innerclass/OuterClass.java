package nestedclass.innerclass;

public class OuterClass {

	public String outerField = "normal outer field";
	public static String staticOuterField = "static outer field";
	
	class InnerClass {
		public void accessFields() {
			System.out.println("staticOuterField " + staticOuterField); // can access directly without class reference - OuerClass.staticOuterField
			System.out.println("outerClass.outerField " + outerField);
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClassOne = outerClass.new InnerClass();
		innerClassOne.accessFields();
		// innerClassOne.outerField = "aaa"; // inner class instance cannot access outer class fields or methods
		OuterClass.InnerClass innerClassTwo = outerClass.new InnerClass();
	}
}

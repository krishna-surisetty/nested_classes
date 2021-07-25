package nestedclass.staticnestedclass;

public class OuterClass {

	public String outerField = "normal outer field";
	public static String staticOuterField = "static outer field";
	
	static class StaticNestedClass {
		public /* static */void accessFields(OuterClass outerClass) {
			System.out.println("staticOuterField " + staticOuterField); // can access directly without class reference - OuerClass.staticOuterField
			//System.out.println("outerField " + outerField); // causes error
			System.out.println("outerClass.outerField " + outerClass.outerField);
		}
	}
	
	
	
	public static void main(String[] args) {
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		OuterClass outerClass = new OuterClass();
		staticNestedClass.accessFields(outerClass);
		// staticNestedClass.staticOuterField = "aaaa"; // nested static class instance cannot access outer class fields or methods.
	}
}

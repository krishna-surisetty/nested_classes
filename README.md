# Nested class

Java programming allows us to define a class within another class. Such class is called nested class

	class Outer {	
		// Outer class fields and methods
		class Inner {	
			// Inner class fields and methods	
		}	
	}

# Advantages

1. It is a way of logically grouping classes that are used only in one place - If a class is useful to only one other class then it is logical to embed them together which makes a package more streamlined (clear or precise)
1. It increases encapsulation - Consider a situation where we have to classes viz. class A and class B in which class B is entirely dependent on class A methods otherwise those methods would be declared private. In addition class B can be hidden
		
# Categories

1. Non static nested classes or Inner classes.It is divided to categories
   1a. local class
   1b. Anonymous class
1. Static Nested classes
   
# Characteristics

Since nested class is a member of an enclosing class, it can be declares public, private, protected and package-private

Inner class or Non static nested class has access to other members of enclosing class even if those members are declared private

Static Nested classes do not have to access to other members of enclosing class

# Inner class

As with instance methods and instance fields, inner class instances are also associated with the instances of outer class. 
Since inner class instance is an instance of outer class the members or methods in it cannot be static (obviously, because static does not refer to instance)

Following is the syntax used for inner class instance creation. refer to nestedclass.innerclass.OuterClass.java

		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClassOne = outerClass.new InnerClass();


NOTE: Inner class instance cannot access outer class fields or methods

# Static Nested Class

A static nested class interacts with the instance members of its outer class (and other classes) just like any other top-level class. 
A static nested class is behaviorally a top-level class that has been nested in another top-level class for packaging convenience

Following is the syntax used for inner class instance creation. refer to nestedclass.staticnestedclass.OuterClass.java

	StaticNestedClass staticNestedClass = new StaticNestedClass();



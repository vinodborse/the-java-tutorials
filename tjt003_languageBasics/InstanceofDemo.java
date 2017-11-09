package tjt003_languageBasics;

public class InstanceofDemo {

	public static void main(String[] args) {

		Parent obj1 = new Parent();
		Parent obj2 = new Child();
		
		System.out.println("obj1 instanceof Parent:"+ (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child:"+ (obj1 instanceof Child));
		System.out.println("obj1 instanceof myInterface:"+ (obj1 instanceof myInterface));
		System.out.println("obj2 instanceof Parent:"+ (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child:"+ (obj2 instanceof Child));
		System.out.println("obj2 instanceof myInterface:"+ (obj2 instanceof myInterface));

	}

}
	class Parent {}
	class Child extends Parent implements myInterface {}
	interface myInterface {}
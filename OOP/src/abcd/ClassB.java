package abcd;

public class ClassB extends ClassA {
	public ClassB() {

	}

	public void test() {
		System.out.println(super.age);
	}

	public void test(int age) {
		System.out.println("ok");
	}

	@Override
	public void f() {
		System.out.println("test");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakCar() {
		// TODO Auto-generated method stub
		
	}

}

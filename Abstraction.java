package Array;
abstract class Hello{
	int a;
	Hello(int a){
		this.a = a;
		System.out.println("Hello(int)");
	}
	{
		System.out.println("Hello-IIB");
	}
	void show(){
		System.out.println("Hello()");
	}
}
class Hai extends Hello{
	Hai(int a){
		super(a);
	}
}
class Abstraction{
	public static void main(String[] args){
		Hai hai = new Hai(10);
		hai.show();
	}
}
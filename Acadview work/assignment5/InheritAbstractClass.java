package assignment5;
abstract class Vehicle{
  abstract void start();
	void stop() {
		System.out.println("The Vehicle is stopping.");
	}
}
class TwoWheeler extends Vehicle{
	void start() {
		System.out.println("The Two Wheeler Vehicle is starting.");
	}
}
class FourWheeler extends Vehicle{
	void start() {
		System.out.println("The Four Wheeler Vehicle is starting.");
	}
}
public class InheritAbstractClass {
public static void main(String arg[]) {
	TwoWheeler t=new TwoWheeler();
	t.start();
	t.stop();
	FourWheeler f=new FourWheeler();
	f.start();
	f.stop();
}
}

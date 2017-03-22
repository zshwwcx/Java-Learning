package pac1;

abstract class Person{
	public abstract void eat();
}

public class Parcel7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(){
			public void eat(){
				System.out.println("Eating something");
			}
		};
		p.eat();
	}

}



public class CalssCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	private static void changeDog(Animal animal) {
		animal = new Dog(); //자동 캐스팅, 업캐스팅 //다형성
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;//강제 캐스팅, 다운캐스팅
			System.out.println("부모 타입으로 받아 자식 타입으로 변경");		
		} else if(animal instanceof Cat) {
			Cat cat = (Cat) animal;//강제 캐스팅, 다운캐스팅
			System.out.println("부모 타입으로 받아 자식 타입으로 변경");		
		} else {
			System.out.println("그런 타입 없습니다.");
		}
//		try {
//			Dog dog = (Dog) animal;
//			System.out.println("부모 타입으로 받아 자식 타입으로 변경");
//		} catch (ClassCastException e) {
//			System.out.println(e.getMessage());
//		}
		
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
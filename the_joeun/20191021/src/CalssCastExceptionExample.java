

public class CalssCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	private static void changeDog(Animal animal) {
		animal = new Dog(); //�ڵ� ĳ����, ��ĳ���� //������
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;//���� ĳ����, �ٿ�ĳ����
			System.out.println("�θ� Ÿ������ �޾� �ڽ� Ÿ������ ����");		
		} else if(animal instanceof Cat) {
			Cat cat = (Cat) animal;//���� ĳ����, �ٿ�ĳ����
			System.out.println("�θ� Ÿ������ �޾� �ڽ� Ÿ������ ����");		
		} else {
			System.out.println("�׷� Ÿ�� �����ϴ�.");
		}
//		try {
//			Dog dog = (Dog) animal;
//			System.out.println("�θ� Ÿ������ �޾� �ڽ� Ÿ������ ����");
//		} catch (ClassCastException e) {
//			System.out.println(e.getMessage());
//		}
		
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
package ppt;

public class Person {
	public String name;
	public int age;
	
	public Person() {
	}	
	public Person(String s) {
		name = s;
	}	
	public String getName() {
		return name;
	}
	
	public static void main (String[] args) {
		Person[] ps;
		ps = new Person[10];
		
		for(int i=0;i<ps.length;i++) {
			ps[i] = new Person();
			ps[i].age = 30+i;
		}
		
		for(int i=0;i<ps.length;i++) {
			System.out.print(ps[i].age+" ");
		}
	}
}

package ppt4;
/* 추상 클래스로 기본 방향을 잡고, 서브에서 구현하면 구현 작업이 쉬워진다.
 * 계층적 상속 관계를 만들때 적합.(목차)
 * 
 * -추상화 작업
 *  . 상속이 자손클래스를 만드는데, 조상클래스를 사용하는 것이라면 추상화는 기존의 클래스의 공통부분을 뽑아 내어 조상클래스를 만드는 작업
 *  . 상속계층도를 따라 내려 갈 수록 세분화되며, 올라갈 수록 공통요소만 남게 된다.
 *  . 추상화 - 클래스간의 공통점을 찾아내어 공통의 조상을 만드는 작업
 *  . 구체화 - 상속을 통해 클래스를 구현, 확장하는 작업
 */
abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double averge(int[] a);
}

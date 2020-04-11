//import java.util.Random;

/*Random클래스를 이용하여 알파벳 대문자 중 무작위로 추출하여 표시하시오.
 * 출력)
 *  G K O P W
 *  R V T S K
 *  B Z Q U Y
 */
public class RandomEx {

	public static void main(String[] args) {
		//Random r = new Random();
		
		for(int i=0; i<15;i++) {
			//int v = r.nextInt(26)+65;
			int v = (int) (Math.random()*26+65); //랜덤값이 실수로 나오므로 int 값으로 만들어준다.
			System.out.print((char)v + " ");
			if((i+1)%5==0)
				System.out.println();
		}

	}

}

//import java.util.Random;

/*RandomŬ������ �̿��Ͽ� ���ĺ� �빮�� �� �������� �����Ͽ� ǥ���Ͻÿ�.
 * ���)
 *  G K O P W
 *  R V T S K
 *  B Z Q U Y
 */
public class RandomEx {

	public static void main(String[] args) {
		//Random r = new Random();
		
		for(int i=0; i<15;i++) {
			//int v = r.nextInt(26)+65;
			int v = (int) (Math.random()*26+65); //�������� �Ǽ��� �����Ƿ� int ������ ������ش�.
			System.out.print((char)v + " ");
			if((i+1)%5==0)
				System.out.println();
		}

	}

}

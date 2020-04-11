package ex;

import java.io.*;

/* - PrintStream
 *  .��� �ڷ����� ����� �� �ִ� print(), println()�޼ҵ尡 �����ε� �Ǿ� �ִ�.
 *  .���α׷��� ���۵Ǹ� ��ġ�� ����� ��� ��Ʈ���� System.in, System.out,System.err ��ü�� PrintStream��ü�̴�.
 *  .�ٸ� ��Ʈ������ �ٸ��� �÷�������� �ڵ����� ó���� �� �ִ� �����ڸ� ������ �ִ�.
 *       �ڸ�� �޼ҵ�� ����ó���� ���� �ʴ´�.
 * - PrintWriter
 *  .PrintWriter�� �ٸ� ��Ʈ���� �ٸ��� ����Ʈ ��� ��Ʈ���� ������� ��Ʈ���� ������ ��ü�� ������ �� �ִ� Ŭ�����̴�.
 *  .�ڵ� �÷���(auto flush)����� ���� �ִ�.
 *       ��PrintWriter Ŭ������ �����ڴ� FileNotFoundException���ܸ� �߻��ϱ� ������ �ݵ�� ����ó���� �ؾ��Ѵ�.
 */
//PrintStream ���Ͽ� ���� ����ϱ�
public class PrintStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream("src/ex/data.sav");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true); //�ڵ��÷���
			ps.println("ȫ�浿 : ");
			ps.println(2019);
			ps.println(true);
			ps.println('a');
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
				if(bos!=null) bos.close();
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}

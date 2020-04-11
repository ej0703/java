package ppt;
/* - System, Class, Runtime
 *  표준 입출력을 포함, 시스템 전반에 걸치 제어를 한다.
 * - 주요메서드
 *  System.in.read()
 *  System.out.print()
 *  System.currentTimeMillis() //현재시간
 *  System.exit(int status) //시스템 종료
 *  System.gc() //가비지 컬렉터 호출
 * - 현재 시스템의 환경속성
 *  System.getProperty(String key);
 *  key : "os.name", "java.version"....
 */
public class SystemEx {

	public static void main(String[] args) {
		long startLoopTime = System.currentTimeMillis();
		for(int i=0;i<100_000_000;i++) {
			for(int j=0;j<100_000;j++) {
				int k = i+j;
			}
		} //for end
		long ttime=System.currentTimeMillis()-startLoopTime;
		
		System.out.println("소요시간 = "+ttime);
		
		byte[] buffer = new byte[255];
		System.out.print("\n Type a line of test : ");
		try {
			System.in.read(buffer,0,255);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(new String(buffer));
	}

}

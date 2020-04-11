package ppt;

public class RunntimeEx {

	public static void main(String[] args) {
		//실행정보 얻어오기
		//자바에서 기본적으로 제공해줌. java.lang.Runtime
		//실행시간에 실행환경에 대한 정보를 얻어오거나 명령을 수행
		Runtime rt = Runtime.getRuntime();
		//현재 자바가상머신(JVM)에서 사용가능한 메모리는 byte 단위
		long fr = rt.freeMemory();		
		System.out.println("freeMemory = "+fr/1024 +"KB");
		
		long fr2= rt.freeMemory();//전체메모리량을 byte 단위
		System.out.println("totalMemory = "+fr2/1024 +"KB");
		
		try {
			rt.exec("C:\\Windows\\System32\\calc.exe");
			rt.exec("C:\\Windows\\System32\\notepad.exe");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

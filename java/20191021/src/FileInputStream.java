

public class FileInputStream implements AutoCloseable {
	private String file;

	public FileInputStream(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file +"을 읽습니다.");
	}

	@Override	//재정의했다. 컴파일러가 이해할 수 있는 주석
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
	}
}
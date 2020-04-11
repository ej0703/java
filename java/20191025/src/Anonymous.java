import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//4. Anonymous class
@SuppressWarnings("serial")
public class Anonymous extends JFrame {

	public static void main(String[] args) {
		//프레임 객체 생성
		Anonymous t = new Anonymous();
		//프레임 제목
		t.setTitle("익명내부클래스 연습...");
		//버튼 객체 생성
		JButton btn = new JButton("버튼을 눌러주세요.");
		//프레임에 버튼 붙이기
		t.add(btn);
		//프레임 크기 설정
		t.setSize(300,300); //가로 세로 크기
		t.setLocation(500,500); // 화면에 x,y 위치
		t.setVisible(true); //프레임을 화면에 보여주기
		//이벤트 발생 처리
		//버튼을 클릭했을시 이벤트처리할 처리기(이벤트 핸들러)연결
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트를 발행한 버튼에 있는 글자를 대입
				String select = e.getActionCommand(); //버튼에 글자 가져오기
				if(select.equals("버튼을 눌러주세요.")) {
					//시스템 종료 == 프로그램 종료 0 또는 다른 정수
					//아무거나 보통 0을 많이 사용.
					System.exit(0);
				}				
			}
		});

	}

}

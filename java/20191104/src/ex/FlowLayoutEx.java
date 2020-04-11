package ex;

import javax.swing.*;
import java.awt.*;
/* JFrame
 * 스윙의 JFrame은 AWT의 Frame과 달리 좀 복잡한 구조로 되어 있다. 프레임 자체로 구성되어 있는 것이 아니라 그 안에 4개의 페인(Pane)이 층으로 구성되어 있다.
 * 1. JRootPane   : 실질적인 윈도우 기능을 수행하는 경량의 컨테이너이다.
 * 				        모든 윈도우들의 동작이나 사용방법등이 같아지고, 다른 컴포넌트들과 잘 조화가 될 수 있도록 도와주기 때문이다.
 * 				    GlassPane과 layerdPane으로 구성되어 있고, layoutPane은 JMenuBar, contentPane을 포함한다.
 * 2. layeredPane : 루트 페인에 대해 레이어를 할 수 있도록 여러 층의 패널을 포함 할 수 있는 패널로 여러 컴포넌트를 서로 오버랩(컴포넌트 위에 다른 컴포넌트를 붙이는 작업)할 수 있도록 한다.
 * 					윗 부분은 JMenuBar, 아랫부분은 contentPane으로 이루어져 있다.
 * 3. contentPane : 일반적인 컴포넌트를 가질 수 있는 패널, 프레임 객체의 getContentPane()을 이용해서 얻을 수 있다.
 * 4. glassPane   : 기본적으로 숨겨진 상태로 되어 있다. 다른 패널 위에 존재하는 패널이다.
 * 					주로 마우스 이벤트를 처리하기 위해 가장 먼저 루트페인에 추가된다.
 * 5. JMenuBar    : 윈도우의 메뉴를 제송하는 역할로 생략이 가능하다.
 * 					JMeny, JMenuItem등을 이용해서 메뉴를 구성하여 setJMenuBaer()를 이용해서 등록할 수 있다. 
 */
public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("Flow Layout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		add(new JButton("add"));
		add(new JButton("aub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculator"));
		
//		setSize(300,250);
		setBounds(500,500,500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}

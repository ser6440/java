package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest {
	//예제: 기본 창 생성해보기
	//Swing의 컴퍼넌트들은 Jxxx의 이름을 가진다.
	public static void main(String[] args) {
		//전부 객체이기 때문에 생성자를 호출하면 요소를 만들 수 있음
		//1. Frame 만들기: JFrame클래스 이용
		
		JFrame frame = new JFrame("Hello GUI");
		frame.setSize(300,200);
		
		//화면 구성을 위해서 Layout지정
		//Default Layout BoarderLayout
		//BorderLayout: 요소를 동,서,남,북 중간 중 하나에 배치
		//GridLayout
		
		frame.getContentPane().setLayout(new GridLayout(2, 2));
		JButton button2 = new JButton("버튼2");
		frame.getContentPane().add("North", button2);
		JButton button3 = new JButton("버튼3");
		frame.getContentPane().add("West", button3);
		
		//창을 항상 위로 유지
		//frame.setAlwaysOnTop(true);
		
		//창크기 변경 가능/불가능 여부
		//frame.setResizable(true);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
//		JButton button1 = new JButton("버튼1");
//		frame.add(button1);
//		JButton button2 = new JButton("버튼2");
//		frame.add(button2);
//		JButton button3 = new JButton("버튼3");
//		frame.add(button3);
//		JButton button4 = new JButton("버튼4");
//		frame.add(button4);
//		JButton button5 = new JButton("버튼5");
//		frame.add(button5);
//		
		
		//frame
		
		//화면보이기
		frame.setVisible(true);
		
	}

}

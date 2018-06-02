package student;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
public class MyInfoFrame extends JFrame {
	
	public MyInfoFrame() {
		this.setSize(500,400);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		//absolute layout : 컴포넌트의 위치를 마음대로 지정
		panel.setLayout(null);
		
		JButton button1 = new JButton("버튼1");
		//좌측상단 점 좌표, 우측하단 점 좌표
		button1.setBounds(280, 37, 134, 77);
		panel.add(button1);
		
		//글자 한줄 입력을 위한 컴퍼넌트
		//JTextField
		JTextField textField = new JTextField();
		textField.setBounds(27, 37, 181, 77);
		panel.add(textField);
		
		//글자를 표시하는 컴퍼넌트
		JLabel label1 = new JLabel("JLabel 입니다.");
		label1.setBounds(27, 140, 181, 15);
		panel.add(label1);
		
		JCheckBox checkBox = new JCheckBox("체크박스 입니다.");
		checkBox.setBounds(35, 178, 115, 23);
//		checkBox.setSelected(true);
//		
//		System.out.println(checkBox.isSelected());
		
		panel.add(checkBox);
		
		//컬렉션 중에 하나 List랑 거의 같이 사용할 수 있음
		Vector<String> contents  = new Vector<String>();
		contents.add("쥐");
		contents.add("소");
		contents.add("호랑이");
		contents.add("토끼");
		contents.add("용");
		
		ButtonGroup group = new ButtonGroup();

		JRadioButton a = new JRadioButton("Radio 1");
		a.setBounds(35, 273, 121, 23);
		panel.add(a);

		JRadioButton b = new JRadioButton("Radio 2");
		b.setBounds(29, 237, 121, 23);
		panel.add(b);

		group.add(a);
		group.add(b);
		
		JList jList = new JList(contents);
		jList.setBounds(273, 139, 159, 118);
		panel.add(jList);
		
		
		this.setVisible(true);
		
	}
}

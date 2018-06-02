package event;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	JButton btnEvent;
	JLabel lblResult;
	private JTextField tfDollar;
	
	public MyFrame() {
		this.setTitle("이벤트처리!");
		this.setSize(369, 300);
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnEvent = new JButton("이벤트 발생!");
		btnEvent.setBounds(72, 153, 182, 43);
		panel.add(btnEvent);
		
		//이벤트 처리를 위해서는 컴포넌트에 Listener를 등록해 주어야 한다.
		//Action이벤트를 처리하기 위해서는 ActionListener를 등록
		//Key이벤트를 처리하기 위해서는 KeyListener를 등록
		//Mouse이벤트를 처리하기 위해서는 MouseListener를 등록
		//addActionListener(리스너객체);
		//리스너 객체는 Listener인터페이스의 구현 클래스 객체를 넣어주면 된다.
		//익명클래스로 Listener인터페이스 구현해서 인자로 넘겨주기
		
		btnEvent.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				//여기다가 btnEvent버튼이 눌리면 동작할 코드를 작성
				//System.out.println(e.getActionCommand());
				System.out.println("버튼 이벤트 발생!!!");
				
				//버튼이 눌리면 얘가 해야할일
				//textField에 있는 문자열 가져와서 >> 1067곱해서
				//결과를 label(lblResult)에 넣기
				String dollar = tfDollar.getText();	//tfDollar는 textField 숫자로 써도 문자열로 저장이 되니까 
				int dollarInt = Integer.parseInt(dollar);	//계산을 하려면 숫자여야 하니까 int형으로 바꿔준다.parseInt
				int result = dollarInt*1067;	//int형으로 바꾼 dollar에 환율 1067을 곱해준다.
				lblResult.setText(result + "원 입니다.");	//결과를 라벨에 보여주기위해 lblResult에 넣어준다.
				
				
			}	
		});
		
		
		panel.add(btnEvent);
		
		tfDollar = new JTextField();
		tfDollar.setBounds(72, 34, 182, 29);

		//키보드 이벤트 처리를 위해 KeyListener 등록
		tfDollar.addKeyListener(new MyKeyListener());
		panel.add(tfDollar);
		
		lblResult = new JLabel("계산하세요.");
		lblResult.setBounds(123, 93, 131, 15);
		panel.add(lblResult);
		
		JLabel lblIntro = new JLabel("달러를 입력하세요");
		lblIntro.setBounds(71, 10, 183, 15);
		panel.add(lblIntro);
        this.setVisible(true);

	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
	}
	
	class MyKeyListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			//키보드가 눌렸을 때 처리
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//키보드가 올라왔을 때 처리
			//System.out.println("키보드가 올라옴!!");
			//그냥KeyRelease 이벤트를 처리하면, 모든 키가 올라올때 처리
			//우리가 하려는건 엔터를 쳤을 때 textField에 있는 값을 처리하는 일
			//눌려진 키가 엔터인지 아닌지 확인하는 작업이 필요
			//어떤 키보드가 눌려졌는지 정보를 이벤트 객체가 가지고 있음 
			//e.getKeyCode() >> 어떤 키가 눌렸는지에 대한 정보를 가져옴
			//System.out.println(e.getKeyCode());
			//엔터는 10 ==> KeyEvent.VK_ENTER
			
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				//엔터가 눌려졌다가 떼지면 얘가 해야할일
				String dollar = tfDollar.getText();
				int dollarInt = Integer.parseInt(dollar);
				int result = dollarInt*1067;
				lblResult.setText(result + "원 입니다.");
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			//내려갔다가 올라왔을 때 처리
			
		}
		
	}
}

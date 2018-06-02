package event;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JLabel;
 
public class EventFrame extends JFrame {
    //이벤트 중 컴포넌트를 조작하는 행위 : Action (버튼 클릭, 글자입력, 목록 선택)
    // Action 을 처리하는 인터페이스 ActionListener
    // 버튼이 눌리는 Action이 일어나면 처리하기
    // 1. 액션이 일어났을 때 동작할 코드 작성하기 >>> ActionListener 구현하기
    // 2. 액션을 처리하고 싶은 컴포넌트에 ActionListener 달아주기
	JButton button;
    boolean isClicked; 
    String name = "홍길동";
    
    
    public EventFrame() {
    	isClicked = false;
        this.setTitle("이벤트 처리하기");
        this.setSize(300,200);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
         
        button = new JButton("눌러봐");
        button.setBounds(12, 10, 97, 23);
         
        //버튼이 눌리는 액션이 발생하면, MyActionListener에 구현한 코드를 실행하겠다.
        button.addActionListener(new MyActionListener());
        panel.add(button);
        
        JButton btnName = new JButton("니 이름이 뭐니?");
        btnName.setBounds(121, 10, 97, 23);
        panel.add(btnName);
        
        JLabel lblName = new JLabel("New label");
        lblName.setBounds(12, 54, 206, 15);
        panel.add(lblName);
        
        btnName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//라벨의 텍스트를 바꿔주는 코드를 작성
				lblName.setText("내 이름은" + name + "입니다.");
			}
		});
         
        this.setVisible(true);
    }
     
    public static void main(String[] args) {
        EventFrame frame = new EventFrame();
    }
     
    //버튼이 눌리는 액션을 처리하기 위해서 ActionListener 이용
    //ActionListener를 구현 하는 구현 클래스 만들기
     
    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("버튼이 눌렸다!!!!!");
            //버튼의 글자를 바꾸는것! >> 버튼객체를 참조
        	
        	if(!isClicked) {	//if(isClicked == false)와 같은의미
        		button.setText("눌렸음");
        		isClicked = true;
        	}else {
        		button.setText("눌러봐");
        		isClicked = false;
        		
        	}
		}
	}

}

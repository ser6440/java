package guiChat;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
 
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
 
public class ChatClient extends JFrame implements KeyListener{
     
    private JTextField textField;
    private JButton btnSend;
    private JTextArea textArea;
    private JTextField textFieldIp;
    private JLabel label;
    private JButton btnConnect;
    private JTextField tfNick;
    private JLabel lblNick;
    private JButton btnNickSave;
     
    //서버로 메시지 전송을 위한, socket, writer(스트림) 선언
    private Socket socket;
    private BufferedWriter writer;
    private String nick = "이름없음";
     
    public ChatClient() {
        this.setTitle("채팅");
        this.setSize(453, 422);
         
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
         
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 10, 210, 313);
        panel.add(scrollPane);
         
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
         
        textField = new JTextField();
        textField.setBounds(12, 333, 279, 35);
        panel.add(textField);
        textField.addKeyListener(this);
         
         
        btnSend = new JButton("전송");
        btnSend.setBounds(303, 333, 112, 35);
         
        //채팅 보내기
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        panel.add(btnSend);
         
        textFieldIp = new JTextField();
        textFieldIp.setBounds(235, 173, 180, 21);
        panel.add(textFieldIp);
        textFieldIp.setText("192.168.0.34");
         
        label = new JLabel("서버아이피");
        label.setBounds(234, 148, 106, 15);
        panel.add(label);
         
        btnConnect = new JButton("접속");
        btnConnect.setBounds(235, 204, 180, 23);
        panel.add(btnConnect);
        
        tfNick = new JTextField();
        tfNick.setBounds(235, 92, 180, 21);
        panel.add(tfNick);
        tfNick.setText("이름없음");
        
        lblNick = new JLabel("닉네임");
        lblNick.setBounds(234, 67, 106, 15);
        panel.add(lblNick);
        
        btnNickSave = new JButton("저장");
        btnNickSave.setBounds(235, 115, 180, 23);
        panel.add(btnNickSave);
        
        btnNickSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 눌리면 nick을 변경
				nick = tfNick.getText();
				
			}
		});
         
        btnConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //서버로 연결
                makeConnection();
            }
        });
         
        this.setVisible(true);
    }//생성자 end
    public void sendMessage() {
        //textfield에 있는 문자열을  writer 를 이용해서 보내면 됨
        try {
            String msg = textField.getText(); 
            writer.write(nick +":" + msg);
            writer.newLine();
            writer.flush();
             
            //보내고 나서 해야할 일: 내가 작성한 내용을 textArea(채팅 내용화면)에 갖다 붙이기
            textArea.append("나: " + msg+"\n");
            //채팅 작성창 비워주기
            textField.setText("");
             
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void makeConnection() {
        //서버로 연결하기 : IP(textfield에서 가져오기), Port (8000)는 고정
        InetAddress ip = null;
        //ip 입력받는 textfield에서 ip 얻어와서 inetAddress 객체 얻기 
        try {
             
            ip = InetAddress.getByName(textFieldIp.getText());
            socket = new Socket(ip, 8000);
            //소켓얻어왔으니.. 데이터 전송을 위해서 스트림 얻어오기 
            writer = new BufferedWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream()));
            
            //서버로 부터 오는 메시지를 처리하기 위한 스레드 생성 및 시작
            Thread receiver = new Thread(new Receiver());
            receiver.start();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
    public static void main(String[] args) {
        ChatClient client = new ChatClient();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
         
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            sendMessage();
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
         
    }
      //Sender Thread가 필요 없는 이유는 보내기가 버튼 이벤트로 처리되기 때문에 필요없음
     //Receiver Thread는 화면을 보여주는 것과 동시에... 
    //서버로 부터 메시지를 계속해서 받아와야함 thread가 필요함
    
    class Receiver implements Runnable{

    	public void run() {
    		//소켓으로 부터 메시지 받아서 출력
    		BufferedReader reader = null;
    		String msg = null;
    		
    		//데이터를 소켓으로부터 읽어오기 위해서 스트림을 얻어옴
    		try {
    			reader = new BufferedReader(
    					new InputStreamReader(socket.getInputStream()));
    			while(true) {
    				msg = reader.readLine();
    				textArea.append( msg + "\n");
    				
    			}
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    }
}

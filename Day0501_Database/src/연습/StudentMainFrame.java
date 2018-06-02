package 연습;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



 
public class StudentMainFrame extends JFrame implements Serializable{
    private JTextField tfName;
    private JTextField tfTotal;
    private JTextField tfAverage;
    private JButton btnDetail;
    private JButton btnAll;
    private static final String FILE_NAME = "studentList.dat";
    private JList<Student> studentJList;	//목록을 화면에 보여주는 컴포넌트	
    							//화면에 나올 때 List가 아니라 Vector를 이용
    
    
    
    //학생리스트 보여주고 선택하여 기본정보를 보여주는 화면
    //데이터: 학생리스트	>> 실제 학생 정보를 가지고 있는 리스트 객체
    private Vector<Student> sList; 
    private JTextField textField;
    private JButton btnSearch;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JTextField tfKor;
    private JTextField tfEng;
    private JTextField tfMath;
    private JButton btnDelete;
    private JButton btnExit;
    private JButton btnAdd;
    private JLabel lblNewLabel_6;
    private JButton btnAllStudent;
    
    
    
    public StudentMainFrame() {
        this.setTitle("학생관리");
        this.setSize(691,478);
        
        
        //setDefaultData();	//기본데이터 생성 및 sList에 데이터 넣기
        
        loadData();
        
        
         
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
         
        studentJList = new JList(sList);		//학생 목록을 화면에 보여줄 컴포넌트
        studentJList.setBounds(33, 29, 219, 344);
       
        panel.add(studentJList);
         
        btnDetail = new JButton("상세보기");
        btnDetail.setBounds(347, 335, 121, 23);
        panel.add(btnDetail);
        btnDetail.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// 지금 선택된 목록의 학생 객체 가져오기
        		Student student = studentJList.getSelectedValue();	//
        		
        		tfName.setText(student.getName());
        		tfKor.setText(student.getKor() + "");
        		tfEng.setText(student.getEng() + "");
        		tfMath.setText(student.getMath() + "");
        		tfTotal.setText(student.getTotal() + ""); 	//숫자를 문자열로 만드는 꼼수 = 숫자 +""
        		tfAverage.setText(student.getAverage() + "");
        		
        	}
        });
         
        btnAll = new JButton("모든학생삭제");
        btnAll.setBounds(347, 377, 121, 23);
        panel.add(btnAll);
        btnAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(sList.size()==0) {
		            System.out.println("학생이 없습니다.");
		            return;
		        }
			
			//sList.remove(studentJList.);
			sList.clear();
			studentJList.setListData(sList);
			saveData();
				
			}
		});
        
        
        tfName = new JTextField();
        tfName.setBounds(336, 85, 116, 21);
        panel.add(tfName);
        tfName.setColumns(10);
         
        tfTotal = new JTextField();
        tfTotal.setBounds(534, 77, 116, 21);
        panel.add(tfTotal);
        tfTotal.setColumns(10);
         
        tfAverage = new JTextField();
        tfAverage.setBounds(534, 125, 116, 21);
        panel.add(tfAverage);
        tfAverage.setColumns(10);
         
        JLabel lblNewLabel = new JLabel("이름");
        lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel.setBounds(267, 88, 57, 15);
        panel.add(lblNewLabel);
         
        JLabel lblNewLabel_1 = new JLabel("총점");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setBounds(465, 80, 57, 15);
        panel.add(lblNewLabel_1);
         
        JLabel lblNewLabel_2 = new JLabel("평균");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2.setBounds(465, 128, 57, 15);
        panel.add(lblNewLabel_2);
        
        textField = new JTextField();
        textField.setBounds(33, 397, 116, 21);
        panel.add(textField);
        textField.setColumns(10);
        
        btnSearch = new JButton("검색");
        btnSearch.setBounds(149, 396, 97, 23);
        panel.add(btnSearch);
        btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				Student findStudent = null;
				//textfield 적은 이름이랑, 목록에 있는 학생의 이름이랑 같으면, 새롭게 화면에 띄울 목록에 추가 
				
				
				Vector<Student> findList = new Vector<Student>();
				String keyword = textField.getText();
				for(Student s : sList) {
					//학생의 이름이 키워드를 포함하고 있으면 findList에  학생이름 추가
					if(s.getName().contains(keyword)) {
						findList.add(s);
					}
				}
				
				studentJList.setListData(findList);	//JList화면에 findList보여주기
				studentJList.repaint();	//화면다시 그려주기
				
				
			}
		});
        
        lblNewLabel_3 = new JLabel("국어");
        lblNewLabel_3.setBounds(294, 131, 57, 15);
        panel.add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel("영어");
        lblNewLabel_4.setBounds(294, 172, 57, 15);
        panel.add(lblNewLabel_4);
        
        lblNewLabel_5 = new JLabel("수학");
        lblNewLabel_5.setBounds(294, 220, 43, 15);
        panel.add(lblNewLabel_5);
        
        tfKor = new JTextField();
        tfKor.setBounds(337, 128, 116, 21);
        panel.add(tfKor);
        tfKor.setColumns(10);
        
        tfEng = new JTextField();
        tfEng.setBounds(337, 169, 116, 21);
        panel.add(tfEng);
        tfEng.setColumns(10);
        
        tfMath = new JTextField();
        tfMath.setBounds(337, 217, 116, 21);
        panel.add(tfMath);
        tfMath.setColumns(10);
        
        btnDelete = new JButton("삭제");
        btnDelete.setBounds(505, 335, 116, 23);
        panel.add(btnDelete);
        
        btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(sList.size()==0) {
			            System.out.println("학생이 없습니다.");
			            return;
			        }
				
				sList.remove(studentJList.getSelectedIndex());
				studentJList.setListData(sList);
				saveData();
				
				
				
			}
		});
        
        btnExit = new JButton("종료");
        btnExit.setBounds(505, 377, 116, 23);
        panel.add(btnExit);
        btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveData();
				
				System.exit(0);
				
			}
		});
        
        btnAdd = new JButton("학생추가");
        btnAdd.setBounds(358, 261, 97, 23);
        btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Student student = new Student();
				
				student.setName(tfName.getText());
				student.setKor(Integer.parseInt(tfKor.getText()));
				student.setMath(Integer.parseInt(tfMath.getText()));
				student.setEng(Integer.parseInt(tfEng.getText()));
	
				sList.add(student);
				studentJList.setListData(sList);
				saveData();
				
			}
		});
        panel.add(btnAdd);
        
        lblNewLabel_6 = new JLabel("학생정보입력");
        lblNewLabel_6.setBounds(343, 43, 78, 15);
        panel.add(lblNewLabel_6);
        
        btnAllStudent = new JButton("모든학생목록");
        btnAllStudent.setBounds(513, 261, 116, 23);
        panel.add(btnAllStudent);
        this.setVisible(true);
        
        btnAllStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				new StudentList();
			}
		});
    }
    
    public void saveData() {
		// 데이터를 파일에 저장하는 기능
		// 파일출력(객체를 파일에 작성)
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("studentList.dat")));

			// 파일에 작성해야 하는 데이터>>>> sList
			oos.writeObject(sList);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadData() {
		// 파일로부터 데이터를 가져오는 기능
		// 파일입력
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("studentList.dat")));
			// 파일에서 sList 객체 가져와서 내가 관리할 sList에
			// 참조 시켜주면 된다.
			sList = (Vector<Student>) ois.readObject();

		}  catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			sList = new Vector<Student>();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    
    
//    public void setDefaultData() {
//    	sList = new Vector<Student>();
//    	
//    }
     
    public static void main(String[] args) {
    	StudentMainFrame mainFrame = new StudentMainFrame();
    	
    	
    }
}
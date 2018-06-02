package studentManagement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JTextField;


import student.Student;

import javax.swing.JButton;

public class Frame extends JFrame implements KeyListener{
	private JTextField tfName;
	private JTextField tfGrade;
	private JTextField tfKor;
	private JTextField tfMath;
	private JTextField tfEng;
	private JTextField tfSearch;
	
	private static final String FILE_NAME = "studentList.dat";
	private JList<Student> studentJList;
	private Vector<Student> sList;
	
	public Frame() {
		this.setTitle("학생관리");
		this.setSize(471, 433);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		studentJList  = new JList<Student>(sList);
		studentJList.setBounds(12, 10, 205, 310);
		panel.add(studentJList);
		
		JLabel lblNewLabel = new JLabel("학생정보입력");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel.setBounds(299, 10, 85, 15);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("이름");
		label.setBounds(259, 35, 32, 21);
		panel.add(label);
		
		tfName = new JTextField();
		tfName.setBounds(303, 35, 116, 21);
		panel.add(tfName);
		tfName.setColumns(10);
		
		JLabel label_1 = new JLabel("학년");
		label_1.setBounds(259, 66, 32, 21);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("국어점수");
		label_2.setBounds(240, 97, 62, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("수학점수");
		label_3.setBounds(240, 128, 62, 21);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("영어점수");
		label_4.setBounds(240, 159, 62, 21);
		panel.add(label_4);
		
		tfGrade = new JTextField();
		tfGrade.setColumns(10);
		tfGrade.setBounds(303, 66, 116, 21);
		panel.add(tfGrade);
		
		tfKor = new JTextField();
		tfKor.setColumns(10);
		tfKor.setBounds(303, 97, 116, 21);
		panel.add(tfKor);
		
		tfMath = new JTextField();
		tfMath.setColumns(10);
		tfMath.setBounds(303, 128, 116, 21);
		panel.add(tfMath);
		
		tfEng = new JTextField();
		tfEng.setColumns(10);
		tfEng.setBounds(303, 159, 116, 21);
		panel.add(tfEng);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(12, 338, 146, 28);
		panel.add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.setBounds(287, 190, 97, 28);
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Student student = new Student();
				
				student.setName(tfName.getText());
				student.setGrade(Integer.parseInt(tfGrade.getText()));
				student.setKor(Integer.parseInt(tfKor.getText()));
				student.setMath(Integer.parseInt(tfMath.getText()));
				student.setEng(Integer.parseInt(tfEng.getText()));
	
				sList.add(student);
			}
		});
		panel.add(btnAdd);
		btnAdd.addKeyListener(this);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setBounds(154, 337, 63, 29);
		panel.add(btnSearch);
		
		JButton btnShow = new JButton("모든학생보기");
		btnShow.setBounds(229, 254, 116, 28);
		panel.add(btnShow);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setBounds(346, 254, 97, 28);
		panel.add(btnDelete);
		
		JButton btnScore = new JButton("점수보기");
		btnScore.setBounds(229, 292, 116, 28);
		panel.add(btnScore);
		
		JButton btnExit = new JButton("종료");
		btnExit.setBounds(346, 292, 97, 28);
		panel.add(btnExit);
		
		this.setVisible(true);
	}
	 public void saveData() {
	        //데이터를 파일에 저장하는 기능
	        //파일출력(객체를 파일에 작성)
	        ObjectOutputStream oos = null;
	        try {
	            oos = new ObjectOutputStream(
	                    new BufferedOutputStream(
	                        new FileOutputStream("studentList.dat")));
	             
	            //파일에 작성해야 하는 데이터>>>> sList
	            oos.writeObject(sList);
	            oos.flush();
	             
	        }catch(FileNotFoundException e) {
	            e.printStackTrace();
	        }catch(IOException e) {
	            e.printStackTrace();
	        }finally {
	            try{
	                if(oos !=null) oos.close();
	            }catch(IOException e) {
	                e.printStackTrace();
	            }
	        }
	         
	         
	    }
	 public void loadData() {
	        //파일로부터 데이터를 가져오는 기능
	        //파일입력
	        ObjectInputStream ois = null;
	        try{
	            ois = new ObjectInputStream(
	                    new BufferedInputStream(
	                        new FileInputStream("studentList.dat")));
	            //파일에서 sList 객체 가져와서 내가 관리할 sList에
	            //참조 시켜주면 된다. 
	           
	                sList = (Vector<Student>)ois.readObject();

	        }catch(FileNotFoundException e) {
	        	System.out.println("파일이 없습니다.");
	            sList = new Vector<Student>();
	            e.printStackTrace();
	        }catch(IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
	            try{
	                if(ois !=null) ois.close(); 
	            }catch(IOException e) {
	                e.printStackTrace();
	            }
	        }
	 }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
	}
}

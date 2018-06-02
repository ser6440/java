package 연습;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class StudentList extends JFrame {
	private final String[] COLUMN_NAMES = { "이름", "국어", "영어", "수학", "총점", "평균" };
	private JTable table;
	private Vector<Student> sList;
	private JList<Student> studentJList;

	public StudentList() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel label = new JLabel("학생정보");
		label.setBounds(185, 25, 57, 15);
		panel.add(label);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 46, 410, 205);
		panel.add(scrollPane);

		table = new JTable();

		scrollPane.setViewportView(table);
		setModel();

		setSize(550, 400);
		setVisible(true);
	}

	public static void main(String[] args) {

		StudentList s = new StudentList();

	}

	// [][][][][][][]
	// [][][][][][][]
	// [][][][][][][]
	// [][][][][][][]
	// [][][][][][][]
	// [][][][][][][]
	// [][][][][][][]

	public void setModel() {
		table.setModel(new DefaultTableModel(new Object[sList.size()][COLUMN_NAMES.length], COLUMN_NAMES));

		DefaultTableModel model = new DefaultTableModel(getRow(), COLUMN_NAMES);
		table.setModel(model);
	}

	private Object[][] getRow() {
		Vector<Student> list = (Vector<Student>) studentJList.getModel();
		Object[][] lists = new Object[list.size()][COLUMN_NAMES.length];

		for (int i = 0; i < list.size(); i++) {
			// 데이터 채워 넣기
			lists[i][0] = list.get(i).getName();
			lists[i][1] = list.get(i).getKor();
			lists[i][2] = list.get(i).getEng();
			lists[i][3] = list.get(i).getMath();
			lists[i][4] = list.get(i).getTotal();
			lists[i][5] = list.get(i).getAverage();
		}
		return lists;
	}
}

package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dept.dao.DeptDao;
import test.dept.dto.DeptDto;

/*
 *  1. test.dept.dto.DeptDto 클래스를 만드세요
 *  2. test.dept.dao.DeptDao 클래스를 만드세요
 *  3. DeptDto 를 완성해 보세요.
 *  4. DeptDao 를 완성해 보세요.
 *  5. 위에 완성된 DeptDao 를 이용해서 아래 DeptFrame 을 구현해 보세요. 
 */
public class DeptFrame extends JFrame implements ActionListener, PropertyChangeListener{
	JTextField text_dname, text_loc;
	DefaultTableModel model;
	JTable table;
	
	public DeptFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.PINK);
		add(topPanel,BorderLayout.NORTH);
		JLabel label_dname=new JLabel("부서명");
		JLabel label_loc=new JLabel("지역");

		text_dname=new JTextField(10);
		text_loc=new JTextField(10);
		JButton btn_add=new JButton("추가");
		JButton btn_delete=new JButton("삭제");
		btn_add.setActionCommand("add");
		btn_add.addActionListener(this);
		btn_delete.setActionCommand("delete");
		btn_delete.addActionListener(this);

		topPanel.add(label_dname);
		topPanel.add(text_dname);
		topPanel.add(label_loc);
		topPanel.add(text_loc);
		topPanel.add(btn_add);
		topPanel.add(btn_delete);
		
		table=new JTable();
		String[] colNames= {"부서번호","부서명","지역"};
		model=new DefaultTableModel(colNames,0);
		table.setModel(model);
		JScrollPane scPane=new JScrollPane(table);
		add(scPane,BorderLayout.CENTER);
		printDept();
		
		table.addPropertyChangeListener(this);
	}
	
	public void printDept() {
		DeptDao dao=new DeptDao();
		List<DeptDto> list=dao.selectAll();
		model.setRowCount(0);
		for(DeptDto tmp:list) {
			Vector<Object> row=new Vector<>();
			row.add(tmp.getDeptNo());
			row.add(tmp.getdName());
			row.add(tmp.getLoc());
			model.addRow(row);
		}
	}
	public static void main(String[] args) {
		DeptFrame d=new DeptFrame("부서관리");
		d.setBounds(100, 100, 800, 500);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 action command 를 읽어온다.
		String command=e.getActionCommand();
		if(command.equals("add")) { //추가 버튼을 눌렀을때
			addDept();
		}else if(command.equals("delete")) {//삭제 버튼을 눌렀을때
			deleteDept();
		}
	}
	public void addDept() {
		String dName=text_dname.getText();
		String loc=text_loc.getText();
		
		DeptDto dto=new DeptDto();
		dto.setdName(dName);
		dto.setLoc(loc);
		
		DeptDao dao=new DeptDao();
		boolean isSuccess=dao.insert(dto);
		if(isSuccess) {
			JOptionPane.showMessageDialog(this, dName+" 의 정보 추가됨");
			printDept();
		}else {
			JOptionPane.showMessageDialog(this, "추가 실패함");
		}
		
	}
	public void deleteDept() {
		//선택된 row 의 인덱스를 읽어온다.
		int selectedIndex=table.getSelectedRow();
		if(selectedIndex == -1) {
			JOptionPane.showMessageDialog(this,"삭제할 부서를 선택하세요");
			return;//메소드를 여기서 끝내라 
		}
		//선택한 row 의 0 번 칼럼의 값(번호)을 읽어와서 int 로 casting 하기 
		int deptno=(int)table.getValueAt(selectedIndex, 0);
		int result=JOptionPane.showConfirmDialog(this, deptno+" 번 부서를 삭제하시겠습니까?");
		if(result == JOptionPane.YES_OPTION) {
			new DeptDao().delete(deptno);
			printDept();
		}
	}
	class UpdateThread extends Thread{
		@Override
		public void run() {
			// 바깥에 싸고 있는 클래스의 멤버 메소드 printMember() 메소드를 
			// 5초마다 한번씩 주기적으로 호출하기
			while(true) {//무한 루프
				try {
					//5초 잠자다가
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//수정중이 아닐때 화면 업데이트
				if(!isEditing) {
					printDept();
				}
			}
		}
	}
	//table 칼럼이 수정중인지 여부 
	boolean isEditing=false;
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("change!");
		System.out.println(evt.getPropertyName());
		//만일 table 칼럼에서 발생한 이벤트라면
		if(evt.getPropertyName().equals("tableCellEditor")) {
			if(isEditing) {
				//수정된 row 를 읽어와서 DB 에 반영한다.
				int selectedIndex=table.getSelectedRow();
				int deptNo=(int)model.getValueAt(selectedIndex, 0);
				String dName=(String)model.getValueAt(selectedIndex, 1);
				String loc=(String)model.getValueAt(selectedIndex, 2);
				DeptDto dto=new DeptDto(deptNo,dName,loc);
				new DeptDao().update(dto);
			}
			isEditing=!isEditing;
			}
	}
						
}






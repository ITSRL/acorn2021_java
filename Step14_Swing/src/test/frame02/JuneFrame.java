package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JuneFrame extends JFrame implements ActionListener {	// 1. JFrame을 상속받고
																	// 3. String type 을 인자로 받을 생성자
	public JuneFrame(String title) {
		super(title);												// 5. 부모 생성자에 전달해야해
		this.setLayout(new FlowLayout());							// 8. 레이아웃 법칙 만들기  this 생략가능
		JButton runBtn=new JButton("달리기");							// 7. 버튼만들기 근데 이렇게 만들면 창 전체가 버튼이야
		this.add(runBtn);											//    this 생략 가능
		runBtn.addActionListener(this);								// 9. 왜 안되지? implements ActionListener 해야 되지
		
	}	
	
	public static void main(String[] args) { 						// 2. main 컨트롤스페이스 메인메소드 만들고
		//생성자 만들고 프레임 작업 시작
		//JuneFrame j=new JuneFrame("준프레임"); 왜 오류가 날까? 스트링타입을 받을 준비가 안되있어 
		JuneFrame j=new JuneFrame("준프레임"); 
		j.setBounds(100, 100, 500, 500);
		j.setVisible(true);    										// 4. 여기까지 했는데 왜 제목이 안나올까? 
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 			// 6. 종료하면 프로세스가 종료되게 하는법 <여기까지 빈프레임 만들기
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "달려달려!");
	}

}

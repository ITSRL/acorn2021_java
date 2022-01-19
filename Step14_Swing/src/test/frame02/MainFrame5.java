package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame5 extends JFrame implements ActionListener{
	public MainFrame5(String name) {
		super(name);
		setLayout(new FlowLayout());
		JButton btn1=new JButton("attack");
		JButton btn2=new JButton("stop");
		
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		btn1.setActionCommand("공격");
		btn2.setActionCommand("중지");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		if(command.equals("공격")) {
			JOptionPane.showMessageDialog(this, "공격합니다");
		}else {
			JOptionPane.showMessageDialog(this, "중지합니다");
		}
	}
	
	public static void main(String[] args) {
		MainFrame5 f=new MainFrame5("마린");
		f.setBounds(150, 150, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		}
}

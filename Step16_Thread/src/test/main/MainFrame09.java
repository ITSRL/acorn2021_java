package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame09 extends JFrame implements ActionListener{

   public MainFrame09(String title) {
      super(title);
      setLayout(new BorderLayout());
      JButton btn=new JButton("인사하기");
      btn.addActionListener(this);
      
      add(btn, BorderLayout.NORTH);
   }
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
 
      new Thread(()->{
         try {
            for(int i=0; i<20; i++) {
               System.out.println("안녕하세요");
               Thread.sleep(1000);
            }
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }     
      }).start();
      
      new Thread(()->{
         try {
            for(int i=0; i<4; i++) {
               System.out.println("반갑습니다");
               Thread.sleep(5000);
            }
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }   
      }).start();
   }
   
   public static void main(String[] args) {
      MainFrame09 f=new MainFrame09("인사봇");
      f.setBounds(300, 300, 500, 500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }
}



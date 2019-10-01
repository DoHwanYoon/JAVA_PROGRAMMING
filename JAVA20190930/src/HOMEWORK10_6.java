import java.awt.event.*;
import javax.swing.*;

public class HOMEWORK10_6 extends JFrame{
	 JPanel Jpanel = new JPanel();
	    JLabel Jlabel = new JLabel("random label");
	    HOMEWORK10_6()
	    {	       
	        this.setTitle("자바프로그래밍2 1분반 #1(Chap10.6) 20153251 윤도환");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	        setContentPane(Jpanel);
	        Jpanel.setLayout(null);
	        Jlabel.addMouseListener(new clickListener());
	        Jlabel.setLocation(100, 100);
	        Jlabel.setSize(100, 50);
	        Jpanel.add(Jlabel);
	       
	        setSize(300, 300);
	        setVisible(true);
	    }
	   
	    public class clickListener implements MouseListener
	    {

	        public void mouseClicked(MouseEvent e)
	        {
	            Jlabel.setLocation((int)(Math.random()*200), (int)(Math.random()*200));
	        }
	        public void mousePressed(MouseEvent e) {}
	        public void mouseReleased(MouseEvent e) {}
	        public void mouseEntered(MouseEvent e) {}
	        public void mouseExited(MouseEvent e) {}
	       
	    }
	   
	    public static void main(String[] args)
	    {
	        new HOMEWORK10_6();
	    }
}

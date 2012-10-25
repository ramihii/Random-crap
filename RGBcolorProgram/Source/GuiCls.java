import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GuiCls extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton but1;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JLabel lab1;
	
	Color s;
	
	int CRed;
	int CGreen;
	int CBlue;
	
	public GuiCls(){
		but1 = new JButton("X");
		text1 = new JTextField("255");
		text2 = new JTextField("255");
		text3 = new JTextField("255");
		lab1 = new JLabel("Color Code RGB:");
		
		CRed = 255;
		CGreen = 255;
		CBlue = 255;
		
		setLayout(null);
		setSize(300, 150);
		setResizable(false);
		setTitle("RGB - Color Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lab1.setBounds(0, 0, 100, 25);
		but1.setBounds(249, 0, 45, 25);
		text1.setBounds(100, 0, 50, 25);
		text2.setBounds(150, 0, 50, 25);
		text3.setBounds(200, 0, 50, 25);
		
		add(lab1);
		add(but1);
		add(text1);
		add(text2);
		add(text3);
		
		Listener listen = new Listener();
		but1.addActionListener(listen);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		this.setBackground(Color.WHITE);
		s = new Color(CRed, CGreen, CBlue);
		g.setColor(s);
		g.fillRect(0, 50, 300, 125);
	}
	
	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==but1){
				int r = 255;
				int g = 255;
				int b = 255;
				try{
					r = Integer.parseInt(text1.getText());
					g = Integer.parseInt(text2.getText());
					b = Integer.parseInt(text3.getText());
					
					CRed=r; CGreen=g; CBlue=b;
					repaint();
				}catch(Exception ex1){}
				
					
				
			}
			
		}
	}

}

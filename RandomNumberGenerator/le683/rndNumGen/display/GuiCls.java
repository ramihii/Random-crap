package le683.rndNumGen.display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import le683.rndNumGen.data.RandomIntGen;

public class GuiCls extends JFrame {
	JLabel lab1;
	JLabel lab2;
	JTextField text1;
	JButton but1;
	
	RandomIntGen rand = new RandomIntGen();
	
	public GuiCls(){
		
		lab1=new JLabel("0");
		lab2=new JLabel("Mady by Le683 :D");
		text1=new JTextField("highest");
		but1=new JButton("Randomize");
		
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Randomizer");
		this.setSize(300, 100);
		
		lab1.setBounds(0,0,50,25);
		text1.setBounds(0,25,75,25);
		but1.setBounds(75,25,100,25);
		lab2.setBounds(190,50,100,25);
		
		this.add(lab1);
		this.add(text1);
		this.add(but1);
		this.add(lab2);
		
		Listen listen = new Listen();
		but1.addActionListener(listen);
	}
	
	public class Listen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==but1){
				System.out.println("but1");
				try{
					lab1.setText(Integer.toString(rand.generateRandom(Integer.parseInt(text1.getText()))));
				}catch(Exception err){
					System.out.println("Error");
				}
			}
				
		}
		
	}
}

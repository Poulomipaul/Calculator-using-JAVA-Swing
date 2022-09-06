package practice2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class GUIDesign{
	JFrame f1; 
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	GUIDesign(){
		f1= new JFrame("Calculator");
		f1.setSize(400,500);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1= new JLabel("<html><font color='blue'>Enter First Number: </font></html>");
		t1=new JTextField();
		l2=new JLabel("<html><font color='blue'>Enter Second Number: </font></html>");
		t2=new JTextField();
		l3=new JLabel("<html><font color='blue'>Result: </font></html>");
		t3=new JTextField();
		b1=new JButton("<html><font color='red'>+ </font></html>");
		b2=new JButton("<html><font color='red'>- </font></html>");
		b3=new JButton("<html><font color='red'>* </font></html>");
		b4=new JButton("<html><font color='red'>/ </font></html>");
		
		l1.setBounds(50,20,150,50);
		t1.setBounds(180,30,150,30);
		l2.setBounds(30,100,150,50);
		t2.setBounds(180,110,150,30);
		l3.setBounds(60,200,150,50);
		//width height width height
		t3.setBounds(180,200,150,30);
		b1.setBounds(20,250,50,30);
		b2.setBounds(90,250,50,30);
		b3.setBounds(160,250,50,30);
		b4.setBounds(230,250,50,30);
		
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(l3);
		f1.add(t3);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		
		f1.setLayout(null);
		f1.setVisible(true);
		b1.addActionListener(new f1());
		b2.addActionListener(new f1());
		b3.addActionListener(new f1());
		b4.addActionListener(new f1());
	}
	class f1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String data= t1.getText();
//	System.out.println(data);
			//t2.setText(data);
			String data1= t2.getText();
	//System.out.println(data1);
			String op=e.getActionCommand();
			if(op=="+") {
				int res= Integer.parseInt(data)+Integer.parseInt(data1);
			String s= Integer.toString(res);
	//System.out.println(s);
			t3.setText(s);
			}
			if(op=="-") {
				int res= Integer.parseInt(data)-Integer.parseInt(data1);
				String s= Integer.toString(res);
				t3.setText(s);
			}
			if (op=="*") {
				int res = Integer.parseInt(data)*Integer.parseInt(data1);
				String s=Integer.toString(res);
				t3.setText(s);
			}
			if(op=="/") {
				if(data1=="0") {
					System.out.println("Divisible by 0 is not possible");
				}
				else {
					float res= Float.parseFloat(data)/Float.parseFloat(data1);
					String s= Float.toString(res);
					t3.setText(s);
				}
			}
			
			
			
			
				}
			}
	}


public class Calculator {
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GUIDesign ob= new GUIDesign();
	}

}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel DisplayL;
	JButton Button7;
	JButton Button8;
	JButton Button9;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button0;
	JButton Buttondot;
	JButton Buttonplus;
	JButton Buttonminus;
	JButton Buttondiv;
	JButton Buttonmult;
	JButton Buttonequal;
	JButton Buttonclear;
	int work;
	float num3;
	float num1;
	boolean dot=false;
	float num2 ;
	String numf2;
	String ans;
	String numf1;
	
	
	public  void hai () {
		
		// Frame
		
		jf = new JFrame("Calculator");
		jf.setLocation(500, 250);
		jf.setSize(600,500);
		jf.setVisible(true);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setBackground(Color.red);
		
		// Label
		
		DisplayL = new JLabel();
		DisplayL.setLocation(50,50);
		DisplayL.setSize(500,50);
		DisplayL.setBackground(Color.orange);
		DisplayL.setOpaque(true);
		DisplayL.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayL.setForeground(Color.black);
		DisplayL.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(DisplayL);
		
		
		// Buttons
		
		
		// Button7
		
		Button7 =new JButton("7");
		Button7.setFont(new Font("Arial",Font.PLAIN,40));
		Button7.setLocation(50,130);
		Button7.setSize(60,60);
		Button7.addActionListener(this);
		jf.add(Button7);
		
		// Button8
		
		Button8 =new JButton("8");
		Button8.setLocation(120,130);
		Button8.setSize(60,60);
		Button8.setFont(new Font("Arial",Font.PLAIN,40));;
		Button8.addActionListener(this);
		jf.add(Button8);
		
		// Button9
		
		Button9 =new JButton("9");
		Button9.setLocation(190,130);
		Button9.setSize(60,60);
		Button9.setFont(new Font("Arial",Font.PLAIN,40));
		Button9.addActionListener(this);
		jf.add(Button9);
		
		// Button4
		
		Button4 =new JButton("4");
		Button4.setLocation(50,200);
		Button4.setSize(60,60);
		Button4.setFont(new Font("Arial",Font.PLAIN,40));
		Button4.addActionListener(this);
		jf.add(Button4);
		
		// Button5
		
		Button5 =new JButton("5");
		Button5.setLocation(120,200);
		Button5.setSize(60,60);
		Button5.setFont(new Font("Arial",Font.PLAIN,40));
		Button5.addActionListener(this);
		jf.add(Button5);
		
		// Button6
		
		Button6 =new JButton("6");
		Button6.setLocation(190,200);
		Button6.setSize(60,60);
		Button6.setFont(new Font("Arial",Font.PLAIN,40));
		Button6.addActionListener(this);
		jf.add(Button6);
		
		// Button1
		
		Button1 =new JButton("1");
		Button1.setLocation(50,270);
		Button1.setSize(60,60);
		Button1.setFont(new Font("Arial",Font.PLAIN,40));
		Button1.addActionListener(this);
		jf.add(Button1);
		
		// Button2
		
		Button2 =new JButton("2");
		Button2.setLocation(120,270);
		Button2.setSize(60,60);
		Button2.setFont(new Font("Arial",Font.PLAIN,40));
		Button2.addActionListener(this);
		jf.add(Button2);
		
		// Button3
		
		Button3 =new JButton("3");
		Button3.setLocation(190,270);
		Button3.setSize(60,60);
		Button3.setFont(new Font("Arial",Font.PLAIN,40));
		Button3.addActionListener(this);
		jf.add(Button3);
		
		// Buttondot
		
		Buttondot =new JButton(".");
		Buttondot.setLocation(50,340);
		Buttondot.setSize(60,60);
		Buttondot.setFont(new Font("Arial",Font.PLAIN,40));
		Buttondot.addActionListener(this);
		jf.add(Buttondot);
		
		// Button0
		
		Button0 =new JButton("0");
		Button0.setLocation(120,340);
		Button0.setSize(130,60);
		Button0.setFont(new Font("Arial",Font.PLAIN,40));
		Button0.addActionListener(this);
		jf.add(Button0);
		
		// Buttonequal
		
		Buttonequal =new JButton("=");
		Buttonequal.setLocation(320,340);
		Buttonequal.setSize(130,60);
		Buttonequal.setFont(new Font("Arial",Font.PLAIN,40));
		Buttonequal.addActionListener(this);
		jf.add(Buttonequal);
		
		// Buttonplus
		
		Buttonplus =new JButton("+");
		Buttonplus.setLocation(320,130);
		Buttonplus.setSize(60,60);
		Buttonplus.setFont(new Font("Arial",Font.PLAIN,40));
		Buttonplus.addActionListener(this);
		jf.add(Buttonplus);
		
		// Buttonminus
		
		Buttonminus =new JButton("-");
		Buttonminus.setLocation(390,130);
		Buttonminus.setSize(60,60);
		Buttonminus.setFont(new Font("Arial",Font.PLAIN,40));
		Buttonminus.addActionListener(this);
		jf.add(Buttonminus);
		
		// Buttonmult
		
		Buttonmult =new JButton("x");
		Buttonmult.setLocation(320,200);
		Buttonmult.setSize(60,60);
		Buttonmult.setFont(new Font("Arial",Font.PLAIN,40));
		Buttonmult.addActionListener(this);
		jf.add(Buttonmult);
		
		// Buttondiv
		
		Buttondiv =new JButton("/");
		Buttondiv.setLocation(390,200);
		Buttondiv.setSize(60,60);
		Buttondiv.setFont(new Font("Arial",Font.PLAIN,40));
		Buttondiv.addActionListener(this);
		jf.add(Buttondiv);
		
		Buttonclear =new JButton("CLEAR");
		Buttonclear.setLocation(460,130);
		Buttonclear.setSize(120,60);
		Buttonclear.setFont(new Font("Arial",Font.PLAIN,25));
		Buttonclear.addActionListener(this);
		jf.add(Buttonclear);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Button7) {
			DisplayL.setText(DisplayL.getText()+"7");
		}else if (e.getSource()==Button8){
			DisplayL.setText(DisplayL.getText()+"8");
		}else if (e.getSource()==Button9){
			DisplayL.setText(DisplayL.getText()+"9");
		}else if (e.getSource()==Button4){
			DisplayL.setText(DisplayL.getText()+"4");
		}else if (e.getSource()==Button5){
			DisplayL.setText(DisplayL.getText()+"5");
		}else if (e.getSource()==Button6){
			DisplayL.setText(DisplayL.getText()+"6");
		}else if (e.getSource()==Button1){
			DisplayL.setText(DisplayL.getText()+"1");
		}else if (e.getSource()==Button2){
			DisplayL.setText(DisplayL.getText()+"2");
		}else if (e.getSource()==Button3){
			DisplayL.setText(DisplayL.getText()+"3");
		}else if (e.getSource()==Button0){
			DisplayL.setText(DisplayL.getText()+"0");
		}else if (e.getSource()==Buttondot){
			if(dot) {
				
			}else {
				dot=true;
				DisplayL.setText(DisplayL.getText()+".");
			}
		}else if (e.getSource()==Buttonplus){
			numf1=DisplayL.getText();
			num1 =Float.parseFloat(numf1);
			work=1;
			DisplayL.setText("");
			dot=false;
		}else if (e.getSource()==Buttonminus){
			numf1=DisplayL.getText();
			num1 =Float.parseFloat(numf1);
			work=2;
			dot=false;
			DisplayL.setText("");
		}else if (e.getSource()==Buttondiv){
			numf1=DisplayL.getText();
			num1 =Float.parseFloat(numf1);
			work=4;
			dot=false;
			DisplayL.setText("");
		}else if (e.getSource()==Buttonmult){
			numf1=DisplayL.getText();
			num1 =Float.parseFloat(numf1);
			work=3;
			dot=false;
			DisplayL.setText("");
		}else if (e.getSource()==Buttonclear){
			DisplayL.setText("");
			dot=false;
		}else if (e.getSource()==Buttonequal) {
			numf2="0"+DisplayL.getText();
			num2 =Float.parseFloat(numf2);
			if(work==1) {
				num3 = num1+num2;
			}else if(work==2) {
				num3 = num1-num2;
			}else if(work==3) {
				num3 = num1*num2;	
			}else if(work==4) {
				num3 = num1/num2;
			}
			DisplayL.setText(num3+"");
			work=0;
			num1=0;
			num2=0;
			num3=0;
			numf1="0";
			numf2="0";
			dot=true;
			
		}
	} public static void main(String[] args) {
		
		Calculator h = new Calculator ();
		h.hai();
	}
	
}

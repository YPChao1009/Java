/*
 * CALCULATOR-app17_18.java
 * Author:Yun Pei Chao 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class app17_18 {

	private static Frame frm=new Frame("Calculator");
	private static Panel pnl1=new Panel(new GridLayout(2, 5));
	private static Panel pnl2=new Panel(new GridLayout(1, 5));
	
	protected static Label lab=new Label("0. ",Label.RIGHT);
	protected static Button digits[]=new Button[10];
	protected static Button eql=new Button("=");
	protected static Button add=new Button("+");
	protected static Button sub=new Button("-");
	protected static Button mul=new Button("*");
	protected static Button div=new Button("/");
	protected static Button cn=new Button("c");
	
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		frm.setLayout(null);
		frm.setSize(300, 300);
		frm.setResizable(false);
		
		lab.setBounds(30, 40, 240, 40);
		lab.setBackground(new Color(135, 206, 250));
		
	pnl1.setBounds(30, 120, 240, 80);
	pnl2.setBounds(30, 240, 240, 40);
	
	for(int i=0;i<=9;i++) {
		digits[i]=new Button(Integer.toString(i));
		pnl1.add(digits[i]);
		digits[i].addActionListener(new ActLis()); 
	}
	
	pnl2.add(add);
	add.addActionListener(new ActLis());
	pnl2.add(sub);
	sub.addActionListener(new ActLis());
	pnl2.add(mul);
	mul.addActionListener(new ActLis());
	pnl2.add(div);
	div.addActionListener(new ActLis());
	pnl2.add(eql);
	eql.addActionListener(new ActLis());
	pnl2.add(cn);
	cn.addActionListener(new ActLis());
	
	
	frm.addWindowListener(new WindowAdapter() {
	
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	
	frm.add(lab);
	frm.add(pnl1);
	frm.add(pnl2);
	frm.setVisible(true);
	}

}

﻿/*
 * DrawPanelTest2.java
 * Author:Yun Pei Chao 
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
public class DrawPanelTest2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		DrawPanel2 panel=new DrawPanel2();
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}

}
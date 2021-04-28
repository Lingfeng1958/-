package com.Game_v4;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameUI extends JFrame{
	private ArrayList<Role> roles=new ArrayList<Role>();
	public void InitUI(){
		Vector location = new Vector(100,250);
		Vector location2 = new Vector(800,250);
		Vector speed = new Vector(0,0);
		Role role = new Role(location,speed,"������","kaichang");
		Role role2 = new Role(location2,speed,"������","kaichang");
		role.ActionInit();
		role2.ActionInit();
		this.roles.add(role);
		this.roles.add(role2);
		this.setSize(1280, 720);//���ô�С
		this.setLayout(new FlowLayout());//������ʽ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);//���ӻ�
		Graphics g = this.getGraphics();
		KeyListenter kl = new KeyListenter(role);
		this.addKeyListener(kl);
		DrawThread dt = new DrawThread(g,roles);
		dt.start();
	}
	
	public static void main(String[] args) {
		GameUI game = new GameUI();
		game.InitUI();
	}
}

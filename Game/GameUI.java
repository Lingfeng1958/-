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
		Role role = new Role(location,speed,"八神庵","kaichang");
		Role role2 = new Role(location2,speed,"坂崎良","kaichang");
		role.ActionInit();
		role2.ActionInit();
		this.roles.add(role);
		this.roles.add(role2);
		this.setSize(1280, 720);//设置大小
		this.setLayout(new FlowLayout());//启用流式布局
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);//可视化
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

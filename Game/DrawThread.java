package com.Game_v4;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class DrawThread extends Thread{//实现一个线程类:继承Thread类
	private Graphics g;
//s	Role role;
	Vector speed = new Vector(100,0);
	private ArrayList<Role> roles;
	Role role;
	Image imgback = new ImageIcon("D:\\Javacode\\java\\JavaBasic\\img\\拳皇\\background.jpg").getImage();
	public DrawThread(Graphics g, ArrayList<Role> roles){
		this.g = g;
		this.roles = roles;
	}
	//重写run方法，就是线程的主方法
	public void run(){		
		//创建缓存
		BufferedImage buffer = new BufferedImage(1280,720,BufferedImage.TYPE_INT_ARGB);
		Graphics bufferGraphics = buffer.getGraphics();
		
		//role.count = 0;
		while(true){
			for(int i=0;i<this.roles.size();i++){
				this.role=roles.get(i);
				//画这个角色
				this.role.draw(bufferGraphics);
				//显示缓存
				g.drawImage(buffer,0,0,null);
				if("kaichang".equals(this.role.gettype())){
					if(i==0){
						this.role.settype("kaichang");
						if(this.role.count<11){
							this.role.count++;
						}
						else{ 
							this.role.settype("zhanli");
							this.role.count=0;
						}
					}
					else{
						this.role.settype("kaichang");
						if(this.role.count<16){
							this.role.count++;
						}
						else{ 
							this.role.settype("zhanli");
							this.role.count=0;
						}
					}		
				}else if("j".equals(this.role.gettype())) {
					if(this.role.count<4){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.count=0;
					}
				}else if("k".equals(this.role.gettype())) {
					if(this.role.count<5){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.count=0;
					}
				}else if("i".equals(this.role.gettype())) {
					if(this.role.count<8){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.count=0;
					}
				}else if("o".equals(this.role.gettype())) {
					if(this.role.count<9){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.count=0;
					}
				}else if("aadj".equals(this.role.gettype())) {
					if(this.role.count<14){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.count=0;
					}
				}else if("adwj".equals(role.gettype())) {
					if(this.role.count<18){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.moveq(speed);
						this.role.count=0;
					}
				}else if("v".equals(this.role.gettype())) {
					if(this.role.count<1){
						this.role.count++;
					}
					else{ 
						this.role.settype("zhanli");
						this.role.count=0;
					}
				}else if("w".equals(this.role.gettype())) {
					if(this.role.count<12){
						this.role.count++;
					}
					else{ 
						role.settype("zhanli");
						role.count=0;
					}
				}else if("c".equals(role.gettype())) {
					if(role.count<35){
						role.count++;
					}
					else{ 
						role.settype("zhanli");
						role.count=0;
					}
				}
				else role.count=0;		
				System.out.println(role.count);
			}
			try{
				if("w".equals(role.gettype())){
					Thread.sleep(50);
				}
				else Thread.sleep(70);
			}catch(Exception ef){}
			bufferGraphics.drawImage(imgback, 0, 0, 1280, 720, null);	
		}
	}
}
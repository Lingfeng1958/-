package com.Game_v4;

import java.awt.Graphics;
import com.Game_v1.DrawImage;

public class Role {
	//位置
	private Vector location ;
	//角色名字
	private String name;
	//动作类型
	private String type;
	//标志
	public int count = 0;
	//移动速度
	Vector speed0 = new Vector(12,0);
	Vector speed1 = new Vector(-12,0);
	//创建动作对象	
	DrawImage kc,zl,zt,qjin,ht,xd,jn1,jn2,qj,zj,qq,zq,bd,jf;
	
	public void ActionInit(){
		if("八神庵".equals(this.name))
		{
			kc = new DrawImage(name+"\\开场",12);
			zl = new DrawImage(name+"\\站立",9);
			zt = new DrawImage(name+"\\直跳",13);
			qjin = new DrawImage(name+"\\前进",10);
			ht = new DrawImage(name+"\\后退",9);
			xd = new DrawImage(name+"\\下蹲",6);
			jn1 = new DrawImage(name+"\\技能1",15);
			jn2 = new DrawImage(name+"\\技能2",60);
			qj = new DrawImage(name+"\\轻脚",6);
			zj = new DrawImage(name+"\\重脚",10);
			qq = new DrawImage(name+"\\轻拳",5);
			zq = new DrawImage(name+"\\重拳",9);
			bd = new DrawImage(name+"\\被打",2);
			jf = new DrawImage(name+"\\击飞",37);
		}
		else if("坂崎良".equals(this.name)){
			kc = new DrawImage(name+"\\开场",17);
			zl = new DrawImage(name+"\\站立",6);
			bd = new DrawImage(name+"\\被打",8);
		}
	}
	
	public Role(Vector location,Vector speed,String name, String type) {
		this.location=location;
		this.name=name;
		this.type=type;
	}
	
	public void settype(String type) {
		this.type=type;	
	}
	
	public String gettype() {
		return type;	
	}
	
	public void moveq(Vector speed) {
		this.location.add(speed);	
	}
	
	public boolean is_Visible() {
		if(location.x>0&&location.x<1280&&location.y>0&&location.y<768)return true;
		else return false;
	}
	
	public void draw(Graphics g) {
		if(type.equals("zhanli")){
			zl.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("j")){
			qq.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("d")){
			qjin.show(g, (int)this.location.x, (int)this.location.y, 450, 450);	
			this.location.add(speed0);
		}else if(type.equals("a")){
			ht.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
			this.location.add(speed1);
		}else if(type.equals("k")){
			qj.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("o")){
			zj.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("kaichang")){
			kc.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("w")){
			zt.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("i")){
			zq.show(g, (int)this.location.x-25, (int)this.location.y, 450, 450);
		}else if(type.equals("s")){
			xd.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("aadj")){
			jn1.show(g, (int)this.location.x-10, (int)this.location.y+10, 596, 450);
		}else if(type.equals("adwj")){
			jn2.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("v")){
			bd.show(g, (int)this.location.x, (int)this.location.y, 450, 450);
		}else if(type.equals("c")){
			jf.show(g, (int)this.location.x, (int)this.location.y-30, 317, 340);
		}
	}
}

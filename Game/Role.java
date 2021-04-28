package com.Game_v4;

import java.awt.Graphics;
import com.Game_v1.DrawImage;

public class Role {
	//λ��
	private Vector location ;
	//��ɫ����
	private String name;
	//��������
	private String type;
	//��־
	public int count = 0;
	//�ƶ��ٶ�
	Vector speed0 = new Vector(12,0);
	Vector speed1 = new Vector(-12,0);
	//������������	
	DrawImage kc,zl,zt,qjin,ht,xd,jn1,jn2,qj,zj,qq,zq,bd,jf;
	
	public void ActionInit(){
		if("������".equals(this.name))
		{
			kc = new DrawImage(name+"\\����",12);
			zl = new DrawImage(name+"\\վ��",9);
			zt = new DrawImage(name+"\\ֱ��",13);
			qjin = new DrawImage(name+"\\ǰ��",10);
			ht = new DrawImage(name+"\\����",9);
			xd = new DrawImage(name+"\\�¶�",6);
			jn1 = new DrawImage(name+"\\����1",15);
			jn2 = new DrawImage(name+"\\����2",60);
			qj = new DrawImage(name+"\\���",6);
			zj = new DrawImage(name+"\\�ؽ�",10);
			qq = new DrawImage(name+"\\��ȭ",5);
			zq = new DrawImage(name+"\\��ȭ",9);
			bd = new DrawImage(name+"\\����",2);
			jf = new DrawImage(name+"\\����",37);
		}
		else if("������".equals(this.name)){
			kc = new DrawImage(name+"\\����",17);
			zl = new DrawImage(name+"\\վ��",6);
			bd = new DrawImage(name+"\\����",8);
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

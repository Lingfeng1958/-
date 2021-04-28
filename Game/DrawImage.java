package com.Game_v4;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;

public class DrawImage {
	
	//图片数组
	Image img[] ;
	//记录图片绘制的下标
	int curImageIndex = 0;
	
	public DrawImage(String imageName,int count) {
		img = new Image[count];
		//创建每一张图片
		String filePath = "D:\\Javacode\\java\\JavaBasic\\img\\拳皇\\八神庵\\";
		for(int i=0; i<count; i++) {
			//图片完整路径
			String fileName = filePath+imageName+"\\"+i+".png";
			img[i] = new ImageIcon(fileName).getImage();
		}
	}
	
	//绘制
	public void show(Graphics g,int x,int y,int w,int h) {	
		g.drawImage(img[curImageIndex], x, y, w, h, null);	
		curImageIndex++;	
		//count超出边界，归0
		if(curImageIndex == img.length) {
			curImageIndex = 0;
		}	
		
	}
	
	
}

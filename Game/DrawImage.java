package com.Game_v4;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;

public class DrawImage {
	
	//ͼƬ����
	Image img[] ;
	//��¼ͼƬ���Ƶ��±�
	int curImageIndex = 0;
	
	public DrawImage(String imageName,int count) {
		img = new Image[count];
		//����ÿһ��ͼƬ
		String filePath = "D:\\Javacode\\java\\JavaBasic\\img\\ȭ��\\������\\";
		for(int i=0; i<count; i++) {
			//ͼƬ����·��
			String fileName = filePath+imageName+"\\"+i+".png";
			img[i] = new ImageIcon(fileName).getImage();
		}
	}
	
	//����
	public void show(Graphics g,int x,int y,int w,int h) {	
		g.drawImage(img[curImageIndex], x, y, w, h, null);	
		curImageIndex++;	
		//count�����߽磬��0
		if(curImageIndex == img.length) {
			curImageIndex = 0;
		}	
		
	}
	
	
}

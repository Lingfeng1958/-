package com.Game_v4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenter implements KeyListener{
	//��һ�ΰ�����ʱ��
	long lastKeyPressedTime = 0;
	//��Ч��ʱ����
	long span = 500;
	//��¼֮ǰ�İ����ַ�
	String pressedChars = "";
	Role role;
	public KeyListenter(Role role) {
		this.role = role;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//��ȡ��ǰʱ��
		long curTimes = System.currentTimeMillis();
		if(curTimes - lastKeyPressedTime > span) {
			pressedChars = "";
		}
		//����ʱ��
		lastKeyPressedTime = curTimes;
				
		pressedChars += e.getKeyChar();
		if("d".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("d");
		}
		if("s".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("s");
		}
		if("a".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("a");
		}
		System.out.println(pressedChars);
				
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if("s".equals(role.gettype()))role.settype("zhanli");
		if("d".equals(role.gettype()))role.settype("zhanli");
		if("a".equals(role.gettype()))role.settype("zhanli");
		if("j".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("j");
		}	
		if("k".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("k");
		}	
		if("i".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("i");
		}	
		if("o".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("o");
		}
		if("aadj".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("aadj");
		}
		if("adwj".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("adwj");
		}
		if("v".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("v");
		}
		if("w".equals(pressedChars)&&"zhanli".equals(role.gettype())) {
			role.settype("w");
		}
		
	}
}

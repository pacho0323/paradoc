package com.bancolombia.certificacion.paradoc.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotUtils extends Thread {
	
	private int time;
	private String usuario;
	private String clave;
	
	private static Robot robot;
	
	
	public RobotUtils(int time, String usuario, String clave) {
	
		this.time = time;
		this.usuario = usuario;
		this.clave = clave;
		
		initRobot();
	}
	
	public RobotUtils() {
		initRobot();
	}
	
	public void initRobot() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run () {
		
		ingresar(usuario);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		ingresar(clave);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	 }
		
	
	public void ingresar(String valor) {

		try {
			sleep(time);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		StringSelection stringSelection=new StringSelection(valor);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);

			
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	
		
	  }

}

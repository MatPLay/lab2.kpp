package fleet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller {
	
	private Destroyer destroyer = new Destroyer("Aist", 20);
	private Carrier carrier = new Carrier("Zybr", 80);
	
	public void connectTorpedoButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	boolean result = destroyer.launchTorpedo();
            	
            	if(result)
            		JOptionPane.showMessageDialog(null, "Торпеда запущена!");
            	else 
            		JOptionPane.showMessageDialog(null, "Не удалось запустить торпеду!");
            }
		});
	}
	
	public void connectSendPlaneButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	boolean result = carrier.sendPlane();
            	
            	if(result)
            		JOptionPane.showMessageDialog(null, "Самолёт запущен! Цель уничтожена!");
            	else 
            		JOptionPane.showMessageDialog(null, "Не удалось запустить самолёт!");
            }
		});
	}
	
	public void connectCarrierShootButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	carrier.shoot();
            	JOptionPane.showMessageDialog(null, "Авиация противника уничтожена!");
            }
		});
	}
	
	public void connectCarrierSwimButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	carrier.swim();
            	JOptionPane.showMessageDialog(null, "Авианосец успешно сменил позицию!");
            }
		});
	}
	
	public void connectDestroyerShootButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	destroyer.shoot();
            	JOptionPane.showMessageDialog(null, "Флот противника уничтожен!");
            }
		});
	}
	
	public void connectDestroyerSwimButton(final JButton button) {
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	destroyer.swim();
            	JOptionPane.showMessageDialog(null, "Эсминец успешно сменил позицию!");
            }
		});
	}

}

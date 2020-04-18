package com.company;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaGUI {
    //Owner owner;
    JFrame window, menu;
    ImageIcon img;
    JPanel panel, menuPanel;
    JLabel dogInfo,
           foodInfo,
           commandInfo;
    JButton commandBtn,
            poodleBtn,
            shepherdBtn,
            terrierBtn;
    JTextField commandName;
    MaGUI(Owner owner){
        window = new JFrame("dada");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        img = new ImageIcon("dada.jpg");
        window.setIconImage(img.getImage());

        panel = new JPanel();

        foodInfo = new JLabel("Amount of food: "+owner.dogFood.getFood());
        panel.add(foodInfo);

        dogInfo = new JLabel("Dog info: "+owner.dog.getInfo());
        panel.add(dogInfo);

        commandName = new JTextField();
        commandName.setBackground(Color.WHITE);
        commandName.setColumns(14);
        panel.add(commandName);

        commandBtn = new JButton("give command");
        commandBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String str;
                str=commandName.getText();
                if(owner.dog.executeCommand()){
                    commandInfo.setText("Command "+str+" was executed");
                    owner.feed();
                    str=String.valueOf(owner.dogFood.getFood());
                    foodInfo.setText(str);
                }else{
                    commandInfo.setText("Command "+str+" was not executed");
                }
            }
        });
        panel.add(commandBtn);

        commandInfo = new JLabel("");
        panel.add(commandInfo);

        window.getContentPane().add(panel);
        window.pack();
        window.setLocationRelativeTo(null);
    }

}

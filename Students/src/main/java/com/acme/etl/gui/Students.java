package com.acme.etl.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Students {

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Baby Name and Frequency of Occurence");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        JLabel label = new JLabel("File Name");
        frame.getContentPane().add(label);

        final JTextField fileNameField = new JTextField();
        frame.getContentPane().add(fileNameField);

        label = new JLabel("Baby Name");
        frame.getContentPane().add(label);

        final JTextField babyNameField = new JTextField();
        frame.getContentPane().add(babyNameField);

        label = new JLabel("Frequency");
        frame.getContentPane().add(label);

        final JTextField frequencyField = new JTextField();
        frame.getContentPane().add(frequencyField);

        
        JButton button = new JButton("click"); //creating instance of JButton  
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Add Code to search for the frequency of occurence
				String fileName = fileNameField.getText();
				
				String babyName = babyNameField.getText();
				
				// calculate frequency and set the Text of frequencyField
				
				int frequency = 10;  // Replace this calculated value
				frequencyField.setText("" + frequency);
			}
        	
        });
        // button.setBounds(130, 100, 100, 40); 
        frame.getContentPane().add(button);
        
        button = new JButton("Quit"); //creating instance of JButton  
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
        	
        });
        // button.setBounds(130, 100, 100, 40); 
        frame.getContentPane().add(button);        
        
        frame.setSize(400, 500);//400 width and 500 height  
        
        //Display the window.
        // frame.pack();
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

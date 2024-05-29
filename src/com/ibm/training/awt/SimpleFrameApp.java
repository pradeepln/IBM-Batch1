package com.ibm.training.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleFrameApp extends Frame implements ActionListener{
	
	MenuBar menuBar = new MenuBar();
	Menu fileMenu = new Menu("File");
	MenuItem newItem = new MenuItem("New");
	MenuItem open = new MenuItem("Open");
	MenuItem save = new MenuItem("Save");
	MenuItem exit = new MenuItem("Exit");
	
	TextArea textArea = new TextArea();
	
	public SimpleFrameApp() {
		super("This is My Java AWT App!");
		setSize(400, 600);
		setVisible(true);
		
		fileMenu.add(newItem);fileMenu.add(open);fileMenu.add(save);fileMenu.add(exit);
		menuBar.add(fileMenu);
		this.setMenuBar(menuBar);
		this.add(textArea);
		
		fileMenu.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Bye!");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new SimpleFrameApp();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String label = e.getActionCommand();
		switch(label) {
		case "Open":
			performOpen();
			break;
		}
	}

	private void performOpen() {
		FileDialog fd = new FileDialog(this, "Select File", FileDialog.LOAD);
		fd.setVisible(true);
		String file = fd.getFile();
		System.out.println(file);
	}

	
}

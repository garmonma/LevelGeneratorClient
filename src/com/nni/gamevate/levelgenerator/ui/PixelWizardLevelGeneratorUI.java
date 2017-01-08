package com.nni.gamevate.levelgenerator.ui;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import com.nni.gamevate.levelgenerator.ui.pixelwizard.EnemyType;

/**
 * 
 * @author Marcus Garmon
 * @date Jan 8, 2017
 */
public class PixelWizardLevelGeneratorUI extends JFrame{

	
	private static final long serialVersionUID = -5661687650309408977L;
	
	private BorderLayout mainLayout;
	private JPanel westPanel, eastPanel, centerPanel, northPanel, southPanel;
	
	public PixelWizardLevelGeneratorUI(){
		super("Level Generator UI");
		
		setSize(800, 600);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				PixelWizardLevelGeneratorUI.this.setVisible(false);
				PixelWizardLevelGeneratorUI.this.dispose();
			}
		});
		
		mainLayout = new BorderLayout();
		setLayout(mainLayout);
		
		initWestPanel();
		initEastPanel();
		initCentralPanel();
		initNorthPanel();
		initSouthPanel();
	}
	
	private void initWestPanel(){
		JLabel headerLabel = new JLabel("Enemies");
		JList<EnemyType> list = new JList<EnemyType>(loadEnemyList());
		JScrollPane scrollPane = new JScrollPane(list);
			
		westPanel = new JPanel();
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
		westPanel.add(headerLabel);
		westPanel.add(scrollPane);
		
		add(westPanel, BorderLayout.WEST);
	}
	
	private void initEastPanel(){
		eastPanel = new JPanel();
		add(eastPanel, BorderLayout.EAST);
	}
	
	private void initNorthPanel(){
		northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);
	}
	
	private void initSouthPanel(){
		southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);
	}
	
	private void initCentralPanel(){
		centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
	}
	
	private EnemyType[] loadEnemyList(){
		EnemyType[] et = new EnemyType[3];
		et[0] = EnemyType.GoblinInitiate;
		et[1] = EnemyType.Dragon;
		et[2] = EnemyType.MountedLance;
		
		return et;
	}
}
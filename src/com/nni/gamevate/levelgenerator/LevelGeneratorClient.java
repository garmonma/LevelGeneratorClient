package com.nni.gamevate.levelgenerator;

import javax.swing.SwingUtilities;

import com.nni.gamevate.levelgenerator.ui.PixelWizardLevelGeneratorUI;

public class LevelGeneratorClient {
	
	public static void main(String[] args){
	
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				final PixelWizardLevelGeneratorUI lg = new PixelWizardLevelGeneratorUI();
				lg.setVisible(true);
			}
		});
	}
}
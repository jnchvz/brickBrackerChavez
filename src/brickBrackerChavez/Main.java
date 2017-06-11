package brickBrackerChavez;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// Creating the JFrame and setting its properties
		JFrame obj = new JFrame();
		// Creating the object of the class Gameplay
		Gameplay gamePlay = new Gameplay();
		obj.setVisible(true);
		obj.setBounds(10,10,694,600 );
		obj.setTitle( "Brick bracker game" );
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adding the object gamePlay into the object of JFrame
		obj.add(gamePlay);
	}

}

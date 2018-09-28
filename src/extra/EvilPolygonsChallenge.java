package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot r2d3 = new Robot();
		// 2. Set the speed to 100
		r2d3.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "What Color?", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Green", "Blue" }, 0);
		r2d3.penDown();
		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			r2d3.setPenColor(255, 0, 0);
		} else if (colorChoice == 1) {

			r2d3.setPenColor(0, 255, 0);
		} else {
			r2d3.setPenColor(0, 0, 255);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String Quest = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		// 5. Use the robot to draw the number of polygons the user requested.
		int Num = Integer.parseInt(Quest);
		for (int i = 0; i < Num; i++) {

			r2d3.turn(90);
			r2d3.move(200);
			r2d3.turn(90);
			r2d3.move(200);
			r2d3.move(200);
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}

package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
	for (int i = 0; i < robots.length; i++) {
		robots[i]=new Robot();
	robots[i].setSpeed(10);
	
	}
	robots[0].setY(500);
	robots[0].setX(100);
	robots[1].setY(500);
	robots[1].setX(200);
	robots[2].setY(500);
	robots[2].setX(300);
	robots[3].setY(500);
	robots[3].setX(400);
	robots[4].setY(500);
	robots[4].setX(500);
	
		//2. create an array of 5 robots.
	while (robots[0].getY()>=0||robots[1].getY()>=0||robots[2].getY()>=0|| robots[3].getY()>=0||robots[4].getY()>=0) {
		  
		for (int i = 0; i < robots.length; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt(50);
			
			robots[i].move(randomNum);
			robots[i].turn(10);
			if(robots[i].getX()>=600) {
				JOptionPane.showMessageDialog(null, i + " wins");	
				break;
			}
	}
		}
	}				
	
	}
		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	


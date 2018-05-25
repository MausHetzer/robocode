/**
 * Copyright (c) 2001-2018 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 */
package Botato;
import java.lang.Math;
import robocode.*;
import java.awt.*;


/**
 * Tracker - a sample robot by Mathew Nelson.
 * <p>
 * Locks onto a robot, moves close, fires when close.
 *
 * @author Mathew A. Nelson (original)
 * @author Flemming N. Larsen (contributor)
 */
public class BotatoIII extends AdvancedRobot {
	private String Name = null;
	private int count = 0;
	private byte gunTurn = 1;
	setAdjustGunForRobotTurn(true);
	setAdjustRadarForRobotTurn(true);
	public void run() {
	setAllColours(Color.WHITE);
		
		while (true) {
			count++;
			setGunTurnRight(360 * gunTurn);
			execute();
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
		if(Name == null){
			Name = e.getName();
			gunTurn *= -1;
		}
		else if(Name.equals(e.getName())) && e.getDistance < 250){
			setTurnRight(e.getBearing() - 90);
			setAhead(45);
			gunTurn *= -1;
		}
		else if(Name.equals(e.getName() && e.getDistance >= 250){
			setTurnRight(e.getBearing();
			setAhead(e.getDistance() - 200);
			gunTurn *= -1;
		}
				     
		else{
			return;
		}
		setFire(300/e.getDistance());
	}

	public void onRobotDeath(RobotDeathEvent event) {
		if(Name.equals(e.getName())){
			Name = null;
		}
	}

	public void onWin(WinEvent e) {
		}
	}
}

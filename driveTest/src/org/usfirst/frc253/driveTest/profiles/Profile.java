package org.usfirst.frc253.driveTest.profiles;

import java.util.ArrayList;

import com.ctre.phoenix.motion.TrajectoryPoint;

public class Profile{
	private int kNumPoints;
	private double[][] points;
	private ArrayList<TrajectoryPoint> trajPoints;
	
	public Profile(int numPoints, double[][] points){
		this.kNumPoints = numPoints;
		this.points = points;
		
		this.trajPoints = genTrajPoint(this.kNumPoints, this.points);
	}
	
	private static ArrayList<TrajectoryPoint> genTrajPoint(int num, double[][] points){
		ArrayList<TrajectoryPoint> temp = new ArrayList<TrajectoryPoint>();
		
		for(int i = 0; i < num; i++){
			TrajectoryPoint point = new TrajectoryPoint();
			
			point.position = points[i][0];
			point.velocity = points[i][1];
			point.profileSlotSelect = 0;
			
			point.zeroPos = false;
			if(i == 0)
				point.zeroPos = true;
			
			point.isLastPoint = false;
			if(i + 1 == num)
				point.isLastPoint = true;
			
			temp.add(point);
		}
		
		return temp;
	}
	
	public int getNumPoints(){
		return kNumPoints;
	}
	
	public double[][] getPoints(){
		return points;
	}
	
	public ArrayList<TrajectoryPoint> getTrajPoints(){
		return trajPoints;
	}
}
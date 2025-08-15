package house;
import robocode.*;
import java.awt.Color;
import java.lang.Math;

public class CaçaSaci extends Robot
{
	double nDirecao;
	public void run() 
	{
		while(true) 
		{
			moveinsana();
		}
	}

	public void moveinsana()
	{
		if (getEnergy() < 20)
		{
			nDirecao = Math.random();
			if (nDirecao <= 0.5)
			{
				back(Math.random() * 500);
			}
			else
			{
				ahead(Math.random() * 500);
			}
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) 
	{

	}
		
	public void onHitByBullet(HitByBulletEvent e) 
	{
		ahead(10);
	}
	
	public void onHitWall(HitWallEvent e) 
	{
		moveinsana();
	}	
}

package house;
import robocode.*;
import java.lang.Math;

public class CaçaSaci extends Robot
{
	double dblDirecao, dblDistancia, dblMira;
	String strModo;
	public void run() 
	{
		while(true) 
		{
		turnRadarRight(360);
			if (getEnergy() >= 50)
			{
				strModo = "cabeçada";
			}
			else
			{
				strModo = "atirador";
			}
			
			if (strModo.equals("cabeçada"))
			{

			}
			else
			{
				moveinsana();
			}
		}
	}
	
	public void cabecada()
	{	
		
	}

	public void atirador()
	{	
		
	}
	public void moveinsana()
	{
		dblDirecao = Math.random();
		if (dblDirecao <= 0.5)
		{
			back(Math.random() * 500);
		}
		else
		{
			ahead(Math.random() * 500);
		}	
	}	

	public void onScannedRobot(ScannedRobotEvent e) 
	{
		dblDistancia = e.getDistance();
		dblMira = getRadarHeading() - getHeading();
		turnRight(dblMira);
		ahead(dblDistancia);
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

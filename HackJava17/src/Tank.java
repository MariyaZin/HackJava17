import java.awt.Point;

public class Tank extends Vehicule{
	double gunAngle;
	double gunMaxRange;
	
	
	public Tank(double speed, double maxRange, double turnRate, Point coords){
		super.maxSpeed = speed;
		super.turnRate = turnRate;
		super.coords = coords;
	}
	
}

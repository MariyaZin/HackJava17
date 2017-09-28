import java.awt.Point;

public abstract class MovingObject {
	double speed;			//object's speed
	Point coords;			//where the object is
	double direction;		//where the object is going
	double maxSpeed;		//Maximum speed it can go
	
	abstract void move();	//moves the object to a different position
	
}

package item;

import java.security.Identity;

public class SCV extends GroundUnit implements IRepairable {
	public SCV() {
		super(60);
		hitPoint = MAX_HP;
		
	}
	@Override
	public String toString() {
	
		return "SCV";
	}

	
	public void repair(IRepairable unit) {
		
		if(unit instanceof Unit) {
			Unit unit2 = (Unit)unit;
			unit2.hitPoint =unit2.MAX_HP;
		}
			
	}
}

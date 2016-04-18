public class GameOfLife {


public static State getNextState(State current, int neighbourCount) {
	
	if ((current == LIVE) && ((neighbourCount == 2) || (neighbourCount == 3))) {
		return LIVE;
	}
	
	if ((current == LIVE && ((neighbourCount == 0) || (neighbourCount == 1)) {
		return LIVE;
	}
	
	if ((current == LIVE && ((neighbourCount >=3) || (neighbourCount <=8)) {
		return DEAD;
	}
	
	if (current == DEAD && neighbourCount == 3) {
		return LIVE;
	}
	
	if ((current == DEAD) && ((neighbourCount >= 0) && (neighbourCount <=2)) {
		return DEAD;
	}
	if ((current == DEAD) && ((neighbourCount >= 4) && (neighbourCount <=8)) {
		return DEAD;
	}

}
public enum State {
	LIVE;
	DEAD;
}

}
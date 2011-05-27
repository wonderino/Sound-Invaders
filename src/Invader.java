import processing.core.PApplet;

public class Invader {
	private static enum State {
		WAIT, READY, MOVE, DEAD, ALIVE
	};

	private static enum Type {
		Mute, T0, T1, T2, T3, T4, T5, T6, T7
	};

	public static float block_width;
	public static float block_height;

	private PApplet parent;

	String gene;
	State currentState;
	Type thisType;
	Receiver targetReceiver;

	int xNth;
	int yNth;
	float posX;
	float posY;
	float velY;
	int color;

	public Invader(PApplet parent, String gene, int xnth, int ynth, int typeNum,
			Receiver targetReceiver) {
		this.parent = parent;
		this.gene = gene;
		this.xNth = xnth;
		this.yNth = ynth;
		this.targetReceiver = targetReceiver;
		// set posX and posY according to nth

		// set color
		color = this.parent.lerpColor(0, 360, xNth/7);

		// 
		block_width = parent.screenWidth * 0.01f;
		block_height = block_width;
		//
		
		// to decide type according to xnth
		switch (typeNum) {
		case 0:
			thisType = Type.T0;
			break;
		case 1:
			thisType = Type.T1;
			break;
		case 2:
			thisType = Type.T2;
			break;
		case 3:
			thisType = Type.T3;
			break;
		case 4:
			thisType = Type.T4;
			break;
		case 5:
			thisType = Type.T5;
			break;
		case 6:
			thisType = Type.T6;
			break;
		case 7:
			thisType = Type.T7;
			break;

		}
		//
		currentState = State.WAIT;
	}

	public State setState(State newState) {
		return currentState = newState;
	}

	public State getState() {
		return currentState;
	}

	public void update() {
		moveDown();
		draw();
	}

	public void draw() {
		if (currentState == State.WAIT) {

		} else if (currentState == State.READY) {

		} else if (currentState == State.MOVE) {

		} else if (currentState == State.ALIVE) {

		} else {

		}
	}

	public void drawInvader() {
		// draw Invader
		switch(thisType){
		case T0 :
			break;
		case T1 :
			break;
		case T2 :
			break;
		case T3 :
			break;
		case T4 :
			break;
		case T5 :
			break;
		case T6 :
			break;
		case T7:
			break;
		}
	}
	
	String mutate(){
		
		return gene;
	}
	

	void moveDown() {
		if (currentState == State.WAIT) {
			
		} else if (currentState == State.READY) {

		} else if (currentState == State.MOVE) {

		} else if (currentState == State.ALIVE) {

		} else {

		}
	}

	float setVelY(float bpm) {
		// calculate the velY according to bpm
		return bpm;
	}

	int addYNth() {
		if (yNth > 0)
			return --yNth;
		else
			return yNth;
	}

	int getXNth() {
		return xNth;
	}

	int getYNth() {
		return yNth;
	}

}
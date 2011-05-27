import processing.core.PApplet;
import oscP5.OscMessage;

public class Receiver {
	static enum State {
		Wait, Ready, Receiving
	};

	static enum Score {
		Miss, Poor, Good, Excellent
	};

	static float receiver_width = Invader.block_width * 10;
	static float receiver_height = Invader.block_height * 10;
	static float receiver_posY;

	private PApplet parent;
	private Invader targetInvader;

	private int nth;
	private float posX;
	private float posY;
	private int color;
	private State currentState;
	private boolean lastButtonPushed;
	private OscMessage currentMessage;

	public Receiver(PApplet parent, Invader targetInvader) {
		this.parent = parent;
		this.targetInvader = targetInvader;
		nth = targetInvader.xNth;
		posX = targetInvader.posX;
		receiver_posY = parent.screenHeight - receiver_height;
		// TODO :: decide COLOR according to nth

		float nthRatio = nth / 7;
		color = this.parent.lerpColor(0, 360, nthRatio);
		buttonPushed = false;
	}

	public void update() {
		if (currentState == State.Receiving) {
			
		}

	}

	public void draw() {

		parent.pushMatrix();
		parent.box(receiver_width);
		parent.popMatrix();
	}

	public Score checkHit() {
		// get score according to target invader and receiver's position
		float targetPosY = targetInvader.posY;
		Score thisScore = Score.Excellent;
		//

		return thisScore;
	}

	public boolean checkbuttonPushed(OscMessage buttonMessage) {
		// if button Message == 1 then buttonPushed = true else false
		if(!lastButtonPushed)  //&& buttonMessage is true 
		else] {
			
			return false;
		}
	}

	State changeState(State newState) {
		return currentState = newState;
	}

}
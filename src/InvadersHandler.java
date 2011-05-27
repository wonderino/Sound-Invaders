import processing.core.PApplet;
import java.util.ArrayList;
import java.lang.Math;

public class InvadersHandler {

	PApplet parent;
	ArrayList<Invader> invaders;
	ArrayList<Receiver> receivers;

	// TODO : phase를 어떻게 받아올 것인가!! 전체를 한번에 아니면 매번 생성되게 할 것인가?
	String[] totalPhases;
	String currentPhase;

	Timer timer;
	float currentBPM;
	boolean gameStarted;
	boolean gameOvered;

	StringBuffer thisPhaseScores;
	String lastPhaseScores;

	public InvadersHandler(PApplet parent, String[] totalPhases) {
		this.parent = parent;
		timer = new Timer(parent, 120.0f); // set initial BPM to 120.

		gameStarted = false;
		gameOvered = false;
		lastPhaseScores = "33333333";
		thisPhaseScores = new StringBuffer(8); // current phase's result set to
												// all excellent.

	}

	public String getPhase(String phase) {
		currentPhase = phase;
		return currentPhase;
	}

	public void update() {
		if (gameOvered) {
			// do ending title
		} else if (gameStarted) {
			// do playing
		} else {
			// do starting title

		}

	}

	public void draw() {

	}

	// TODO : 인베이더를 떨어뜨리는 타이밍을 결정해야함.
	private void drapInvaders(int nth) {

	}

	// TODO : 인베이더를 생성하는 원리를 결정해야함.
	private Invader makeInvader() {

	}

	// send hit message to MAX
	public string sendHitMessage() {

	}

	public void getInput(int nthButton) {

	}

	// TODO: 새로운 phase의 성공은

	private String getHits() {

	}

	private String mutate(String phase) {
		return phase;
	}

	private float changeBPM(float BPM) {
		currentBPM = BPM;
		return currentBPM;
	}

}



import processing.core.PApplet;
import java.util.ArrayList;
import java.lang.Math;

public class InvadersHandler {

	PApplet parent;
	ArrayList<Invader> invaders;
	ArrayList<Receiver> receivers;
	
	//TODO : phase를 어떻게 받아올 것인가!! 전체를 한번에 아니면 매번 생성되게 할 것인가?
	String[] phases;
	String thisPhase;
	String thisPhaseResult;
	
	Timer timer;
	float currentBPM;
	
	public InvadersHandler(PApplet parent, String[] phases) {
		this.parent = parent;
		this.phases = phases;
		//timer = new Timer();
		thisPhaseResult = "33333333";
			
	}
	
	public String getPhase(String phase){
		thisPhase = phase;
		return thisPhase;
	}
	
	public void update() {
		
	}
	
	public void draw() {
		
	}
	
	//TODO : 인베이더를 떨어뜨리는 타이밍을 결정해야함. 
	private void drapInvaders(int nth) {
	
	}
	
	//TODO : 인베이더를 생성하는 원리를 결정해야함.
	private Invader makeInvader() {
			
	}
	
	//send hit message to MAX
	public string sendHitMessage() {
		
	}
	
	//TODO: 새로운 phase의 성공은 
	
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


class Invader {
	static enum State{WAIT, READY, MOVE, DEAD, ALIVE};
	static enum Type{Mute, T1, T2, T3, T4, T5, T6, T7, T8};
	
	PApplet parent;
	
	String gene;
	State currentState;
	Type thisType;
	Receiver targetReceiver;
	
	int nth;
	float posX;
	float posY;
	float velY;
	
	Invader(PApplet parent, String gene, float posX, float posY) {
		this.parent = parent;
		this.gene = gene;
		currentState = State.WAIT;
	}

	void changeState(State newState){
		currentState = newState;
	}
	
	void update() {

	}
	
	// to draw according to gene
	void draw() {

	}
	
	void moveToReceiver() {
		
	}
}

class Receiver {
	static enum State{Wait, Ready, Miss, Poor, Good, Excellent};
	static float width;
	static float height;
	
	Invader targetInvader;
	int nth;
	float posX;
	float posY;
	
	State currentState;
	
	Receiver() {
		
	}
	
	void update(){
		
	}
	
	void draw() {
		
	}
	
	State checkHit(Invader invader){
		return State.Wait;
	}
	
	State changeState(State newState){
		return currentState = newState;
	}
	
}

/* TODO :: Timer class를 사용하여, invader를 동작시켜야함.
/* 새로운 소절을 시작할 것. -> bpm에 따라 타이밍을 계산해야함.
 * 소절에 따라 인베이더가 떨어질 타이밍을 알려줄 것 -> 이것이 문제!!
 */


class Timer {
	PApplet parent;
	boolean isStarted;
	int startTime;
	float currentBPM;
	int currentDuration;
	int maxDuration;
	
	Timer(PApplet parent, float bpm) {
		this.parent = parent;
		this.currentBPM = bpm;
		maxDuration = calMaxDuration(bpm);
	}
	
	int calMaxDuration(float BPM) {
		int millsPerBeat = Math.round(6000 / BPM);
		return millsPerBeat * 8;
	}
	
	int timerStart() {
		isStarted = true;
		currentDuration = 0;
		return startTime = parent.millis();
	}
	
	float setBPM(float newBPM){
		return currentBPM = newBPM;
	}
	
	int getDuration() {
		if (isStarted = true) return parent.millis()- startTime;
		else return -1;
	}
	
	void update() {
		currentDuration = parent.millis() - startTime;
		if (currentDuration >= maxDuration) isStarted = false; 
	}
	
	boolean isTimerOn() {
		return isStarted;
	}
}

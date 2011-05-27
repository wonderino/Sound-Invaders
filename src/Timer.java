import processing.core.PApplet;


/*
 * TODO :: Timer class를 사용하여, invader를 동작시켜야함. /* 새로운 소절을 시작할 것. -> bpm에 따라 타이밍을
 * 계산해야함. 소절에 따라 인베이더가 떨어질 타이밍을 알려줄 것 -> 이것이 문제!!
 */

public class Timer {
	PApplet parent;
	boolean isStarted;
	int startTime;
	float currentBPM;
	int currentDuration;
	int maxDuration;
	int durationPerUnit;

	Timer(PApplet parent, float bpm) {
		this.parent = parent;
		this.currentBPM = bpm;
		maxDuration = calMaxDuration(bpm);
	}

	int calMaxDuration(float BPM) {
		durationPerUnit = Math.round(6000 / BPM);
		return durationPerUnit * 8;
	}

	int timerStart() {
		isStarted = true;
		currentDuration = 0;
		return startTime = parent.millis();
	}

	int getCurrentUnitStage() {
		int stage = (int) Math.floor(currentDuration / maxDuration);
		return stage;
	}

	float setBPM(float newBPM) {
		return currentBPM = newBPM;
	}

	int getCurrentDuration() {
		if (isStarted = true)
			return currentDuration;
		else
			return -1;
	}

	void update() {
		currentDuration = parent.millis() - startTime;
		if (currentDuration >= maxDuration)
			isStarted = false;
	}

	boolean isTimerOn() {
		return isStarted;
	}
}

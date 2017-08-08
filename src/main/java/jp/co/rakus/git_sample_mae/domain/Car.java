package jp.co.rakus.git_sample_mae.domain;

public class Car {

	/** スピード*/
	private int speed;

	
	/**
	 * 走ります.
	 */
	public void run(){
		
		this.speed += 5;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

package jp.co.rakus.git_sample_mae.domain;

/**
 * @author hiroki.mae
 *
 */
public class Car {

	/** スピード */
	private int speed;

	/** 車体の色 */
	private String color;

	/** ブレーキ */
	private int brake;

	/**
	 * 走ります.
	 */
	public void run() {

		this.speed += 150;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBrake() {
		return brake;
	}

	public void setBrake(int brake) {
		this.brake = brake * 10;
	}

}

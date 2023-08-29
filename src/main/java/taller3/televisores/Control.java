package taller3.televisores;

public class Control {
	private TV tv;
	
	public Control(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
}

package observerPattern;

import jsrlog.JsrLog;

public class CurrentConditionsDisplay implements WeObserver, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject wSubject){
		this.weatherData = wSubject;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		// TODO Auto-generated method stub
		JsrLog.logout("Current conditions:" + temperature + "F degrees and" + humidity + "% humidity");
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}

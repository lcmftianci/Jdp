package observerPattern;

public class ForecastDisplay implements WeObserver, DisplayElement {

	private Subject weatherData;

	public ForecastDisplay(Subject wSubject) {
		// TODO Auto-generated constructor stub
		this.weatherData = wSubject;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		// TODO Auto-generated method stub

	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

	}

}

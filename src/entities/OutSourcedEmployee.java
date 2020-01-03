package entities;

public class OutSourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public final double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}

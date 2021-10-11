package fr.diginamic.banque.entites;

public class Theatre {

	public Theatre(String name, int maxPersons, int subscribed, double totalRevenues) {
		if (maxPersons < subscribed) {
			throw new IllegalArgumentException("Subscribed members is higher than the max persons number");
		}
		this.name = name;
		this.maxPersons = maxPersons;
		this.subscribed = subscribed;
		this.totalRevenues = totalRevenues;
	}

	public void subscribe(int numberOfClients, double ticketPrice) {
		if (this.subscribed + numberOfClients > this.maxPersons) {
			// throw new IllegalArgumentException("There is not enough place left for the
			// subscribers");
			System.out.println("There is not enough place left for the subscribers");
		} else {
			this.subscribed += numberOfClients;
			this.totalRevenues += numberOfClients * ticketPrice;

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxPersons() {
		return maxPersons;
	}

	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}

	public int getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(int subscribed) {
		this.subscribed = subscribed;
	}

	public double getTotalRevenues() {
		return totalRevenues;
	}

	public void setTotalRevenues(double totalRevenues) {
		this.totalRevenues = totalRevenues;
	}

	private String name;
	private int maxPersons;
	private int subscribed;
	private double totalRevenues;
}

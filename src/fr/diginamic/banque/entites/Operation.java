package fr.diginamic.banque.entites;

public abstract class Operation {
	public Operation(int date, int mount) {
		this.date = date;
		this.mount = mount;
	}
	
	public abstract String getType();

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMount() {
		return mount;
	}

	public void setMount(int mount) {
		this.mount = mount;
	}
	
	private int date;
	
	private int mount;
}

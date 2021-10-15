package fr.diginamic.recensement;

public class City {
	private int regionCode;
	private String regionName;

	private String departmentCode;
	private String departmentName;

	private int municipalityCode;
	private String municipalityName;

	private int inhabitant;

	public City(int regionCode, String regionName, String departmentCode, String departmentName, int municipalityCode,
			String municipalityName, int inhabitant) {
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.municipalityCode = municipalityCode;
		this.municipalityName = municipalityName;
		this.inhabitant = inhabitant;
	}

	public String toString() {
		return "Region : " + this.regionName + " - " + this.regionCode + " | Department : " + this.departmentName
				+ " - " + this.departmentCode + " | Municipality : " + this.municipalityName + " - "
				+ this.municipalityCode + " | Inhabitants : " + this.inhabitant;
	}

	public int getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getMunicipalityCode() {
		return municipalityCode;
	}

	public void setMunicipalityCode(int municipalityCode) {
		this.municipalityCode = municipalityCode;
	}

	public String getMunicipalityName() {
		return municipalityName;
	}

	public void setMunicipalityName(String municipalityName) {
		this.municipalityName = municipalityName;
	}

	public int getInhabitant() {
		return inhabitant;
	}

	public void setInhabitant(int inhabitant) {
		this.inhabitant = inhabitant;
	}

}

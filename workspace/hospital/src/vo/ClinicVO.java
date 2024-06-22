package vo;

public class ClinicVO {
	private int clinicNumber;
	private int animalNumber;
	private String clinicDisease;
	private String clinicTime;
	
	public ClinicVO() {;}

	public ClinicVO(int clinicNumber, int animalNumber, String clinicDisease, String clinicTime) {
		this.clinicNumber = clinicNumber;
		this.animalNumber = animalNumber;
		this.clinicDisease = clinicDisease;
		this.clinicTime = clinicTime;
	}

	public int getClinicNumber() {
		return clinicNumber;
	}

	public void setClinicNumber(int clinicNumber) {
		this.clinicNumber = clinicNumber;
	}

	public int getAnimalNumber() {
		return animalNumber;
	}

	public void setAnimalNumber(int animalNumber) {
		this.animalNumber = animalNumber;
	}

	public String getClinicDisease() {
		return clinicDisease;
	}

	public void setClinicDisease(String clinicDisease) {
		this.clinicDisease = clinicDisease;
	}

	public String getClinicTime() {
		return clinicTime;
	}

	public void setClinicTime(String clinicTime) {
		this.clinicTime = clinicTime;
	}

	@Override
	public String toString() {
		return "ClinicVO [clinicNumber=" + clinicNumber + ", animalNumber=" + animalNumber + ", clinicDisease="
				+ clinicDisease + ", clinicTime=" + clinicTime + "]";
	}
	
	
}

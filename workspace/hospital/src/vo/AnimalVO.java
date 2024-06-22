package vo;

public class AnimalVO {
	
	private int animalNumber;
	private String animalName;
	private String animalSpeices;
	private int ownerNumber;
	
	public AnimalVO() {;}

	public AnimalVO(int animalNumber, String animalName, String animalSpeices, int ownerNumber) {
		this.animalNumber = animalNumber;
		this.animalName = animalName;
		this.animalSpeices = animalSpeices;
		this.ownerNumber = ownerNumber;
	}

	public int getAnimalNumber() {
		return animalNumber;
	}

	public void setAnimalNumber(int animalNumber) {
		this.animalNumber = animalNumber;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalSpeices() {
		return animalSpeices;
	}

	public void setAnimalSpeices(String animalSpeices) {
		this.animalSpeices = animalSpeices;
	}

	public int getOwnerNumber() {
		return ownerNumber;
	}

	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	@Override
	public String toString() {
		return "AnimalVO [animalNumber=" + animalNumber + ", animalName=" + animalName + ", animalSpeices="
				+ animalSpeices + ", ownerNumber=" + ownerNumber + "]";
	}
	
	
}

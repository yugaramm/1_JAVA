package vo;

public class OwnerVO {
	
	private int ownerNumber;
	private String ownerName;
	private String ownerPhone;
	
	public OwnerVO() {;}

	public OwnerVO(int ownerNumber, String ownerName, String ownerPhone) {
		this.ownerNumber = ownerNumber;
		this.ownerName = ownerName;
		this.ownerPhone = ownerPhone;
	}

	public int getOwnerNumber() {
		return ownerNumber;
	}

	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	@Override
	public String toString() {
		return "OwnerVO [ownerNumber=" + ownerNumber + ", ownerName=" + ownerName + ", ownerPhone=" + ownerPhone + "]";
	}
	
}

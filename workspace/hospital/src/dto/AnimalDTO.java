package dto;

public class AnimalDTO {

   private String ownerName;
   private String animalName;
   private String animalSpeices;
   private String clinicDisease;
   private String clinicTime;

   public AnimalDTO() {;}

   public AnimalDTO(String ownerName, String animalName, String animalSpeices, String clinicDisease,
         String clinicTime) {
      super();
      this.ownerName = ownerName;
      this.animalName = animalName;
      this.animalSpeices = animalSpeices;
      this.clinicDisease = clinicDisease;
      this.clinicTime = clinicTime;
   }

   public String getOwnerName() {
      return ownerName;
   }

   public void setOwnerName(String ownerName) {
      this.ownerName = ownerName;
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
      return "AnimalDTO [ownerName=" + ownerName + ", animalName=" + animalName + ", animalSpeices=" + animalSpeices
            + ", clinicDisease=" + clinicDisease + ", clinicTime=" + clinicTime + "]";
   }
   
   
   
}


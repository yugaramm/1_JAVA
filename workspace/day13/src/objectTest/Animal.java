package objectTest;

public class Animal {
   
   private int number;
   private String name;
   private int age;
   private String species;
   private String weight;

   public Animal(int number, String name, int age, String species, String weight) {
      this.number = number;
      this.name = name;
      this.age = age;
      this.species = species;
      this.weight = weight;
   }
   
   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getSpecies() {
      return species;
   }

   public void setSpecies(String species) {
      this.species = species;
   }

   public String getWeight() {
      return weight;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

	@Override
	public String toString() {
		return "Animal [number=" + number + ", name=" + name + ", age=" + age + ", species=" + species + ", weight="
				+ weight + "]";
	}
   
//   @Override
//   public String toString() {
//      return "이름 : " + name + "\n나이 : " + age + "\n종 : " + species + "\n몸무게 : " + weight;
//   }
	
	//동물의 고유 코드가 같다면
	//true가 뜨도록 equals 메소드를 재정의하자.
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Animal) {
			Animal ani = (Animal)obj;
			return this.number == ani.number;
		}
		return false;
	}
   
   
   
}
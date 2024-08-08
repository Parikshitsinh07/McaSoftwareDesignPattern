
public class CompositionExample2{
    public static void main(String[] args) {
        Pet myPet = new Pet("Fluffy", "Cat");

        PetOwner petOwner = new PetOwner("Parikshit", myPet);

        System.out.println("Owner Name: " + petOwner.ownerName);
        System.out.println("Pet Name: " + petOwner.pet.name);
        System.out.println("Pet Species: " + petOwner.pet.species);
    }
}

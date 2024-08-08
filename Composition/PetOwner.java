class PetOwner {
     String ownerName;
     Pet pet; // Composition: PetOwner has a Pet

    public PetOwner(String ownerName, Pet pet) {
        this.ownerName = ownerName;
        this.pet = pet;
    }
	public String gewnerName(){
		return ownerName;
	}
	public Pet getpet(){
		return pet;
	}
}

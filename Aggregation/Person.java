// Person class containing a Smartphone (aggregation)
class Person {
    String name;
    int age;
    Smartphone personPhone;  // Aggregation - Person has a Smartphone

 
    public Person(String name, int age, Smartphone personPhone) {
        this.name = name;
        this.age = age;
        this.personPhone = personPhone;
    }

  
    public void displayPerson() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
        System.out.println("Phone Brand: " + personPhone.brand);
        System.out.println("Phone Model: " + personPhone.model);
    }
}
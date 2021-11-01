import org.w3c.dom.NameList;

public class Dog extends Pet {
    // Instance variable(s)
    String breed;
    String name;
    int age;
    // Constructors
    public Dog () {
        super();
        breed = "Bulldog";
        name = getName();
        age = getAge();
    }
    public Dog (String Name, int Age, String Breed) {
        super(Name,Age);
        name = Name;
        age = Age;
        breed = Breed;
    }
    // makeNoise() method
    public void makeNoise() {
        System.out.println("Bark");
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
    }

    // Getter

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }

    // Setter

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
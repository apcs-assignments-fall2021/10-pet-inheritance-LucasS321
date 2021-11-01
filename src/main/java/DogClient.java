public class DogClient {
    public static void main(String[] args) {
        Dog myDog = new Dog("Samuel",9461, "German Shepherd");
        System.out.println(myDog.toString());// Name: Samuel, Age: 9461, Breed: German Shepherd
        System.out.println(myDog.getAge());//9461
        System.out.println(myDog.getName());//Samuel
        System.out.println(myDog.getBreed());//German Shepherd
        myDog.setBreed("Poodle");
        myDog.setAge(12);
        myDog.setName("Jerry");
        myDog.makeNoise(); // Bark
        System.out.println(myDog.getAge()); // 12
        System.out.println(myDog.getName()); // Jerry
        System.out.println(myDog.getBreed()); // Poodle
    }
}
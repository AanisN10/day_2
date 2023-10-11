public class Person {

    private String name;

    private String town;

    private int age;


    //      Constructor this is used to set up our objects or initialise our objects
    public Person(String inputName, String inputTown) {
        this.name = inputName; // name:Aanis
        this.town = inputTown; // town: Tottenham
        this.age = 0;

    }

//    void greet(){
//        System.out.println("Good Morning");

    String greet() {
        return "Good Morning";
    }

    String generateBio() {
        return "My name is " + this.name + " and i live in " + this.town;
    }

    ;

//    setters & getters


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
//        regulation step/confirmation step
        this.name = newName;
    }


}

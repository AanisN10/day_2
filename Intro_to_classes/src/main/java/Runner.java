public class Runner {

    public static void main(String[] args) {

//        String name = "Aanis";
        Person person1 = new Person("Aanis", "Tottenham"); // instantied our objects using the help of the constructor
        Person person2 = new Person("Nuur", "London"); // instantied our objects using the help of the constructor


        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        // greet method
        person1.greet();
        person2.greet();

        String greet = person1.greet();
        System.out.println(greet);

        String generateBio = person1.generateBio();
        System.out.println(generateBio);


        person1.setName("Zvolt");
        System.out.println(person1.getName());





    }
}

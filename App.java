public class App {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop through the array and print each value
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        Person person = new Person("John", 25);

        person.displayInfo();

        person.setName("Jane");
        person.setAge(34);

    }
}
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
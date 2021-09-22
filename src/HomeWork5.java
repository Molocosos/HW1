/**
 * Java 1 HW 5
 *
 * @author Mironova Anastasiia
 * @version 21.09.2021
 */


public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] empLoy = new Employee[5];
        empLoy[0] = new Employee("Ivanov Ivan", "plumber", "ivanoiv@boxmail.com", "4851298", 45000, 53);
        empLoy[1] = new Employee("Kirilov Kirill", "electrician", "kirilovkir@boxmail.com", "9123947", 38000, 36);
        empLoy[2] = new Employee("Smirnova Victoria", "accountant", "smirnovavi@box.mail.com", "1238596", 60000, 29);
        empLoy[3] = new Employee("Bezrukova Natalia", "realtor", "bezrukovana@boxmail.com", "4168237", 115000, 41);
        empLoy[4] = new Employee("Smith Tom", "engineer", "smith@mail.com", "1498249", 78000, 25);

        for (Employee employee : empLoy)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}

class Employee {
    private String username;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String username, String position, String email, String telephone, int salary, int age) {
        this.username = username;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (username + "\n-"
                + position + "\n-"
                + email + "\n-"
                + telephone + "\n-"
                + salary + "\n-"
                + age);
    }
}

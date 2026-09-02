public class encapsulation {
    public static void main(String[] args) {

        bankBalance ba = new bankBalance();
        ba.deposit(5000);
        ba.withdraw(2000);
        System.out.println(ba.getBalance());

        Student s1 = new Student();
        System.out.println(s1.getName());
        s1.setName("Divyansh");
        System.out.println(s1.getName());


    }
}
class bankBalance {
    private double balance;

    bankBalance() {}

    bankBalance(int balance) {
        this.balance =  balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    //getters && setters
    public double getBalance() {
        return balance;
    }
}
class Student {
    private String name;
    private int age;
    private int rollNumber;
    private String college;

    Student(){
        this("Unknown");
    }
    Student(String name) {
        this(name, 0);
    }
    Student(String name, int age) {
        this(name, age, 0);
    }
    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "Unknown");
    }
    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    // getters && setters

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
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
}
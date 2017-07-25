package variables;

public class Person {

    int age;
    double height;
    String firstName;
    String lastName;
    boolean AStudent;
    String hobby;
    String passions;
    String phoneNumber;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isAStudent() {
        return AStudent;
    }

    public void setAStudent(boolean AStudent) {
        this.AStudent = AStudent;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPassions() {
        return passions;
    }

    public void setPassions(String passions) {
        this.passions = passions;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
public class PhoneBook {
       int[] array = new person[];

package variables;
public class PhoneBookExample {
public static void main(String[] args) {
    Person p1 = new Person("Alix", "Feinsod", "5105555555");
    Person p2 = new Person("Dave", "Baker", "1804444444");
    Person p3 = new Person("John", "Irwin", "9203333333");
    Person p4 = new Person("Hayden", "Mason", "2832222222");
    Person p5 = new Person("Benjamin", "Trott", "9341111111");
    PhoneBook pb= new PhoneBook();
    pb.Addperson(p1);
    pb.Addperson(p2);
    pb.Addperson(p3);
    pb.Addperson(p4);
    pb.Addperson(p5);
    pb.printEntries();
}
}

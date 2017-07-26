/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

public class PhoneBook {

    Person[] array;
    int length;

    public PhoneBook() {
        array = new Person[100];
        length = 0;
    }

    public void Addperson(Person p) {
        array[length] = p;
        length++;
    }

    public void printEntries() {
        for (int index = 0; index < length; index++) {
            System.out.println(array[index].getFirstName() + " " + array[index].getLastName() + ", " + array[index].getPhoneNumber());
        }

    }
}

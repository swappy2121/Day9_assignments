package com.Bridgelabz;
import javax.swing.*;
import java.util.*;

class PersonInfo {
    String First_Name;
    String Last_Name;
    String Address;
    String PhoneNumber;
    String State;
    String City;
    PersonInfo(String n,String s,String a, String p,String q,String r) {
        First_Name = n;
        Last_Name = s;
        Address = a;
        PhoneNumber = p;
        State = q;
        City = r;
    }

    void display() {
        JOptionPane.showMessageDialog(null,"First Name: " + First_Name +"\nLast Name : " + Last_Name +"\nAddress: " + Address + "\nPhone no: " + PhoneNumber + "\nstate : " + State + "\ncity : " + City);
    }
}
class AddressBook {
    ArrayList persons;

    AddressBook() {
        persons = new ArrayList();
    }

    // adding a Person Object
    void addPerson() {
        String Fname = JOptionPane.showInputDialog("Enter first Name:");
        String Lname = JOptionPane.showInputDialog("Enter last name:");
        String Add = JOptionPane.showInputDialog("Enter Address:");
        String pNum = JOptionPane.showInputDialog("Enter PhoneNo:");
        String State = JOptionPane.showInputDialog("Enter state:");
        String City = JOptionPane.showInputDialog("Enter City:");

        // creating a personInfo object
        PersonInfo p = new PersonInfo(Fname, Lname, Add, pNum, State, City);
        persons.add(p);
    }

    // searching for a person
    void searchPerson(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.First_Name)) {
                p.display();
            }
        }
    }

    // deleting a person
    void deletePerson(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.First_Name)) {
                persons.remove(i);
            }
        }
    }
}






       public class addressBook {

        public static void main(String[] args) {
            AddressBook ab = new AddressBook();
            String input, s;
            int ch;

            while (true) {
                input = JOptionPane.showInputDialog("Enter 1 to Add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit");
                ch = Integer.parseInt(input);


                switch (ch) {
                    case 1:
                        ab.addPerson();
                        break;
                    case 2:
                        s = JOptionPane.showInputDialog("Enter name to search:");
                        ab.searchPerson(s);
                        break;
                    case 3:
                        s = JOptionPane.showInputDialog("Enter name to delete:");
                        ab.deletePerson(s);
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
    }


           
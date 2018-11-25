package pl.sdacademy.java14poz.wlasneprogramy;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private String name;
    private String lastName;
    private int yearOfBirth;
    public enum Gender {MALE, FEMALE, UNKNOWN}
    private Gender gender;
    private String city;
    private List<Message> messages;
    private double balance;

    public User(String username, String password, String name, String lastName, int yearOfBirth, Gender gender, String city) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.city = city;
        this.messages = new ArrayList<Message>();
        this.balance = 0;
    }

    public User(String username, String password, String name, String lastName, int yearOfBirth, Gender gender) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.city = "Unknown city";
        this.messages = new ArrayList<Message>();
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "Account details:\n" +
                "\t- Name   --> " + name + " <--\n" +
                "\t- Last name   --> " + lastName + " <--\n" +
                "\t- Year of birth   --> " + yearOfBirth + " <--\n" +
                "\t- Gender   --> " + gender + " <--\n" +
                "\t- City   --> " + city + " <--";
    }

    public void showMessages(List<Message> messages) {
        System.out.println("\u2709 You have " + messages.size() + " message(s) in your mailbox.");
        if (!messages.isEmpty()) {
            int readMessages = 0;
            for (int i = 0; i < messages.size(); i++) {
                if (messages.get(i).isRead()) {
                    readMessages++;
                }
            }
            int unreadMessages = messages.size() - readMessages;
            System.out.println("Read messages: " + readMessages);
            if (readMessages != 0) {
                int counter = 0;
                for (int i = 0; i < messages.size(); i++) {
                    if (messages.get(i).isRead()) {
                        counter++;
                        System.out.println("-> Message number " + counter + ":");
                        System.out.println(messages.get(i).toString());
                    }
                }
            }
            System.out.println("Unread messages: " + unreadMessages);
            if (unreadMessages != 0) {
                int counter = 0;
                for (int i = 0; i < messages.size(); i++) {
                    if (!messages.get(i).isRead()) {
                        counter++;
                        System.out.println("-> Message number " + counter + ":");
                        System.out.println(messages.get(i).toString());
                        messages.get(i).setRead(true);
                    }
                }
            }
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is " + String.format("%.2f", getBalance()) + " $");
    }

    public String getUsername() {
        return username;
    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

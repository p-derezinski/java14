package pl.sdacademy.java14poz.wlasneprogramy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {

    private static List<User> users = new ArrayList<User>();
    private static Scanner scanner = new Scanner(System.in);
    private static AlbumChristmas albumChristmas = new AlbumChristmas();
    private static Shop shop = new Shop();

    public static void main(String[] args) {
        startApp(users);
    }

    private static void startApp(List<User> users) {
        System.out.println("===========================================================");
        System.out.println("==  Welcome to THE APP! The best app you have ever used  ==");
        System.out.println("===========================================================");
        printMenu1();
        boolean usingApp = true;
        while (usingApp) {
            int choice1 = scanner.nextInt();
            scanner.nextLine();
            switch (choice1) {
                case 0:
                    System.out.println("Thank you for using THE APP.");
                    usingApp = false;
                    break;
                case 1:
                    addUser();
                    break;
                case 2:
                    logIn();
                    break;
            }
        }
    }

    private static void printMenu1() {
        System.out.println("Available options. Press:\n" +
                "\t0 - to close THE APP\n" +
                "\t1 - to create an account\n" +
                "\t2 - to log in");
    }

    private static boolean addUser() {
        User user;
        System.out.println("Creating new account. Please provide the following information");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        boolean goodPassword = false;
        String password = null;
        while (!goodPassword) {
            System.out.print("Password (at least 5 characters): ");
            password = scanner.nextLine();
            if (password.length() < 5) {
                System.out.println("Password is too short.");
            } else {
                goodPassword = true;
            }
        }
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gender (M - male, F - female; if you prefer not to say, press Enter): ");
        String gend = scanner.nextLine();
        User.Gender gender;
        switch (gend) {
            case "M":
                gender = User.Gender.MALE;
                System.out.println(User.Gender.MALE + " registered.");
                break;
            case "F":
                gender = User.Gender.FEMALE;
                System.out.println(User.Gender.FEMALE + " registered.");
                break;
            default:
                gender = User.Gender.UNKNOWN;
                System.out.println(User.Gender.UNKNOWN + " gender registered.");
                break;
        }
        System.out.print("City (if you prefer not to say, press Enter): ");
        String city = scanner.nextLine();
        if (city.equals("")) {
            user = new User(username, password, name, lastName, yearOfBirth, gender);
        } else {
            user = new User(username, password, name, lastName, yearOfBirth, gender, city);
        }
        System.out.println("Account for user '" + username + "' has been successfully created.");
        printMenu1();
        return users.add(user);
    }

    private static void logIn() {
        User user;
        System.out.println("Logging in.");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        user = findUser(username);
        if (user == null) {
            System.out.println("User '" + username + "' does not exist in the database.");
        } else {
            boolean passwordCorrect = false;
            while (!passwordCorrect) {
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (password.equals(user.getPassword())) {
                    System.out.println("Hello, " + user.getName() + "! You are now logged in to your account.");
                    userMenu(user);
                    passwordCorrect = true;
                } else {
                    System.out.println("Incorrect password. Choose:\n\t1 - to try again\n\t2 - to go back to the main menu");
                    int choice2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice2) {
                        case 1:
                            break;
                        case 2:
                            passwordCorrect = true;
                            break;
                        default:
                            passwordCorrect = true;
                            break;
                    }
                }
            }
        }
        printMenu1();
    }

    private static User findUser(String username) {
        User user;
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                user = users.get(i);
                return user;
            }
        }
        return null;
    }

    private static void userMenu(User user) {
        printMenu2();
        boolean beingLoggedIn = true;
        while (beingLoggedIn) {
            int choice2 = scanner.nextInt();
            scanner.nextLine();
            switch (choice2) {
                case 0:
                    System.out.println("You have successfully logged out.");
                    beingLoggedIn = false;
                    break;
                case 1:
                    System.out.println(user.toString());
                    printMenu2();
                    break;
                case 2:
                    updateAccount(user);
                    printMenu2();
                    break;
                case 3:
                    System.out.print("Podaj znak: ");
                    String znak = scanner.nextLine();
                    System.out.print("Podaj ilość poziomów: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    ChristmasTree christmasTree = new ChristmasTree(znak, n);
                    printMenu2();
                    break;
                case 4:
                    albumChristmas.playSong();
                    printMenu2();
                    break;
                case 5:
                    sendMessage(user);
                    printMenu2();
                    break;
                case 6:
                    user.showMessages(user.getMessages());
                    printMenu2();
                    break;
                case 7:
                    LocalDateTime christmas = LocalDateTime.of(2018, 12, 24, 0, 0);
                    long daysToChristmas = DAYS.between(LocalDateTime.now(), christmas);
                    System.out.println("Time remaining for Christmas: " + daysToChristmas + " days.");
                    printMenu2();
                    break;
                case 8:
                    moneyAccountMenu(user);
                    printMenu2();
                    break;
                case 9:
                    shopMenu(user);
                    printMenu2();
                    break;
                case 10:
                    // dodać pytanie, czy na pewno usunąć konto
                    System.out.println("Account for user '" + user.getUsername() + "' has been successfully deleted.");
                    users.remove(user);
                    beingLoggedIn = false;
                    break;
            }
        }
    }

    private static void printMenu2() {
        System.out.print("--------------------------------------------------\n" +
                "Available options. Press:\n" +
                "\t0 - to log out\n" +
                "\t1 - to print account details\n" +
                "\t2 - to update account details\n" +
                "\t3 - to print a Christmas tree\n" +
                "\t4 - to play a Christmas song\n" +
                "\t5 - to send a message\n" +
                "\t6 - to show messages\n" +
                "\t7 - to check time remaining for Christmas\n" +
                "\t8 - to go to user's money account\n" +
                "\t9 - to go to the Christmas Shop\n" +
                "\t10 - to delete the account\n" +
                "--------------------------------------------------\n" +
                "Chosen option: ");
    }

    private static void updateAccount(User user) {
        System.out.print("\t- Name   --> " + user.getName() + " <--   Do you want to change it? YES - press 'Y', NO - press 'N': ");
        String changeName = scanner.nextLine();
        if (changeName.equals("Y")) {
            System.out.print("\t\tName: ");
            String name = scanner.nextLine();
            user.setName(name);
            System.out.println("Your name has been changed to '" + user.getName() + "'.");
        }

        System.out.print("\t- Last name   --> " + user.getLastName() + " <--   Do you want to change it? YES - press 'Y', NO - press 'N': ");
        String changeLastName = scanner.nextLine();
        if (changeLastName.equals("Y")) {
            System.out.print("\t\tLast name: ");
            String lastName = scanner.nextLine();
            user.setLastName(lastName);
            System.out.println("Your last name has been changed to '" + user.getLastName() + "'.");
        }

        System.out.print("\t- Year of birth   --> " + user.getYearOfBirth() + " <--   Do you want to change it? YES - press 'Y', NO - press 'N': ");
        String changeYearOfBirth = scanner.nextLine();
        if (changeYearOfBirth.equals("Y")) {
            System.out.print("\t\tYear of birth: ");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            user.setYearOfBirth(yearOfBirth);
            System.out.println("Your year of birth has been changed to '" + user.getYearOfBirth() + "'.");
        }

        System.out.print("\t- Gender   --> " + user.getGender() + " <--   Do you want to change it? YES - press 'Y', NO - press 'N': ");
        String changeGender = scanner.nextLine();
        if (changeGender.equals("Y")) {
            System.out.print("\t\tGender (M - male, F - female; if you prefer not to say, press Enter): ");
            String gend = scanner.nextLine();
            User.Gender gender;
            switch (gend) {
                case "M":
                    gender = User.Gender.MALE;
                    break;
                case "F":
                    gender = User.Gender.FEMALE;
                    break;
                default:
                    gender = User.Gender.UNKNOWN;
                    break;
            }
            user.setGender(gender);
            System.out.println("Your gender has been changed to '" + user.getGender() + "'.");
        }

        System.out.print("\t- City   --> " + user.getCity() + " <--   Do you want to change it? YES - press 'Y', NO - press 'N': ");
        String changeCity = scanner.nextLine();
        if (changeCity.equals("Y")) {
            System.out.print("\t\tCity (if you prefer not to say, press Enter): ");
            String city = scanner.nextLine();
            if (city.equals("")) {
                user.setCity("Unknown city");
            } else {
                user.setCity(city);
            }
            System.out.println("Your city has been changed to '" + user.getCity() + "'.");
        }

        System.out.println("Account for user '" + user.getUsername() + "' has been successfully updated.");
    }

    private static void sendMessage(User user) {
        User receiver;
        System.out.print("Enter username of the receiver of your message: ");
        String username = scanner.nextLine();
        receiver = findUser(username);
        if (receiver == null) {
            System.out.println("User '" + username + "' does not exist in the database.");
        } else {
            String sender = user.getName() + " " + user.getLastName();
            System.out.println("Enter message title:");
            String title = scanner.nextLine();
            System.out.println("Enter message text:");
            String text = scanner.nextLine();
            Message message = new Message(sender, title, text);
            receiver.getMessages().add(message);
            System.out.println("A message has been sent to user '" + username + "' (" + receiver.getName() + " " + receiver.getLastName() + ").");
        }
    }

    private static void printMenu3() {
        System.out.print("==================================================\n" +
                "Money account menu. Available options. Press:\n" +
                "\t0 - to go back to user's menu\n" +
                "\t1 - to check the current balance\n" +
                "\t2 - to add money to the account\n" +
                "==================================================\n" +
                "Chosen option: ");
    }

    private static void moneyAccountMenu(User user) {
        boolean beingInMoneyAccountMenu = true;
        while (beingInMoneyAccountMenu) {
            printMenu3();
            int choice3 = scanner.nextInt();
            scanner.nextLine();
            switch (choice3) {
                case 0:
                    System.out.println("You are back to user's menu.");
                    beingInMoneyAccountMenu = false;
                    break;
                case 1:
                    user.checkBalance();
                    break;
                case 2:
                    System.out.print("Amount of money to add to your account: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    user.setBalance(user.getBalance() + amount);
                    System.out.println(amount + " $ have been successfully added to your account.");
                    break;
            }
        }
    }

    private static void printMenu4() {
        System.out.print("**************************************************\n" +
                "Christmas Shop menu. Available options. Press:\n" +
                "\t0 - to go back to user's menu\n" +
                "\t1 - to show the list of available products\n" +
                "\t2 - to show the description of a product\n" +
                "\t3 - to make an order\n" +
                "**************************************************\n" +
                "Chosen option: ");
    }

    private static void shopMenu(User user) {
        boolean beingInShopMenu = true;
        while (beingInShopMenu) {
            printMenu4();
            int choice4 = scanner.nextInt();
            scanner.nextLine();
            switch (choice4) {
                case 0:
                    System.out.println("You are back to user's menu.");
                    beingInShopMenu = false;
                    break;
                case 1:
                    shop.showShopProducts();
                    break;
                case 2:
                    System.out.print("Choose the number of the product: ");
                    int productNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (productNumber > shop.getListOfShopProducts().size()) {
                        System.out.println("This product does not exist.");
                    } else {
                        System.out.println(shop.getListOfShopProducts().get(productNumber - 1).showDescription());
                    }
                    break;
                case 3:
                    user.checkBalance();
                    orderMenu(user);
                    break;
            }
        }
    }

    private static void printMenu5() {
        System.out.print("**************************************************\n" +
                "Christmas Shop menu. Order section. Press:\n" +
                "\t1 - to show the list of available products\n" +
                "\t2 - to add a product to your order\n" +
                "\t3 - to finish the order\n" +
                "**************************************************\n" +
                "Chosen option: ");
    }

    private static void orderMenu(User user) {
        Order order = new Order();
        boolean beingInOrderMenu = true;
        while (beingInOrderMenu) {
            printMenu5();
            int choice5 = scanner.nextInt();
            scanner.nextLine();
            switch (choice5) {
                case 1:
                    shop.showShopProducts();
                    break;
                case 2:
                    System.out.print("Choose the number of the product: ");
                    int productNumber = scanner.nextInt();
                    scanner.nextLine();
                    if (productNumber > shop.getListOfShopProducts().size()) {
                        System.out.println("This product does not exist.");
                    } else {
                        System.out.print("Enter the quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        if (quantity < 1) {
                            System.out.println("Incorrect quantity.");
                        } else {
                            Position position = new Position(shop.getListOfShopProducts().get(productNumber - 1), quantity);
                            user.setBalance(order.addPosition(position, user.getBalance()));
                            System.out.println(order.toString());
                        }
                    }
                    break;
                case 3:
                    if (order.getOrderList().isEmpty()) {
                        System.out.println("You did not order anything. Maybe next time!");
                    } else {
                        System.out.println("  ^ Thank you for choosing the Christmas Shop! ^\n" +
                                "  ^ The conformation of your order has been sent to your mailbox ^");
                        Message message = new Message("The Christmas Shop",
                                "The confirmation of your order",
                                "Thank you for choosing the Christmas Shop!\n" +
                                order.toString() + "\n***** MERRY CHRISTMAS! *****");
                        user.getMessages().add(message);
                    }
                    beingInOrderMenu = false;
                    break;
            }
        }
    }

}

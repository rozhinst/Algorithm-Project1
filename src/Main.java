import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    static User head = null;

    public static void main(String[] args) {
        int userCount = 0;
        String str;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.println("Choose a number:\n1.Add a username\n2.Delete a username\n3.Add a travel\n4.Exit");
            int cmd = sc.nextInt();
            str = sc.nextLine();
            switch (cmd) {
                case 1:
                    System.out.println("Enter your name:");
                    if (userCount == 0)
                        head = new User(sc.nextLine());
                    else
                        Snapp.addUser(head, sc.nextLine());
                    userCount++;
                    break;

                case 2:
                    Snapp.print(head);
                    Snapp.deleteUser(head, sc.nextLine());
                    Snapp.print(head);//For checking
                    break;

                case 3:
                    Snapp.print(head);
                    String username = sc.nextLine();
                    User temp = Snapp.findUser(head, username);
                    if (temp == null) break;
                    System.out.println("Plz enter your current location then your destination:");
                    if (temp.getTravelCount() == 0)
                        temp.setFirstTravel(new Travel(sc.nextLine(), sc.nextLine()));
                    else {
                        temp.addTravel(sc.nextLine(), sc.nextLine());
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                case 5:

                        break;
                    }
            }
        }
    }


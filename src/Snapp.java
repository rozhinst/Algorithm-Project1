
public class Snapp {

    public static void addUser(User head, String userName) {
        User temp = new User(userName);
        while (head.getNextUser() != null)
            head = head.getNextUser();
        head.setNextUser(temp);
    }

    public static void deleteUser(User head, String user) {
        if (head == null) return;
        if (Main.head.getUsername().equals(user))
            Main.head = Main.head.getNextUser();
        else {
            while (head.getNextUser() != null) {
                if (!head.getNextUser().getUsername().equals(user))
                    head = head.getNextUser();
                else head.setNextUser(head.getNextUser().getNextUser());
            }
        }
    }

    public static User findUser(User head, String username) {
        if (head != null) {
            if (head.getUsername().equals(username)) {
                return head;
            }
            while (head.getNextUser() != null) {
                if (!head.getNextUser().getUsername().equals(username)) {
                    head = head.getNextUser();
                } else return head.getNextUser();
            }
        }
        return null;
    }


    public static void print(User head) {
        System.out.println("Choose a name:");
        User temp = head;
        int count = 1;
        while (temp != null) {
            System.out.println(count + "." + temp.getUsername());
            count++;
            temp = temp.getNextUser();
        }
    }
}

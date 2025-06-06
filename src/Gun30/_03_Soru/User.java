package Gun30._03_Soru;

public class User {
    String username;
    Role userRole;
    Statu userStatu;


    public User(String username, Role userRole, Statu userStatu) {
        this.username = username;
        this.userRole = userRole;
        this.userStatu = userStatu;
    }

    public static void userSil(User u){
        if (u.userRole == Role.ADMIN)
            System.out.println("Admin silinemez");
        else
        {
            System.out.println(u.username + " User silindi");
            u.userStatu = Statu.PASIF; //sisteme girişi engellendi
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userRole=" + userRole +
                ", userStatu=" + userStatu +
                '}';
    }
}

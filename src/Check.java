public class Check {
    public static void main(String[] args) {
        String user1 = "иван";
        String user2 = "Иван Иванов";
        
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
            System.out.println("Длина имени " + user1.length());
            System.out.println("А без пробелов " + user1.length());
    }
}

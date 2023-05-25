public class Stroki {
    public static void main(String[] args) {
        String a = "Иван Иванов";
        String b = "Иван Иванов";

        if (a.equalsIgnoreCase(b)==true) {
            System.out.println("Выберите другое имя пользователя");
        } else System.out.println("Отличное имя");
    }
}

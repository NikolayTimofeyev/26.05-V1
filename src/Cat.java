public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;
    static int catCount;

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //кошки не молодеют!
        if (age > this.age)
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    private void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 30;
        //сами вызываем свою функцию, если надо
        if (weight > 130)
           pee();
    }
}




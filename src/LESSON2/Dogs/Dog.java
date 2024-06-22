package LESSON2.Dogs;

//переменные это характеристики
//методы это поведение объекта
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("I am " + name + " voice!");
    }

    private void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
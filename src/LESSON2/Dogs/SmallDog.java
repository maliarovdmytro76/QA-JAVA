package LESSON2.Dogs;

// extends - говорит о том, что можно взять доступные методы и свойства их класса родителя(Dog)
// 1 наследоваться можно только от одного класса
// 2 нельзя наследоваться от самого себя
// new Dog -> /....name..../
// new SmallDog -> /....name..../
// 3 наследуется все кроме приватных методов и переменных!!! Но поля все равно будут
// 4 можно переопределить поведение родительского метода
// 5 через супер можно обращаться к методам и переменным родителя
// 6 можно запретить наследование через final
public class SmallDog extends Dog {

    private int temp;

    public SmallDog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        if (temp < 35) {
            super.voice();
        } else {
            //super - говорит о том, что обращаемся к родительскому классу
            System.out.println("I have a cold");
        }
    }
}
package InheritanceDemos;

class Animal1
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Dog1 extends Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog1 extends Dog1
{
    void weep()
    {
        System.out.println("weep");
    }
}


public class TestMultiLevelInheritance {

    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();

        Dog1 d = new Dog1();
        d.eat();
        d.bark();

        BabyDog1 bd = new BabyDog1();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}

public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("Woof woof it's a dog!");
    }

    @Override
    public String sleep(){
        return "A dog sleeps...";
    }

    @Override
    public String eat(){
        return "A dog sleeps...";
    }

    public String bark(){
        return "bark!";
    }

}

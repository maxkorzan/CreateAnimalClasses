/*
 * All Birds are Animals but all Animals are not Birds
 */
public class Bird extends Animal {              //inherit methods from Animal class
    public Bird() {
        //super();
        System.out.println("A bird is hatched...");
    }


    @Override                                   //polymorphism
    public String sleep() {                     //Animal-sleep turns into Bird-sleep
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat() {                       //polymorphism Animal->Bird eat
        return "A bird eats...";
    }


    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}
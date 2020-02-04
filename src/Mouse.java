public class Mouse extends Animal{
    public Mouse(){
        super();
        System.out.println("now I'm a mouse");
    }

    @Override
    public String sleep(){
        return "a mouse sleeps...";
    }

    public String eat(){
        return "a mouse eats...";
    }

    public String squeak() {
        return "squeak! ...";
    }
}

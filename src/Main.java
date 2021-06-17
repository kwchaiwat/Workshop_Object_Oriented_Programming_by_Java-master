public class Main {
    public static  void main(String [] args){
        Ironman h1 = new Ironman();
        h1.setName("Tony Stark");
        h1.setAge(35);
        h1.skill("Fly and Shooting");
        h1.displayHero();

        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge(1000);
        h2.skill("Thunder");
        h2.weapon("Hammer");
        h2.setNation("Asgard");
        h2.displayHero();

        Spiderman h3 = new Spiderman();
        h3.setName("Peter");
        h3.setAge(17);
        h3.skill("High jump");
        h3.displayHero();
    }
}

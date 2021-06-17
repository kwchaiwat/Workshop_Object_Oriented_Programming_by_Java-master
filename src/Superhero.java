public abstract class Superhero {
    private String name;
    private int age;
    private String job;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayHero(){
        System.out.println("Name = "+this.name+"\nAge = "+this.age);
    }

    public abstract void skill(String skill);
}

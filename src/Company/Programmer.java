class Programmer extends Employee {
    // overloading method

    public Programmer(String name,Double salary){
        super(name,salary);
        System.out.println("I'm Programmer have skill language.");

    }

    public void skill() {
        System.out.println("No skill");
    }
    public void skill(String... language) {
        for (int i = 0; i < language.length; i++) {
            System.out.println("Have " + language[i] + " skill");
        }
    }
    //Override
    public void bonus(){
        System.out.println("Bonus = 20%");
    }
}

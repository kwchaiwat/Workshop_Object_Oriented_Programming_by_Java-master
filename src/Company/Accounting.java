class Accounting extends Employee {

    public String skill = "Manage Money";

    public Accounting(String name,Double salary){
        super(name,salary);
        System.out.println("I'm Accounting have skill math.");
    }

    //Override
    public void bonus(){
        System.out.println("Bonus = 30%");
    }
}

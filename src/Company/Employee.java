abstract class Employee {
    // Attribute
    private String id;
    private String name;
    private Double salary;

    //Static Attribute
    static int minSalary = 12000;

    // Default Constructor
    public Employee(){
        System.out.println("I'm Employee");
    }

    public Employee(String name, Double salary){
        this.name = name;
        this.salary  = salary;
        displayEmployee();
    }

    public abstract void bonus();

    public void displayEmployee(){
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+this.salary);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public  Double getSalary(){
        return this.salary;
    }

}

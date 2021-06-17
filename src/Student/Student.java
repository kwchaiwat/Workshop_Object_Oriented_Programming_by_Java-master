abstract class Student {
    private String id;
    private String name;

    public abstract void Registor();
    public abstract void PreTest();
    public abstract void PostTest();

    public void setId(String id){
        this.id = id;
    }

    public  void setName(String name){
        this.name = name;
    }
}

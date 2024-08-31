class parent{
    private int id;
    private String name;

    public parent(int id,String name){
        this.id = id;
        this.name = name;
    }

    public parent(){

    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override 
    public String toString(){
        return this.id+" "+this.name;
    }
}
public class encapsulation {

    public static void main(String[]args){
        parent obj = new parent(1, "Akash");
        
        parent obj2 = new parent();

        obj2.setId(2);
        obj2.setName("Aditya");

        System.out.println(obj+"\n"+obj2.getId()+" "+obj2.getName());
    }
    
}

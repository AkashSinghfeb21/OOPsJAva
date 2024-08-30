//polymorphism is about method ovverriding and overloading
//Overloading
class parent{
    //same name but with different parameters
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
} 
public class polymorphism {

    public static void main(String[]args){ 
    parent obj = new parent();
     
     System.out.println(obj.add(1, 2));
     
     System.out.println(obj.add(1, 2,4));

    }
    
}

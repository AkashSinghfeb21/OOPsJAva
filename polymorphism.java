//polymorphism is about method ovverriding and overloading
//Overloading
// class parent{
//     //same name but with different parameters
//     public int add(int a,int b){
//         return a+b;
//     }

//     public int add(int a,int b,int c){
//         return a+b+c;
//     }
// } 
//Overriding
class parent{
    public void hello(){
        System.out.println("Yellow");
    }
}

class child extends parent{
    @Override
    public void hello(){
        System.out.println("Override via inheritance");
    }
}

public class polymorphism {

    public static void main(String[]args){ 
    // parent obj = new parent();
     
    //  System.out.println(obj.add(1, 2));
     
    //  System.out.println(obj.add(1, 2,4));
    
    //anonmous class 
    parent obj = new parent(){
        @Override
        public void hello(){
           System.out.println("Overrided function via anonymous class");  
        }
    };  

    child obj2 = new child();

    obj.hello();

    obj2.hello();
  }    
}

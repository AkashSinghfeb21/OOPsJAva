//hiding unecesary things and focusing on only what matters

//can achieve abstraction via interface and abstract class

// interface a{
//     public void sayHello();
// }

// class Ax implements a{
//     public void sayHello(){
//         System.out.println("Hello there");
//     } 
// }

abstract class Ax{
    abstract void startsRunning();

    public void anotherOne(){
        System.out.println("another One");
    }
}

class child extends Ax{
      public void startsRunning(){
        System.out.println("Starts Running via inheritance");
      } 
}

public class abstraction {

    public static void main(String[]args){
        // Ax obj = new Ax();

        // obj.sayHello();

        Ax obj = new Ax(){
            public void startsRunning(){
                System.out.println("Starts Running via anonymous class");
            }

        };

        obj.startsRunning();
        obj.anotherOne();

        new child().startsRunning();
    }
    
}

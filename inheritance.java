//Single Level inheritance
/*class parent{
    void hello(){
        System.out.println("how are you");
    }
}

class child extends parent{
    
}*/

//mulilevel inheritance
/* 
class GrandParent {
    void hello(){
        System.out.println("hellow");
    }
}

class parent extends GrandParent{
    void eats(){
        System.out.println("starts eating");
    }
}

class child extends parent{
    void running(){
        System.out.println("Starts running");
    }
}*/

//hierarchical inheritance
class parent {
    void skill(){
        System.out.println("GoldMaker");
    }
}

class child1 extends parent{
    void newSkill(){
        System.out.println("Gaming");
    }
}

class child2 extends parent{
    void newSkill(){
        System.out.println("Skating");
    }
}
public class inheritance{
    public static void main(String[]args){
        /*child obj = new child();
        obj.hello();*/
        
        //anonmous object
        // new child().hello();
        // new child().eats();
        // new child().running();

        child1 obj = new child1();
        child2 obj2 = new child2();
        
        obj.skill();
        obj.newSkill();
        
        obj2.skill();
        obj2.newSkill();
    }
}
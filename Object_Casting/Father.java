
class Father {
    public String Lastname;
    public int age;
    
    public void beRepresented(){
        System.out.println("I can be represented");
    }
}

class Son extends Father {
    public String name;

    public void canRepresent(){
        System.out.println("I can represent");
    }
}

 class Test{
    public static void main(String args[]){
        //Implicit casting
        Father father = new Son();
        father.beRepresented();

        //Explicit casting
        Son son = (Son) father;
        son.beRepresented();

    }
}
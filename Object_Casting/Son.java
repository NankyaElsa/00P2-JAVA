public class Son extends Father {
        public String name;
    
        public void beRepresented(){
            System.out.println("My father can be represented");
        }
    
        public void canRepresent(){
            System.out.println("I can represent");
        }
    }
    
     class Test{
        public static void main(String[] args){
            //Implicit casting
            Father father = new Son();
            father.beRepresented();
            father.about();
    
            Son son = (Son) father;
            son.beRepresented();
            son.about();
            son.canRepresent();
            
    
            // //Explicit casting
            // Son son = (Son) father;
            // son.beRepresented();
    
        }
    }
    


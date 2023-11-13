
//This program demonstrates how to create and use a local inner class 



public class Local {
   
    public void local_Outer(){
        System.out.println("Inside the this local method");
         
        //create a local inner class inside the method local_outer
        class Local_Inner{         
            
            public int i;
            public int j;

            Local_Inner(int i, int j){
                this.i = i;
                this.j =j;
            }
            public int add(){
              return i+j;  
                
            }
        }
        //create the object outside the class but inside the method in which the class is created
        Local_Inner inner = new Local_Inner(9, 12);
        System.out.println("Answer is " +inner.add());
    }
    public static void main(String[] args) {
        Local outer = new Local();
        outer.local_Outer();
    }
}

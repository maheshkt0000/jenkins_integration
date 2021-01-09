package jenkins;

public class addtiontest{
   int myVar;                                 //instance variable
   static int data = 30;                      //static variable
                                                                                                            
   public static void main(String args[]){
      int a = 100;                           //local variable
      addtiontest obj = new addtiontest();
      
      System.out.println("Value of instance variable myVar: "+ obj.myVar);
      System.out.println("Value of static variable data: "+ addtiontest.data);
      System.out.println("Value of local variable a: "+a);
   }
}
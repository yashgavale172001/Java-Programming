package Interface;

public interface Calculator 
{
     double pi=22.0/7.0;                         //in interface all non-methods are public and abstract
     public abstract void add(int a,int b);
     public abstract int multiply(double a,double b);
     void divide(double a,double b);
     public  static  void trying() //you cannot write static or abstract at a same time    //we need to define body for static methods in interface compulsay
     {
    	 System.out.println("Static method cannot override,whenever we write static method we need to define its body we cannot make it bastract because we cannot override static method(cannot do implementation in child class thats why...)");
     }
}

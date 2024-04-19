
// Constructor
class A
{
    int a ;
    String name;
  A()   //constructor as same as class name
  {
      a=0;
      name = null;
  }
    void show()  //behaviour of method
    {
        System.out.println(a+ " "+ name);
    }

    class B
    {
         public static void main(String [] agrs)
         {
             A ref= new A();
             ref.show();
         }
    

}
}
        
//      System.out.print("Message");
//     void sleep() //behaviour of method
//     {
//         System.out.print("im sleeping");
    
//     }
//     public static void main (String [] agrs)
//     {
//         classobj d = new classobj();
//         System.out.println(d.age);
//         System.out.println(d.weight);
//         System.out.println(d.hight);
//         System.out.println(d.color);
//         d.eat();
//         d.sleep();
//     }
// }
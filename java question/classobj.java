class classobj{
    int age= 24;
    int weight = 59;
   int  hight = 6;
    String color ="light" ;
    void eat()  //behaviour of method
    {
        System.out.println("im eating");
    }
    void sleep() //behaviour of method
    {
        System.out.print("im sleeping");
    
    }
    public static void main (String [] agrs)
    {
        classobj d = new classobj();
        System.out.println(d.age);
        System.out.println(d.weight);
        System.out.println(d.hight);
        System.out.println(d.color);
        d.eat();
        d.sleep();
    }
}
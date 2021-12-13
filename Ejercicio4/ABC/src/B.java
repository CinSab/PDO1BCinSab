public class B extends  A{
    @Override
    public void hola(){
        System.out.println("hola soy B");
    }
    public B(int num){

        super(num);
        System.out.println("estoy contruyendo un B " + num);
    }
}

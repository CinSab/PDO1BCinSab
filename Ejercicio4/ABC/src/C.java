public class C extends B{

    public C(int num ){
        super(num);
        System.out.println("estoy contruyendo un C "+ num);
    }
    @Override
    public void hola(){
        System.out.println("hola soy C");
    }

}


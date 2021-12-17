public class Main {
    public static void main(String[] arg){
        Thing thingOne = new Thing("Thing One");
        Thing thingTwo = new Thing("Thing Two");
        Thing thingThree = new Thing("Thing Trheee");

        Thing var1 = thingOne;
        Thing var2 = thingOne;
        Thing var3 = thingOne;

        Thing sucesivo =thingThree;
        sucesivo = thingOne;
        sucesivo = thingTwo;

        Thing garbage;

        Thing lifeCycle = new Thing();

        lifeCycle.lifeCycle();
        lifeCycle.delete();
        lifeCycle.lifeCycle();
        lifeCycle.OutOfMemoryError();
    }
}

public class Thing {
    private String nombre;
    private Thing thingXthing;

    public Thing(String nombre) {
        this.nombre = nombre;
    }
    public Thing(){}

    public void setThingXthing(Thing thingXthing) {this.thingXthing = thingXthing;}

    public Thing lifeCycle() {
        Thing thing = new Thing();
        int num = 1;
        while (num < 1000) {
            Thing thingXthing = new Thing();
            thing.setThingXthing(thing);
            num++;
        }
        return thing;
    }

    public void delete() {
        Thing thing = new Thing();
        int num = 1;
        while (num < 1000) {
            thing = new Thing();
            num++;
            System.gc();
        }
    }

    public void OutOfMemoryError() {
        int j = 1;
        try {
            while (true) {
                Thing[] array = new Thing[1000 * 1000 * 1000];
                array[j] = new Thing();
                j++;

            }
        } catch (OutOfMemoryError e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

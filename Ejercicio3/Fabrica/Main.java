public class Main {
    public static void main(String[] args){
        FabricaDeAuto Ford = new FabricaDeAuto("Ford");
      System.out.println(Ford.dataAuto(Ford.fabricarAuto("Fiesta")));
        System.out.println(Ford.dataAuto(Ford.fabricarAuto("Fiesta2")));
        System.out.println(Ford.dataAuto(Ford.fabricarAuto("Fiesta3")));
        System.out.println(Ford.dataAuto(Ford.fabricarAuto("Fiesta4")));
        System.out.println(Ford.dataAuto(Ford.fabricarAuto("Fiesta5")));

    }
}

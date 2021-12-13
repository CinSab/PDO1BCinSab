public class Main {
    public static void main(String[] args) {
        Album base = new Album("Basement","Colourmeinkindness");
        Album base1 = new Album("Basement","Colourmeinkindness");
        System.out.println(base1==base);
        System.out.println(base1.equals(base));

    }
}

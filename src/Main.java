public class Main {

    public static void main(String[] args) {
	// write your code here
        Bilar bil1 = new Bilar();
        Bilar bil2 = new Bilar();

        bil1.model = "Audi";
        bil1.year = 2019;
        bil1.price= 300000;

        bil2.model= "Mercedes";
        bil2.year= 2020;
        bil2.price= 400000;

        System.out.println(bil1.model + " har årsmodell " + bil1.year + " och kostar " + bil1.price + "kr");
        System.out.println(bil2.model + " har årsmodell " + bil2.year + " och kostar " + bil2.price + "kr");
    }
}

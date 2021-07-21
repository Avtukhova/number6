public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int priceMile = 20;
        int miles = service.calculate(price, priceMile);
        System.out.println(miles);
    }
}

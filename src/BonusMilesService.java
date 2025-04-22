public class BonusMilesService {
    public int calculate(int price) {
        int oneBonusMile = 20;
        int miles = price / oneBonusMile;
        return miles;
    }
}

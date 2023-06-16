package breakcontinue;

public class FoodList {
    public static void main(String[] args) {
        //break and continue
        String[] list = {"beans", "rice", "yam", "Indomie", "egg","potato"};
        for (String food : list) {
            if (food.equals("yam")) {
                break;
            }
            System.out.println(food);
        }
    }
}
package week4;

import java.util.ArrayList;

public class Ex76 {
    public static class Menu{
        private ArrayList<String> meals;
        public Menu(){
            this.meals = new ArrayList<>();
        }
        public void printMeals(){
            for(String meal:meals){
                System.out.println(meal);
            }
        }
        public void addMeal(String meal){
           if (!meals.contains(meal)) {
               meals.add(meal);
           }else {
               System.out.println("This is already in the menu, think of something else to add");}
        }
        public void clearMeals(){
            meals.clear();
            System.out.println("meals cleared out..");
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMeals();
        menu.addMeal("pitsa");
        menu.addMeal("pitsa");
        menu.addMeal("kõrvits");
        menu.addMeal("kakao");
        menu.addMeal("pringles");
        menu.printMeals();
        menu.clearMeals();
        menu.printMeals();
        menu.addMeal("pitsa");
        menu.printMeals();


    }
}

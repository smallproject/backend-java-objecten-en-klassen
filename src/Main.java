public class Main {

    public static void main(String[] args) {
        //ingredients();

//        Ingredient ingredient = new Ingredient();
//
//        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());

        ApplePieRecipe recipe = new ApplePieRecipe();

        recipe.printIngredients();

        recipe.printRecipe();
    }

    public static void ingredients()
    {
        System.out.println("Ingredients:");
        System.out.println("200 gram ongezouten roomboter");
        System.out.println("200 gram witte bastard suiker");
        System.out.println("400 gram zelfrijzend bakmeel");
        System.out.println("1 stuk(s) ei");
        System.out.println("8 gram vanillesuiker");
        System.out.println("1 snuf zout");
        System.out.println("1.5 kilo zoetzure appels");
        System.out.println("75 gram kristal suiker");
        System.out.println("3 theelepels kaneel");
        System.out.println("15 gram paneermeel");
    }
}

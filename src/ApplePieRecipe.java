public class ApplePieRecipe {

    public Ingredient roomboter = new Ingredient("ongezouten roomboter", 200, "gram");
    public Ingredient suiker = new Ingredient("witte bastard suiker", 200, "gram");
    public Ingredient bakmeel = new Ingredient("zelfrijzend bakmeel", 200, "gram");
    public Ingredient ei = new Ingredient("ei", 1, "stuk");
    public Ingredient vanille = new Ingredient("vanillesuiker", 8, "gram");
    public Ingredient zout = new Ingredient("zout", 1, "snuf");
    public Ingredient appels = new Ingredient("zoetzure appels", 1.5, "kilo");
    public Ingredient kristalSuiker = new Ingredient("kristal suiker", 75, "gram");
    public Ingredient kaneel = new Ingredient("kaneel", 3, "theelepels");
    public Ingredient paneermeel = new Ingredient("paneermeel", 15, "gram");

    public void printIngredients() {
        System.out.println("Ingredienten:");
        System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
        System.out.println(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName());
        System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vanille.getAmount() + " " + vanille.getUnit() + " " + vanille.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
        System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }

    public void printRecipe() {
        System.out.println("Stappen:");
        verwarm();
        klop();
        meng();
        schil();
        vet();
        gebruik();
        doe();
        rol();
        leg();
        zet();
    }

    public void verwarm() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void klop() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void meng() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void schil() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void vet() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }
    public void gebruik() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void doe() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void rol() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void leg() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void zet() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}

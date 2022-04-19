public class Main {
    public static void main(String[] args) {

        Model model1 = new Model(8, "Mobexpert", 2021);
        Mobila mobila1 = new Mobila(6000f, "Denver", model1 );
        MobilaBaie mobilaBaie_mdf = new MobilaBaie("MDF", "Alb", 180, 2, mobila1);
        Model model2 = new Model(10, "Mobexpert", 2022);
        Mobila mobila2 = new Mobila(5000F, "Consola", model2);
        MobilaLiving mobilaLiving_mdf = new MobilaLiving("Denver", "Lemn", 180, 2,"auriu", mobila2);
        System.out.println(mobilaBaie_mdf);
        System.out.println(mobilaLiving_mdf);



    }
}

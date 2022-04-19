public class MobilaLiving extends Mobila {

    private String colectie;
    private String material;
    private int inaltime;
    private int stocare;
    private int culoare;


    public MobilaLiving(String denver, String lemn, int inaltime, int stocare, String auriu, Mobila mobila2){

    }

    @Override
    public float getPret() {
        return super.getPret();
    }

    @Override
    public Model getModel() {
        return super.getModel();
    }

    @Override
    public String getNume() {
        return super.getNume();
    }
    @Override
    public void setModel(Model model) {
        super.setModel(model);
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

    @Override
    public void setPret(float pret) {
        super.setPret(pret);
    }


    public MobilaLiving(String colectie, String material, int inaltime, int stocare, int culoare, Mobila mobila) {

        this.colectie = colectie;
        this.material = material;
        this.inaltime = inaltime;
        this.stocare = stocare;
        this.culoare = culoare;
        this.setPret(mobila.getPret());
        this.setNume(mobila.getNume());
        this.setModel(mobila.getModel());


    }

    @Override
    public String toString() {
        return
                "MobilaLiving:"+
                        "colectie='" + colectie + '\'' +
                        ", material='" + material + '\'' +
                        ", inaltime=" + inaltime +
                        ", stocare=" + stocare +
                        ", culoare=" + culoare + "p"+ ", "+
                        super.toString()
                ;
    }

    public String getColectie() {
        return colectie;
    }

    public void setColectie(String colectie) {
        this.colectie = colectie;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getStocare() {
        return stocare;
    }

    public void setStocare(int stocare) {
        this.stocare = stocare;
    }

    public int getCuloare() {
        return culoare;
    }

    public void setCuloare(int culoare) {
        this.culoare = culoare;
    }
}

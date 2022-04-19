public class MobilaBaie extends Mobila {

    private String material;
    private String culoare;
    private int inaltime;
    private int nr_sertare;

    public MobilaBaie(String material, String culoare, int inaltime, int nr_sertare, Mobila mobila) {

        this.material = material;
        this.culoare = culoare;
        this.inaltime = inaltime;
        this.nr_sertare = nr_sertare;
        this.setPret(mobila.getPret());
        this.setNume(mobila.getNume());
        this.setModel(mobila.getModel());


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

    @Override
    public String toString() {
        return "MobilaBaie:" +
                "material='" + material + '\'' +
                ", culoare=" + culoare + "p"+
                ", inaltime=" + inaltime +
                ", stocare=" + nr_sertare + ", "+
                super.toString();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getNr_sertare() {
        return nr_sertare;
    }

    public void setNr_sertare(int nr_sertare) {
        this.nr_sertare = nr_sertare;
    }
}

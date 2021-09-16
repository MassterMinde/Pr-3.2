public class Sofas extends ABS_furniture {
    int softness1to5 ;

    public int getSoftness1to5() {
        return softness1to5;
    }

    @Override
    String check() {
        return "\nКачество: "+getQuality()+"\nМатериал: "+getType()+"\nМягкость 1/5: "+getSoftness1to5()+"\nЦена: "+getCost();
    }
}

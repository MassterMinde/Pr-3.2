public class Tables extends ABS_furniture {
    char moreSpace;

    public Tables(char moreSpace,String quality,String type,int cost) {
        this.moreSpace = moreSpace;
        this.setCost(cost);
        this.setQuality(quality);
        this.setType(type);
    }

    public char getMoreSpace() {
        return moreSpace;
    }

    @Override
    String check() {
        return "\nКачество: "+getQuality()+"\nМатериал: "+getType()+"\nРасширяемый: "+getMoreSpace()+"\nЦена: "+getCost();
    }
}

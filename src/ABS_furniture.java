public abstract class ABS_furniture {
    String type;
    String quality;
    int cost;

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String getQuality() {
        return quality;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    abstract String check();
}

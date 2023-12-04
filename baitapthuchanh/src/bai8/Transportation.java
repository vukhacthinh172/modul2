package bai8;

public class Transportation {
    private int id ;
    private  String producer ;
    private int yearOfProduction ;
    private  Double price ;
    private  String color ;

    public Transportation() {
    }

    public Transportation(int id, String producer, int yearOfProduction, Double price, String color) {
        this.id = id;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}

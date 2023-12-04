package bai8;

public class Truck extends  Transportation{
    private int trongTai ;

    public Truck() {
    }

    public Truck(int id, String producer, int yearOfProduction, Double price, String color, int trongTai) {
        super(id, producer, yearOfProduction, price, color);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
    public String toString() {
        return "Transportation{" +
                "id=" + super.getId() +
                ", producer='" + super.getProducer() + '\'' +
                ", yearOfProduction=" + super.getYearOfProduction() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                "trongTai=" + trongTai +
                '}';
    }
}

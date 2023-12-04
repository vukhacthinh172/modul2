package bai8;

public class Motobike extends  Transportation{
    private  String congSuat ;

    public Motobike() {
    }

    public Motobike(int id, String producer, int yearOfProduction, Double price, String color, String congSuat) {
        super(id, producer, yearOfProduction, price, color);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }
    public String toString() {
        return "Transportation{" +
                "id=" + super.getId() +
                ", producer='" + super.getProducer() + '\'' +
                ", yearOfProduction=" + super.getYearOfProduction() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                "congSuat='" + congSuat + '\'' +
                '}';
    }


}

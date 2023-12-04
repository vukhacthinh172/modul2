package bai8;

public class Car extends  Transportation{
    private int soChoNgoi ;
    private  String kieuDongCo ;

    public Car() {
    }

    public Car(int id, String producer, int yearOfProduction, Double price, String color, int soChoNgoi, String kieuDongCo) {
        super(id, producer, yearOfProduction, price, color);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public String toString() {
        return "Transportation{" +
                "id=" + super.getId() +
                ", producer='" + super.getProducer() + '\'' +
                ", yearOfProduction=" + super.getYearOfProduction() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }

}

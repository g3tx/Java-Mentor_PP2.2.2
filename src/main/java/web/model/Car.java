package web.model;

public class Car {
    private String Mark;
    private String Model;
    private int Year;

    public Car(String mark, String model, int year) {
        Mark = mark;
        Model = model;
        Year = year;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Mark='" + Mark + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                '}';
    }
}

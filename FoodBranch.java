package module3;
import java.time.LocalDate;
import java.util.Random;

public class FoodBranch {
    private String id;
    private String name;

    private int price;

    private LocalDate manufacturedDay;

    private LocalDate expireDay;

    public FoodBranch(String id) throws Exception {
        setId(id);
    }
    private void setId(String id) throws Exception{
        if(!id.equals(""))
            this.id = id;
        else
            throw new Exception("id accept is not null!");

    }

    public FoodBranch(String id, String name, int price, LocalDate manufacturedDay, LocalDate expireDay) throws Exception {
        setId(id);
        this.name = name;
        this.price = price;
        this.manufacturedDay = manufacturedDay;
        this.expireDay = expireDay;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(""))
            this.name = "xxx";
        else this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<0)
            this.price = 0;
        else
            this.price = price;

    }

    public LocalDate getManufacturedDay() {

        return manufacturedDay;
    }

    public void setManufacturedDay(LocalDate manufacturedDay) {
        if(manufacturedDay.isAfter(LocalDate.now()))
            this.manufacturedDay = LocalDate.now();
        else
            this.manufacturedDay = manufacturedDay;
    }

    public LocalDate getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(LocalDate expireDay) {
        if (expireDay.isBefore(getManufacturedDay()))
            this.expireDay = getManufacturedDay();
        else
            this.expireDay = expireDay;
    }
}

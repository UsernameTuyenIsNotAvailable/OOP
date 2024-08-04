public class Car {
   public String color;
   private String model;
   protected int year;
    public static void main(String[] args) {
         Car car = new Car();
         car.color = "red";
         System.out.println(car.color);
         car.model = "da";
         System.out.println(car.model);
    }

    public  void setModel(String newModel) {
        this.model= newModel;


    }
    public String getModel() {
        return model  ;
    }
}

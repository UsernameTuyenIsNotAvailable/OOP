public class Reader{

   ;
   public static String name;
   public static String address ;
   public static  int phoneNumber ;
   public static String type ;
    public static int id = 100000;
    public static void main(String[] args) {

    }




    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;

    }
    public String getAddress() {
        return address;
    }
  public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
  }
  public int getPhoneNumber() {
        return phoneNumber;
  }
  public void setType(String type) {
        this.type = type;
  }
  public String getType() {
        return type;
  }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", type='" + type + '\'' +
                '}';
    }

}

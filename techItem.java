public class techItem{
  //instance variable
  private double price;
  private String name;
  private boolean forGaming;
  private boolean isWireless;

  /*I will make my constructor methods with overloading because I want
  to make it easy to call by value of arguments. 
  */
  //constructor methods
  public techItem(){
    price=99.99;
    name="Unknown Item";
    forGaming=false;
    isWireless=false;
  }

  public techItem(double price){
    this.price=price;
    name="Unknown Item";
    forGaming=false;
    isWireless=false;
  }
  public techItem(double price, String name){
    this.price=price;
    this.name=name;
    forGaming=false;
    isWireless=false;
  }
  public techItem(double price, String name, boolean forGaming, boolean isWireless){
    this.price=price;
    this.name=name;
    this.forGaming=forGaming;
    this.isWireless=isWireless;
  }

  //accessor
  public double getPrice(){
    return price;
  }
  public String getName(){
    return name;
  }
  public boolean getGaming(){
    return forGaming;
  }
  public boolean getWireless(){
    return isWireless;
  }
  
  
  //mutator method
  public void setPrice(double price){
    this.price=price;
  }
   public void setName(String name){
    this.name=name;
  }
  public void setGame(boolean forGaming){
    this.forGaming=forGaming;
  }
  public void setWireless(boolean isWireless){
    this.isWireless=isWireless;
  }
  
  //tostring method
  public String toString(){
    return "------------------\n"+"Price: "+ price + "\nName: " +name + "\nFor Gaming: "+forGaming+"\nIs Wireless: "+isWireless;
  }
}
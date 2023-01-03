public class Wilder {

  private String firstName;
  private Boolean aware;

  public Wilder (String firstName, Boolean aware ){
    this.firstName=firstName;
    this.aware=aware;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public Boolean isAware(){
    return this.aware;
  }

  public void setFirstName(String firstName){
    this.firstName=firstName;
  }
  public void setAware(Boolean aware){
    this.aware=aware;
  }

  public String areYouAware() {
   if(this.isAware() == true){
    return "et je suis aware";
   }
   else {
    return "et je ne suis pas aware";
   }
}

  public String whoAmI() {
    return "Je m'appelle " + this.getFirstName()+' ' + this.areYouAware();
}
}
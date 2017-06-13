public class Taofik implements Coba {
  String name,nim,phone;
  
  Taofik (String newName, String newNim, String newPhone) {
    name = newName;
    nim = newNim;
    phone = newPhone;
  }
  
  @Override
  public void setName(String newName) {
    name = newName;
  }
  
  @Override
  public void setNim(String newNim) {
    nim = newNim;
  }
  
  @Override
  public void setPhone(String newPhone) {
    phone = newPhone;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
  @Override
  public String getNim() {
    return nim;
  }
  
  @Override
  public String getPhone() {
    return phone;
  }
  
  public String getKAMPUS() {
    return KAMPUS;
  }
  
  public String getALAMAT() {
    return ALAMAT;
  }
}
public class Client implements Authenticable {
 private String name;
 private String identityNumber;
 private String profession;
 private String password;

 public Client(String name, String identityNumber, String profession, String password) {
  this.name = name;
  this.identityNumber = identityNumber;
  this.profession = profession;
  this.password = password;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getIdentityNumber() {
  return identityNumber;
 }

 public void setIdentityNumber(String identityNumber) {
  this.identityNumber = identityNumber;
 }

 public String getProfession() {
  return profession;
 }

 public void setProfession(String profession) {
  this.profession = profession;
 }

 @Override
 public void setPassword(String password) {
  this.password = password;
 }

 @Override
 public boolean authenticate(String password) {
  if (this.password == password) {
   return true;
  } else {
   return false;
  }
 }
}

package application;

//UserCredentials.java
public class UserCredentials {
 private static UserCredentials instance;

 private String username;
 private String password;

 private UserCredentials() {
     // private constructor to prevent instantiation
 }

 public static synchronized UserCredentials getInstance() {
     if (instance == null) {
         instance = new UserCredentials();
     }
     return instance;
 }

 public String getUsername() {
     return username;
 }

 public void setUsername(String username) {
     this.username = username;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }
}

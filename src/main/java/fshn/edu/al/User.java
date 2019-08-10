package fshn.edu.al;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user", schema = "billing")
public class User {

  @Id
  @GeneratedValue
  private int id;
  @Column(name = "user_name")
  private String userName;

  @Column(name = "user_password")
  private String userPassword;

  @Column(name = "status")
  private String status;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return userPassword;
  }

  public void setPassword(String password) {
    this.userPassword = password;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}

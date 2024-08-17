package com.Hackathon.Catalog.Model;

import java.util.ArrayList;
import java.util.List;

public class Users {
  private String userName;
  private List<EwasteItem> waste;

  public Users(String userName) {
    this.waste = new ArrayList<>();
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public List<EwasteItem> getWaste() {
    return waste;
  }

  public void addEwasteItem(EwasteItem item) {
    waste.add(item);
  }
}

package com.Hackathon.Catalog.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Hackathon.Catalog.Model.EwasteItem;
import com.Hackathon.Catalog.Model.Users;

@Service
public class EWasteMonitorService {
  private List<Users> users = new ArrayList<>();

  public void registerUsers(Users user) {
    users.add(user);
  }

  public void displayEwasteItems() {
    for (Users user : users) {
      System.out.println(user);
      for (EwasteItem item : user.getWaste()) {
        System.out.println(item);
      }
    }
  }

  public void recycleItems() {
    for (Users user : users) {
      for (EwasteItem item : user.getWaste()) {
        if (item.isReadyForRecycle()) {
          item.markAsRecycled("2024-08-18");
          System.out.println("Recycled: " + item.getItemName());
        }
      }
    }
  }

}

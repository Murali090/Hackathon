package com.Hackathon.Catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Hackathon.Catalog.Model.EwasteItem;
import com.Hackathon.Catalog.Model.Users;
import com.Hackathon.Catalog.Service.EWasteMonitorService;

@SpringBootApplication
public class CatalogApplication implements CommandLineRunner {

  @Autowired
  private EWasteMonitorService service;

  public CatalogApplication() {
  }

  public static void main(String[] args) {
    SpringApplication.run(CatalogApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // Create Userss
    Users user1 = new Users("Organization A");
    Users user2 = new Users("Organization B");

    // Add E-waste items for users
    EwasteItem item1 = new EwasteItem("Laptop", "SN12345", "2022-01-01");
    EwasteItem item2 = new EwasteItem("Printer", "SN54321", "2021-06-15");
    user1.addEwasteItem(item1);
    user2.addEwasteItem(item2);

    // Register users in the system
    service.registerUsers(user1);
    service.registerUsers(user2);

    // Display E-waste items
    System.out.println("E-waste Items Before Recycling:");
    service.displayEwasteItems();

    // Recycle E-waste items
    service.recycleItems();

    // Display E-waste items after recycling
    System.out.println("\nE-waste Items After Recycling:");
    service.displayEwasteItems();
  }

}

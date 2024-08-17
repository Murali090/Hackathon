package com.Hackathon.Catalog.Model;

import org.springframework.stereotype.Service;

public class EwasteItem {

  private String itemName;
  private String seriralNumber;
  private String purchaseDate;
  private String recycleDate;
  private boolean isRecycled;

  public EwasteItem(String itemName, String seriralNumber, String recycleDate) {
    this.itemName = itemName;
    this.seriralNumber = seriralNumber;
    this.recycleDate = recycleDate;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getSeriralNumber() {
    return seriralNumber;
  }

  public void setSeriralNumber(String seriralNumber) {
    this.seriralNumber = seriralNumber;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public String getRecycleDate() {
    return recycleDate;
  }

  public void setRecycleDate(String recycleDate) {
    this.recycleDate = recycleDate;
  }

  public boolean isRecycled() {
    return isRecycled;
  }

  public void setRecycled(boolean isRecycled) {
    this.isRecycled = isRecycled;
  }

  @Override
  public String toString() {
    return "EwasteItem [itemName=" + itemName + ", seriralNumber=" + seriralNumber + ", purchaseDate=" + purchaseDate
        + ", recycleDate=" + recycleDate + ", isRecycled=" + isRecycled + ", getItemName()=" + getItemName()
        + ", getSeriralNumber()=" + getSeriralNumber() + ", getPurchaseDate()=" + getPurchaseDate()
        + ", getRecycleDate()=" + getRecycleDate() + ", isRecycled()=" + isRecycled() + "]";
  }

  public void markAsRecycled(String recycleDate) {
    this.recycleDate = recycleDate;
    this.isRecycled = true;
  }

  public boolean isReadyForRecycle() {
    return !isRecycled;
  }
}

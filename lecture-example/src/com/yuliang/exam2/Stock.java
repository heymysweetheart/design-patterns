package com.yuliang.exam2;

public class Stock {
  private String symbol;
  private int quality;
  private double price;

  public Stock(String symbol, int quality, double price) {
    this.symbol = symbol;
    this.quality = quality;
    this.price = price;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

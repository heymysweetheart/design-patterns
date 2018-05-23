package com.yuliang.exam2;

public class TradingGateway {
  public static void main(String[] args) {
    Stock orcl = new Stock("ORCL", 500, 100.09);
    BuyStockCommand buyStockCommand = new BuyStockCommand(orcl);
    buyStockCommand.execute();
  }
}

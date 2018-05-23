package com.yuliang.exam2;

public class SellStockCommand implements Order{

  private OrderStatus orderStatus;

  private StockTradingPlatform stockTradingPlatform;
  protected Stock stock;

  public SellStockCommand(Stock stock) {
    this.stock = stock;
  }

  @Override
  public boolean execute() {
    orderStatus = OrderStatus.NOT_FILLED;
    return stockTradingPlatform.buy(stock);
  }

  @Override
  public boolean undo() {
    if(stockTradingPlatform.isValid(stock)) {
      stockTradingPlatform.cancel(stock);
    }
    return false;
  }
}

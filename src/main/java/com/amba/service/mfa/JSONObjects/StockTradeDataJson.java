package com.amba.service.mfa.JSONObjects;

public class StockTradeDataJson {

	
	  private Boolean allOrNone;
	    private Integer lowerChangeLimit;
	    private AmountJson lowerPrice;
	    private Integer numberOfShares;
	    private PriceTypeJson priceType;
	    private StockDataJson stockData;
	    private TermTypeJson termType;
	    private TradeTypeJson tradeType;
	    private Integer upperChangeLimit;
	    private AmountJson upperPrice;
		public Boolean getAllOrNone() {
			return allOrNone;
		}
		public void setAllOrNone(Boolean allOrNone) {
			this.allOrNone = allOrNone;
		}
		public Integer getLowerChangeLimit() {
			return lowerChangeLimit;
		}
		public void setLowerChangeLimit(Integer lowerChangeLimit) {
			this.lowerChangeLimit = lowerChangeLimit;
		}
		public AmountJson getLowerPrice() {
			return lowerPrice;
		}
		public void setLowerPrice(AmountJson lowerPrice) {
			this.lowerPrice = lowerPrice;
		}
		public Integer getNumberOfShares() {
			return numberOfShares;
		}
		public void setNumberOfShares(Integer numberOfShares) {
			this.numberOfShares = numberOfShares;
		}
		public PriceTypeJson getPriceType() {
			return priceType;
		}
		public void setPriceType(PriceTypeJson priceType) {
			this.priceType = priceType;
		}
		public StockDataJson getStockData() {
			return stockData;
		}
		public void setStockData(StockDataJson stockData) {
			this.stockData = stockData;
		}
		public TermTypeJson getTermType() {
			return termType;
		}
		public void setTermType(TermTypeJson termType) {
			this.termType = termType;
		}
		public TradeTypeJson getTradeType() {
			return tradeType;
		}
		public void setTradeType(TradeTypeJson tradeType) {
			this.tradeType = tradeType;
		}
		public Integer getUpperChangeLimit() {
			return upperChangeLimit;
		}
		public void setUpperChangeLimit(Integer upperChangeLimit) {
			this.upperChangeLimit = upperChangeLimit;
		}
		public AmountJson getUpperPrice() {
			return upperPrice;
		}
		public void setUpperPrice(AmountJson upperPrice) {
			this.upperPrice = upperPrice;
		}
	    
	    
}

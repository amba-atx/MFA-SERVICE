package com.amba.service.mfa.JSONObjects;

public class StockDataJson {

	    private Boolean etf;
	    private Boolean otc;
	    private Boolean sp500;
	    private AmountJson currentMarketPrice;
	    private AmountJson last30DaysAveragePrice;
	    private Integer last30DaysAverageVolume;
	    private AmountJson last30DaysHighPrice;
	    private AmountJson last30DaysLowPrice;
	    private Integer percentSharesHeldByInstitution;
	    private Integer sharesFloating;
	    private Integer sharesOut;
	    private String symbol;
	    private AmountJson todayHighPrice;
	    private AmountJson todayLowPrice;
	    private AmountJson todayOpenPrice;
	    private Integer todayVolume;
		public Boolean getEtf() {
			return etf;
		}
		public void setEtf(Boolean etf) {
			this.etf = etf;
		}
		public Boolean getOtc() {
			return otc;
		}
		public void setOtc(Boolean otc) {
			this.otc = otc;
		}
		public Boolean getSp500() {
			return sp500;
		}
		public void setSp500(Boolean sp500) {
			this.sp500 = sp500;
		}
		public AmountJson getCurrentMarketPrice() {
			return currentMarketPrice;
		}
		public void setCurrentMarketPrice(AmountJson currentMarketPrice) {
			this.currentMarketPrice = currentMarketPrice;
		}
		public AmountJson getLast30DaysAveragePrice() {
			return last30DaysAveragePrice;
		}
		public void setLast30DaysAveragePrice(AmountJson last30DaysAveragePrice) {
			this.last30DaysAveragePrice = last30DaysAveragePrice;
		}
		public Integer getLast30DaysAverageVolume() {
			return last30DaysAverageVolume;
		}
		public void setLast30DaysAverageVolume(Integer last30DaysAverageVolume) {
			this.last30DaysAverageVolume = last30DaysAverageVolume;
		}
		public AmountJson getLast30DaysHighPrice() {
			return last30DaysHighPrice;
		}
		public void setLast30DaysHighPrice(AmountJson last30DaysHighPrice) {
			this.last30DaysHighPrice = last30DaysHighPrice;
		}
		public AmountJson getLast30DaysLowPrice() {
			return last30DaysLowPrice;
		}
		public void setLast30DaysLowPrice(AmountJson last30DaysLowPrice) {
			this.last30DaysLowPrice = last30DaysLowPrice;
		}
		public Integer getPercentSharesHeldByInstitution() {
			return percentSharesHeldByInstitution;
		}
		public void setPercentSharesHeldByInstitution(Integer percentSharesHeldByInstitution) {
			this.percentSharesHeldByInstitution = percentSharesHeldByInstitution;
		}
		public Integer getSharesFloating() {
			return sharesFloating;
		}
		public void setSharesFloating(Integer sharesFloating) {
			this.sharesFloating = sharesFloating;
		}
		public Integer getSharesOut() {
			return sharesOut;
		}
		public void setSharesOut(Integer sharesOut) {
			this.sharesOut = sharesOut;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public AmountJson getTodayHighPrice() {
			return todayHighPrice;
		}
		public void setTodayHighPrice(AmountJson todayHighPrice) {
			this.todayHighPrice = todayHighPrice;
		}
		public AmountJson getTodayLowPrice() {
			return todayLowPrice;
		}
		public void setTodayLowPrice(AmountJson todayLowPrice) {
			this.todayLowPrice = todayLowPrice;
		}
		public AmountJson getTodayOpenPrice() {
			return todayOpenPrice;
		}
		public void setTodayOpenPrice(AmountJson todayOpenPrice) {
			this.todayOpenPrice = todayOpenPrice;
		}
		public Integer getTodayVolume() {
			return todayVolume;
		}
		public void setTodayVolume(Integer todayVolume) {
			this.todayVolume = todayVolume;
		}
	    
	    

	    
}

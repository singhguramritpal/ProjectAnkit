package com.uber.reports;

public class TotalSalesReport extends RevenueReport {

	public TotalSalesReport(String reportDetails) {
		typeOfReport = "Sales Report";
		this.reportDetails = reportDetails;
	}

	public TotalSalesReport() {
		super();
		typeOfReport = "Sales Report";
	}

	@Override
	public void showReport() {
		System.out.println("#.Sales Reports: ");
		super.showReport();
	}
}	
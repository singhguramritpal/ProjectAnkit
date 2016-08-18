package com.uber.reports;

public class PerformanceReport extends RevenueReport {


	public PerformanceReport(String reportDetails) {
		// TODO Auto-generated constructor stub
		typeOfReport ="Performance Report";
		this.reportDetails = reportDetails;
	}

	@Override
	public void showReport() {
		// TODO Auto-generated method stub
		System.out.println("#.Performance Reports: ");
		super.showReport();
	}


	

}

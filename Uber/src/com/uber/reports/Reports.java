	package com.uber.reports;
	
	public abstract class Reports {
		
		public String reportDetails;
		public String typeOfReport;
		public void showReport(){
			System.out.println(typeOfReport + ": " + this.reportDetails);
		};
	
	}

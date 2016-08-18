package com.uber.reports;

import java.util.ArrayList;
import java.util.List;

public abstract class RevenueReport extends Reports {
	 protected List<Reports> rep = new ArrayList<Reports>(); 
	
	@Override
	public void showReport() {
		// TODO Auto-generated method stub
		super.showReport();
		if (rep.size()>0){
			for(Reports reports:rep){
				reports.showReport();
				}	
			}
		}
}

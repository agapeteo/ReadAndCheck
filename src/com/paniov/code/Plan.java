package com.paniov.code;

import java.util.HashMap;
import java.util.Map;

public class Plan implements IPlan{
	private Map<Integer, String> planOT;
	private Map<Integer, String> planNT;


	public Plan() {		
	}

	@Override
	public void setPlan1(String textOT1, String textNT1) {
		planOT = new HashMap<Integer, String>();
		planNT = new HashMap<Integer, String>();
		
		for(int i=1; i<=365; i++) {
			planOT.put(i, textOT1 + " 1");
			planNT.put(i, textNT1 + " 1");
		}		
	}

	@Override
	public void setPlan2(String textOT2, String textNT2) {
		planOT = new HashMap<Integer, String>();
		planNT = new HashMap<Integer, String>();
		
		for(int i=1; i<=365; i++) {
			planOT.put(i, textOT2 + " 2");
			planNT.put(i, textNT2 + " 2");
		}		
	}

	@Override
	public void setPlan3(String textOT3, String textNT3) {
		planOT = new HashMap<Integer, String>();
		planNT = new HashMap<Integer, String>();
		
		for(int i=1; i<=365; i++) {
			planOT.put(i, textOT3 + " 3");
			planNT.put(i, textNT3 + " 3");
		}		
	}
	
	@Override
	public String getOtBibleText(int day) {
		return planOT.get(day);
	}
	
	@Override
	public String getNtBibleText(int day) {
		return planNT.get(day);
	}
}

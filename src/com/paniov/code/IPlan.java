package com.paniov.code;

import java.util.HashMap;

public interface IPlan {
	public void setPlan1(String textOT1, String textNT1);
	public void setPlan2(String textOT2, String textNT2);
	public void setPlan3(String textOT3, String textNT3);
	public String getOtBibleText(int day);
	public String getNtBibleText(int day);

}

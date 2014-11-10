package com.example.marias;
public class Question {
	private int ID;
	private int LEVEL;
	private String QUESTION;
	private String OPTA;
	private String OPTB;
	private String OPTC;
	private String ANSWER;
	public Question()
	{
		ID=0;
		LEVEL=1;
		QUESTION="";
		OPTA="";
		OPTB="";
		OPTC="";
		ANSWER="";
	}
	public Question(int lEVEL,String qUESTION, String oPTA, String oPTB, String oPTC,
			String aNSWER) {
		LEVEL=lEVEL;
		QUESTION = qUESTION;
		OPTA = oPTA;
		OPTB = oPTB;
		OPTC = oPTC;
		ANSWER = aNSWER;
	}
	public int getID()
	{
		return ID;
	}
	public int getLEVEL()
	{
		return LEVEL;
	}
	public String getQUESTION() {
		return QUESTION;
	}
	public String getOPTA() {
		return OPTA;
	}
	public String getOPTB() {
		return OPTB;
	}
	public String getOPTC() {
		return OPTC;
	}
	public String getANSWER() {
		return ANSWER;
	}
	public void setID(int id)
	{
		ID=id;
	}
	public void setLEVEL(int level)
	{
		LEVEL=level;
	}
	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}
	public void setOPTA(String oPTA) {
		OPTA = oPTA;
	}
	public void setOPTB(String oPTB) {
		OPTB = oPTB;
	}
	public void setOPTC(String oPTC) {
		OPTC = oPTC;
	}
	public void setANSWER(String aNSWER) {
		ANSWER = aNSWER;
	}
	
}

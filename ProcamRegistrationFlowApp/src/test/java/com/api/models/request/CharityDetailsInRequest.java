package com.api.models.request;

public class CharityDetailsInRequest {

	private int causeId;
    private String ngoName;
    private int amount;
    
	public CharityDetailsInRequest(int causeId, String ngoName, int amount) {
		super();
		this.causeId = causeId;
		this.ngoName = ngoName;
		this.amount = amount;
	}
	
	public int getCauseId() {
		return causeId;
	}
	public void setCauseId(int causeId) {
		this.causeId = causeId;
	}
	public String getName() {
		return ngoName;
	}
	public void setName(String ngoName) {
		this.ngoName = ngoName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "CharityDetailsInRequest [causeId=" + causeId + ", ngoName=" + ngoName + ", amount=" + amount + "]";
	}
    
    
}

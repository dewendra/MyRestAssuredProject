package com.api.models.response;

public class TicketQuestionOption {

	private String key;
	private String value;
	private String gender;
	private boolean deActivated;
	private int priority;
	private int quantity;
	private int usedQuantity;
	private int remaingQuantity;

	public TicketQuestionOption() {
	}

	public TicketQuestionOption(String key, String value, String gender, boolean deActivated, int priority,
			int quantity, int usedQuantity, int remaingQuantity) {
		super();
		this.key = key;
		this.value = value;
		this.gender = gender;
		this.deActivated = deActivated;
		this.priority = priority;
		this.quantity = quantity;
		this.usedQuantity = usedQuantity;
		this.remaingQuantity = remaingQuantity;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isDeActivated() {
		return deActivated;
	}

	public void setDeActivated(boolean deActivated) {
		this.deActivated = deActivated;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUsedQuantity() {
		return usedQuantity;
	}

	public void setUsedQuantity(int usedQuantity) {
		this.usedQuantity = usedQuantity;
	}

	public int getRemaingQuantity() {
		return remaingQuantity;
	}

	public void setRemaingQuantity(int remaingQuantity) {
		this.remaingQuantity = remaingQuantity;
	}

	@Override
	public String toString() {
		return "TicketQuestionOption [key=" + key + ", value=" + value + ", gender=" + gender + ", deActivated="
				+ deActivated + ", priority=" + priority + ", quantity=" + quantity + ", usedQuantity=" + usedQuantity
				+ ", remaingQuantity=" + remaingQuantity + "]";
	}

	
}

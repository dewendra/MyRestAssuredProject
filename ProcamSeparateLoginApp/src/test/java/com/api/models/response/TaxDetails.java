package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDetails {
	private double percent;
    private double tax;
    private double included;
    private double excluded;
    
	public TaxDetails() {
		
	}

	public TaxDetails(double percent, double tax, double included, double excluded) {
		super();
		this.percent = percent;
		this.tax = tax;
		this.included = included;
		this.excluded = excluded;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getIncluded() {
		return included;
	}

	public void setIncluded(double included) {
		this.included = included;
	}

	public double getExcluded() {
		return excluded;
	}

	public void setExcluded(double excluded) {
		this.excluded = excluded;
	}

	@Override
	public String toString() {
		return "TaxDetails [percent=" + percent + ", tax=" + tax + ", included=" + included + ", excluded=" + excluded
				+ "]";
	}
    
    
}

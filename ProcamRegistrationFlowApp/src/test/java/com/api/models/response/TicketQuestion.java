package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketQuestion {

	private String question;
    private String label;
    private String answer;
    private String answerLabel;
    private boolean editable;
    private boolean mandatory;
    private boolean primary;
    private String dataType;
    private List<TicketQuestionOption> options;
    private List<TicketQuestionObject> links;
    
	public TicketQuestion() {
		
	}

	public TicketQuestion(String question, String label, String answer, String answerLabel, boolean editable,
			boolean mandatory, boolean primary, String dataType, List<TicketQuestionOption> options,
			List<TicketQuestionObject> links) {
		super();
		this.question = question;
		this.label = label;
		this.answer = answer;
		this.answerLabel = answerLabel;
		this.editable = editable;
		this.mandatory = mandatory;
		this.primary = primary;
		this.dataType = dataType;
		this.options = options;
		this.links = links;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerLabel() {
		return answerLabel;
	}

	public void setAnswerLabel(String answerLabel) {
		this.answerLabel = answerLabel;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<TicketQuestionOption> getOptions() {
		return options;
	}

	public void setOptions(List<TicketQuestionOption> options) {
		this.options = options;
	}

	public List<TicketQuestionObject> getLinks() {
		return links;
	}

	public void setLinks(List<TicketQuestionObject> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "TicketQuestion [question=" + question + ", label=" + label + ", answer=" + answer + ", answerLabel="
				+ answerLabel + ", editable=" + editable + ", mandatory=" + mandatory + ", primary=" + primary
				+ ", dataType=" + dataType + ", options=" + options + ", links=" + links + "]";
	}
    
    
}

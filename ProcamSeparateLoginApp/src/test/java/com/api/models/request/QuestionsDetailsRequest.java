package com.api.models.request;

public class QuestionsDetailsRequest {
	private String question;
    private Object answer;
    
	public QuestionsDetailsRequest() {
		
	}

	public QuestionsDetailsRequest(String question, Object answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Object getAnswer() {
		return answer;
	}

	public void setAnswer(Object answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionsDetailsRequest [question=" + question + ", answer=" + answer + "]";
	}
    
    
}

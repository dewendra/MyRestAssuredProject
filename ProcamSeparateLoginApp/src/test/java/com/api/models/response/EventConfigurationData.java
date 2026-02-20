package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventConfigurationData {

	private String createdAuthor;
    private String createdDate;
    private String updatedAuthor;
    private String updatedDate;
    private int version;
    private boolean deleted;
    private int rowId;
    private int eventId;
    private boolean fundraiser;
    private boolean targetAmmount;
    private boolean showSizeChartNote;
    private boolean onGround;
    private boolean virtual;
    private boolean addon;
    private boolean charity;
    private boolean gratification;
    private boolean greenBib;
    private boolean aadhaarEnable;
    private boolean interNationalCharity;
    private boolean userLoginConset;

    @JsonProperty("buddy_count")
    private int buddyCount;

    @JsonProperty("ballot_enabled")
    private boolean ballotEnabled;

    @JsonProperty("registration_enabled")
    private boolean registrationEnabled;

    @JsonProperty("buddy_gender")
    private boolean buddyGender;

    @JsonProperty("parrent_id_proof")
    private boolean parrentIdProof;

    @JsonProperty("emergencyContact_count")
    private int emergencyContactCount;

    private boolean fundaraiserAmountRequired;
    private boolean fundraiserPanRequired;
    private boolean fundraiserNgoRequired;
    
	public EventConfigurationData() {
		
	}

	public EventConfigurationData(String createdAuthor, String createdDate, String updatedAuthor, String updatedDate,
			int version, boolean deleted, int rowId, int eventId, boolean fundraiser, boolean targetAmmount,
			boolean showSizeChartNote, boolean onGround, boolean virtual, boolean addon, boolean charity,
			boolean gratification, boolean greenBib, boolean aadhaarEnable, boolean interNationalCharity,
			boolean userLoginConset, int buddyCount, boolean ballotEnabled, boolean registrationEnabled,
			boolean buddyGender, boolean parrentIdProof, int emergencyContactCount, boolean fundaraiserAmountRequired,
			boolean fundraiserPanRequired, boolean fundraiserNgoRequired) {
		super();
		this.createdAuthor = createdAuthor;
		this.createdDate = createdDate;
		this.updatedAuthor = updatedAuthor;
		this.updatedDate = updatedDate;
		this.version = version;
		this.deleted = deleted;
		this.rowId = rowId;
		this.eventId = eventId;
		this.fundraiser = fundraiser;
		this.targetAmmount = targetAmmount;
		this.showSizeChartNote = showSizeChartNote;
		this.onGround = onGround;
		this.virtual = virtual;
		this.addon = addon;
		this.charity = charity;
		this.gratification = gratification;
		this.greenBib = greenBib;
		this.aadhaarEnable = aadhaarEnable;
		this.interNationalCharity = interNationalCharity;
		this.userLoginConset = userLoginConset;
		this.buddyCount = buddyCount;
		this.ballotEnabled = ballotEnabled;
		this.registrationEnabled = registrationEnabled;
		this.buddyGender = buddyGender;
		this.parrentIdProof = parrentIdProof;
		this.emergencyContactCount = emergencyContactCount;
		this.fundaraiserAmountRequired = fundaraiserAmountRequired;
		this.fundraiserPanRequired = fundraiserPanRequired;
		this.fundraiserNgoRequired = fundraiserNgoRequired;
	}

	public String getCreatedAuthor() {
		return createdAuthor;
	}

	public void setCreatedAuthor(String createdAuthor) {
		this.createdAuthor = createdAuthor;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedAuthor() {
		return updatedAuthor;
	}

	public void setUpdatedAuthor(String updatedAuthor) {
		this.updatedAuthor = updatedAuthor;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public boolean isFundraiser() {
		return fundraiser;
	}

	public void setFundraiser(boolean fundraiser) {
		this.fundraiser = fundraiser;
	}

	public boolean isTargetAmmount() {
		return targetAmmount;
	}

	public void setTargetAmmount(boolean targetAmmount) {
		this.targetAmmount = targetAmmount;
	}

	public boolean isShowSizeChartNote() {
		return showSizeChartNote;
	}

	public void setShowSizeChartNote(boolean showSizeChartNote) {
		this.showSizeChartNote = showSizeChartNote;
	}

	public boolean isOnGround() {
		return onGround;
	}

	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

	public boolean isVirtual() {
		return virtual;
	}

	public void setVirtual(boolean virtual) {
		this.virtual = virtual;
	}

	public boolean isAddon() {
		return addon;
	}

	public void setAddon(boolean addon) {
		this.addon = addon;
	}

	public boolean isCharity() {
		return charity;
	}

	public void setCharity(boolean charity) {
		this.charity = charity;
	}

	public boolean isGratification() {
		return gratification;
	}

	public void setGratification(boolean gratification) {
		this.gratification = gratification;
	}

	public boolean isGreenBib() {
		return greenBib;
	}

	public void setGreenBib(boolean greenBib) {
		this.greenBib = greenBib;
	}

	public boolean isAadhaarEnable() {
		return aadhaarEnable;
	}

	public void setAadhaarEnable(boolean aadhaarEnable) {
		this.aadhaarEnable = aadhaarEnable;
	}

	public boolean isInterNationalCharity() {
		return interNationalCharity;
	}

	public void setInterNationalCharity(boolean interNationalCharity) {
		this.interNationalCharity = interNationalCharity;
	}

	public boolean isUserLoginConset() {
		return userLoginConset;
	}

	public void setUserLoginConset(boolean userLoginConset) {
		this.userLoginConset = userLoginConset;
	}

	public int getBuddyCount() {
		return buddyCount;
	}

	public void setBuddyCount(int buddyCount) {
		this.buddyCount = buddyCount;
	}

	public boolean isBallotEnabled() {
		return ballotEnabled;
	}

	public void setBallotEnabled(boolean ballotEnabled) {
		this.ballotEnabled = ballotEnabled;
	}

	public boolean isRegistrationEnabled() {
		return registrationEnabled;
	}

	public void setRegistrationEnabled(boolean registrationEnabled) {
		this.registrationEnabled = registrationEnabled;
	}

	public boolean isBuddyGender() {
		return buddyGender;
	}

	public void setBuddyGender(boolean buddyGender) {
		this.buddyGender = buddyGender;
	}

	public boolean isParrentIdProof() {
		return parrentIdProof;
	}

	public void setParrentIdProof(boolean parrentIdProof) {
		this.parrentIdProof = parrentIdProof;
	}

	public int getEmergencyContactCount() {
		return emergencyContactCount;
	}

	public void setEmergencyContactCount(int emergencyContactCount) {
		this.emergencyContactCount = emergencyContactCount;
	}

	public boolean isFundaraiserAmountRequired() {
		return fundaraiserAmountRequired;
	}

	public void setFundaraiserAmountRequired(boolean fundaraiserAmountRequired) {
		this.fundaraiserAmountRequired = fundaraiserAmountRequired;
	}

	public boolean isFundraiserPanRequired() {
		return fundraiserPanRequired;
	}

	public void setFundraiserPanRequired(boolean fundraiserPanRequired) {
		this.fundraiserPanRequired = fundraiserPanRequired;
	}

	public boolean isFundraiserNgoRequired() {
		return fundraiserNgoRequired;
	}

	public void setFundraiserNgoRequired(boolean fundraiserNgoRequired) {
		this.fundraiserNgoRequired = fundraiserNgoRequired;
	}

	@Override
	public String toString() {
		return "EventConfigurationData [createdAuthor=" + createdAuthor + ", createdDate=" + createdDate
				+ ", updatedAuthor=" + updatedAuthor + ", updatedDate=" + updatedDate + ", version=" + version
				+ ", deleted=" + deleted + ", rowId=" + rowId + ", eventId=" + eventId + ", fundraiser=" + fundraiser
				+ ", targetAmmount=" + targetAmmount + ", showSizeChartNote=" + showSizeChartNote + ", onGround="
				+ onGround + ", virtual=" + virtual + ", addon=" + addon + ", charity=" + charity + ", gratification="
				+ gratification + ", greenBib=" + greenBib + ", aadhaarEnable=" + aadhaarEnable
				+ ", interNationalCharity=" + interNationalCharity + ", userLoginConset=" + userLoginConset
				+ ", buddyCount=" + buddyCount + ", ballotEnabled=" + ballotEnabled + ", registrationEnabled="
				+ registrationEnabled + ", buddyGender=" + buddyGender + ", parrentIdProof=" + parrentIdProof
				+ ", emergencyContactCount=" + emergencyContactCount + ", fundaraiserAmountRequired="
				+ fundaraiserAmountRequired + ", fundraiserPanRequired=" + fundraiserPanRequired
				+ ", fundraiserNgoRequired=" + fundraiserNgoRequired + "]";
	}
    
	
    
}

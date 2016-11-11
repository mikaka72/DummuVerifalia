package com.cdk.verifalia.model;

public class Entry {

	private String inputData;
	private String completedOn;
	private String emailAddress;
	private String  asciiEmailAddressDomainPart;
	private String emailAddressLocalPart;
	private String emailAddressDomainPart;
    private boolean hasInternationalDomainName;
    private boolean hasInternationalMailboxName;
    private boolean isDisposableEmailAddress;
    private boolean isRoleAccount;
    private String status;
    private String syntaxFailureIndex;
    private boolean isCatchAllFailure;
    private boolean isSuccess;
    private boolean isTimeoutFailure;
    private boolean isNetworkFailure;
    private boolean isSyntaxFailure;
    private boolean isDnsFailure;
    private boolean isSmtpFailure;
    private boolean isMailboxFailure;
	public String getInputData() {
		return inputData;
	}
	public void setInputData(String inputData) {
		this.inputData = inputData;
	}
	public String getCompletedOn() {
		return completedOn;
	}
	public void setCompletedOn(String completedOn) {
		this.completedOn = completedOn;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAsciiEmailAddressDomainPart() {
		return asciiEmailAddressDomainPart;
	}
	public void setAsciiEmailAddressDomainPart(String asciiEmailAddressDomainPart) {
		this.asciiEmailAddressDomainPart = asciiEmailAddressDomainPart;
	}
	public String getEmailAddressLocalPart() {
		return emailAddressLocalPart;
	}
	public void setEmailAddressLocalPart(String emailAddressLocalPart) {
		this.emailAddressLocalPart = emailAddressLocalPart;
	}
	public String getEmailAddressDomainPart() {
		return emailAddressDomainPart;
	}
	public void setEmailAddressDomainPart(String emailAddressDomainPart) {
		this.emailAddressDomainPart = emailAddressDomainPart;
	}
	public boolean isHasInternationalDomainName() {
		return hasInternationalDomainName;
	}
	public void setHasInternationalDomainName(boolean hasInternationalDomainName) {
		this.hasInternationalDomainName = hasInternationalDomainName;
	}
	public boolean isHasInternationalMailboxName() {
		return hasInternationalMailboxName;
	}
	public void setHasInternationalMailboxName(boolean hasInternationalMailboxName) {
		this.hasInternationalMailboxName = hasInternationalMailboxName;
	}
	public boolean isDisposableEmailAddress() {
		return isDisposableEmailAddress;
	}
	public void setDisposableEmailAddress(boolean isDisposableEmailAddress) {
		this.isDisposableEmailAddress = isDisposableEmailAddress;
	}
	public boolean isRoleAccount() {
		return isRoleAccount;
	}
	public void setRoleAccount(boolean isRoleAccount) {
		this.isRoleAccount = isRoleAccount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSyntaxFailureIndex() {
		return syntaxFailureIndex;
	}
	public void setSyntaxFailureIndex(String syntaxFailureIndex) {
		this.syntaxFailureIndex = syntaxFailureIndex;
	}
	public boolean isCatchAllFailure() {
		return isCatchAllFailure;
	}
	public void setCatchAllFailure(boolean isCatchAllFailure) {
		this.isCatchAllFailure = isCatchAllFailure;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public boolean isTimeoutFailure() {
		return isTimeoutFailure;
	}
	public void setTimeoutFailure(boolean isTimeoutFailure) {
		this.isTimeoutFailure = isTimeoutFailure;
	}
	public boolean isNetworkFailure() {
		return isNetworkFailure;
	}
	public void setNetworkFailure(boolean isNetworkFailure) {
		this.isNetworkFailure = isNetworkFailure;
	}
	public boolean isSyntaxFailure() {
		return isSyntaxFailure;
	}
	public void setSyntaxFailure(boolean isSyntaxFailure) {
		this.isSyntaxFailure = isSyntaxFailure;
	}
	public boolean isDnsFailure() {
		return isDnsFailure;
	}
	public void setDnsFailure(boolean isDnsFailure) {
		this.isDnsFailure = isDnsFailure;
	}
	public boolean isSmtpFailure() {
		return isSmtpFailure;
	}
	public void setSmtpFailure(boolean isSmtpFailure) {
		this.isSmtpFailure = isSmtpFailure;
	}
	public boolean isMailboxFailure() {
		return isMailboxFailure;
	}
	public void setMailboxFailure(boolean isMailboxFailure) {
		this.isMailboxFailure = isMailboxFailure;
	}
    
    
    
    
}

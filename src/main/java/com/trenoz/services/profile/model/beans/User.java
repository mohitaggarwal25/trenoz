package com.trenoz.services.profile.model.beans;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String passPhrase;
	private String phoneNo;
	private UserContact contact;
	private String qualification;
	private boolean working;
	private boolean studyingInInstitute;
	private String instituteStudyingIn;
	private boolean notificationsSubscribed;
	private Date createdDate;
	private Date modifiedDate;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the passPhrase
	 */
	public String getPassPhrase() {
		return passPhrase;
	}

	/**
	 * @param passPhrase
	 *            the passPhrase to set
	 */
	public void setPassPhrase(String passPhrase) {
		this.passPhrase = passPhrase;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the contact
	 */
	public UserContact getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(UserContact contact) {
		this.contact = contact;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification
	 *            the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the working
	 */
	public boolean isWorking() {
		return working;
	}

	/**
	 * @param working
	 *            the working to set
	 */
	public void setWorking(boolean working) {
		this.working = working;
	}

	/**
	 * @return the studyingInInstitute
	 */
	public boolean isStudyingInInstitute() {
		return studyingInInstitute;
	}

	/**
	 * @param studyingInInstitute
	 *            the studyingInInstitute to set
	 */
	public void setStudyingInInstitute(boolean studyingInInstitute) {
		this.studyingInInstitute = studyingInInstitute;
	}

	/**
	 * @return the instituteStudyingIn
	 */
	public String getInstituteStudyingIn() {
		return instituteStudyingIn;
	}

	/**
	 * @param instituteStudyingIn
	 *            the instituteStudyingIn to set
	 */
	public void setInstituteStudyingIn(String instituteStudyingIn) {
		this.instituteStudyingIn = instituteStudyingIn;
	}

	/**
	 * @return the notificationsSubscribed
	 */
	public boolean isNotificationsSubscribed() {
		return notificationsSubscribed;
	}

	/**
	 * @param notificationsSubscribed
	 *            the notificationsSubscribed to set
	 */
	public void setNotificationsSubscribed(boolean notificationsSubscribed) {
		this.notificationsSubscribed = notificationsSubscribed;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}

package com.eccl.cloud.common.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserCredentials {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.id
	 * @mbg.generated
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.user_id
	 * @mbg.generated
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.user_name
	 * @mbg.generated
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.certificate_number
	 * @mbg.generated
	 */
	private String certificateNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.credentials_name
	 * @mbg.generated
	 */
	private String credentialsName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.credentials_type
	 * @mbg.generated
	 */
	private String credentialsType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.begin_date
	 * @mbg.generated
	 */
	private Date beginDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.end_date
	 * @mbg.generated
	 */
	private Date endDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.attachment
	 * @mbg.generated
	 */
	private String attachment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.creator
	 * @mbg.generated
	 */
	private Long creator;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.create_time
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.operator
	 * @mbg.generated
	 */
	private Long operator;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.operate_time
	 * @mbg.generated
	 */
	private Date operateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_credentials.flow_state
	 * @mbg.generated
	 */
	private String flowState;
	
	private String bid;
	private boolean state;
	
	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.id
	 * @return  the value of user_credentials.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.id
	 * @param id  the value for user_credentials.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.user_id
	 * @return  the value of user_credentials.user_id
	 * @mbg.generated
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.user_id
	 * @param userId  the value for user_credentials.user_id
	 * @mbg.generated
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.user_name
	 * @return  the value of user_credentials.user_name
	 * @mbg.generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.user_name
	 * @param userName  the value for user_credentials.user_name
	 * @mbg.generated
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.certificate_number
	 * @return  the value of user_credentials.certificate_number
	 * @mbg.generated
	 */
	public String getCertificateNumber() {
		return certificateNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.certificate_number
	 * @param certificateNumber  the value for user_credentials.certificate_number
	 * @mbg.generated
	 */
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.credentials_name
	 * @return  the value of user_credentials.credentials_name
	 * @mbg.generated
	 */
	public String getCredentialsName() {
		return credentialsName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.credentials_name
	 * @param credentialsName  the value for user_credentials.credentials_name
	 * @mbg.generated
	 */
	public void setCredentialsName(String credentialsName) {
		this.credentialsName = credentialsName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.credentials_type
	 * @return  the value of user_credentials.credentials_type
	 * @mbg.generated
	 */
	public String getCredentialsType() {
		return credentialsType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.credentials_type
	 * @param credentialsType  the value for user_credentials.credentials_type
	 * @mbg.generated
	 */
	public void setCredentialsType(String credentialsType) {
		this.credentialsType = credentialsType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.begin_date
	 * @return  the value of user_credentials.begin_date
	 * @mbg.generated
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.begin_date
	 * @param beginDate  the value for user_credentials.begin_date
	 * @mbg.generated
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.end_date
	 * @return  the value of user_credentials.end_date
	 * @mbg.generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.end_date
	 * @param endDate  the value for user_credentials.end_date
	 * @mbg.generated
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.attachment
	 * @return  the value of user_credentials.attachment
	 * @mbg.generated
	 */
	public String getAttachment() {
		return attachment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.attachment
	 * @param attachment  the value for user_credentials.attachment
	 * @mbg.generated
	 */
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.creator
	 * @return  the value of user_credentials.creator
	 * @mbg.generated
	 */
	public Long getCreator() {
		return creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.creator
	 * @param creator  the value for user_credentials.creator
	 * @mbg.generated
	 */
	public void setCreator(Long creator) {
		this.creator = creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.create_time
	 * @return  the value of user_credentials.create_time
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.create_time
	 * @param createTime  the value for user_credentials.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.operator
	 * @return  the value of user_credentials.operator
	 * @mbg.generated
	 */
	public Long getOperator() {
		return operator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.operator
	 * @param operator  the value for user_credentials.operator
	 * @mbg.generated
	 */
	public void setOperator(Long operator) {
		this.operator = operator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.operate_time
	 * @return  the value of user_credentials.operate_time
	 * @mbg.generated
	 */
	public Date getOperateTime() {
		return operateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.operate_time
	 * @param operateTime  the value for user_credentials.operate_time
	 * @mbg.generated
	 */
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_credentials.flow_state
	 * @return  the value of user_credentials.flow_state
	 * @mbg.generated
	 */
	public String getFlowState() {
		return flowState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_credentials.flow_state
	 * @param flowState  the value for user_credentials.flow_state
	 * @mbg.generated
	 */
	public void setFlowState(String flowState) {
		this.flowState = flowState;
	}
}
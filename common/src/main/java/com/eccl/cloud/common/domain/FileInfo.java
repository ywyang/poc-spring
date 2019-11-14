package com.eccl.cloud.common.domain;

import java.util.Date;
import java.util.Map;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class FileInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_info.id
     *
     * @mbg.generated
     */
	@Id
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_info.name
     *
     * @mbg.generated
     */
    private String name;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_info.content_type
     *
     * @mbg.generated
     */
    private String contentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_info.bucket_name
     *
     * @mbg.generated
     */
    private String bucketName;
    
    
    private String objectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_info.temp
     *
     * @mbg.generated
     */
    private Boolean temp;
    
    
    private Map<String, String> fileAttr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_info.id
     *
     * @return the value of file_info.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_info.id
     *
     * @param id the value for file_info.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_info.name
     *
     * @return the value of file_info.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_info.name
     *
     * @param name the value for file_info.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_info.content_type
     *
     * @return the value of file_info.content_type
     *
     * @mbg.generated
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_info.content_type
     *
     * @param contentType the value for file_info.content_type
     *
     * @mbg.generated
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_info.create_time
     *
     * @return the value of file_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_info.create_time
     *
     * @param createTime the value for file_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_info.bucket_name
     *
     * @return the value of file_info.bucket_name
     *
     * @mbg.generated
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_info.bucket_name
     *
     * @param bucketName the value for file_info.bucket_name
     *
     * @mbg.generated
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    
    
    

    public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_info.temp
     *
     * @return the value of file_info.temp
     *
     * @mbg.generated
     */
    public Boolean getTemp() {
        return temp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_info.temp
     *
     * @param temp the value for file_info.temp
     *
     * @mbg.generated
     */
    public void setTemp(Boolean temp) {
        this.temp = temp;
    }

	public Map<String, String> getFileAttr() {
		return fileAttr;
	}

	public void setFileAttr(Map<String, String> fileAttr) {
		this.fileAttr = fileAttr;
	}
    
    
}
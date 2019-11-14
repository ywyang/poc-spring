package com.eccl.cloud.common.domain;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class SysDictProp {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.id
	 * @mbg.generated
	 */
	@Id
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.type_id
	 * @mbg.generated
	 */
	@NotBlank
	private String typeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.prop_id
	 * @mbg.generated
	 */
	@NotBlank
	private String propId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.prop_name
	 * @mbg.generated
	 */
	@NotBlank
	private String propName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.state
	 * @mbg.generated
	 */
	private String state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.show_index
	 * @mbg.generated
	 */
	private Integer showIndex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.remark
	 * @mbg.generated
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.creator
	 * @mbg.generated
	 */
	private Long creator;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.create_time
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.operator
	 * @mbg.generated
	 */
	private Long operator;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_prop.operate_time
	 * @mbg.generated
	 */
	private Date operateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.id
	 * @return  the value of sys_dict_prop.id
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.id
	 * @param id  the value for sys_dict_prop.id
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.type_id
	 * @return  the value of sys_dict_prop.type_id
	 * @mbg.generated
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.type_id
	 * @param typeId  the value for sys_dict_prop.type_id
	 * @mbg.generated
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.prop_id
	 * @return  the value of sys_dict_prop.prop_id
	 * @mbg.generated
	 */
	public String getPropId() {
		return propId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.prop_id
	 * @param propId  the value for sys_dict_prop.prop_id
	 * @mbg.generated
	 */
	public void setPropId(String propId) {
		this.propId = propId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.prop_name
	 * @return  the value of sys_dict_prop.prop_name
	 * @mbg.generated
	 */
	public String getPropName() {
		return propName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.prop_name
	 * @param propName  the value for sys_dict_prop.prop_name
	 * @mbg.generated
	 */
	public void setPropName(String propName) {
		this.propName = propName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.state
	 * @return  the value of sys_dict_prop.state
	 * @mbg.generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.state
	 * @param state  the value for sys_dict_prop.state
	 * @mbg.generated
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.show_index
	 * @return  the value of sys_dict_prop.show_index
	 * @mbg.generated
	 */
	public Integer getShowIndex() {
		return showIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.show_index
	 * @param showIndex  the value for sys_dict_prop.show_index
	 * @mbg.generated
	 */
	public void setShowIndex(Integer showIndex) {
		this.showIndex = showIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.remark
	 * @return  the value of sys_dict_prop.remark
	 * @mbg.generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.remark
	 * @param remark  the value for sys_dict_prop.remark
	 * @mbg.generated
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.creator
	 * @return  the value of sys_dict_prop.creator
	 * @mbg.generated
	 */
	public Long getCreator() {
		return creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.creator
	 * @param creator  the value for sys_dict_prop.creator
	 * @mbg.generated
	 */
	public void setCreator(Long creator) {
		this.creator = creator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.create_time
	 * @return  the value of sys_dict_prop.create_time
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.create_time
	 * @param createTime  the value for sys_dict_prop.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.operator
	 * @return  the value of sys_dict_prop.operator
	 * @mbg.generated
	 */
	public Long getOperator() {
		return operator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.operator
	 * @param operator  the value for sys_dict_prop.operator
	 * @mbg.generated
	 */
	public void setOperator(Long operator) {
		this.operator = operator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_prop.operate_time
	 * @return  the value of sys_dict_prop.operate_time
	 * @mbg.generated
	 */
	public Date getOperateTime() {
		return operateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_prop.operate_time
	 * @param operateTime  the value for sys_dict_prop.operate_time
	 * @mbg.generated
	 */
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((operateTime == null) ? 0 : operateTime.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((propId == null) ? 0 : propId.hashCode());
		result = prime * result + ((propName == null) ? 0 : propName.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((showIndex == null) ? 0 : showIndex.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysDictProp other = (SysDictProp) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (operateTime == null) {
			if (other.operateTime != null)
				return false;
		} else if (!operateTime.equals(other.operateTime))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		if (propId == null) {
			if (other.propId != null)
				return false;
		} else if (!propId.equals(other.propId))
			return false;
		if (propName == null) {
			if (other.propName != null)
				return false;
		} else if (!propName.equals(other.propName))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (showIndex == null) {
			if (other.showIndex != null)
				return false;
		} else if (!showIndex.equals(other.showIndex))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (typeId == null) {
			if (other.typeId != null)
				return false;
		} else if (!typeId.equals(other.typeId))
			return false;
		return true;
	}
	
}
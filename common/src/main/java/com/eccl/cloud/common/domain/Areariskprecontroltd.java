package com.eccl.cloud.common.domain;

import java.io.Serializable;
import java.util.Date;

public class Areariskprecontroltd implements Serializable{
	   /**
     * 主键id
     */
    private Long id;

    /**
     * 风险源
     */
    private String riskfrom;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 风险因素
     */
    private String riskreason;

    /**
     * 风险结果
     */
    private String riskresult;

    /**
     * 风险等级
     */
    private String riskgrade;

    /**
     * 应急措施
     */
    private String emergencymeasure;

    /**
     * 状态
     */
    private String statu;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建人
     */
    private String createperson;

    /**
     * 创建人id
     */
    private String createpersonid;

    /**
     * 操作时间
     */
    private Date operatetime;

    /**
     * 操作人
     */
    private String operateperson;

    /**
     * 操作人
     */
    private String operatepersonid;

    /**
     * 备用0
     */
    private String spare0;

    /**
     * 备用1
     */
    private String spare1;

    /**
     * 备用2
     */
    private String spare2;

    /**
     * 备用3
     */
    private String spare3;

    /**
     * 备用4
     */
    private String spare4;

    /**
     * 备用5
     */
    private String spare5;

    /**
     * 备用6
     */
    private String spare6;

    /**
     * 备用7
     */
    private String spare7;

    /**
     * 备用8
     */
    private String spare8;

    /**
     * 备用9
     */
    private String spare9;

    /**
     * 
     */
    private String bid;

    /**
     * 控制措施
     */
    private String controlmeasure;

    /**
     * c54_area_risk_precontrol_td
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.id
     *
     * @return the value of c54_area_risk_precontrol_td.id
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.id
     *
     * @param id the value for c54_area_risk_precontrol_td.id
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.riskfrom
     *
     * @return the value of c54_area_risk_precontrol_td.riskfrom
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getRiskfrom() {
        return riskfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.riskfrom
     *
     * @param riskfrom the value for c54_area_risk_precontrol_td.riskfrom
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setRiskfrom(String riskfrom) {
        this.riskfrom = riskfrom == null ? null : riskfrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.risktype
     *
     * @return the value of c54_area_risk_precontrol_td.risktype
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getRisktype() {
        return risktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.risktype
     *
     * @param risktype the value for c54_area_risk_precontrol_td.risktype
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setRisktype(String risktype) {
        this.risktype = risktype == null ? null : risktype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.riskreason
     *
     * @return the value of c54_area_risk_precontrol_td.riskreason
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getRiskreason() {
        return riskreason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.riskreason
     *
     * @param riskreason the value for c54_area_risk_precontrol_td.riskreason
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setRiskreason(String riskreason) {
        this.riskreason = riskreason == null ? null : riskreason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.riskresult
     *
     * @return the value of c54_area_risk_precontrol_td.riskresult
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getRiskresult() {
        return riskresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.riskresult
     *
     * @param riskresult the value for c54_area_risk_precontrol_td.riskresult
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setRiskresult(String riskresult) {
        this.riskresult = riskresult == null ? null : riskresult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.riskgrade
     *
     * @return the value of c54_area_risk_precontrol_td.riskgrade
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getRiskgrade() {
        return riskgrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.riskgrade
     *
     * @param riskgrade the value for c54_area_risk_precontrol_td.riskgrade
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setRiskgrade(String riskgrade) {
        this.riskgrade = riskgrade == null ? null : riskgrade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.emergencymeasure
     *
     * @return the value of c54_area_risk_precontrol_td.emergencymeasure
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getEmergencymeasure() {
        return emergencymeasure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.emergencymeasure
     *
     * @param emergencymeasure the value for c54_area_risk_precontrol_td.emergencymeasure
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setEmergencymeasure(String emergencymeasure) {
        this.emergencymeasure = emergencymeasure == null ? null : emergencymeasure.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.statu
     *
     * @return the value of c54_area_risk_precontrol_td.statu
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getStatu() {
        return statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.statu
     *
     * @param statu the value for c54_area_risk_precontrol_td.statu
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.createtime
     *
     * @return the value of c54_area_risk_precontrol_td.createtime
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.createtime
     *
     * @param createtime the value for c54_area_risk_precontrol_td.createtime
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.createperson
     *
     * @return the value of c54_area_risk_precontrol_td.createperson
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getCreateperson() {
        return createperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.createperson
     *
     * @param createperson the value for c54_area_risk_precontrol_td.createperson
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.createpersonid
     *
     * @return the value of c54_area_risk_precontrol_td.createpersonid
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getCreatepersonid() {
        return createpersonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.createpersonid
     *
     * @param createpersonid the value for c54_area_risk_precontrol_td.createpersonid
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setCreatepersonid(String createpersonid) {
        this.createpersonid = createpersonid == null ? null : createpersonid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.operatetime
     *
     * @return the value of c54_area_risk_precontrol_td.operatetime
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.operatetime
     *
     * @param operatetime the value for c54_area_risk_precontrol_td.operatetime
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.operateperson
     *
     * @return the value of c54_area_risk_precontrol_td.operateperson
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getOperateperson() {
        return operateperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.operateperson
     *
     * @param operateperson the value for c54_area_risk_precontrol_td.operateperson
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setOperateperson(String operateperson) {
        this.operateperson = operateperson == null ? null : operateperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.operatepersonid
     *
     * @return the value of c54_area_risk_precontrol_td.operatepersonid
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getOperatepersonid() {
        return operatepersonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.operatepersonid
     *
     * @param operatepersonid the value for c54_area_risk_precontrol_td.operatepersonid
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setOperatepersonid(String operatepersonid) {
        this.operatepersonid = operatepersonid == null ? null : operatepersonid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare0
     *
     * @return the value of c54_area_risk_precontrol_td.spare0
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare0() {
        return spare0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare0
     *
     * @param spare0 the value for c54_area_risk_precontrol_td.spare0
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare0(String spare0) {
        this.spare0 = spare0 == null ? null : spare0.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare1
     *
     * @return the value of c54_area_risk_precontrol_td.spare1
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare1() {
        return spare1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare1
     *
     * @param spare1 the value for c54_area_risk_precontrol_td.spare1
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare2
     *
     * @return the value of c54_area_risk_precontrol_td.spare2
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare2() {
        return spare2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare2
     *
     * @param spare2 the value for c54_area_risk_precontrol_td.spare2
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare2(String spare2) {
        this.spare2 = spare2 == null ? null : spare2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare3
     *
     * @return the value of c54_area_risk_precontrol_td.spare3
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare3() {
        return spare3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare3
     *
     * @param spare3 the value for c54_area_risk_precontrol_td.spare3
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare3(String spare3) {
        this.spare3 = spare3 == null ? null : spare3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare4
     *
     * @return the value of c54_area_risk_precontrol_td.spare4
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare4() {
        return spare4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare4
     *
     * @param spare4 the value for c54_area_risk_precontrol_td.spare4
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare4(String spare4) {
        this.spare4 = spare4 == null ? null : spare4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare5
     *
     * @return the value of c54_area_risk_precontrol_td.spare5
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare5() {
        return spare5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare5
     *
     * @param spare5 the value for c54_area_risk_precontrol_td.spare5
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare5(String spare5) {
        this.spare5 = spare5 == null ? null : spare5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare6
     *
     * @return the value of c54_area_risk_precontrol_td.spare6
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare6() {
        return spare6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare6
     *
     * @param spare6 the value for c54_area_risk_precontrol_td.spare6
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare6(String spare6) {
        this.spare6 = spare6 == null ? null : spare6.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare7
     *
     * @return the value of c54_area_risk_precontrol_td.spare7
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare7() {
        return spare7;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare7
     *
     * @param spare7 the value for c54_area_risk_precontrol_td.spare7
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare7(String spare7) {
        this.spare7 = spare7 == null ? null : spare7.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare8
     *
     * @return the value of c54_area_risk_precontrol_td.spare8
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare8() {
        return spare8;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare8
     *
     * @param spare8 the value for c54_area_risk_precontrol_td.spare8
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare8(String spare8) {
        this.spare8 = spare8 == null ? null : spare8.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.spare9
     *
     * @return the value of c54_area_risk_precontrol_td.spare9
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getSpare9() {
        return spare9;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.spare9
     *
     * @param spare9 the value for c54_area_risk_precontrol_td.spare9
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setSpare9(String spare9) {
        this.spare9 = spare9 == null ? null : spare9.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.bid
     *
     * @return the value of c54_area_risk_precontrol_td.bid
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.bid
     *
     * @param bid the value for c54_area_risk_precontrol_td.bid
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c54_area_risk_precontrol_td.controlmeasure
     *
     * @return the value of c54_area_risk_precontrol_td.controlmeasure
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public String getControlmeasure() {
        return controlmeasure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c54_area_risk_precontrol_td.controlmeasure
     *
     * @param controlmeasure the value for c54_area_risk_precontrol_td.controlmeasure
     *
     * @mbg.generated Sat Sep 22 14:46:38 CST 2018
     */
    public void setControlmeasure(String controlmeasure) {
        this.controlmeasure = controlmeasure == null ? null : controlmeasure.trim();
    }
    
    private String state;
    
    private Date disclosedate;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDisclosedate() {
		return disclosedate;
	}

	public void setDisclosedate(Date disclosedate) {
		this.disclosedate = disclosedate;
	}
}

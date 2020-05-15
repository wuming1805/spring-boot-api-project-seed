package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Account {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 0 ��̨���� 1 ���� 2 ҽ��
     */
    @Column(name = "UTYPE")
    private Byte utype;

    /**
     * ��½��
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * ��½����
     */
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "TOKEN")
    private String token;

    /**
     * �绰
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * ��ʵ����
     */
    @Column(name = "REALNAME")
    private String realname;

    /**
     * ����
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * �Ա�
     */
    @Column(name = "SEXCODE")
    private Byte sexcode;

    /**
     * ��������
     */
    @Column(name = "BIRTHDATE")
    private Date birthdate;

    /**
     * ͷ��
     */
    @Column(name = "HEADER")
    private String header;

    /**
     * 1:����,0: ������:9:ͣ��
     */
    @Column(name = "FLAG")
    private Byte flag;

    /**
     * ��½�������
     */
    @Column(name = "FAILURENUM")
    private Byte failurenum;

    /**
     * �ϴε�½ʱ��
     */
    @Column(name = "LASTLOGDATE")
    private Date lastlogdate;

    /**
     * �ϴε�½IP
     */
    @Column(name = "LASTLOGIP")
    private String lastlogip;

    /**
     * ע��IP
     */
    @Column(name = "REGIP")
    private String regip;

    /**
     * ע��ʱ��
     */
    @Column(name = "REGDATE")
    private Date regdate;

    /**
     * ע������ 1������ͨ��ע���½��2����΢�ŵ�½��3����qq��½��4����΢����½
     */
    @Column(name = "REGTYPE")
    private Short regtype;

    /**
     * ֤�����1���������֤2���۰ľ������֤3��̨��������֤4�����գ�
     */
    @Column(name = "CARDTYPE")
    private String cardtype;

    /**
     * ֤������
     */
    @Column(name = "IDCARD")
    private String idcard;

    /**
     * �Ƿ񼤻�[�������ehr-card]��0����δ���1������
     */
    @Column(name = "ACTIVATED")
    private Short activated;

    /**
     * ΢�ź�
     */
    @Column(name = "OPENID")
    private String openid;

    /**
     * ����(1���й���½��2���й��۰ģ�3���й�̨�壻9������ͬ����
     */
    @Column(name = "NATIONALITY")
    private Byte nationality;

    /**
     * his�е��û�ID
     */
    @Column(name = "PATIENTCODE")
    private String patientcode;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "CITY_CODE")
    private String cityCode;

    @Column(name = "AREA")
    private String area;

    @Column(name = "AREA_CODE")
    private String areaCode;

    @Column(name = "ADDRESS")
    private String address;

    /**
     * �Ƿ���֤
     */
    @Column(name = "certification_validity_period")
    private String certificationValidityPeriod;

    /**
     * �����id
     */
    private String aliuid;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ0 ��̨���� 1 ���� 2 ҽ��
     *
     * @return UTYPE - 0 ��̨���� 1 ���� 2 ҽ��
     */
    public Byte getUtype() {
        return utype;
    }

    /**
     * ����0 ��̨���� 1 ���� 2 ҽ��
     *
     * @param utype 0 ��̨���� 1 ���� 2 ҽ��
     */
    public void setUtype(Byte utype) {
        this.utype = utype;
    }

    /**
     * ��ȡ��½��
     *
     * @return USERNAME - ��½��
     */
    public String getUsername() {
        return username;
    }

    /**
     * ���õ�½��
     *
     * @param username ��½��
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ��½����
     *
     * @return PASSWORD - ��½����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ���õ�½����
     *
     * @param password ��½����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return TOKEN
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * ��ȡ�绰
     *
     * @return MOBILE - �绰
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ���õ绰
     *
     * @param mobile �绰
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * ��ȡ��ʵ����
     *
     * @return REALNAME - ��ʵ����
     */
    public String getRealname() {
        return realname;
    }

    /**
     * ������ʵ����
     *
     * @param realname ��ʵ����
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * ��ȡ����
     *
     * @return EMAIL - ����
     */
    public String getEmail() {
        return email;
    }

    /**
     * ��������
     *
     * @param email ����
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ�Ա�
     *
     * @return SEXCODE - �Ա�
     */
    public Byte getSexcode() {
        return sexcode;
    }

    /**
     * �����Ա�
     *
     * @param sexcode �Ա�
     */
    public void setSexcode(Byte sexcode) {
        this.sexcode = sexcode;
    }

    /**
     * ��ȡ��������
     *
     * @return BIRTHDATE - ��������
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * ���ó�������
     *
     * @param birthdate ��������
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * ��ȡͷ��
     *
     * @return HEADER - ͷ��
     */
    public String getHeader() {
        return header;
    }

    /**
     * ����ͷ��
     *
     * @param header ͷ��
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * ��ȡ1:����,0: ������:9:ͣ��
     *
     * @return FLAG - 1:����,0: ������:9:ͣ��
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * ����1:����,0: ������:9:ͣ��
     *
     * @param flag 1:����,0: ������:9:ͣ��
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    /**
     * ��ȡ��½�������
     *
     * @return FAILURENUM - ��½�������
     */
    public Byte getFailurenum() {
        return failurenum;
    }

    /**
     * ���õ�½�������
     *
     * @param failurenum ��½�������
     */
    public void setFailurenum(Byte failurenum) {
        this.failurenum = failurenum;
    }

    /**
     * ��ȡ�ϴε�½ʱ��
     *
     * @return LASTLOGDATE - �ϴε�½ʱ��
     */
    public Date getLastlogdate() {
        return lastlogdate;
    }

    /**
     * �����ϴε�½ʱ��
     *
     * @param lastlogdate �ϴε�½ʱ��
     */
    public void setLastlogdate(Date lastlogdate) {
        this.lastlogdate = lastlogdate;
    }

    /**
     * ��ȡ�ϴε�½IP
     *
     * @return LASTLOGIP - �ϴε�½IP
     */
    public String getLastlogip() {
        return lastlogip;
    }

    /**
     * �����ϴε�½IP
     *
     * @param lastlogip �ϴε�½IP
     */
    public void setLastlogip(String lastlogip) {
        this.lastlogip = lastlogip;
    }

    /**
     * ��ȡע��IP
     *
     * @return REGIP - ע��IP
     */
    public String getRegip() {
        return regip;
    }

    /**
     * ����ע��IP
     *
     * @param regip ע��IP
     */
    public void setRegip(String regip) {
        this.regip = regip;
    }

    /**
     * ��ȡע��ʱ��
     *
     * @return REGDATE - ע��ʱ��
     */
    public Date getRegdate() {
        return regdate;
    }

    /**
     * ����ע��ʱ��
     *
     * @param regdate ע��ʱ��
     */
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    /**
     * ��ȡע������ 1������ͨ��ע���½��2����΢�ŵ�½��3����qq��½��4����΢����½
     *
     * @return REGTYPE - ע������ 1������ͨ��ע���½��2����΢�ŵ�½��3����qq��½��4����΢����½
     */
    public Short getRegtype() {
        return regtype;
    }

    /**
     * ����ע������ 1������ͨ��ע���½��2����΢�ŵ�½��3����qq��½��4����΢����½
     *
     * @param regtype ע������ 1������ͨ��ע���½��2����΢�ŵ�½��3����qq��½��4����΢����½
     */
    public void setRegtype(Short regtype) {
        this.regtype = regtype;
    }

    /**
     * ��ȡ֤�����1���������֤2���۰ľ������֤3��̨��������֤4�����գ�
     *
     * @return CARDTYPE - ֤�����1���������֤2���۰ľ������֤3��̨��������֤4�����գ�
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * ����֤�����1���������֤2���۰ľ������֤3��̨��������֤4�����գ�
     *
     * @param cardtype ֤�����1���������֤2���۰ľ������֤3��̨��������֤4�����գ�
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * ��ȡ֤������
     *
     * @return IDCARD - ֤������
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * ����֤������
     *
     * @param idcard ֤������
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * ��ȡ�Ƿ񼤻�[�������ehr-card]��0����δ���1������
     *
     * @return ACTIVATED - �Ƿ񼤻�[�������ehr-card]��0����δ���1������
     */
    public Short getActivated() {
        return activated;
    }

    /**
     * �����Ƿ񼤻�[�������ehr-card]��0����δ���1������
     *
     * @param activated �Ƿ񼤻�[�������ehr-card]��0����δ���1������
     */
    public void setActivated(Short activated) {
        this.activated = activated;
    }

    /**
     * ��ȡ΢�ź�
     *
     * @return OPENID - ΢�ź�
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * ����΢�ź�
     *
     * @param openid ΢�ź�
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * ��ȡ����(1���й���½��2���й��۰ģ�3���й�̨�壻9������ͬ����
     *
     * @return NATIONALITY - ����(1���й���½��2���й��۰ģ�3���й�̨�壻9������ͬ����
     */
    public Byte getNationality() {
        return nationality;
    }

    /**
     * ���ù���(1���й���½��2���й��۰ģ�3���й�̨�壻9������ͬ����
     *
     * @param nationality ����(1���й���½��2���й��۰ģ�3���й�̨�壻9������ͬ����
     */
    public void setNationality(Byte nationality) {
        this.nationality = nationality;
    }

    /**
     * ��ȡhis�е��û�ID
     *
     * @return PATIENTCODE - his�е��û�ID
     */
    public String getPatientcode() {
        return patientcode;
    }

    /**
     * ����his�е��û�ID
     *
     * @param patientcode his�е��û�ID
     */
    public void setPatientcode(String patientcode) {
        this.patientcode = patientcode;
    }

    /**
     * @return PROVINCE
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return PROVINCE_CODE
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * @return CITY
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return CITY_CODE
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return AREA
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return AREA_CODE
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ�Ƿ���֤
     *
     * @return certification_validity_period - �Ƿ���֤
     */
    public String getCertificationValidityPeriod() {
        return certificationValidityPeriod;
    }

    /**
     * �����Ƿ���֤
     *
     * @param certificationValidityPeriod �Ƿ���֤
     */
    public void setCertificationValidityPeriod(String certificationValidityPeriod) {
        this.certificationValidityPeriod = certificationValidityPeriod;
    }

    /**
     * ��ȡ�����id
     *
     * @return aliuid - �����id
     */
    public String getAliuid() {
        return aliuid;
    }

    /**
     * ���������id
     *
     * @param aliuid �����id
     */
    public void setAliuid(String aliuid) {
        this.aliuid = aliuid;
    }
}
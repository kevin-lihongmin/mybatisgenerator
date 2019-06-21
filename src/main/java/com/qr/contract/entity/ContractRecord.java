package com.qr.contract.entity;

import java.io.Serializable;
import java.util.Date;

public class ContractRecord implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createdDate;

    /**
     * 修改时间
     */
    private Date modifiedDate;

    /**
     * 合同内容
     */
    private String content;

    /**
     * 合同名称
     */
    private String contractName;

    /**
     * 合同类型:1、pdf 2、html
     */
    private Integer contractType;

    /**
     * 合同链接
     */
    private String contractUrl;

    /**
     * oss标识
     */
    private String eTag;

    /**
     * 是否使用模板: 1、使用模板 2、不使用模板
     */
    private Integer haveTemplate;

    /**
     * 模板编码
     */
    private String templateCode;

    /**
     * 系统code
     */
    private String systemCode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public String geteTag() {
        return eTag;
    }

    public void seteTag(String eTag) {
        this.eTag = eTag;
    }

    public Integer getHaveTemplate() {
        return haveTemplate;
    }

    public void setHaveTemplate(Integer haveTemplate) {
        this.haveTemplate = haveTemplate;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}
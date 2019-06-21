package com.qr.contract.entity;

import java.io.Serializable;
import java.util.Date;

public class Template implements Serializable {
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
     * 模板地址
     */
    private String templateAddress;

    /**
     * 模板code
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

    public String getTemplateAddress() {
        return templateAddress;
    }

    public void setTemplateAddress(String templateAddress) {
        this.templateAddress = templateAddress;
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
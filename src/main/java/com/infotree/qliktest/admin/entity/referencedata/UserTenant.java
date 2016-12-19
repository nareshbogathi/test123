package com.infotree.qliktest.admin.entity.referencedata;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.infotree.qliktest.admin.entity.BaseQTAdminEntity;
import com.infotree.qliktest.admin.entity.accesscontrolled.AccessControlled;


/**
 * A role that can be used to grant access to functions within the system.
 */
@Entity
@Table(name = "user_tenant")
//@Audited("User Profile")
public class UserTenant implements BaseQTAdminEntity, Serializable,AccessControlled {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserTenantComp userTenantComp;
	
	@Column(name = "created_by", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	@Basic(fetch = FetchType.EAGER)
	private Date createdDate;
	
	@Column(name = "modified_by", length = 50)
	@Basic(fetch = FetchType.EAGER)
	private String modifiedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date")
	@Basic(fetch = FetchType.EAGER)
	private Date modifiedDate;
	
	/**
	 * Constructor. Sets all properties to default (null) values.
	 */
	public UserTenant() {
	}

	

	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}



	/**
	 * @return the userTenantComp
	 */
	public UserTenantComp getUserTenantComp() {
		return userTenantComp;
	}



	/**
	 * @param userTenantComp the userTenantComp to set
	 */
	public void setUserTenantComp(UserTenantComp userTenantComp) {
		this.userTenantComp = userTenantComp;
	}

}

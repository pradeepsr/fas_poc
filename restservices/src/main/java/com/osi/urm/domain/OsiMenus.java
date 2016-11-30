package com.osi.urm.domain;

// Generated Nov 28, 2016 7:51:32 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OsiMenus generated by hbm2java
 */
@Entity
@Table(name = "osi_menus")
public class OsiMenus implements java.io.Serializable {

	private Long id;
	private String menuName;
	private String description;
	private Integer createdBy;
	private Date createdDate;
	private Integer updatedBy;
	private Date updatedDate;
	private Set<OsiMenuEntries> osiMenuEntriesesForSubMenuId = new HashSet<OsiMenuEntries>(
			0);
	private Set<OsiResponsibilities> osiResponsibilitieses = new HashSet<OsiResponsibilities>(
			0);
	private Set<OsiMenuEntries> osiMenuEntriesesForMenuId = new HashSet<OsiMenuEntries>(
			0);

	public OsiMenus() {
	}

	public OsiMenus(Long id, String menuName) {
		this.id = id;
		this.menuName = menuName;
	}

	public OsiMenus(Long id, String menuName, String description,
			Integer createdBy, Date createdDate, Integer updatedBy,
			Date updatedDate, Set<OsiMenuEntries> osiMenuEntriesesForSubMenuId,
			Set<OsiResponsibilities> osiResponsibilitieses,
			Set<OsiMenuEntries> osiMenuEntriesesForMenuId) {
		this.id = id;
		this.menuName = menuName;
		this.description = description;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.osiMenuEntriesesForSubMenuId = osiMenuEntriesesForSubMenuId;
		this.osiResponsibilitieses = osiResponsibilitieses;
		this.osiMenuEntriesesForMenuId = osiMenuEntriesesForMenuId;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "menu_name", nullable = false, length = 1000)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "description", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 0)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 0)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "osiMenusBySubMenuId")
	public Set<OsiMenuEntries> getOsiMenuEntriesesForSubMenuId() {
		return this.osiMenuEntriesesForSubMenuId;
	}

	public void setOsiMenuEntriesesForSubMenuId(
			Set<OsiMenuEntries> osiMenuEntriesesForSubMenuId) {
		this.osiMenuEntriesesForSubMenuId = osiMenuEntriesesForSubMenuId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "osiMenus")
	public Set<OsiResponsibilities> getOsiResponsibilitieses() {
		return this.osiResponsibilitieses;
	}

	public void setOsiResponsibilitieses(
			Set<OsiResponsibilities> osiResponsibilitieses) {
		this.osiResponsibilitieses = osiResponsibilitieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "osiMenusByMenuId")
	public Set<OsiMenuEntries> getOsiMenuEntriesesForMenuId() {
		return this.osiMenuEntriesesForMenuId;
	}

	public void setOsiMenuEntriesesForMenuId(
			Set<OsiMenuEntries> osiMenuEntriesesForMenuId) {
		this.osiMenuEntriesesForMenuId = osiMenuEntriesesForMenuId;
	}

}

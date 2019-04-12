package com.javabycode.springboot.bean;

import java.time.LocalDate;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

import com.javabycode.springboot.bean.AbsenceType;


public class Absence {


	private Integer id;

	private LocalDate startDate;


	private LocalDate endDate;


	private String reason;

	private AbsenceType absenceType;


	private Status status;

	public Absence() {
		super();
	}

	public Absence(Integer id, LocalDate startDate, LocalDate endDate, String reason, AbsenceType absenceType,
			Status status) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reason = reason;
		this.absenceType = absenceType;
		this.status = status;
	}

	@NotNull
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Past
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Past
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@NotBlank
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@NotBlank
	public AbsenceType getAbsenceType() {
		return absenceType;
	}

	public void setAbsenceType(AbsenceType absenceType) {
		this.absenceType = absenceType;
	}

	@NotBlank
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Absence [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", reason=" + reason
				+ ", idAbsenceType=" + absenceType + ", idStatus=" + status + "]";
	}

}

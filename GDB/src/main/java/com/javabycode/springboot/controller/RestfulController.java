package com.javabycode.springboot.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabycode.springboot.bean.Absence;
import com.javabycode.springboot.bean.AbsenceType;
import com.javabycode.springboot.bean.Status;

@RestController
public class RestfulController {

	@GetMapping("/api/absences")
	public @ResponseBody List<Absence> findAbsences() {

		AbsenceType absT = new AbsenceType(0, "Youcef");
		Status st = new Status(0, "Handoura");
		
		AbsenceType absT2 = new AbsenceType(1, "Yoane");
		Status st2 = new Status(1, "Mercury");
		
		AbsenceType absT3 = new AbsenceType(2, "Anis");
		Status st3 = new Status(2, "Maël");
		
		List<Absence> absences = new ArrayList<>();
		Absence absence = new Absence();
		Absence absence2 = new Absence();
		Absence absence3 = new Absence();
		
		absence.setAbsenceType(absT);
		absence2.setAbsenceType(absT2);
		absence3.setAbsenceType(absT3);
		absence.setEndDate(LocalDate.now());
		absence2.setEndDate(LocalDate.now());
		absence3.setEndDate(LocalDate.now());
		absence.setId(0);
		absence2.setId(0);
		absence3.setId(0);
		absence.setReason("edrfghuj");
		absence2.setReason("edrfghuj");
		absence3.setReason("edrfghuj");
		absence.setStatus(st);
		absence2.setStatus(st2);
		absence3.setStatus(st3);

		
		absences.add(absence);
		absences.add(absence2);
		absences.add(absence3);
		
		return absences;

	}

}
package fr.uha.anis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String summary;
String acceptanceCriteria;
String status;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public String getAcceptanceCriteria() {
	return acceptanceCriteria;
}
public void setAcceptanceCriteria(String acceptanceCriteria) {
	this.acceptanceCriteria = acceptanceCriteria;
}
public Task(String summary, String acceptanceCriteria, String status) {

	this.summary = summary;
	this.acceptanceCriteria = acceptanceCriteria;
	this.status = status;
}
public Task() {
	// TODO Auto-generated constructor stub
}
}

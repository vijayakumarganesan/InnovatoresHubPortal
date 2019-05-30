package com.innovatoreshub.project.bean;

import org.springframework.stereotype.Component;

@Component
    public class InnovationsRecord {
	String email;
	String idadhar;
	String innovationtitle;
	String categorey;
	String technology;
	String shortdescription;
	String longdescription;
	String vediourl;
	String githuburl;
	String attachment;
	String status;
	public InnovationsRecord()
	{
		super();
	}
	
	public InnovationsRecord(String emailid,String idadhar,String innovationtitle,String categorey,String shortdescription,String longdescription,		String vediourl,	String githuburl,	String attachment,	String status)
	{
		this.email=email;
		this.idadhar=idadhar;
		this.innovationtitle=innovationtitle;
		this.categorey=categorey;
		this.technology=technology;
		this.shortdescription=shortdescription;
		this.longdescription=longdescription;
		this.vediourl=vediourl;
		this.githuburl=githuburl;
		this.attachment=attachment;
		this.status=status;
	}
	
	public String getEmail() {
		return email;
	}
	public String getIdadhar() {
		return idadhar;
	}
	public String getInnovationtitle() {
		return innovationtitle;
	}
	public String getCategorey() {
		return categorey;
	}
	public String getTechnology() {
		return technology;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public String getLongdescription() {
		return longdescription;
	}
	public String getVediourl() {
		return vediourl;
	}
	public String getGithuburl() {
		return githuburl;
	}
	public String getAttachment() {
		return attachment;
	}
	public String getStatus() {
		return status;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdadhar(String idadhar) {
		this.idadhar = idadhar;
	}
	public void setInnovationtitle(String innovationtitle) {
		this.innovationtitle = innovationtitle;
	}
	public void setCategorey(String categorey) {
		this.categorey = categorey;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public void setLongdescription(String longdescription) {
		this.longdescription = longdescription;
	}
	public void setVediourl(String vediourl) {
		this.vediourl = vediourl;
	}
	public void setGithuburl(String githuburl) {
		this.githuburl = githuburl;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InnovationsRecord [email=" + email + ", idadhar=" + idadhar + ", innovationtitle=" + innovationtitle+ ", categorey=" + categorey + ", technology=" + technology + ", shortdescription=" + shortdescription+ ", longdescription=" + longdescription + ", vediourl=" + vediourl + ", githuburl=" + githuburl+ ", attachment=" + attachment + ", status=" + status + "]";
	}
}

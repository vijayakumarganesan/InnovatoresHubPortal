package com.innovatoreshub.project.dao;

import java.util.List;

import com.innovatoreshub.project.bean.InnovationsRecord;
import com.innovatoreshub.project.bean.InnovatoresPersonalInfo;

public interface InnovatoresDao {
	public void registerInnovations(InnovatoresPersonalInfo innovatorespersonalinfo);
	public List getAllInnovationsDetails();
	public boolean login(String username, String password);
	public long update(String idadhar,String contactno);
    public long innovationsUpload(InnovationsRecord innovationsrecord,String idadhar);
}

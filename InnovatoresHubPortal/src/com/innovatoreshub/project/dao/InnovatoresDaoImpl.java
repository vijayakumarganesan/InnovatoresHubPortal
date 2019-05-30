package com.innovatoreshub.project.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.innovatoreshub.project.bean.InnovationsRecord;
import com.innovatoreshub.project.bean.InnovatoresPersonalInfo;
import com.mongodb.client.result.UpdateResult;
public class InnovatoresDaoImpl implements InnovatoresDao{
	
	private static final String COLLECTION="innovatores_information";
	@Autowired
    JdbcTemplate jdbcTemplate;
	@Autowired
	MongoTemplate mongoTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	@Override
	public void registerInnovations(InnovatoresPersonalInfo innovatorespersonalinfo) {
	mongoTemplate.insert(innovatorespersonalinfo);	
	}
	
	public List getAllInnovationsDetails() {
		return(List) mongoTemplate.findAll(InnovatoresPersonalInfo.class,COLLECTION);
	}
 
	public boolean login(String username, String password) {
		
		boolean l=false;
		if(username !=null)
		{
		Query query=new Query();
		query.addCriteria(Criteria.where("username").is(username).and("password").is(password));
		l=true;
		}
		return l;

	}
	public long update(String idadhar,String contactno)
	{
		long l=0;
		if(idadhar!=null)
		{
		Query query=new Query();
		query.addCriteria(Criteria.where("idadhar").is(idadhar));
		Update update=new Update();
		update.set("contactno", contactno);
        UpdateResult res= mongoTemplate.updateFirst(query, update,InnovatoresPersonalInfo.class );
        l=res.getModifiedCount();
		}
		return l;
	}
	public long innovationsUpload(InnovationsRecord innvoationsrecord,String idadhar)
	{
		long l=0;
		if(idadhar !=null)
		{
			Query query=new Query();
			query.addCriteria(Criteria.where("idadhar").is(idadhar));
			Update update=new Update();
			update.push("innovationsinfo", innvoationsrecord);
			UpdateResult res=mongoTemplate.updateFirst(query, update,InnovatoresPersonalInfo.class);
		}
		
		return l;
	}
}
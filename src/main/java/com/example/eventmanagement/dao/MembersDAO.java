package com.example.eventmanagement.dao;

import com.example.eventmanagement.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MembersDAO implements MembersInterface{

@Autowired
    JdbcTemplate jdbcTemplate;

@Override
    public void addNewMember(Member member){
    String sql = "INSTER INTO members " + "(login, password, name, mail) VALUES (?, ?, ?, ?)";
    jdbcTemplate.update(sql, new Object[]{member.getLogin(), member.getPassword(), member.getName(), member.getMail()});
}
}

package com.example.eventmanagement.dao;

import com.example.eventmanagement.model.Member;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MembersRowMapper implements RowMapper<Member> {



    @Override
    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
        Member member = new Member();
        member.setLogin(rs.getString("login"));
        member.setPassword(rs.getString("Password"));
        member.setMail(rs.getString(("Mail")));
        member.setName((rs.getString("Name")));
        return member;
    }
}

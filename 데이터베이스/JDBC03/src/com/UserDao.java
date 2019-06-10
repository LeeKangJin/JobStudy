package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.User;

public class UserDao extends Dao<String, User> {

	
	
	@Override
	public void insert(User v, Connection con) throws Exception {
		
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.insertUser);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getPwd());
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			throw e;
		}
		finally {
			close(pstmt);
		}
		
	}

	@Override
	public void delete(String k, Connection con) throws Exception {
		
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.deleteUser);
			pstmt.setString(1, k);
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			throw e;
		}
		finally {
			close(pstmt);
		}
		
	}

	@Override
	public void update(User v, Connection con) throws Exception {
		
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.updateUser);
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getId());
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			throw e;
		}
		finally {
			
			close(pstmt);
			
		}
		
	}

	@Override
	public User select(String k, Connection con) throws Exception {
		
		
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		User u = null;
		try {
			pstmt = con.prepareStatement(Sql.selectUser);
			pstmt.setString(1, k);
			
			
			rset = pstmt.executeQuery(); 
		
			rset.next();

			String id = rset.getString("ID");
			String pwd = rset.getString("PWD");
			String name = rset.getString("NAME");
				
			u = new User(id,pwd,name);
			
		}
		catch(Exception e)
		{
			throw e;
		}
		finally {
			close(pstmt);
			close(rset);
		}
		return u;
	}

	@Override
	public ArrayList<User> select(Connection con) throws Exception {
		
		PreparedStatement pstmt = null;
		ResultSet rset =null;
		ArrayList<User> users = new ArrayList<User>();
		try {
			pstmt = con.prepareStatement(Sql.selectAllUser);
		
			
			
			rset = pstmt.executeQuery(); 
		
			while(rset.next()) {

			String id = rset.getString("ID");
			String pwd = rset.getString("PWD");
			String name = rset.getString("NAME");
				
			users.add(new User(id,pwd,name));
			}
		}
		catch(Exception e)
		{
			throw e;
		}
		finally {
			close(pstmt);
			close(rset);
		}
		return users;
	}

	
	
	
}

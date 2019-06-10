package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.User;

public class UserBiz extends Biz<String, User> {

	Dao<String,User> dao;
	
	public UserBiz() {
		dao = new UserDao();
	}
	
	@Override
	/*
	 * Connection & Transaction.
	 * 
	 * */
	public void register(User v) throws Exception {

		Connection con = null;
		
		try {
			con = getCon();
			/*
			 * Transaction 일관성 유지
			 */
			dao.insert(v, con);
			
			con.commit();
			
		}
		catch(Exception e) {
			
			//transcation 중간에 에러 생성시 rollback
			con.rollback();
			throw e;
		}
		finally {
			close(con);
		}
	}

	@Override
	public void remove(String k) throws Exception {
		
		Connection con = null;
		
		try {
			con = getCon();
			/*
			 * Transaction 일관성 유지
			 */
			dao.delete(k, con);
			
			con.commit();
			
		}
		catch(Exception e) {
			
			//transcation 중간에 에러 생성시 rollback
			con.rollback();
			throw e;
		}
		finally {
			close(con);
		}
		
		
	}

	@Override
	public void modify(User v) throws Exception {

		Connection con = null;
		
		try {
			con = getCon();
			/*
			 * Transaction 일관성 유지
			 */
			dao.update(v, con);
			
			con.commit();
			
		}
		catch(Exception e) {
			
			//transcation 중간에 에러 생성시 rollback
			con.rollback();
			throw e;
		}
		finally {
			close(con);
		}
		
	}

	@Override
	// select에는 transaction 처리가 없어
	public User get(String k) throws Exception {

		Connection con = null;
		User u = null;
		try {
			con = getCon();
		
			u = dao.select(k,con);
			
		}
		catch(Exception e) {
			throw e;
		}
		finally {
			close(con);
		}
		
		
		return u;
	}

	@Override
	public ArrayList<User> get() throws Exception {
		
		Connection con = null;
		ArrayList<User> u = new ArrayList<User>();
		try {
			con = getCon();
		
			u = dao.select(con);
			
		}
		catch(Exception e) {
			throw e;
		}
		finally {
			close(con);
		}
		
		
		return u;
	}

	
	
	
}

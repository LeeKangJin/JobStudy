package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.Product;

public class ProductDao extends Dao<String, Product> {

	@Override
	public void insert(Product v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		
		
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.insertProduct);
			pstmt.setString(1,v.getId());
			pstmt.setString(2,v.getName());
			pstmt.setDouble(3, v.getPrice());
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
		}
		
	}

	@Override
	public void delete(String k) throws Exception {
		
		PreparedStatement pstmt = null;
		Connection con = null;
		
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.deleteProduct);
			pstmt.setString(1,k);
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
		}
		
	}

	@Override
	public void update(Product v) throws Exception {
		
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.updateProduct);
			pstmt.setDouble(1,v.getPrice());
			pstmt.setString(2,v.getName());
			pstmt.setString(3,v.getId());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
		}
		
	}

	@Override
	public Product select(String k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		String aId;
		String aName;
		Double aPrice;
		Date adate;
		
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectProduct);
			pstmt.setString(1,k);
			rset = pstmt.executeQuery();
			rset.next();
		
			 aId = rset.getString("ID");
			 aName = rset.getString("Name");
			 aPrice = rset.getDouble("Price");
			 adate = rset.getDate("REGDATE");
			
			
			
			
		
		}catch(Exception e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
			close(rset);
		}
		
		return new Product(aId,aName,aPrice,adate);
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		String aId;
		String aName;
		Double aPrice;
		Date adate;
		
		ArrayList<Product> aProduct = new ArrayList<Product>();
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectAllProduct);
			rset = pstmt.executeQuery();
			
			//while문으로 arrayList 추가하기. 
			while(rset.next()) {
				 aId = rset.getString("ID");
				 aName = rset.getString("Name");
				 aPrice = rset.getDouble("Price");
				 adate = rset.getDate("REGDATE");
				
				
				 aProduct.add(new Product(aId,aName,aPrice,adate));
				
			}
			
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(pstmt);
			close(con);
			close(rset);
		}
		
		return aProduct;
	}

}

package test;

import java.util.ArrayList;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserGetAll {

	
	public static void main(String[] args) {
		
		Biz<String,User> biz = new UserBiz();
		
		try {
			ArrayList<User> u = biz.get();
			
			for(int i=0; i<u.size(); i++) {
				System.out.println(u.get(i).getId()+" "+ u.get(i).getName()+" "+u.get(i).getPwd());
			}
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

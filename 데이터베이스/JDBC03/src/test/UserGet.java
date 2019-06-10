package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserGet {

	public static void main(String[] args) {
		String key = "id999";
		
		Biz<String,User> biz = new UserBiz();
		
		try {
			User u = biz.get(key);
			System.out.println(u.getId()+" "+ u.getName()+" "+u.getPwd());
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

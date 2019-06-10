package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserDelete {

	public static void main(String[] args) {
		String key = "id999";
		
		Biz<String,User> biz = new UserBiz();
		
		try {
			biz.remove(key);
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

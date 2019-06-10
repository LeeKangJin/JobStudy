package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserInsert {

	
	
	
	public static void main(String[] args) {
		User u = new User("id999","pwd102","¸»¼÷ÀÌ");
		Biz<String,User> biz = new UserBiz();
		
		try {
			biz.register(u);
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

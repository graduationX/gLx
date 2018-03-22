package com.educate.shiro.realm;

import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.HeaderTokenizer.Token;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.educate.front.service.PersonService;
import com.educate.front.service.TeacherService;
import com.educate.pojo.ActiveUser;
import com.educate.pojo.Permission;
import com.educate.pojo.Teacher;
import com.educate.pojo.TeacherExample;


public class CustomRealm extends AuthorizingRealm{
	
	//注入service
	@Autowired
	private TeacherService teacherService;

	@Autowired
	private PersonService  personService;
	
	/**
	 * 用于认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//客户端获取token
		String userCode =(String) token.getPrincipal();
		System.out.println("我要看看用户名是什么"+userCode);
		//模拟方法  111111liu
		//String password="f3694f162729b7d0254c6e40260bf15c";
		//String password="111111";
		//盐
		String salt ="qwerty";
	
		//从数据库查询教师
		Teacher teacher =null;
		try {
			teacher =teacherService.findtea(userCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 如果查询不到返回null
		if(teacher==null){//
		   return null;
		}
		String username = teacher.getTname();
		String password = teacher.getPassword();
		
		//将教师设置入ACTIVEUSER
		ActiveUser activeUser =new ActiveUser();
		
		activeUser.setUserid(teacher.getTid());
		activeUser.setUsercode(teacher.getUserCode());
		activeUser.setUsername(teacher.getTname());
		
		
		/*activeUser =
		List<Permission> menu =new ArrayList<>();
		try {
			menu = personService.findPermission();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	//	teacher.setMenu(menu);
		//通过service取出权限菜单
	
		
		
		
		
		SimpleAuthenticationInfo simpleAuthenticationInfo =new SimpleAuthenticationInfo(activeUser,
				password,ByteSource.Util.bytes(salt) ,username);
				 
		
		
		return simpleAuthenticationInfo;
		//return null;
	}
	
	
	

	/**
	 * 用于授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		
		//获取身份信息
	//	String userCode = (String) principal.getPrimaryPrincipal();
		//A cteacherExtend = (TeacherExtend) principal.getPrimaryPrincipal();
		ActiveUser activeUser = (ActiveUser) principal.getPrimaryPrincipal();
		//根据身份信息获取权限
		//模拟链接数据库
		List<String> roles=new ArrayList<>();
		
		List<String> permission = new ArrayList<>();
		List<Permission> menu =new ArrayList<>();
		try {
			//menu = personService.findPermission();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Permission s : menu) {
			permission.add(s.getPercode());
			System.out.println("这里执行了？？？？？？？？？？？？？？？？ ");
		}
	/*	permission.add("user:create");
		//permission.add("user:import");
		//permission.add("people:query");
		roles.add("role1");
		roles.add("role2");*/
		
		//查到权限数据，返回
		
		SimpleAuthorizationInfo simpleAuthorizationInfo =new SimpleAuthorizationInfo();
		
		//查询的授权信息
		simpleAuthorizationInfo.addStringPermissions(permission);
		simpleAuthorizationInfo.addRoles(roles);

		
		return simpleAuthorizationInfo;
	}

	
	//清除缓存

	public void clearCache() {
		// TODO Auto-generated method stub
		PrincipalCollection principals =SecurityUtils.getSubject().getPreviousPrincipals();
		super.clearCache(principals);
	}
	
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("customRealm");
	}

}

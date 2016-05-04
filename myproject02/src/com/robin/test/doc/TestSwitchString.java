package com.robin.test.doc;

/**
 * 测试switch字符串判断
 * @author luyp
 *
 */
public class TestSwitchString {
	public static void main(String[] args){
		String a="我";
		
		switch(a){
		case"我":
			System.out.println("自己人");
			break;
		case"你":
			System.out.println("其他人");
			break;
		default:
			System.out.println("你好！");
			break;
		}
	}
}

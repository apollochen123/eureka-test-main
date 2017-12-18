//package com.chen.eureka.producer;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;  
////输入字符串，输出全部排列组合 
//public class Test {  
//	//存放结果字符串
//	private List<String> result = new ArrayList<>();
//	
//	public void p(String[] str,int cursor){
//		//如果当前游标到达倒数第二个，直接输出
//		if(cursor == str.length - 1){
//			result.add(Arrays.toString(str));
//		}else{
//			//交换当前子串第一个和第i个位置
//			for(int i = cursor;i < str.length ; i++){
//				String temp = str [cursor];
//				str [cursor] = str [i];
//				str [i] = temp;
//				p(str,cursor+1);
//				temp = str [i];
//				str [i] = str [cursor];
//				str [cursor] = temp;
//			}
//		}
//	}
//	public List<String> getResult() {
//		return result;
//	}
//	public void setResult(List<String> result) {
//		this.result = result;
//	}
//	public static String[] StringToStringArray(String str){
//		if(str.contains(",") == true){
//			return str.split(",");
//		}else{
//			String[] result= new String[str.length()];
//			char[] ch  = str.toCharArray();
//			for(int i = 0 ; i < ch.length ; i++){
//				result[i] = String.valueOf(ch[i]);
//			}
//			return result;
//		}
//	}
//	public static void main(String[] args) {
//		String a = "abcd";
//		Test test = new Test();
//		String[] inAarry = StringToStringArray(a);
//		test.p(inAarry, 0);
//		for(int i = 0 ; i < test.getResult().size() ; i++){
//			System.out.println( test.getResult().get(i));
//		}
//	}
//}  
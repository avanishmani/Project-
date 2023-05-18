package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RgFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern p=Pattern.compile("[abc]");
Matcher m=p.matcher("avanish Mani Tripathi");
while(m.find()) {
	System.out.println(m.start()+"----->"+m.end()+"----->"+m.group());
}
	}

}

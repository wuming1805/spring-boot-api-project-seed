package com.company.weixin.wechat.msg;

import com.alibaba.fastjson.JSONObject;
import com.company.weixin.Constants;
import com.company.weixin.util.HttpsRequestCommon;
import com.company.weixin.util.URLUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class GetExistAccessToken {
	protected static final Logger log = LoggerFactory.getLogger(GetExistAccessToken.class);

	// 定义一个私有的静态全局变量来保存该类的唯一实例
	private static GetExistAccessToken getExistAccessToken;

	// / 构造函数必须是私有的
	// / 这样在外部便无法使用 new 来创建该类的实例
	private GetExistAccessToken() {}

	// / 定义一个全局访问点
	// / 设置为静态方法
	// / 则在类的外部便无需实例化就可以调用该方法
	public static GetExistAccessToken getInstance() {
		// 这里可以保证只实例化一次
		// 即在第一次调用时实例化
		// 以后调用便不会再实例化
		if (getExistAccessToken == null) {
			getExistAccessToken = new GetExistAccessToken();
		}
		return getExistAccessToken;
	}

	/**
	 * 获得ACCESS_TOKEN
	 * 
	 * @Title: getAccess_token
	 * @Description: 获得ACCESS_TOKEN
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String getAccess_token() {
		try {
			JSONObject json = HttpsRequestCommon.httpsRequest(URLUtil.getAccessTookenURL(), "GET", null);
			System.out.print("getAccessToken :"+json.toString());
			return json.getString("access_token");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}

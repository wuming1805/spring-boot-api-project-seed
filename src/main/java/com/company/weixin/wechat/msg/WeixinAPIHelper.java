package com.company.weixin.wechat.msg;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class WeixinAPIHelper {
	protected static final Logger log = LoggerFactory.getLogger(WeixinAPIHelper.class);

	/**
	 * @return
	 */
	public static JSONObject getTemplate(String template_id_short) {
		String json ="{" +
						"\"template_id_short\": \"" + template_id_short+ "\"" +
					"}";
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/template/api_add_template?access_token="+ accessToken;
		log.info("accessToken:" + accessToken);
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}

	/**
	 * 连接请求微信后台接口
	 * @param action   接口url
	 * @param json   请求接口传送的json字符串
	 */
	public static JSONObject connectWeiXinInterface(String action, String json) {
		URL url;
		try {
			url = new URL(action);
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setRequestMethod("POST");
			http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			http.setDoOutput(true);
			http.setDoInput(true);
			http.connect();
			OutputStream os = http.getOutputStream();
			os.write(json.getBytes("UTF-8"));// 传入参数
			InputStream is = http.getInputStream();
			int size = is.available();
			byte[] jsonBytes = new byte[size];
			is.read(jsonBytes);
			String result = new String(jsonBytes, "UTF-8");
			log.info("请求返回结果:" + result);
			os.flush();
			os.close();
			return JSONObject.parseObject(result);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}
	
	/**
	 * 
	 * 微信公共账号发送给账号
	 * @param content  文本内容
	 * @param toUser    微信用户
	 * @return
	 */
	public static JSONObject sendTextMessageToUser(String title, String content, String toUser) {
		String json ="{" 
					+ "\"touser\":\""+toUser+"\"," 
					+ "\"msgtype\":\"text\","
					+ "\"text\":{"
				 			+ "\"content\":\""+content+"\","
						+ "}"
				    + "}";
		log.info(json);
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+ accessToken;
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}


	/**
	 * 
	 * 微信公共账号发送给账号
	 * @param content  文本内容
	 * @param toUser    微信用户
	 * @return
	 */
	public static JSONObject sendImageAndTextMessageToUser(String toUser, String title, String content, String url) {
//		String json ="{"
//			+ "\"touser\":\""+toUser+"\","
//			+ "\"msgtype\":\"text\","
//			+ "\"text\":{"
//			+ "\"articles\": ["
//			+ "{"
//			+ "\"title\":\""+title+"\","
//			+ "\"description\":\""+content+"\","
//			+ "\"url\":\""+url+"\","
//			+ "\"picurl\":\"\""
//			+ "}"
//			+ "]"
//			+ "}"
//			+ "}";
		String json ="{"
				+ "\"touser\":\""+toUser+"\","
				+ "\"msgtype\":\"text\","
				+ "\"text\":{"
				+ "\"content\":\""+content+"\","
				+ "}"
				+ "}";
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token="+ accessToken;
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}

	/**
	 * 
	 * @param title
	 * @param getType
	 * @param name
	 * @param status
	 * @param zyh
	 * @param ksmc
	 * @param url
	 * @param toUser
	 * @return
	 */
	public static JSONObject sendBindUser(String title, String getType, String status, String toUser, String zyh, String name, String ksmc, String url) {
		String json ="{" 
				+ "\"touser\":\""+toUser+"\"," 
				+ "\"template_id\":\"H7I0yUDaSqPiCsj1iKv8izihz6-U45hBi7P9HdWRPvE\","

				+ "\"data\":{"
					+ "\"first\":{"
						+ "\"value\":\""+title+"\","
						+ "\"color\":\"#173177\""
					+ "}," 
					+ "\"keyword1\":{"
						+ "\"value\":\""+getType+"\""
					+ "}," 
					+ "\"keyword2\":{"
					+ "\"value\":\""+status+"\""
					+ "},"
				+ "\"keyword3\":{"
				+ "\"value\":\""+zyh+"\""
				+ "},"
				+ "\"keyword4\":{"
				+ "\"value\":\""+name+"\""
				+ "},"
				+ "\"keyword5\":{"
				+ "\"value\":\""+ksmc+"\""
				+ "},"
				+ "\"remark\":{"
				+ "\"value\":\""+url+"\""
				+ "}"
				+ "}" 
			+ "}";
		log.info(json);
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+ accessToken;
		log.info("json:" + json);
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}
	/**
	 * @param toUser
	 * @param title
	 * @param name
	 * @param hospital
	 * @param ksmc
	 * @param doctor
	 * @param visitDate
	 * @param url

	 * @return
	 */
	public static JSONObject sendBindUserForMYD(String toUser, String title, String name, String hospital, String ksmc, String doctor, String visitDate, String url) {
		String json ="{"
				+ "\"touser\":\""+toUser+"\","
				+ "\"template_id\":\"HhfJkosM_L_oM-DSStdbtOzeOHKJ7n2aBu_KcS89bQU\","
				+ "\"data\":{"
				+ "\"first\":{"
				+ "\"value\":\""+title+"\","
				+ "\"color\":\"#173177\""
				+ "},"
				+ "\"keyword1\":{"
				+ "\"value\":\""+name+"\""
				+ "},"
				+ "\"keyword2\":{"
				+ "\"value\":\""+hospital+"\""
				+ "},"
				+ "\"keyword3\":{"
				+ "\"value\":\""+ksmc+"\""
				+ "},"
				+ "\"keyword4\":{"
				+ "\"value\":\""+doctor+"\""
				+ "},"
				+ "\"keyword5\":{"
				+ "\"value\":\""+visitDate+"\""
				+ "},"
				+ "\"remark\":{"
				+ "\"value\":\""+url+"\""
				+ "}"
				+ "}"
				+ "}";
		log.info(json);
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+ accessToken;
		log.info("json:" + json);
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}

	/**
	 * @param toUser
	 * @param title
	 * @param prescription
	 * @param issueDate
	 * @param remark
	 * @param url

	 * @return
	 */
	public static JSONObject sendBindUserForMK(String toUser,String title,String prescription ,String issueDate,String remark,String url) {
		JSONObject jsonObject = new JSONObject();
		String json ="{"
				+ "\"touser\":\""+toUser+"\","
				+ "\"url\":\""+url+"\","
				+ "\"template_id\":\"Xk9vso_87sqhqfun5czRz7ldhcpXSf8fBKbN_w6S5Lo\","
				+ "\"data\":{"
				+ "\"first\":{"
				+ "\"value\":\""+title+"\","
				+ "\"color\":\"#173177\""
				+ "},"
				+ "\"keyword1\":{"
				+ "\"value\":\""+prescription+"\""
				+ "},"
				+ "\"keyword2\":{"
				+ "\"value\":\""+issueDate+"\""
				+ "},"
				+ "\"remark\":{"
				+ "\"value\":\""+remark+"\""
				+ "}"
				+ "}"
				+ "}";
		log.info(json);
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+ accessToken;
		log.info("json:" + json);
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}
	/**
	 *
	 * @param title
	 * @param getType
	 * @param datetime
	 * @param project
	 * @param hospital
	 * @param ksmc
	 * @param url
	 * @param toUser
	 * @return
	 */
	public static JSONObject sendBindUserMYD(String title, String getType, String toUser, String ksmc, String url, String datetime, String project, String hospital) {
		String json ="{"
				+ "\"touser\":\""+toUser+"\","
				+ "\"template_id\":\"H7I0yUDaSqPiCsj1iKv8izihz6-U45hBi7P9HdWRPvE\","

				+ "\"data\":{"
				+ "\"first\":{"
				+ "\"value\":\""+title+"\","
				+ "\"color\":\"#173177\""
				+ "},"
				+ "\"keyword1\":{"
				+ "\"value\":\""+hospital+"\""
				+ "},"
				+ "\"keyword2\":{"
				+ "\"value\":\""+ksmc+"\""
				+ "},"
				+ "\"keyword3\":{"
				+ "\"value\":\""+getType+"\""
				+ "},"
				+ "\"keyword4\":{"
				+ "\"value\":\""+project+"\""
				+ "},"
				+ "\"keyword5\":{"
				+ "\"value\":\""+datetime+"\""
				+ "},"
				+ "\"remark\":{"
				+ "\"value\":\""+url+"\""
				+ "}"
				+ "}"
				+ "}";
		log.info(json);
		GetExistAccessToken getExistAccessToken = GetExistAccessToken.getInstance();
		String accessToken = getExistAccessToken.getAccess_token();
		String action = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+ accessToken;
		log.info("json:" + json);
		try {
			return connectWeiXinInterface(action, json);
		} catch (Exception e) {
			e.printStackTrace();
			return JSONObject.parseObject("{\"errcode\":1,\"errmsg\":\""+e.getMessage()+"\"}");
		}
	}
}

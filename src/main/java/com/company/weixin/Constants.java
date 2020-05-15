package com.company.weixin;

import java.io.File;

/**
 * Created by Tank on 2016/1/6.
 */
public class Constants {
	public static final String TOKEN = "hjukjjdsufehjfshiuefkl"; //token

	public static final String PARTNER = "1449100102";//商户号
	public static final String PARTNER_KEY = "0ed20a67e51342b99bb04bdfbca17355";//商户密匙

//	public static final String APPID = "wx9051092a9ba09b99";   //黄山
//	public static final String SECRET = "851823127c3fe56c44e9fd0323d04968";  //黄山
	public static final String APPID = "wxddc6981d8a3b68f3";

	public static final String SECRET = "f3775f2b3611cf504d647880d2af28d9";
	public static String hos_name="太和县人民医院";//医院名称

	//	public static String serverURL="http://test-wechat.jshtcm.com/wechat/wechatclient/";
	public static String serverURL="http://gzh.hssyy.com/wechatclient/";

	//聚合支付参数
	public final  static String ZIBO_MERCHANT_NO = "109900060201";//淄博收款商户号
//	public final  static String AGGREGATE_URL="http://pay.zsyjjkw.com:53501/gatewayOnline/gateway/portal/pgPayRe";//支付平台地址
	public final  static String AGGREGATE_URL="http://pay.bsoftpay.com:53507/gatewayOnline/gateway/portal/pgPayRe";//支付平台地址
	public final  static String AGGREGATE_DESKEY="HOXTMWuiSdM=";//报文对称DES加密密钥
	public final  static String AGGREGATE_RSAPRIVATEKEY="MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEAxgG5SudcqIr7Foe/4E8NsCeb61GlRSRoaCxjv3MdCqTt4XY7EAanNb+yWzdJ91q+x87wr8OxxCYisjqBi1L7gwIDAQABAkB+r52pAgxzvbBWwvYOAyZj3YPR9MQET/4JINWVKYacRrepyLlO0Q3u1+4EZEt3qqQAtY4QzNKjuhPFCeO/Uo4xAiEA6dJF3ebty6j8fuKcp2C8Gyls39b+lnjNwAgnZyaSREsCIQDYycm4uVs0gRV+rIDGKGs/O9Wj0RP3NwXFoUqNbX/yqQIgcRv2DlVC3U1e76aB73odJOqSL2oaeAHyTh3jqcN/6CcCIGCsM3ldpu9V9OjlMhOrqI+tNgr0TGv8rGVCFMXWo6zpAiACxb9KWTbwDnfEdusT89GA5+lrWi02SMbKoAAaCqsCBg==";//报文RSA签名私钥
	public final  static String AGGREGATE_DEVELOPERID="21689";//开发者ID

	// 获取access_token的接口地址（GET） 限200（次/天）
    public final static String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    // 菜单创建（POST） 限100（次/天）
    public static String MENU_CREATE_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    // 菜单查询
    public static String MENU_GET_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
    //删除菜单（POST） 限100（次/天）
    public static String MENU_DELETE_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
    //微信平台用户授权接口  (微信授权接口)
    public static String OPENID_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=APPSECRET&code=CODE&grant_type=authorization_code";
    //项目调用微信平台授权接口  (微信菜单请求接口)
    public static String AUTH_PROJECT_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";
    //统一支付订单URL
  	public static String ORDER_PAY_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    //发送客服消息
  	public static String SEND_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
  	//按组群发消息
  	public static String SEND_MESSAGE_BYGROUP_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
  	//按微信号群发消息
  	public static String SEND_MESSAGE_BYOPENID_URL = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";
  	//上传文件
  	public static String UPLOAD_MEDIA_URL = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";
  	//上传图文消息素材(用于群发) 每日调用限制为100次，但是用户每月只能接收4条
  	public static String UPLOAD_NEWS_URL = "https://api.weixin.qq.com/cgi-bin/media/uploadnews?access_token=ACCESS_TOKEN";
  	//下载文件
  	public static String DOWNLOAD_MEDIA_URL = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";
  	//获取粉丝（用户信息）
  	public static String GET_FANINFO_URL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";
  	//创建分组 最多支持创建500个分组
  	public static String CREATE_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
  	//查询所有分组
  	public static String GET_GROUPLIST_URL = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
  	//查询用户所在分组
  	public static String GET_GROUPID_URL = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN";
  	//修改组名
  	public static String UPDATE_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN";
  	//移动用户分组
  	public static String REMOVE_USERFORGROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
  	//微信红包发送请求接口url
  	public static String REDENVELOPE_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack";
  	//微信红包查看请求接口url
  	public static String REDENVELOPE_RECORD_VIEW_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gethbinfo";
  	//微信消息模板-获得模板id接口url
  	public static String MESSAGETEMPLATE_GETID_URL = "https://api.weixin.qq.com/cgi-bin/template/api_add_template?access_token=ACCESS_TOKEN";
  	//微信消息模板-发送模板消息接口url
  	public static String SEND_MESSAGETEMPLATE_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
  	
  	
  	
  	
  	
  	private static String fileSeparator = File.separator;
	//关键词新增数量
	public static final long KEYWORD_COUNT = 10;
	//素材新增数量(类型)
	public static final long WECHATSOURCE_TYPE_COUNT = 10;
	//素材新增数量(服务号)
	public static final long WECHATSOURCE_ALL_COUNT = 100;
	/**文件保存的位置（若在本地调试可改成本地电脑上的地址，如：d:///aaa.jpg）*/
	public static final String FILE_URL = "d:///FILE_NAME.FILE_TYPE";
	public static final String WECHAT_ATTACHFILE = "uploadFile" + fileSeparator + "weChat";
	/**GET或POST（必须大写，不可更改）*/
	public static final String GET = "GET";
	public static final String POST = "POST";
	/**是否受理*/
	public static final Long NOT_ACCEPT = 0l;
	public static final Long ACCEPT = 1l;
	
	/**是否转发*/
	public static final Long NOT_FORWARD = 1l;
	public static final Long FORWARD = 2l;//已转发
	
	public static final Long AVAILABILITY = 1L;//有效
	public static final Long INVALID = 2L;//无效

	/**信息类型（由微信方规定，不可更改）*/
	/** 
	 * 请求消息类型
	 */
	public static final String REQ_MESSAGE_TYPE_TEXT = "text";
	public static final String REQ_MESSAGE_TYPE_IMAGE = "image";
	public static final String REQ_MESSAGE_TYPE_LINK = "link";
	public static final String REQ_MESSAGE_TYPE_LOCATION = "location";
	public static final String REQ_MESSAGE_TYPE_VOICE = "voice";
	public static final String REQ_MESSAGE_TYPE_VIDEO = "video";
	public static final String REQ_MESSAGE_TYPE_EVENT = "event";
	/** 
	 * 返回消息类型
	 */
	public static final String RESP_MESSAGE_TYPE_TEXT = "text";
	public static final String RESP_MESSAGE_TYPE_IMAGE = "image";
	public static final String RESP_MESSAGE_TYPE_VOICE = "voice";
	public static final String RESP_MESSAGE_TYPE_VIDEO = "video";
	public static final String RESP_MESSAGE_TYPE_MUSIC = "music";
	public static final String RESP_MESSAGE_TYPE_NEWS = "news";
	/** 
	 * 事件类型
	 */
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
	/** 
	 * 事件类型：unsubscribe(取消订阅) 
	 */
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";

	/** 
	 * 事件类型：scan(关注用户扫描带参数二维码) 
	 */
	public static final String EVENT_TYPE_SCAN = "scan";
	/** 
	 * 事件类型：location上报地理位置
	 */
	public static final String EVENT_TYPE_LOCATION = "LOCATION";

	/** 
	 * 事件类型：CLICK(自定义菜单点击事件) 
	 */
	public static final String EVENT_TYPE_CLICK = "CLICK";

}

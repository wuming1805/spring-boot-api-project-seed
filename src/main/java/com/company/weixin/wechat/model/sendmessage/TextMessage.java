/**
 * 
 */
package com.company.weixin.wechat.model.sendmessage;

/**
 * 响应消息-> 文本消息
 * @author 
 *  @date  2014年4月16日
 */
public class TextMessage extends BaseMessage {

	// 回复的消息内容  
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}

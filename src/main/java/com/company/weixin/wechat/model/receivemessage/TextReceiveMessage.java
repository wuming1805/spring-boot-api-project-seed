package com.company.weixin.wechat.model.receivemessage;

/** 文本消息 */
public class TextReceiveMessage extends BaseReceiveMessage {
	/**消息内容*/
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
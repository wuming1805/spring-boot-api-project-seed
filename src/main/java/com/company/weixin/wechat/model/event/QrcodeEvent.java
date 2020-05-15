/**
 * 
 */
package com.company.weixin.wechat.model.event;

/**
 * 扫描带参数二维码事件
 * @author 
 *  @date  2014年4月17日
 */
public class QrcodeEvent extends BaseEvent {
	//事件key值
	private String EventKey;
	//用于获取二维码图片
	private String Ticket;

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

}

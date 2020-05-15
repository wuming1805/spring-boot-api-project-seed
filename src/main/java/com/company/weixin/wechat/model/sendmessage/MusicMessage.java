/**
 * 
 */
package com.company.weixin.wechat.model.sendmessage;

/**
 * 响应消息-> 音乐消息 
 * @author 
 *  @date  2014年4月16日
 */
public class MusicMessage extends BaseMessage {
	// 音乐  
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}

}

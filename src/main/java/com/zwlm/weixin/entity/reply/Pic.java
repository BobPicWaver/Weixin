package com.zwlm.weixin.entity.reply;

import java.io.Serializable;

/**
 * 微信图文信息中，对应的图文对象，为抽象出来的，方便用于返回结果
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class Pic implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6426469990402679575L;

	/**
	 * 图文消息标题
	 */
	private String Title;

	/**
	 * 图文消息描述
	 */
	private String Description;

	/**
	 * 图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	 */
	private String PicUrl;

	/**
	 * 点击图文消息跳转链接
	 */
	private String Url;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}

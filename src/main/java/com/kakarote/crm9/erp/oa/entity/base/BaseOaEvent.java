package com.kakarote.crm9.erp.oa.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaEvent<M extends BaseOaEvent<M>> extends Model<M> implements IBean {

	public void setEventId(Integer eventId) {
		set("event_id", eventId);
	}

	public Integer getEventId() {
		return getInt("event_id");
	}

	public void setTitle(String title) {
		set("title", title);
	}

	public String getTitle() {
		return getStr("title");
	}

	public void setContent(String content) {
		set("content", content);
	}

	public String getContent() {
		return getStr("content");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}

	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setCreateUserId(Integer createUserId) {
		set("create_user_id", createUserId);
	}

	public Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setType(Integer type) {
		set("type", type);
	}

	public Integer getType() {
		return getInt("type");
	}

	public void setOwnerUserIds(String ownerUserIds) {
		set("owner_user_ids", ownerUserIds);
	}

	public String getOwnerUserIds() {
		return getStr("owner_user_ids");
	}

	public void setAddress(String address) {
		set("address", address);
	}

	public String getAddress() {
		return getStr("address");
	}

	public void setRemark(String remark) {
		set("remark", remark);
	}

	public String getRemark() {
		return getStr("remark");
	}

	public void setColor(String color){
		set("color",color);
	}

	public String getColor(){
		return getStr("color");
	}

	public void setRemindType(Integer remindType){
		set("remind_type",remindType);
	}

	public Integer getRemindType(){
		return getInt("remind_type");
	}

}

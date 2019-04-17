package com.fapai.mvc.userrelation;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 
import java.math.BigInteger; 

import com.jfinal.log.Log;

/**
 * 用户分享推荐关系 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
@Table(tableName = UserRelation.table_name)
public class UserRelation extends BaseModel<UserRelation> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static final Log log = Log.getLog(UserRelation.class);
	
	public static final UserRelation dao = new UserRelation().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "user_spread_relation";
	
	/**
	 * 字段描述： 
	 * 字段类型：bigint(20) unsigned  长度：null
	 */
	public static final String column_iduser_spread_relation = "iduser_spread_relation";
	
	/**
	 * 字段描述：推荐者的userid 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_spreader_userid = "spreader_userid";
	
	/**
	 * 字段描述：推荐者的openid 
	 * 字段类型：varchar(129)  长度：129
	 */
	public static final String column_spreader_openid = "spreader_openid";
	
	/**
	 * 字段描述：加入者的userid 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_joiner_userid = "joiner_userid";
	
	/**
	 * 字段描述：加入者的openid 
	 * 字段类型：varchar(129)  长度：129
	 */
	public static final String column_joiner_openid = "joiner_openid";
	
	/**
	 * 字段描述：推荐关系事件原始值 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_change_event_msg = "change_event_msg";
	
	/**
	 * 字段描述：获取关系变化的途径
subscribe - 用户关注时获取推荐关系
dialog_input - 用户在公众号对话框输入 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_change_method = "change_method";
	
	/**
	 * 字段描述：获取关系变化时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_change_time = "change_time";
	public static final String column_joiner_wxnick = "joiner_wxnick";
	public static final String column_spreader_wxnick = "spreader_wxnick";
	public static final String column_spreader_cell_phone = "spreader_cell_phone";
	public static final String column_phone = "phone";
	
	
	/**
	 * sqlId : fapai.userRelation.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPageFrom = "fapai.userRelation.splitPageFrom";
	public static final String sqlId_splitPageSelect = "fapai.userRelation.splitPageSelect";
	
	


	private Long spreader_userid;
	private String spreader_openid;
	private Long joiner_userid;
	private String joiner_openid;
	private String phone;
	private String change_event_msg;
	private String change_method;
	private Timestamp change_time;
	private String joiner_wxnick;
	private String  spreader_wxnick;
	private String  spreader_cell_phone;
	
	public String getSpreader_cell_phone() {
		return get(column_spreader_cell_phone);
	}
	public String getSpreader_wxnick() {
		return get(column_spreader_wxnick);
	}
	public String getJoiner_wxnick() {
		return get(column_joiner_wxnick);
	}
	public String getPhone() {
		return get(column_phone);
	}
	public void setIduser_spread_relation(BigInteger iduser_spread_relation){
		set(column_iduser_spread_relation, iduser_spread_relation);
	}
	public BigInteger getIduser_spread_relation() {
		return get(column_iduser_spread_relation);
	}
	public void setSpreader_userid(Long spreader_userid){
		set(column_spreader_userid, spreader_userid);
	}
	public Long getSpreader_userid() {
		return get(column_spreader_userid);
	}
	public void setSpreader_openid(String spreader_openid){
		set(column_spreader_openid, spreader_openid);
	}
	public String getSpreader_openid() {
		return get(column_spreader_openid);
	}
	public void setJoiner_userid(Long joiner_userid){
		set(column_joiner_userid, joiner_userid);
	}
	public Long getJoiner_userid() {
		return get(column_joiner_userid);
	}
	public void setJoiner_openid(String joiner_openid){
		set(column_joiner_openid, joiner_openid);
	}
	public String getJoiner_openid() {
		return get(column_joiner_openid);
	}
	public void setChange_event_msg(String change_event_msg){
		set(column_change_event_msg, change_event_msg);
	}
	public String getChange_event_msg() {
		return get(column_change_event_msg);
	}
	public void setChange_method(String change_method){
		set(column_change_method, change_method);
	}
	public String getChange_method() {
		return get(column_change_method);
	}
	public void setChange_time(Timestamp change_time){
		set(column_change_time, change_time);
	}
	public Timestamp getChange_time() {
		return get(column_change_time);
	}
	
}

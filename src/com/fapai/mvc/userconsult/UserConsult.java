package com.fapai.mvc.userconsult;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 

import com.jfinal.log.Log;

/**
 * 用户预约咨询房屋、车辆 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
@Table(tableName = UserConsult.table_name)
public class UserConsult extends BaseModel<UserConsult> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static final Log log = Log.getLog(UserConsult.class);
	
	public static final UserConsult dao = new UserConsult().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "user_consult_detail";
	
	/**
	 * 字段描述：用户的微信id 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_idwx_user = "idwx_user";
	
	/**
	 * 字段描述：收藏品类型
0 -- 房屋
1 -- 车辆 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_obj_type = "obj_type";
	
	/**
	 * 字段描述：收藏品ID 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_obj_id = "obj_id";
	
	/**
	 * 字段描述：订阅时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_subs_time = "subs_time";
	public static final String column_wx_nick = "wx_nick";
	public static final String column_wx_openid = "wx_openid";
	public static final String column_wx_sex = "wx_sex";
	public static final String column_wx_cell_phone = "wx_cell_phone";
	/**
	 * sqlId : fapai.userConsult.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPageFrom = "fapai.userConsult.splitPageFrom";
	public static final String sqlId_splitPageSelect = "fapai.userConsult.splitPageSelect";
	private Long idwx_user;
	private Integer obj_type;
	private Long obj_id;
	private Timestamp subs_time;
	private String wx_nick;
	private String wx_openid;
	private String wx_sex;
	private String wx_cell_phone;
	public Long getWx_sex() {
		return get(column_wx_sex);
	}
	public Long getWx_cell_phone() {
		return get(column_wx_cell_phone);
	}
	public Long getWx_nick() {
		return get(column_wx_nick);
	}
	public Long getWx_openid() {
		return get(column_wx_openid);
	}
	public void setIdwx_user(Long idwx_user){
		set(column_idwx_user, idwx_user);
	}
	public Long getIdwx_user() {
		return get(column_idwx_user);
	}
	public void setObj_type(Integer obj_type){
		set(column_obj_type, obj_type);
	}
	public Integer getObj_type() {
		return get(column_obj_type);
	}
	public void setObj_id(Long obj_id){
		set(column_obj_id, obj_id);
	}
	public Long getObj_id() {
		return get(column_obj_id);
	}
	public void setSubs_time(Timestamp subs_time){
		set(column_subs_time, subs_time);
	}
	public Timestamp getSubs_time() {
		return get(column_subs_time);
	}
	
}

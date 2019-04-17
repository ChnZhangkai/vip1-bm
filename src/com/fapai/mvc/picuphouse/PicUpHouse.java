package com.fapai.mvc.picuphouse;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 

import com.jfinal.log.Log;

/**
 * 法拍房图片 model
 */
@SuppressWarnings("unused")
@Table(tableName = PicUpHouse.table_name)
public class PicUpHouse extends BaseModel<PicUpHouse> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static final Log log = Log.getLog(PicUpHouse.class);
	
	public static final PicUpHouse dao = new PicUpHouse().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "pic_up_house";
	
	/**
	 * 字段描述：法拍房ID 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_id_house = "id_house";
	
	/**
	 * 字段描述：照片类型
0 -- 抬头展示 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_pic_type = "pic_type";
	public static final String column_fileid = "fileid";
	
	/**
	 * 字段描述：照片的展示顺序 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_pic_order = "pic_order";
	
	/**
	 * 字段描述：图片存在本地硬盘的相对路径 
	 * 字段类型：varchar(255)  长度：255
	 */
	public static final String column_pic_url = "pic_url";
	
	/**
	 * 字段描述：是否已删除
0 -- 未删除
1 -- 已删除 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_is_delete = "is_delete";
	
	/**
	 * 字段描述： 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_modify_time = "modify_time";
	
	
	/**
	 * sqlId : fapai.picUpHouse.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPageFrom = "fapai.picUpHouse.splitPageFrom";
	/**
	 * sqlId : fapai.picUpHouse.selectAll
	 * 描述：selectAll
	 */
	public static final String sqlId_selectAll = "fapai.picUpHouse.selectAll";

	public static String sqlId_deleteById = "fapai.picUpHouse.deleteById" ;
	
	private String id_house;
	private Integer pic_type;
	private Integer pic_order;
	private String pic_url;
	private String fileid;
	private Integer is_delete;
	private Timestamp modify_time;
	
	public void setId_house(String id_house){
		set(column_id_house, id_house);
	}
	public String getId_house() {
		return get(column_id_house);
	}
	public void setFileid(String fileid){
		set(column_fileid, fileid);
	}
	public String getFileid() {
		return get(column_fileid);
	}
	public void setPic_type(Integer pic_type){
		set(column_pic_type, pic_type);
	}
	public Integer getPic_type() {
		return get(column_pic_type);
	}
	public void setPic_order(Integer pic_order){
		set(column_pic_order, pic_order);
	}
	public Integer getPic_order() {
		return get(column_pic_order);
	}
	public void setPic_url(String pic_url){
		set(column_pic_url, pic_url);
	}
	public String getPic_url() {
		return get(column_pic_url);
	}
	public void setIs_delete(Integer is_delete){
		set(column_is_delete, is_delete);
	}
	public Integer getIs_delete() {
		return get(column_is_delete);
	}
	public void setModify_time(Timestamp modify_time){
		set(column_modify_time, modify_time);
	}
	public Timestamp getModify_time() {
		return get(column_modify_time);
	}
	
}

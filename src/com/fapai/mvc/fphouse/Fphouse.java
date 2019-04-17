package com.fapai.mvc.fphouse;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 

import com.jfinal.log.Log;

/**
 * 法拍房信息 model
 */
@SuppressWarnings("unused")
@Table(tableName = Fphouse.table_name)
public class Fphouse extends BaseModel<Fphouse> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static final Log log = Log.getLog(Fphouse.class);
	
	public static final Fphouse dao = new Fphouse().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "fp_house_info";
	
	/**
	 * 字段描述：房屋标题 
	 * 字段类型：varchar(25)  长度：25
	 */
	public static final String column_house_title = "house_title";
	
	/**
	 * 字段描述：房屋属性
0 -- 其他;1 -- 住宅;2 -- 商业;3 -- 工业 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_house_nature = "house_nature";
	
	/**
	 * 字段描述：当前价，单位元 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_current_price = "current_price";
	
	/**
	 * 字段描述：法院评估价，单位元 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_court_price = "court_price";
	
	/**
	 * 字段描述：市场评估价，单位元 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_martket_price = "martket_price";
	
	/**
	 * 字段描述：对应fp_city的ID 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_house_city_id = "house_city_id";
	public static final String column_house_province_id = "house_province_id";
	/**
	 * 字段描述：对应fp_region的ID 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_house_region_id = "house_region_id";
	
	/**
	 * 字段描述：拍卖开始时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_auction_start_time = "auction_start_time";
	
	/**
	 * 字段描述：拍卖结束时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_auction_end_time = "auction_end_time";
	
	/**
	 * 字段描述：住宅小区 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_resident_area = "resident_area";
	
	/**
	 * 字段描述：房屋面积，单位平方米 
	 * 字段类型：double  长度：null
	 */
	public static final String column_house_area = "house_area";
	
	/**
	 * 字段描述：楼层 
	 * 字段类型：varchar(10)  长度：10
	 */
	public static final String column_flour_num = "flour_num";
	
	/**
	 * 字段描述：年代 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_year = "year";
	
	/**
	 * 字段描述：租约 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_lease = "lease";
	
	/**
	 * 字段描述：空置 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_vacant = "vacant";
	
	/**
	 * 字段描述：税费，单位元 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_tax = "tax";
	
	/**
	 * 字段描述：周边设施 
	 * 字段类型：varchar(255)  长度：255
	 */
	public static final String column_surrounding = "surrounding";
	
	/**
	 * 字段描述：法院公告链接 
	 * 字段类型：varchar(255)  长度：255
	 */
	public static final String column_court_announce_link = "court_announce_link";
	public static final String column_auction_announce = "auction_announce";
	
	/**
	 * 字段描述：拍卖状态
一拍;二拍 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_auction_state = "auction_state";
	
	/**
	 * 字段描述：是否删除
0 -- 未删除
1 -- 已删除 
	 * 字段类型：tinyint(4)  长度：null
	 */
	public static final String column_is_delete = "is_delete";
	/**
	 * 字段描述：商品上下架状态
0 -- put on sale/ shelves.上架;
1 -- pull off shelves 下架 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_shelves_status = "shelves_status";
	/**
	 * 字段描述： 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_modify_time = "modify_time";
	
	/**
	 * 字段描述：拍卖热度 
	 * 字段类型：varchar(10)  长度：10
	 */
	public static final String column_auction_heat = "auction_heat";
	
	/**
	 * 字段描述：自定义标签
	 * 字段类型：varchar(10)  长度：10
	 */
	public static final String column_auction_dispose = "auction_dispose";
	
	/**
	 * sqlId : fapai.fphouse.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPageFrom = "fapai.fphouse.splitPageFrom";

	private String house_title;
	private Integer house_nature;
	private Long current_price;
	private Long court_price;
	private Long martket_price;
	private Integer house_province_id;
	private Integer house_city_id;
	private Integer house_region_id;
	private Timestamp auction_start_time;
	private Timestamp auction_end_time;
	private String resident_area;
	private Double house_area;
	private String flour_num;
	private String year;
	private String lease;
	private String vacant;
	private Long tax;
	private String surrounding;
	private String court_announce_link;
	private String auction_announce;
	private String auction_state;
	private Integer is_delete;
	private Integer shelves_status;
	private Timestamp modify_time;
	
	private String auction_heat;
	private String auction_dispose;
	
	public void setHouse_title(String house_title){
		set(column_house_title, house_title);
	}
	public String getHouse_title() {
		return get(column_house_title);
	}
	public void setHouse_nature(Integer house_nature){
		set(column_house_nature, house_nature);
	}
	public Integer getHouse_nature() {
		return get(column_house_nature);
	}
	public void setCurrent_price(Long current_price){
		set(column_current_price, current_price);
	}
	public Long getCurrent_price() {
		return get(column_current_price);
	}
	public void setCourt_price(Long court_price){
		set(column_court_price, court_price);
	}
	public Long getCourt_price() {
		return get(column_court_price);
	}
	public void setMartket_price(Long martket_price){
		set(column_martket_price, martket_price);
	}
	public Long getMartket_price() {
		return get(column_martket_price);
	}
	public void setHouse_city_id(Integer house_city_id){
		set(column_house_city_id, house_city_id);
	}
	public void setHouse_province_id(Integer house_province_id){
		set(column_house_province_id, house_province_id);
	}
	public Integer getHouse_province_id() {
		return get(column_house_province_id);
	}
	public Integer getHouse_city_id() {
		return get(column_house_city_id);
	}
	public void setHouse_region_id(Integer house_region_id){
		set(column_house_region_id, house_region_id);
	}
	public Integer getHouse_region_id() {
		return get(column_house_region_id);
	}
	public void setAuction_start_time(Timestamp auction_start_time){
		set(column_auction_start_time, auction_start_time);
	}
	public Timestamp getAuction_start_time() {
		return get(column_auction_start_time);
	}
	public void setAuction_end_time(Timestamp auction_end_time){
		set(column_auction_end_time, auction_end_time);
	}
	public Timestamp getAuction_end_time() {
		return get(column_auction_end_time);
	}
	public void setResident_area(String resident_area){
		set(column_resident_area, resident_area);
	}
	public String getResident_area() {
		return get(column_resident_area);
	}
	public void setHouse_area(Double house_area){
		set(column_house_area, house_area);
	}
	public Double getHouse_area() {
		return get(column_house_area);
	}
	public void setFlour_num(String flour_num){
		set(column_flour_num, flour_num);
	}
	public String getFlour_num() {
		return get(column_flour_num);
	}
	public void setYear(String year){
		set(column_year, year);
	}
	public String getYear() {
		return get(column_year);
	}
	public void setLease(String lease){
		set(column_lease, lease);
	}
	public String getLease() {
		return get(column_lease);
	}
	public void setVacant(String vacant){
		set(column_vacant, vacant);
	}
	public String getVacant() {
		return get(column_vacant);
	}
	public void setTax(Long tax){
		set(column_tax, tax);
	}
	public Long getTax() {
		return get(column_tax);
	}
	public void setSurrounding(String surrounding){
		set(column_surrounding, surrounding);
	}
	public String getSurrounding() {
		return get(column_surrounding);
	}
	public void setCourt_announce_link(String court_announce_link){
		set(column_court_announce_link, court_announce_link);
	}
	public String getCourt_announce_link() {
		return get(column_court_announce_link);
	}
	public void setAuction_announce(String auction_announce){
		set(column_auction_announce, auction_announce);
	}
	public String getAuction_announce() {
		return get(column_auction_announce);
	}
	public void setAuction_state(String auction_state){
		set(column_auction_state, auction_state);
	}
	public String getAuction_state() {
		return get(column_auction_state);
	}
	public void setIs_delete(Integer is_delete){
		set(column_is_delete, is_delete);
	}
	public Integer getIs_delete() {
		return get(column_is_delete);
	}
	public void setShelves_status(Integer shelves_status){
		set(column_shelves_status, shelves_status);
	}
	public Integer getShelves_status() {
		return get(column_shelves_status);
	}
	public void setModify_time(Timestamp modify_time){
		set(column_modify_time, modify_time);
	}
	public Timestamp getModify_time() {
		return get(column_modify_time);
	}
	public String getAuction_heat() {
		return get(column_auction_heat);
	}
	public void setAuction_heat(String auction_heat) {
		set(column_auction_heat, auction_heat);
	}
	public String getAuction_dispose() {
		return get(column_auction_dispose);
	}
	public void setAuction_dispose(String auction_dispose) {
		set(column_auction_dispose, auction_dispose);
	}
	
}

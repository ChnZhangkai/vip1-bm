package com.fapai.mvc.fpcar;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 

import com.jfinal.log.Log;

/**
 * 法拍车信息 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
@Table(tableName = Fpcar.table_name)
public class Fpcar extends BaseModel<Fpcar> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static final Log log = Log.getLog(Fpcar.class);
	
	public static final Fpcar dao = new Fpcar().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "fp_car_info";
	
	/**
	 * 字段描述：车标题 
	 * 字段类型：varchar(25)  长度：25
	 */
	public static final String column_car_title = "car_title";
	
	/**
	 * 字段描述：车属性
0 -- 其他;1 -- 非营运;2 -- 营运 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_car_nature = "car_nature";
	
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
	public static final String column_market_price = "market_price";
	
	/**
	 * 字段描述：小型客车等 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_car_type = "car_type";
	
	/**
	 * 字段描述： 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_car_province_id = "car_province_id";
	
	/**
	 * 字段描述：对应fp_city的ID 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_car_city_id = "car_city_id";
	
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
	 * 字段描述：车辆初次登记日期 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_car_first_reg_time = "car_first_reg_time";
	
	/**
	 * 字段描述：发动机号 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_engine_num = "engine_num";
	
	/**
	 * 字段描述：行车里程，单位公里 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_mileage = "mileage";
	
	/**
	 * 字段描述：车身颜色 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_color = "color";
	
	/**
	 * 字段描述：品牌车型 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_brand_models = "brand_models";
	
	/**
	 * 字段描述：违章记录 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_violation_records = "violation_records";
	
	/**
	 * 字段描述：税费，单位元 
	 * 字段类型：bigint(20)  长度：null
	 */
	public static final String column_tax = "tax";
	
	/**
	 * 字段描述：详细介绍 
	 * 字段类型：varchar(255)  长度：255
	 */
	public static final String column_detail_desc = "detail_desc";
	
	/**
	 * 字段描述：法院公告链接 
	 * 字段类型：varchar(255)  长度：255
	 */
	public static final String column_court_announce_link = "court_announce_link";
	
	/**
	 * 字段描述：拍卖状态
一拍;二拍 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_auction_state = "auction_state";
	
	/**
	 * 字段描述：鉴定报告价格，以分为单位 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_appraisal_report_price = "appraisal_report_price";
	
	/**
	 * 字段描述：是否删除\n0 -- 未删除\n1 -- 已删除 
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
	 * sqlId : fapai.fpCar.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPageFrom = "yhfp.fpCar.splitPageFrom";
public static final String column_auction_announce = "auction_announce";
	

	private String car_title;
	private Integer car_nature;
	private Long current_price;
	private Long court_price;
	private Long market_price;
	private String car_type;
	private Integer car_province_id;
	private Integer car_city_id;
	private Timestamp auction_start_time;
	private Timestamp auction_end_time;
	private Timestamp car_first_reg_time;
	private String engine_num;
	private Integer mileage;
	private String color;
	private String brand_models;
	private String violation_records;
	private Long tax;
	private String detail_desc;
	private String court_announce_link;
	private String auction_state;
	private Integer appraisal_report_price;
	private Integer is_delete;
	private Integer shelves_status;
	private Timestamp modify_time;
	private String auction_announce;
	
	public void setAuction_announce(String auction_announce){
		set(column_auction_announce, auction_announce);
	}
	public String getAuction_announce() {
		return get(column_auction_announce);
	}
	public void setCar_title(String car_title){
		set(column_car_title, car_title);
	}
	public String getCar_title() {
		return get(column_car_title);
	}
	public void setCar_nature(Integer car_nature){
		set(column_car_nature, car_nature);
	}
	public Integer getCar_nature() {
		return get(column_car_nature);
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
	public void setMarket_price(Long market_price){
		set(column_market_price, market_price);
	}
	public Long getMarket_price() {
		return get(column_market_price);
	}
	public void setCar_type(String car_type){
		set(column_car_type, car_type);
	}
	public String getCar_type() {
		return get(column_car_type);
	}
	public void setCar_province_id(Integer car_province_id){
		set(column_car_province_id, car_province_id);
	}
	public Integer getCar_province_id() {
		return get(column_car_province_id);
	}
	public void setCar_city_id(Integer car_city_id){
		set(column_car_city_id, car_city_id);
	}
	public Integer getCar_city_id() {
		return get(column_car_city_id);
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
	public void setCar_first_reg_time(Timestamp car_first_reg_time){
		set(column_car_first_reg_time, car_first_reg_time);
	}
	public Timestamp getCar_first_reg_time() {
		return get(column_car_first_reg_time);
	}
	public void setEngine_num(String engine_num){
		set(column_engine_num, engine_num);
	}
	public String getEngine_num() {
		return get(column_engine_num);
	}
	public void setMileage(Integer mileage){
		set(column_mileage, mileage);
	}
	public Integer getMileage() {
		return get(column_mileage);
	}
	public void setColor(String color){
		set(column_color, color);
	}
	public String getColor() {
		return get(column_color);
	}
	public void setBrand_models(String brand_models){
		set(column_brand_models, brand_models);
	}
	public String getBrand_models() {
		return get(column_brand_models);
	}
	public void setViolation_records(String violation_records){
		set(column_violation_records, violation_records);
	}
	public String getViolation_records() {
		return get(column_violation_records);
	}
	public void setTax(Long tax){
		set(column_tax, tax);
	}
	public Long getTax() {
		return get(column_tax);
	}
	public void setDetail_desc(String detail_desc){
		set(column_detail_desc, detail_desc);
	}
	public String getDetail_desc() {
		return get(column_detail_desc);
	}
	public void setCourt_announce_link(String court_announce_link){
		set(column_court_announce_link, court_announce_link);
	}
	public String getCourt_announce_link() {
		return get(column_court_announce_link);
	}
	public void setAuction_state(String auction_state){
		set(column_auction_state, auction_state);
	}
	public String getAuction_state() {
		return get(column_auction_state);
	}
	public void setAppraisal_report_price(Integer appraisal_report_price){
		set(column_appraisal_report_price, appraisal_report_price);
	}
	public Integer getAppraisal_report_price() {
		return get(column_appraisal_report_price);
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
	
}

package com.fapai.mvc.fporder;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Timestamp; 

import com.jfinal.log.Log;

/**
 * 订单信息表 model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
@Table(tableName = FpOrder.table_name)
public class FpOrder extends BaseModel<FpOrder> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static final Log log = Log.getLog(FpOrder.class);
	
	public static final FpOrder dao = new FpOrder().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "fp_order";
	
	/**
	 * 字段描述：商户订单号 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_out_trade_no = "out_trade_no";
	
	/**
	 * 字段描述：微信支付订单号 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_transaction_id = "transaction_id";
	
	/**
	 * 字段描述：商家id 
	 * 字段类型：varchar(50)  长度：50
	 */
	public static final String column_company_id = "company_id";
	
	/**
	 * 字段描述：微信分配的公众账号ID 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_appid = "appid";
	
	/**
	 * 字段描述：微信支付分配的商户号 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_mch_id = "mch_id";
	
	/**
	 * 字段描述：终端设备号(门店号或收银设备ID)，PC网页或公众号内支付为"WEB" 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_device_info = "device_info";
	
	/**
	 * 字段描述：商品或支付单简要描述 
	 * 字段类型：varchar(130)  长度：130
	 */
	public static final String column_body = "body";
	
	/**
	 * 字段描述：商品名称明细列表 
	 * 字段类型：varchar(8195)  长度：8195
	 */
	public static final String column_detail = "detail";
	
	/**
	 * 字段描述：附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据 
	 * 字段类型：varchar(128)  长度：128
	 */
	public static final String column_attach = "attach";
	
	/**
	 * 字段描述：CNY 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_fee_type = "fee_type";
	
	/**
	 * 字段描述：订单总金额，单位为分 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_total_fee = "total_fee";
	
	/**
	 * 字段描述：订单总金额，单位为分 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_total_fee_int = "total_fee_int";
	
	/**
	 * 字段描述：用户标识
trade_type=JSAPI，此参数必传，用户在商户appid下的唯一标识 
	 * 字段类型：varchar(129)  长度：129
	 */
	public static final String column_openid = "openid";
	
	/**
	 * 字段描述：用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_is_subscribe = "is_subscribe";
	
	/**
	 * 字段描述：APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_spbill_create_ip = "spbill_create_ip";
	
	/**
	 * 字段描述：订单生成时间，格式为yyyyMMddHHmmss 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_time_start = "time_start";
	
	/**
	 * 字段描述：订单生成时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_time_start_dateformat = "time_start_dateformat";
	
	/**
	 * 字段描述：订单失效时间，格式为yyyyMMddHHmmss
注意：最短失效时间间隔必须大于5分钟 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_time_expire = "time_expire";
	
	/**
	 * 字段描述：订单失效时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_time_expire_dateformat = "time_expire_dateformat";
	
	/**
	 * 字段描述：订单支付时间，格式为yyyyMMddHHmmss 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_time_end = "time_end";
	
	/**
	 * 字段描述：订单支付时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_time_end_dateformat = "time_end_dateformat";
	
	/**
	 * 字段描述：商品标记，代金券或立减优惠功能的参数 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_goods_tag = "goods_tag";
	
	/**
	 * 字段描述：接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。 
	 * 字段类型：varchar(260)  长度：260
	 */
	public static final String column_notify_url = "notify_url";
	
	/**
	 * 字段描述： 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_order_state = "order_state";
	
	/**
	 * 字段描述： 
	 * 字段类型：varchar(130)  长度：130
	 */
	public static final String column_order_state_desc = "order_state_desc";
	
	/**
	 * 字段描述：取值如下：JSAPI，NATIVE，APP 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_trade_type = "trade_type";
	
	/**
	 * 字段描述：交易状态
SUCCESS—支付成功
REFUND—转入退款
NOTPAY—未支付
CLOSED—已关闭
REVOKED—已撤销（刷卡支付）
USERPAYING--用户支付中
PAYERROR--支付失败(其他原因，如银行返回失败) 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_trade_state = "trade_state";
	
	/**
	 * 字段描述：交易状态描述 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_trade_state_desc = "trade_state_desc";
	
	/**
	 * 字段描述：trade_type=NATIVE，此参数必传。此id为二维码中包含的商品ID，商户自行定义。 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_product_id = "product_id";
	
	/**
	 * 字段描述：指定支付方式 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_limit_pay = "limit_pay";
	
	/**
	 * 字段描述：错误代码 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_err_code = "err_code";
	
	/**
	 * 字段描述：错误代码描述 
	 * 字段类型：varchar(130)  长度：130
	 */
	public static final String column_err_code_des = "err_code_des";
	
	/**
	 * 字段描述：预支付交易会话标识
微信生成的预支付回话标识，用于后续接口调用中使用，该值有效期为2小时 
	 * 字段类型：varchar(70)  长度：70
	 */
	public static final String column_prepay_id = "prepay_id";
	
	/**
	 * 字段描述：trade_type为NATIVE是有返回，可将该参数值生成二维码展示出来进行扫码支付 
	 * 字段类型：varchar(128)  长度：128
	 */
	public static final String column_code_url = "code_url";
	
	/**
	 * 字段描述：付款银行 银行类型，采用字符串类型的银行标识 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_bank_type = "bank_type";
	
	/**
	 * 字段描述：订单现金支付金额 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_cash_fee = "cash_fee";
	
	/**
	 * 字段描述：订单现金支付金额 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_cash_fee_int = "cash_fee_int";
	
	/**
	 * 字段描述：现金支付货币类型 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_cash_fee_type = "cash_fee_type";
	
	/**
	 * 字段描述：代金券或立减优惠金额 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_coupon_fee = "coupon_fee";
	
	/**
	 * 字段描述：代金券或立减优惠金额 
	 * 字段类型：int(11)  长度：null
	 */
	public static final String column_coupon_fee_int = "coupon_fee_int";
	
	/**
	 * 字段描述：代金券或立减优惠使用数量 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_coupon_count = "coupon_count";
	
	/**
	 * 字段描述：代金券或立减优惠批次ID ,$n为下标，从0开始编号 
	 * 字段类型：varchar(300)  长度：300
	 */
	public static final String column_coupon_batch_id_n = "coupon_batch_id_n";
	
	/**
	 * 字段描述：代金券或立减优惠ID,$n为下标，从0开始编号 
	 * 字段类型：varchar(300)  长度：300
	 */
	public static final String column_coupon_id_n = "coupon_id_n";
	
	/**
	 * 字段描述：单个代金券或立减优惠支付金额,$n为下标，从0开始编号 
	 * 字段类型：varchar(300)  长度：300
	 */
	public static final String column_coupon_fee_n = "coupon_fee_n";
	
	/**
	 * 字段描述：上次更新状态的操作对象 
	 * 字段类型：varchar(45)  长度：45
	 */
	public static final String column_last_updater = "last_updater";
	
	/**
	 * 字段描述：上次更新状态的时间 
	 * 字段类型：datetime  长度：null
	 */
	public static final String column_last_update_time = "last_update_time";
	
	/**
	 * 字段描述：备注 
	 * 字段类型：varchar(200)  长度：200
	 */
	public static final String column_comment = "comment";
	
	
	/**
	 * sqlId : fapai.fpOrder.splitPageFrom
	 * 描述：分页from
	 */
	public static final String sqlId_splitPageFrom = "fapai.fpOrder.splitPageFrom";

	private String out_trade_no;
	private String transaction_id;
	private String company_id;
	private String appid;
	private String mch_id;
	private String device_info;
	private String body;
	private String detail;
	private String attach;
	private String fee_type;
	private String total_fee;
	private Integer total_fee_int;
	private String openid;
	private String is_subscribe;
	private String spbill_create_ip;
	private String time_start;
	private Timestamp time_start_dateformat;
	private String time_expire;
	private Timestamp time_expire_dateformat;
	private String time_end;
	private Timestamp time_end_dateformat;
	private String goods_tag;
	private String notify_url;
	private String order_state;
	private String order_state_desc;
	private String trade_type;
	private String trade_state;
	private String trade_state_desc;
	private String product_id;
	private String limit_pay;
	private String err_code;
	private String err_code_des;
	private String prepay_id;
	private String code_url;
	private String bank_type;
	private String cash_fee;
	private Integer cash_fee_int;
	private String cash_fee_type;
	private String coupon_fee;
	private Integer coupon_fee_int;
	private String coupon_count;
	private String coupon_batch_id_n;
	private String coupon_id_n;
	private String coupon_fee_n;
	private String last_updater;
	private Timestamp last_update_time;
	private String comment;
	
	public void setOut_trade_no(String out_trade_no){
		set(column_out_trade_no, out_trade_no);
	}
	public String getOut_trade_no() {
		return get(column_out_trade_no);
	}
	public void setTransaction_id(String transaction_id){
		set(column_transaction_id, transaction_id);
	}
	public String getTransaction_id() {
		return get(column_transaction_id);
	}
	public void setCompany_id(String company_id){
		set(column_company_id, company_id);
	}
	public String getCompany_id() {
		return get(column_company_id);
	}
	public void setAppid(String appid){
		set(column_appid, appid);
	}
	public String getAppid() {
		return get(column_appid);
	}
	public void setMch_id(String mch_id){
		set(column_mch_id, mch_id);
	}
	public String getMch_id() {
		return get(column_mch_id);
	}
	public void setDevice_info(String device_info){
		set(column_device_info, device_info);
	}
	public String getDevice_info() {
		return get(column_device_info);
	}
	public void setBody(String body){
		set(column_body, body);
	}
	public String getBody() {
		return get(column_body);
	}
	public void setDetail(String detail){
		set(column_detail, detail);
	}
	public String getDetail() {
		return get(column_detail);
	}
	public void setAttach(String attach){
		set(column_attach, attach);
	}
	public String getAttach() {
		return get(column_attach);
	}
	public void setFee_type(String fee_type){
		set(column_fee_type, fee_type);
	}
	public String getFee_type() {
		return get(column_fee_type);
	}
	public void setTotal_fee(String total_fee){
		set(column_total_fee, total_fee);
	}
	public String getTotal_fee() {
		return get(column_total_fee);
	}
	public void setTotal_fee_int(Integer total_fee_int){
		set(column_total_fee_int, total_fee_int);
	}
	public Integer getTotal_fee_int() {
		return get(column_total_fee_int);
	}
	public void setOpenid(String openid){
		set(column_openid, openid);
	}
	public String getOpenid() {
		return get(column_openid);
	}
	public void setIs_subscribe(String is_subscribe){
		set(column_is_subscribe, is_subscribe);
	}
	public String getIs_subscribe() {
		return get(column_is_subscribe);
	}
	public void setSpbill_create_ip(String spbill_create_ip){
		set(column_spbill_create_ip, spbill_create_ip);
	}
	public String getSpbill_create_ip() {
		return get(column_spbill_create_ip);
	}
	public void setTime_start(String time_start){
		set(column_time_start, time_start);
	}
	public String getTime_start() {
		return get(column_time_start);
	}
	public void setTime_start_dateformat(Timestamp time_start_dateformat){
		set(column_time_start_dateformat, time_start_dateformat);
	}
	public Timestamp getTime_start_dateformat() {
		return get(column_time_start_dateformat);
	}
	public void setTime_expire(String time_expire){
		set(column_time_expire, time_expire);
	}
	public String getTime_expire() {
		return get(column_time_expire);
	}
	public void setTime_expire_dateformat(Timestamp time_expire_dateformat){
		set(column_time_expire_dateformat, time_expire_dateformat);
	}
	public Timestamp getTime_expire_dateformat() {
		return get(column_time_expire_dateformat);
	}
	public void setTime_end(String time_end){
		set(column_time_end, time_end);
	}
	public String getTime_end() {
		return get(column_time_end);
	}
	public void setTime_end_dateformat(Timestamp time_end_dateformat){
		set(column_time_end_dateformat, time_end_dateformat);
	}
	public Timestamp getTime_end_dateformat() {
		return get(column_time_end_dateformat);
	}
	public void setGoods_tag(String goods_tag){
		set(column_goods_tag, goods_tag);
	}
	public String getGoods_tag() {
		return get(column_goods_tag);
	}
	public void setNotify_url(String notify_url){
		set(column_notify_url, notify_url);
	}
	public String getNotify_url() {
		return get(column_notify_url);
	}
	public void setOrder_state(String order_state){
		set(column_order_state, order_state);
	}
	public String getOrder_state() {
		return get(column_order_state);
	}
	public void setOrder_state_desc(String order_state_desc){
		set(column_order_state_desc, order_state_desc);
	}
	public String getOrder_state_desc() {
		return get(column_order_state_desc);
	}
	public void setTrade_type(String trade_type){
		set(column_trade_type, trade_type);
	}
	public String getTrade_type() {
		return get(column_trade_type);
	}
	public void setTrade_state(String trade_state){
		set(column_trade_state, trade_state);
	}
	public String getTrade_state() {
		return get(column_trade_state);
	}
	public void setTrade_state_desc(String trade_state_desc){
		set(column_trade_state_desc, trade_state_desc);
	}
	public String getTrade_state_desc() {
		return get(column_trade_state_desc);
	}
	public void setProduct_id(String product_id){
		set(column_product_id, product_id);
	}
	public String getProduct_id() {
		return get(column_product_id);
	}
	public void setLimit_pay(String limit_pay){
		set(column_limit_pay, limit_pay);
	}
	public String getLimit_pay() {
		return get(column_limit_pay);
	}
	public void setErr_code(String err_code){
		set(column_err_code, err_code);
	}
	public String getErr_code() {
		return get(column_err_code);
	}
	public void setErr_code_des(String err_code_des){
		set(column_err_code_des, err_code_des);
	}
	public String getErr_code_des() {
		return get(column_err_code_des);
	}
	public void setPrepay_id(String prepay_id){
		set(column_prepay_id, prepay_id);
	}
	public String getPrepay_id() {
		return get(column_prepay_id);
	}
	public void setCode_url(String code_url){
		set(column_code_url, code_url);
	}
	public String getCode_url() {
		return get(column_code_url);
	}
	public void setBank_type(String bank_type){
		set(column_bank_type, bank_type);
	}
	public String getBank_type() {
		return get(column_bank_type);
	}
	public void setCash_fee(String cash_fee){
		set(column_cash_fee, cash_fee);
	}
	public String getCash_fee() {
		return get(column_cash_fee);
	}
	public void setCash_fee_int(Integer cash_fee_int){
		set(column_cash_fee_int, cash_fee_int);
	}
	public Integer getCash_fee_int() {
		return get(column_cash_fee_int);
	}
	public void setCash_fee_type(String cash_fee_type){
		set(column_cash_fee_type, cash_fee_type);
	}
	public String getCash_fee_type() {
		return get(column_cash_fee_type);
	}
	public void setCoupon_fee(String coupon_fee){
		set(column_coupon_fee, coupon_fee);
	}
	public String getCoupon_fee() {
		return get(column_coupon_fee);
	}
	public void setCoupon_fee_int(Integer coupon_fee_int){
		set(column_coupon_fee_int, coupon_fee_int);
	}
	public Integer getCoupon_fee_int() {
		return get(column_coupon_fee_int);
	}
	public void setCoupon_count(String coupon_count){
		set(column_coupon_count, coupon_count);
	}
	public String getCoupon_count() {
		return get(column_coupon_count);
	}
	public void setCoupon_batch_id_n(String coupon_batch_id_n){
		set(column_coupon_batch_id_n, coupon_batch_id_n);
	}
	public String getCoupon_batch_id_n() {
		return get(column_coupon_batch_id_n);
	}
	public void setCoupon_id_n(String coupon_id_n){
		set(column_coupon_id_n, coupon_id_n);
	}
	public String getCoupon_id_n() {
		return get(column_coupon_id_n);
	}
	public void setCoupon_fee_n(String coupon_fee_n){
		set(column_coupon_fee_n, coupon_fee_n);
	}
	public String getCoupon_fee_n() {
		return get(column_coupon_fee_n);
	}
	public void setLast_updater(String last_updater){
		set(column_last_updater, last_updater);
	}
	public String getLast_updater() {
		return get(column_last_updater);
	}
	public void setLast_update_time(Timestamp last_update_time){
		set(column_last_update_time, last_update_time);
	}
	public Timestamp getLast_update_time() {
		return get(column_last_update_time);
	}
	public void setComment(String comment){
		set(column_comment, comment);
	}
	public String getComment() {
		return get(column_comment);
	}
	
}

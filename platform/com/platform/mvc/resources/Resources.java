package com.platform.mvc.resources;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.jfinal.log.Log;
import com.platform.annotation.Table;
import com.platform.mvc.base.BaseModel;

/**
 * 资源负载model
 * @author 董华健
 */
@SuppressWarnings("unused")
@Table(tableName = Resources.table_name)
public class Resources extends BaseModel<Resources> {
	
	private static final long serialVersionUID = 2051998642258015518L;

	private static final Log log = Log.getLog(Resources.class);
	
	public static final Resources dao = new Resources().dao();

	/**
	 * 表名称
	 */
	public static final String table_name = "pt_resources";
	
	/**
	 * 字段描述：系统名称 
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_osname = "osname";
	
	/**
	 * 字段描述：ip地址 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_ips = "ips";
	
	/**
	 * 字段描述：主机名称 
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_hostname = "hostname";
	
	/**
	 * 字段描述：cpu数量 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_cpunumber = "cpunumber";
	
	/**
	 * 字段描述：cpu使用率 
	 * 字段类型：numeric  长度：null
	 */
	public static final String column_cpuratio = "cpuratio";
	
	/**
	 * 字段描述：物理内存 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_phymemory = "phymemory";
	
	/**
	 * 字段描述：物理可用内存 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_phyfreememory = "phyfreememory";
	
	/**
	 * 字段描述：jvm总内存 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_jvmtotalmemory = "jvmtotalmemory";
	
	/**
	 * 字段描述：jvm可用内存 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_jvmfreememory = "jvmfreememory";
	
	/**
	 * 字段描述：jvm最大内存 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_jvmmaxmemory = "jvmmaxmemory";
	
	/**
	 * 字段描述：gc次数 
	 * 字段类型：bigint  长度：null
	 */
	public static final String column_gccount = "gccount";
	
	/**
	 * 字段描述：创建时间 
	 * 字段类型：timestamp with time zone  长度：null
	 */
	public static final String column_createdate = "createdate";
	
	/**
	 * sqlId : platform.resources.pv
	 * 描述：
	 */
	public static final String sqlId_pv = "platform.resources.pv";

	/**
	 * sqlId : platform.resources.24hour
	 * 描述：
	 */
	public static final String sqlId_24hour = "platform.resources.24hour";

	private String osname;
	private String ips;
	private String hostname;
	private Long cpunumber;
	private BigDecimal cpuratio;
	private Long phymemory;
	private Long phyfreememory;
	private Long jvmtotalmemory;
	private Long jvmfreememory;
	private Long jvmmaxmemory;
	private Long gccount;
	private Timestamp createdate;
	
	public void setOsname(String osname){
		set(column_osname, osname);
	}
	public String getOsname() {
		return get(column_osname);
	}
	public void setIps(String ips){
		set(column_ips, ips);
	}
	public String getIps() {
		return get(column_ips);
	}
	public void setHostname(String hostname){
		set(column_hostname, hostname);
	}
	public String getHostname() {
		return get(column_hostname);
	}
	public void setCpunumber(Long cpunumber){
		set(column_cpunumber, isOracle() ? new BigDecimal(cpunumber) : cpunumber);
	}
	public Long getCpunumber() {
		return getNumber(column_cpunumber).longValue();
	}
	public void setCpuratio(BigDecimal cpuratio){
		set(column_cpuratio, cpuratio);
	}
	public BigDecimal getCpuratio() {
		return get(column_cpuratio);
	}
	public void setPhymemory(Long phymemory){
		set(column_phymemory, isOracle() ? new BigDecimal(phymemory) : phymemory);
	}
	public Long getPhymemory() {
		return getNumber(column_phymemory).longValue();
	}
	public void setPhyfreememory(Long phyfreememory){
		set(column_phyfreememory, isOracle() ? new BigDecimal(phyfreememory) : phyfreememory);
	}
	public Long getPhyfreememory() {
		return getNumber(column_phyfreememory).longValue();
	}
	public void setJvmtotalmemory(Long jvmtotalmemory){
		set(column_jvmtotalmemory, isOracle() ? new BigDecimal(jvmtotalmemory) : jvmtotalmemory);
	}
	public Long getJvmtotalmemory() {
		return getNumber(column_jvmtotalmemory).longValue();
	}
	public void setJvmfreememory(Long jvmfreememory){
		set(column_jvmfreememory, isOracle() ? new BigDecimal(jvmfreememory) : jvmfreememory);
	}
	public Long getJvmfreememory() {
		return getNumber(column_jvmfreememory).longValue();
	}
	public void setJvmmaxmemory(Long jvmmaxmemory){
		set(column_jvmmaxmemory, isOracle() ? new BigDecimal(jvmmaxmemory) : jvmmaxmemory);
	}
	public Long getJvmmaxmemory() {
		return getNumber(column_jvmmaxmemory).longValue();
	}
	public void setGccount(Long gccount){
		set(column_gccount, isOracle() ? new BigDecimal(gccount) : gccount);
	}
	public Long getGccount() {
		return getNumber(column_gccount).longValue();
	}
	public void setCreatedate(Timestamp createdate){
		set(column_createdate, createdate);
	}
	public Timestamp getCreatedate() {
		return get(column_createdate);
	}
	
}

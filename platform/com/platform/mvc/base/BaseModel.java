package com.platform.mvc.base;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jfinal.log.Log;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Table;
import com.jfinal.plugin.activerecord.TableMapping;
import com.platform.constant.ConstantRender;
import com.platform.tools.ToolDateTime;
import com.platform.tools.ToolRandoms;
import com.platform.tools.ToolSqlXml;

import oracle.sql.TIMESTAMP;

/**
 * Model基础类
 * 
 * @author 董华健
 * @param <M>
 * 
 * 抽取公共方法，并重写save、update、getDate方法
 */
public abstract class BaseModel<M extends Model<M>> extends Model<M> {

	private static final long serialVersionUID = -900378319414539856L;

	private static final Log log = Log.getLog(BaseModel.class);

	/**
	 * 字段描述：主键 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述：版本号 
	 * 字段类型 ：bigint 
	 */
	public static final String column_version = "version";

	/**
	 * 字段描述：创建者主键 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_createUser = "createUser";

	/**
	 * 字段描述：创建时间 
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_createTime = "createTime";
	
	/**
	 * 字段描述：修改者主键 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_updateUser = "updateUser";

	/**
	 * 字段描述：修改时间 
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_updateTime = "updateTime";

	/**
	 * 字段描述：删除者主键 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_deleteUser = "deleteUser";

	/**
	 * 字段描述：删除时间 
	 * 字段类型：timestamp without time zone  长度：null
	 */
	public static final String column_deleteTime = "deleteTime";
	
	/**
	 * sqlId : platform.baseModel.select
	 * 描述：通用查询
	 */
	public static final String sqlId_select = "platform.baseModel.select";

	/**
	 * sqlId : platform.baseModel.update
	 * 描述：通用更新
	 */
	public static final String sqlId_update = "platform.baseModel.update";

	/**
	 * sqlId : platform.baseModel.delete
	 * 描述：通用删除
	 */
	public static final String sqlId_delete = "platform.baseModel.delete";

	/**
	 * sqlId : platform.baseModel.deleteIn
	 * 描述：通用删除
	 */
	public static final String sqlId_deleteIn = "platform.baseModel.deleteIn";

	/**
	 * sqlId : platform.baseModel.deleteOr
	 * 描述：通用删除
	 */
	public static final String sqlId_deleteOr = "platform.baseModel.deleteOr";

	/**
	 * sqlId : platform.baseModel.splitPageSelect
	 * 描述：通用select *
	 */
	public static final String sqlId_splitPageSelect = "platform.baseModel.splitPageSelect";

	protected String ids;
	protected Long version;
	protected String createUser;
	protected Timestamp createTime;
	protected String updateUser;
	protected Timestamp updateTime;
	protected String deleteUser;
	protected Timestamp deleteTime;

	public void setIds(String ids){
		set(column_ids, ids);
	}
	public String getIds() {
		return get(column_ids);
	}
	public void setVersion(Long version){
		set(column_version, getConfig().getDialect().isOracle() ? new BigDecimal(version) : version);
	}
	public Long getVersion() {
		return getNumber(column_version).longValue();
	}
	public String getCreateUser() {
		return get(column_createUser);
	}
	public void setCreateUser(String createUser) {
		set(column_createUser, createUser);
	}
	public Timestamp getCreateTime() {
		return get(column_createTime);
	}
	public void setCreateTime(Timestamp createTime) {
		set(column_createTime, createTime);
	}
	public String getUpdateUser() {
		return get(column_updateUser);
	}
	public void setUpdateUser(String updateUser) {
		set(column_updateUser, updateUser);
	}
	public Timestamp getUpdateTime() {
		return get(column_updateTime);
	}
	public void setUpdateTime(Timestamp updateTime) {
		set(column_updateTime, updateTime);
	}
	public String getDeleteUser() {
		return get(column_deleteUser);
	}
	public void setDeleteUser(String deleteUser) {
		set(column_deleteUser, deleteUser);
	}
	public Timestamp getDeleteTime() {
		return get(column_deleteTime);
	}
	public void setDeleteTime(Timestamp deleteTime) {
		set(column_deleteTime, deleteTime);
	}
	
	/**
	 * 是否Oracle数据库
	 * @return
	 */
	protected boolean isOracle(){
		return getConfig().getDialect().isOracle();
	}
	
	/**
     * 获取SQL，固定SQL
     * @param sqlId
     * @return
     */
	protected static String getSqlMy(String sqlId){
		return ToolSqlXml.getSqlMy(sqlId);
	}
	
    /**
     * 获取SQL，动态SQL，使用Beetl解析
     * @param sqlId
     * @param param
     * @return
     */
	protected static String getSqlByBeetl(String sqlId, Map<String, Object> param){
    	return ToolSqlXml.getSqlMy(sqlId, param, ConstantRender.sql_renderType_beetl);
    }
    
    /**
     * 获取SQL，动态SQL，使用Beetl解析
     * @param sqlId 
     * @param param 查询参数
     * @param list 用于接收预处理的值
     * @return
     */
	protected static String getSqlByBeetl(String sqlId, Map<String, Object> param, LinkedList<Object> list){
    	return ToolSqlXml.getSqlMy(sqlId, param, ConstantRender.sql_renderType_beetl, list);
    }

    /**
     * 获取SQL，动态SQL，使用FreeMarker解析
     * @param sqlId
     * @param param
     * @return
     */
	protected static String getSqlByFreeMarker(String sqlId, Map<String, Object> param){
    	return ToolSqlXml.getSqlMy(sqlId, param, ConstantRender.sql_renderType_freeMarker);
    }
    
    /**
     * 获取SQL，动态SQL，使用FreeMarker解析
     * @param sqlId 
     * @param param 查询参数
     * @param list 用于接收预处理的值
     * @return
     */
	protected static String getSqlByFreeMarker(String sqlId, Map<String, Object> param, LinkedList<Object> list){
    	return ToolSqlXml.getSqlMy(sqlId, param, ConstantRender.sql_renderType_freeMarker, list);
    }

    /**
     * 获取SQL，动态SQL，使用Velocity解析
     * @param sqlId
     * @param param
     * @return
     */
	protected static String getSqlByVelocity(String sqlId, Map<String, Object> param){
    	return ToolSqlXml.getSqlMy(sqlId, param, ConstantRender.sql_renderType_velocity);
    }
    
    /**
     * 获取SQL，动态SQL，使用Velocity解析
     * @param sqlId 
     * @param param 查询参数
     * @param list 用于接收预处理的值
     * @return
     */
	protected static String getSqlByVelocity(String sqlId, Map<String, Object> param, LinkedList<Object> list){
    	return ToolSqlXml.getSqlMy(sqlId, param, ConstantRender.sql_renderType_velocity, list);
    }
	
	/**
	 * 获取表映射对象
	 * 
	 * @return
	 */
	protected Table getTable() {
		return TableMapping.me().getTable(getClass());
	}

	/**
	 * 获取表名称
	 * 
	 * @return
	 */
	protected String getTableName() {
		return getTable().getName();
	}

	/**
	 * 获取主键名称
	 * @return
	 */
	public String[] getPKNameArr(){
		return getTable().getPrimaryKey();
	}

	/**
	 * 获取主键名称
	 * @return
	 */
	public String getPKNameStr(){
		String[] pkArr = getPKNameArr();
		if(pkArr.length == 1){
			return pkArr[0];
		}else{
			String pk = "";
			for (String pkName : pkArr) {
				pk += pkName + ",";
			}
			return pk;
		}
		
	}

	/**
	 * 获取主键值：非复合主键
	 * @return
	 */
	public String getPKValue(){
		String[] pkNameArr = getTable().getPrimaryKey();
		if(pkNameArr.length == 1){
			return this.getStr(pkNameArr[0]);
		}else{
			String pk = "";
			for (String pkName : pkNameArr) {
				pk += this.get(pkName) + ",";
			}
			return pk;
		}
	}

	/**
	 * 获取主键值：复合主键
	 * @return
	 */
	public List<Object> getPKValueList(){
		String[] pkNameArr = getTable().getPrimaryKey();
		
		List<Object> pkValueList = new ArrayList<Object>();
		for (String pkName : pkNameArr) {
			pkValueList.add(this.get(pkName));
		}
		
		return pkValueList;
	}

	/**
	 * 重写save方法，自动赋值，生成UUID值
	 */
	@Override
	public boolean save() {
		String[] pkArr = getTable().getPrimaryKey();
		for (String pk : pkArr) {
			this.set(pk, ToolRandoms.getUuid(true)); // 设置主键值
		}
		
		Table table = getTable();
		
		if(table.hasColumnLabel(column_version)){ // 是否需要乐观锁控制
			this.set(column_version, isOracle() ? BigDecimal.valueOf(0) : Long.valueOf(0)); // 初始化乐观锁版本号
		}
		
		return super.save();
	}
	/**
	 * 重写save方法，自动赋值，生成UUID值
	 */
	public boolean saveRandomId() {
		String[] pkArr = getTable().getPrimaryKey();
		for (String pk : pkArr) {
			this.set(pk, ToolRandoms.randomId());
		}
		
		Table table = getTable();
		
		if(table.hasColumnLabel(column_version)){ // 是否需要乐观锁控制
			this.set(column_version, isOracle() ? BigDecimal.valueOf(0) : Long.valueOf(0)); // 初始化乐观锁版本号
		}
		
		return super.save();
	}
	/**
	 * 记录保存操作人和时间
	 * @param userIds
	 * @return
	 */
	public boolean save(String userIds) {
		Table table = getTable();

		boolean hasCreateUser = table.hasColumnLabel(column_createUser);
		if(hasCreateUser){
			setCreateUser(userIds);
		}
		
		boolean hasCreateTime = table.hasColumnLabel(column_createTime);
		if(hasCreateTime){
			setCreateTime(ToolDateTime.getSqlTimestamp());
		}
		
		return save();
	}
	
	/**
	 * 重写save方法，单主键，自定义主键值
	 */
	public boolean savePK(String pkIds) {
		String[] pkArr = getTable().getPrimaryKey();
		
		this.set(pkArr[0], pkIds); // 设置主键值

		Table table = getTable();
		
		if(table.hasColumnLabel(column_version)){ // 是否需要乐观锁控制
			this.set(column_version, isOracle() ? BigDecimal.valueOf(0) : Long.valueOf(0)); // 初始化乐观锁版本号
		}
		
		return super.save();
	}

	/**
	 * 记录保存操作人和时间
	 * @param userIds
	 * @return
	 */
	public boolean savePK(String pkIds, String userIds) {
		Table table = getTable();

		boolean hasCreateUser = table.hasColumnLabel(column_createUser);
		if(hasCreateUser){
			setCreateUser(userIds);
		}
		
		boolean hasCreateTime = table.hasColumnLabel(column_createTime);
		if(hasCreateTime){
			setCreateTime(ToolDateTime.getSqlTimestamp());
		}
		
		return savePK(pkIds);
	}
	
	/**
	 * 重写save方法，复合主键，自定义主键值
	 */
	public boolean savePK(Map<String, Object> pkMap) {
		Set<String> pkSet = pkMap.keySet();
		for (String pk : pkSet) {
			this.set(pk, pkMap.get(pk)); // 设置主键值
		}

		Table table = getTable();
		
		if(table.hasColumnLabel(column_version)){ // 是否需要乐观锁控制
			this.set(column_version, isOracle() ? BigDecimal.valueOf(0) : Long.valueOf(0)); // 初始化乐观锁版本号
		}

		return super.save();
	}

	/**
	 * 记录保存操作人和时间
	 * @param userIds
	 * @return
	 */
	public boolean save(Map<String, Object> pkMap, String userIds) {
		Table table = getTable();

		boolean hasCreateUser = table.hasColumnLabel(column_createUser);
		if(hasCreateUser){
			setCreateUser(userIds);
		}
		
		boolean hasCreateTime = table.hasColumnLabel(column_createTime);
		if(hasCreateTime){
			setCreateTime(ToolDateTime.getSqlTimestamp());
		}
		
		return savePK(pkMap);
	}
	
	/**
	 * 重写update方法
	 * 如果存在版本号字段，则验证Model中的modifyFlag集合中是否包含version字段，
	 * 如果包含，则自动将版本号加1，并重新set版本号值
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean update() {
		Table table = getTable();
		
		boolean hasVersion = table.hasColumnLabel(column_version);
		if(hasVersion){// 是否需要乐观锁控制，表是否有version字段
			Set<String> modifyFlag = null;
			try {
				Field field = this.getClass().getSuperclass().getSuperclass().getDeclaredField("modifyFlag");
				field.setAccessible(true);
				Object object = field.get(this);
				if(null != object){
					modifyFlag = (Set<String>) object;
				}
				field.setAccessible(false);
			} catch (NoSuchFieldException e) {
				if(log.isErrorEnabled()) log.error("业务Model类必须继承BaseModel", e);
				e.printStackTrace();
				throw new RuntimeException("业务Model类必须继承BaseModel");
			} catch (IllegalArgumentException e) {
				if(log.isErrorEnabled()) log.error("BaseModel访问modifyFlag异常", e);
				e.printStackTrace();
				throw new RuntimeException("BaseModel访问modifyFlag异常");
			} catch (IllegalAccessException e) {
				if(log.isErrorEnabled()) log.error("BaseModel访问modifyFlag异常", e);
				e.printStackTrace();
				throw new RuntimeException("BaseModel访问modifyFlag异常");
			}
			boolean versionModify = modifyFlag.contains(column_version); // 表单是否包含version字段
			if(versionModify){
				Long newVersion = getVersion() + 1; // 表单中的版本号+1
				this.setVersion(newVersion); // 保存新版本号
			}
		}

		return super.update();
	}

	/**
	 * 记录更新操作人和时间
	 * @param userIds
	 * @return
	 */
	public boolean update(String userIds) {
		Table table = getTable();
		
		boolean hasUpdateUser = table.hasColumnLabel(column_updateUser);
		if(hasUpdateUser){
			setUpdateUser(userIds);
		}
		
		boolean hasUpdateTime = table.hasColumnLabel(column_updateTime);
		if(hasUpdateTime){
			setUpdateTime(ToolDateTime.getSqlTimestamp());
		}
		
		return update();
	}
	
	/**
	 * 记录删除操作人和时间
	 * @param userIds
	 * @return
	 */
	public boolean delete(String userIds) {
		Table table = getTable();
		
		boolean hasDeleteUser = table.hasColumnLabel(column_deleteUser);
		if(hasDeleteUser){
			setDeleteUser(userIds);
		}
		
		boolean hasDeleteTime = table.hasColumnLabel(column_deleteTime);
		if(hasDeleteTime){
			setDeleteTime(ToolDateTime.getSqlTimestamp());
		}
		
		return super.delete();
	}
	
	/**
	 * 针对Oracle做特殊处理
	 * @param attr
	 * @return
	 */
	@Override
	public Date getDate(String attr) {
		if(isOracle()){
			Object obj = this.get(attr);
			if(null == obj){
				return null;
			}
			
			if (TIMESTAMP.class.isAssignableFrom(obj.getClass())){
				TIMESTAMP ts = (TIMESTAMP) obj;
				
				Date date = null;
				try {
					date = ts.timestampValue();
				} catch (SQLException e) {
					return null;
				}
				
				return date;
			}
			
			return (Date) obj;
		}
		
		return super.getDate(attr);
	}
	
}

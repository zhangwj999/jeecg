package org.jeecgframework.web.sms.service;
import org.jeecgframework.web.sms.entity.TSSmsEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public interface TSSmsServiceI extends CommonService{
	
 	public <T> void delete(T entity);
 	
 	public <T> Serializable save(T entity);
 	
 	public <T> void saveOrUpdate(T entity);
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TSSmsEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TSSmsEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TSSmsEntity t);
 	
 	public void send();
 	
 	
 	//add-begin--Author:jg_renjie  Date:20150610 for：根据当前时间及当前登录人，取得规定时间内的信息内容
 	/**
 	 * 根据当前时间及当前登录人，取得规定时间内的信息内容
 	 * curUser:当前系统登录人
 	 * curDate：当前时间（yyyy-MM-dd）
 	 * 
 	*/
 	public List<TSSmsEntity> getMsgsList(String curUser,String curDate);
 	//add-end--Author:jg_renjie  Date:20150610 for：根据当前时间及当前登录人，取得规定时间内的信息内容
 	
}

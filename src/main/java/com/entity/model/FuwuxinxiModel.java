package com.entity.model;

import com.entity.FuwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 服务信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 16:51:01
 */
public class FuwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务图片
	 */
	
	private String fuwutupian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 准备材料
	 */
	
	private String zhunbeicailiao;
		
	/**
	 * 人数
	 */
	
	private Integer renshu;
		
	/**
	 * 服务详情
	 */
	
	private String fuwuxiangqing;
				
	
	/**
	 * 设置：服务图片
	 */
	 
	public void setFuwutupian(String fuwutupian) {
		this.fuwutupian = fuwutupian;
	}
	
	/**
	 * 获取：服务图片
	 */
	public String getFuwutupian() {
		return fuwutupian;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：准备材料
	 */
	 
	public void setZhunbeicailiao(String zhunbeicailiao) {
		this.zhunbeicailiao = zhunbeicailiao;
	}
	
	/**
	 * 获取：准备材料
	 */
	public String getZhunbeicailiao() {
		return zhunbeicailiao;
	}
				
	
	/**
	 * 设置：人数
	 */
	 
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
				
	
	/**
	 * 设置：服务详情
	 */
	 
	public void setFuwuxiangqing(String fuwuxiangqing) {
		this.fuwuxiangqing = fuwuxiangqing;
	}
	
	/**
	 * 获取：服务详情
	 */
	public String getFuwuxiangqing() {
		return fuwuxiangqing;
	}
			
}

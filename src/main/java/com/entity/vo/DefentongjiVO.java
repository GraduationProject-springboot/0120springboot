package com.entity.vo;

import com.entity.DefentongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 得分统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-18 20:07:19
 */
public class DefentongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 试卷题目
	 */
	
	private String shijuantimu;
		
	/**
	 * 得分
	 */
	
	private Float defen;
		
	/**
	 * 得分分析
	 */
	
	private String defenfenxi;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：试卷题目
	 */
	 
	public void setShijuantimu(String shijuantimu) {
		this.shijuantimu = shijuantimu;
	}
	
	/**
	 * 获取：试卷题目
	 */
	public String getShijuantimu() {
		return shijuantimu;
	}
				
	
	/**
	 * 设置：得分
	 */
	 
	public void setDefen(Float defen) {
		this.defen = defen;
	}
	
	/**
	 * 获取：得分
	 */
	public Float getDefen() {
		return defen;
	}
				
	
	/**
	 * 设置：得分分析
	 */
	 
	public void setDefenfenxi(String defenfenxi) {
		this.defenfenxi = defenfenxi;
	}
	
	/**
	 * 获取：得分分析
	 */
	public String getDefenfenxi() {
		return defenfenxi;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}

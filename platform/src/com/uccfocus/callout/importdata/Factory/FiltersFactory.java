package com.uccfocus.callout.importdata.Factory;

import java.util.ArrayList;
import java.util.List;

import com.uccfocus.callout.importdata.filters.QuestionFilter;
import com.uccfocus.callout.importdata.filters.SkillFilter;


public class FiltersFactory {
	/**
	 * modify by guoca 增加泛型
	 * 自动生成任务时获取数据的过滤列表
	 * 
	 * @throws Exception
	 */
	public static List<Filter> getMissionImportFilter()
			throws Exception {
		List<Filter> list = new ArrayList<>();
		//modify by liudx 暂时无用
		//问卷过滤器
		/*QuestionFilter QuestionFilter=new QuestionFilter();
		list.add(QuestionFilter);*/
		//技能等级过滤器
		//SkillFilter skillFilter = new SkillFilter();
		//list.add(skillFilter);
		return list;
	}
}

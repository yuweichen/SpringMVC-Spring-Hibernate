package ssm.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import ssm.model.vo.DataGrid;
import ssm.model.vo.Log;
import ssm.model.vo.User;

public interface LogServiceI {

	public void beforeLog(JoinPoint point);

	public void afterLog(JoinPoint point);

	public Object aroundLog(ProceedingJoinPoint point);
	
	public DataGrid datagrid(Log log);

}

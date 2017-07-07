package scm.dao;

import scm.entity.Dept;

public interface DeptDao {

	// 查询数据

	public Dept selectDept(Integer deptId);

	// 插入数据
	public int insertDept(Dept dept);
}

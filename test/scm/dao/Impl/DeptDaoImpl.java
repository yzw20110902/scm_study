package scm.dao.Impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import scm.entity.Dept;

@Repository("deptDao")
public class DeptDaoImpl {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public Dept selectDept(Integer deptId) {
		Dept dept = sqlSessionTemplate.selectOne(
				"scm.entity.DeptMapper.selectDept", deptId);

		return dept;
	}

	public int insertDept(Dept dept) {

		System.out.println("--" + dept);
		return sqlSessionTemplate.insert("scm.entity.DeptMapper.insertDept",
				dept);
	}

}

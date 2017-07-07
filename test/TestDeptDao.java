import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import scm.dao.Impl.DeptDaoImpl;
import scm.entity.Dept;

public class TestDeptDao {

	static private DeptDaoImpl deptDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		deptDao = (DeptDaoImpl) context.getBean("deptDao");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void TestSelectDeptDao() {
		// TODO Auto-generated constructor stub
		System.out.println(12312);
		System.out.println(deptDao.selectDept(1));

	}

	@Test
	public void TestInsertDept() {
		// TODO Auto-generated constructor stub
		Dept dept = new Dept();
		dept.setDeptName("007");
		dept.setDeptAdress("安徽");
		deptDao.insertDept(dept);

	}
}

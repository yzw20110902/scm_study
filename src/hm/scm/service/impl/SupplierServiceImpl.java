package hm.scm.service.impl;

import hm.scm.dao.SupplierMapper;
import hm.scm.entity.Supplier;
import hm.scm.service.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierMapper supplierMapper;

	@Override
	public int insert(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Supplier select(Supplier entity) {
		// TODO Auto-generated method stub
		return null;
	}

}

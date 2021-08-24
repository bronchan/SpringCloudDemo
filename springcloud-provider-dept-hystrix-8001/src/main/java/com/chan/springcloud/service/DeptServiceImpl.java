package com.chan.springcloud.service;

import com.chan.springcloud.dao.DeptDao;
import com.chan.pojo.DpDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptServiceImpl
 * @date 2021/8/21 20:55
 * @description TODO
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(DpDept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public DpDept queryById(Long deptNo) {
        return deptDao.queryById(deptNo);
    }

    @Override
    public List<DpDept> queryAll() {
        return deptDao.queryAll();
    }
}

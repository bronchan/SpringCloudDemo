package com.chan.springcloud.service;

import com.chan.pojo.DpDept;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptService
 * @date 2021/8/21 20:55
 * @description TODO
 */

public interface DeptService {
    public boolean addDept(DpDept dept);

    public DpDept queryById(Long deptNo);

    public List<DpDept> queryAll();
}

package com.chan.springcloud.dao;

import com.chan.pojo.DpDept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bronchan
 * @version 1.0
 * @className DeptDao
 * @date 2021/8/21 20:42
 * @description TODO
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(DpDept dept);

    public DpDept queryById(Long deptNo);

    public List<DpDept> queryAll();
}

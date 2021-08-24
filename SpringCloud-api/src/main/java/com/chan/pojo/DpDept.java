package com.chan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author bronchan
 * @version 1.0
 * @className DpDept
 * @date 2021/8/21 20:04
 * @description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DpDept implements Serializable {
    private Long dept_no;
    private String dept_name;
    private String dept_source;
}

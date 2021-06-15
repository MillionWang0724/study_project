/*
 * Copyright (c) 2014-2019 Huami, Inc. All Rights Reserved.
 */

package com.huami.effective.mybatis.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class PipelineJob implements Serializable {
    /**
     * pipeline的id 主键
     */
    private Integer jobId;

    private Integer pipelineId;

    /**
     * job名称
     */
    private String jobName;

    /**
     * job状态 success failed
     */
    private String jobStatus;

    /**
     * job执行耗时
     */
    private Double jobDuration;

    private String jobCreatetime;

    /**
     * job 创建时间
     */
    private String jobStarttime;

    /**
     * job结束时间
     */
    private String jobEndtime;

    /**
     * job 日志地址
     */
    private String jobWebUrl;

    private String jobStage;

    /**
     * 扩展字段1
     */
    private String extendedFiled1;

    /**
     * 扩展字段2
     */
    private String extendedFiled2;

    /**
     * 扩展字段3
     */
    private String extendedFiled3;

    private static final long serialVersionUID = 1L;
}

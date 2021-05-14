package com.q1sj.exportdemo.service.impl;

import com.q1sj.exportdemo.pojo.ExportRecord;
import com.q1sj.exportdemo.service.ExportRecordService;
import com.q1sj.export.ExportStatusChangeListener;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Q1sj
 * @date 2021.5.13 21:24
 */
@Service
public class ExportRecordServiceImpl implements ExportRecordService, ExportStatusChangeListener<ExportRecord> {

    @Override
    public List<ExportRecord> list() {
        // 模拟从数据库查询待导出记录
        return Arrays.asList(ExportRecord.mock());
    }
    /**
     * ExportRecord 状态被修改是会调用此方法
     * @param record
     */
    @Override
    public void accept(ExportRecord record) {
        // 真实环境此处可以是更新数据库等操作
        System.out.println("真实环境此处可以是更新数据库等操作" + record);
    }
}

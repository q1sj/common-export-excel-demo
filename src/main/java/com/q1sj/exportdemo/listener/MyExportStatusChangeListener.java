package com.q1sj.exportdemo.listener;

import com.q1sj.exportdemo.pojo.ExportRecord;
import com.qsj.export.ExportStatusChangeListener;
import org.springframework.stereotype.Component;

/**
 * @author Q1sj
 * @date 2021.5.13 21:04
 */
@Component
public class MyExportStatusChangeListener implements ExportStatusChangeListener<ExportRecord> {
    @Override
    public void accept(ExportRecord record) {
        // 真实环境此处可以是更新数据库等操作
        System.out.println("真实环境此处可以是更新数据库等操作" + record);
    }
}

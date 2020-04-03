package cn.jerryshell.liveteaching.service;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.jerryshell.liveteaching.dao.ReportDao;
import cn.jerryshell.liveteaching.model.Report;
@Service
public class ReportService {
	@Autowired
	ReportDao reportdao;
    public Report save(Report report) {
    	Date date=new Date();
    	report.setDate(date);
    	return reportdao.save(report);
    }
    public Report findById(String id) {
		return reportdao.findById(id).orElse(null);
    	
    }

}

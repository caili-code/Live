package cn.jerryshell.liveteaching.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import cn.jerryshell.liveteaching.model.Report;
public interface ReportDao extends JpaRepository<Report, String> {

}

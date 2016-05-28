package mybatis.dao;

import java.util.List;
import mybatis.entity.PeiziDetail;
import mybatis.entity.PeiziDetailExample;
import org.apache.ibatis.annotations.Param;

public interface PeiziDetailMapper {
    int countByExample(PeiziDetailExample example);

    int deleteByExample(PeiziDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeiziDetail record);

    int insertSelective(PeiziDetail record);

    List<PeiziDetail> selectByExample(PeiziDetailExample example);

    PeiziDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PeiziDetail record, @Param("example") PeiziDetailExample example);

    int updateByExample(@Param("record") PeiziDetail record, @Param("example") PeiziDetailExample example);

    int updateByPrimaryKeySelective(PeiziDetail record);

    int updateByPrimaryKey(PeiziDetail record);
}
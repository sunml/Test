package mybatis.dao;

import java.util.List;
import mybatis.entity.DianTouAccountTrade;
import mybatis.entity.DianTouAccountTradeExample;
import org.apache.ibatis.annotations.Param;

public interface DianTouAccountTradeMapper {
    int countByExample(DianTouAccountTradeExample example);

    int deleteByExample(DianTouAccountTradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DianTouAccountTrade record);

    int insertSelective(DianTouAccountTrade record);

    List<DianTouAccountTrade> selectByExample(DianTouAccountTradeExample example);

    DianTouAccountTrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DianTouAccountTrade record, @Param("example") DianTouAccountTradeExample example);

    int updateByExample(@Param("record") DianTouAccountTrade record, @Param("example") DianTouAccountTradeExample example);

    int updateByPrimaryKeySelective(DianTouAccountTrade record);

    int updateByPrimaryKey(DianTouAccountTrade record);
}
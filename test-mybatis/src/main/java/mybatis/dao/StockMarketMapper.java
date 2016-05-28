package mybatis.dao;

import java.util.List;
import mybatis.entity.StockMarket;
import mybatis.entity.StockMarketExample;
import org.apache.ibatis.annotations.Param;

public interface StockMarketMapper {
    int countByExample(StockMarketExample example);

    int deleteByExample(StockMarketExample example);

    int deleteByPrimaryKey(String stockCode);

    int insert(StockMarket record);

    int insertSelective(StockMarket record);

    List<StockMarket> selectByExample(StockMarketExample example);

    StockMarket selectByPrimaryKey(String stockCode);

    int updateByExampleSelective(@Param("record") StockMarket record, @Param("example") StockMarketExample example);

    int updateByExample(@Param("record") StockMarket record, @Param("example") StockMarketExample example);

    int updateByPrimaryKeySelective(StockMarket record);

    int updateByPrimaryKey(StockMarket record);
}
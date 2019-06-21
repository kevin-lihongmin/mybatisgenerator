package com.qr.contract.dao;

import com.qr.contract.entity.ContractRecord;
import com.qr.contract.entity.ContractRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractRecordMapper {
    long countByExample(ContractRecordExample example);

    int deleteByExample(ContractRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractRecord record);

    int insertSelective(ContractRecord record);

    List<ContractRecord> selectByExample(ContractRecordExample example);

    ContractRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractRecord record, @Param("example") ContractRecordExample example);

    int updateByExample(@Param("record") ContractRecord record, @Param("example") ContractRecordExample example);

    int updateByPrimaryKeySelective(ContractRecord record);

    int updateByPrimaryKey(ContractRecord record);
}
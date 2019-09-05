package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Packge;

import java.util.List;

@Mapper
public interface PackgeMapper {
    List<Packge> selectAll();
    void insert(@Param("packge") Packge packge);
}

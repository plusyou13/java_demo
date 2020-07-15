package cn5.day23_redis.src.cn.itcast.service;

import cn5.day23_redis.src.cn.itcast.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}

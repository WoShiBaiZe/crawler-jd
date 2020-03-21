package com.baize.crawler.jd.dao;

import com.baize.crawler.jd.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Long> {
}

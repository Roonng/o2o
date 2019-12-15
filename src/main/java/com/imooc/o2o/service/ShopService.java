package com.imooc.o2o.service;

import java.io.InputStream;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

/**
@version 创建时间:2019年1月19日 下午5:49:59
*/

public interface ShopService {
	/**
	 * 根据shopCondition分页返回相应店铺列表
	 * 
	 * @param shopCondition
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
	
	public ShopExecution addShop(Shop shop,ImageHolder thumbnail);
	
	public Shop getByShopId(Long shopId);
	
	public ShopExecution modifyShop(Shop shop,ImageHolder thumbnail);
	
}

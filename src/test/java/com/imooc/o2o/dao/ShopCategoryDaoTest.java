package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.ShopCategory;

/**
@version 创建时间:2019年1月20日 下午9:47:18
*/

public class ShopCategoryDaoTest extends BaseTest{

	@Autowired
	private ShopCategoryDao shopCategoryDao;
	
	@Test
	public void testQueryShopCategory(){
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(new ShopCategory());
		assertEquals(2,shopCategoryList.size());
		ShopCategory test = new ShopCategory();
		ShopCategory parent = new ShopCategory();
		parent.setShopCategoryId(1L);
		test.setParent(parent);
		shopCategoryList = shopCategoryDao.queryShopCategory(test);
		assertEquals(1,shopCategoryList.size());
		System.out.println(shopCategoryList.get(0).getShopCategoryName());
	}
}

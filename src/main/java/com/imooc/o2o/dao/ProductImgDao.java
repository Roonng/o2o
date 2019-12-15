package com.imooc.o2o.dao;

import java.util.List;

import com.imooc.o2o.entity.ProductImg;

/**
@version 创建时间:2019年1月29日 下午3:56:40
*/

public interface ProductImgDao {

	/**
	 * 批量添加商品详细图片
	 * @param productImg
	 * @return
	 */
	int batchInsertProductImg(List<ProductImg> productImg);

	/**
	 * 列出某个商品的详情图列表
	 * 
	 * @param productId
	 * @return
	 */
	List<ProductImg> queryProductImgList(long productId);
	/**
	 * 删除指定商品下的所有详情图
	 * 
	 * @param productId
	 * @return
	 */
	int deleteProductImgByProductId(long productId);
}

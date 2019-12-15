package test;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.enums.ShopStateEnum;

/**
@version 创建时间:2019年3月2日 上午11:43:16
*/

public class test {
	public static ShopExecution test(){
		return new ShopExecution(ShopStateEnum.NULL_SHOP);
	}
 public static void main(String[] args) {
	System.out.println(test().getState());
}
}

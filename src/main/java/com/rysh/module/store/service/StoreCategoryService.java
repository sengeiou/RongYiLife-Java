package com.rysh.module.store.service;

import com.rysh.module.farm.beans.CategoryInfo;
import com.rysh.module.store.beans.StoreCategory;

import java.util.List;

public interface StoreCategoryService {
    /**
     * 新增商铺商品分类
     * @param category
     * @return int
     * @author Hsiang Sun
     * @date 2019/10/9 10:37
     */
    int addCategory(StoreCategory category);

    /**
     * 查询当前可用的商品分类
     * @param id
     * @return java.util.List<com.rysh.module.farm.beans.FarmCategory>
     * @author Hsiang Sun
     * @date 2019/10/9 10:38
     */
    List<StoreCategory> AvailableCategory(String id);

    /**
     * 删除当前商铺分类
     * @param id
	 * @param login
     * @return int
     * @author Hsiang Sun
     * @date 2019/10/9 10:38
     */
    int deleteCategory(String id, String login);

    /**
     * 通过ID数据回显
     * @param id
     * @return com.rysh.module.store.beans.StoreCategory
     * @author Hsiang Sun
     * @date 2019/10/9 10:42
     */
    StoreCategory getCategoryById(String id);

    /**
     * 更新分类名称
     * @param id
	 * @param name
     * @return int
     * @author Hsiang Sun
     * @date 2019/10/9 10:42
     */
    int updateName(String id, String name);

    /**
     * 展示给商铺管理员所看到的信息
     * @param id
     * @return java.util.List<com.rysh.module.farm.beans.CategoryInfo>
     * @author Hsiang Sun
     * @date 2019/10/9 10:43
     */
    List<CategoryInfo> getCategoryInfo(String id);
}

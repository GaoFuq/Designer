package com.jojo.design.module_core.net

import com.jojo.design.common_base.net.BaseResponse
import com.jojo.design.module_core.bean.*
import com.smart.novel.net.BaseHttpResponse
import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 *    author : JOJO
 *    e-mail : 18510829974@163.com
 *    date   : 2018/12/7 3:42 PM
 *    desc   :
 */
interface ApiCoreService {
    /**
     * 文件上传
     */
    @POST("upload/")
    fun uploadFile(@Body requestBody: RequestBody): Observable<String>

    /**
     * 设计师
     */

    //获取顶部推荐设计师
    @GET("designer2/recommend/operate")
    fun getRecommendDesigner(): Observable<BaseHttpResponse<DesignerEntity>>

    //获取设计师分类
    @GET("designer2/tag/index")
    fun getDesignerTypeList(): Observable<BaseHttpResponse<List<TagCategoryEntity>>>

    //获取设计师列表
    @GET("designer2/list")
    fun getDesignerList(): Observable<BaseResponse<List<DesignerEntity>>>

    //获取设计师详情信息
    @GET("designer2/article")
    fun getDesignerDetail(@Query("id") id: String): Observable<BaseHttpResponse<DesignerDetailEntity>>

    /**
     * 逛
     */
    //获取商品分类列表
    @GET("category/out/children")
    fun getCategoryList(): Observable<BaseHttpResponse<List<CategoryEntity>>>

    //获取商品列表
    @GET("shopping/banner/list")
    fun getGoodsList(): Observable<BaseResponse<List<GoodsEntity>>>
}
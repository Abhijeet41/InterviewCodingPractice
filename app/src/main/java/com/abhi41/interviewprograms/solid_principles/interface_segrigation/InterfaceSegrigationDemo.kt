package com.abhi41.interviewprograms.solid_principles.interface_segrigation

import com.abhi41.interviewprograms.solid_principles.single_responsibility.Product
import com.abhi41.interviewprograms.solid_principles.single_responsibility.User

interface UserDetailRep{
    fun getUSerData(users:List<User>)
    fun addUser(user: User)

}

interface ProductDetailRepo{
    fun addProDuct(product: Product)
    fun getProducts(products: List<Product>)
}
private class UserDetail: UserDetailRep{

    override fun getUSerData(users: List<User>) {
       return
    }

    override fun addUser(user: User) {

    }

}

private class ProductDetail: ProductDetailRepo{
    override fun addProDuct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun getProducts(products: List<Product>) {
        TODO("Not yet implemented")
    }

}
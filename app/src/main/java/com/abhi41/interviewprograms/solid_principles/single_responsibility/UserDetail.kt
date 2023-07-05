package com.abhi41.interviewprograms.solid_principles.single_responsibility

class UserDetail {

    /*
        this class is breaking single responsibility principle
        UserDetails class should contains only user related
        functions addProductFun and showProductFun should be
        displayed on another classes.
     */

    fun addUser(user: User) {

    }

    fun deleteUser(user: User) {

    }

    fun addProduct(product: Product) {

    }

    fun showProduct(productList: List<Product>) {

    }

}
//Solution is to use 2 different classes for that

private class UserDetails {
    fun addUser(user: User) {

    }

    fun deleteUser(user: User) {

    }
}

private class ProductDetails {
    fun addProduct(product: Product) {

    }

    fun showProduct(productList: List<Product>) {

    }
}
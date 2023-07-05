package com.abhi41.interviewprograms.solid_principles.dependency_inversion


//high level module
class ProductCatalog {
    fun listAllProducts() {
        val sql = SQLProductRepo()
        sql.getAllProducts().forEach {
            println(it)
        }
    }
}
//both high level and low lvl module are depends on abstraction

interface ProductRepo{
    fun getAllProducts(): MutableList<String>
}

//low level module
class SQLProductRepo : ProductRepo {
    override fun getAllProducts(): MutableList<String> {
        return mutableListOf("Apple", "Banana")
    }
}

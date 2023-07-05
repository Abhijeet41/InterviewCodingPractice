package com.abhi41.interviewprograms.solid_principles.open_close


interface Customer {
    fun isLoyalCustomer(): Boolean
}

class VehicleInsuranceCustomer : Customer {
    override fun isLoyalCustomer(): Boolean {
        return true
    }
}

class HomeInsuranceCustomer : Customer {
    override fun isLoyalCustomer(): Boolean {
        return true
    }
}

class LifeInsuranceCustomer : Customer {
    override fun isLoyalCustomer(): Boolean {
        return true
    }
}


private class InsuranceCompanyMain {

    fun disCountRate(customer: Customer, loyalDiscount: Int, notLoyal: Int): Int{
        if (customer.isLoyalCustomer()){
           return loyalDiscount
        }else{
            return notLoyal
        }
    }

    //we don't have to create fun for different classes
 /*   private fun discountRate(vehicleInsuranceCustomer: VehicleInsuranceCustomer): Int {
        return if (vehicleInsuranceCustomer.isLoyalCustomer()) 10 else 5
    }

    private fun discountRate(homeInsuranceCustomer: HomeInsuranceCustomer): Int {
        return if (homeInsuranceCustomer.isLoyalCustomer()) 20 else 12
    }

    private fun discountRate(lifeInsuranceCustomer: LifeInsuranceCustomer): Int {
        return if (lifeInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }
    */
}

fun main() {
    val lifeInsuranceCustomer = LifeInsuranceCustomer()
    val homeInsuranceCustomer = HomeInsuranceCustomer()
    val vehicleInsuranceCustomer = VehicleInsuranceCustomer()

    val insuranceCompany = InsuranceCompanyMain()
    insuranceCompany.disCountRate(lifeInsuranceCustomer, 10, 5)
    insuranceCompany.disCountRate(homeInsuranceCustomer,20,12)
    insuranceCompany.disCountRate(vehicleInsuranceCustomer, 10, 8)

}
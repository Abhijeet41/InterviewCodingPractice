package com.abhi41.interviewprograms.solid_principles.open_close

import javax.xml.transform.TransformerFactoryConfigurationError


class InsuranceCompany {

    private class VehicleInsuranceCustomer {
        fun isLoyalCustomer(): Boolean {
            return true
        }
    }

    private class HomeInsuranceCustomer {
        fun isLoyalCustomer(): Boolean {
            return true
        }
    }

    private class LifeInsuranceCustomer {
        fun isLoyalCustomer(): Boolean {
            return true
        }
    }


    /*
    The problem with this approach is we have to create everytime new fun for new classes
    to overcome with this problem use abstraction
 */
    private fun discountRate(vehicleInsuranceCustomer: VehicleInsuranceCustomer): Int {
        return if (vehicleInsuranceCustomer.isLoyalCustomer()) 10 else 5
    }

    private fun discountRate(homeInsuranceCustomer: HomeInsuranceCustomer): Int {
        return if (homeInsuranceCustomer.isLoyalCustomer()) 20 else 12
    }

    private fun discountRate(lifeInsuranceCustomer: LifeInsuranceCustomer): Int {
        return if (lifeInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }

}


fun main() {

}


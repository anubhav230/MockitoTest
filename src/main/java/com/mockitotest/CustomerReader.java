package com.mockitotest;

public class CustomerReader {
    private EntityManager entityManager;


    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String findFullName(long id) {
         Customer customer = this.entityManager.find(Customer.class, id);
        return customer.fName+ " " +customer.lName;
    }

}

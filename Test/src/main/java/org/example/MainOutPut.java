package org.example;

public class MainOutPut {
    public static void main(String[] args) {
        UserDetailsRequest userDetailsRequest = new UserDetailsRequest("Praveen kumar N", 27, "Sri Balaji Whitewoods");

        System.out.println("Employee Details : ");
        System.out.println(userDetailsRequest);

        UserAdditionalDetails userAdditionalDetails = new UserAdditionalDetails(7022674690L,"ICICI Bank",33998800778899L);
        System.out.println("Employee Additional Details");
        System.out.println(userAdditionalDetails);
    }
}

package org.example;

public class UserAdditionalDetails {
    private long phoneNumber;
    private String bankName;
    private long accountNo;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public UserAdditionalDetails(long phoneNumber, String bankName, long accountNo) {
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
        this.accountNo = accountNo;
    }

    @Override
    public String toString() {
        return "UserAdditionalDetails{" +
                "phoneNumber=" + phoneNumber +
                ", bankName='" + bankName + '\'' +
                ", accountNo=" + accountNo +
                '}';
    }
}

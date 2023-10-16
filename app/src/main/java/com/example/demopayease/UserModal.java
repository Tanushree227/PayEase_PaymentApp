package com.example.demopayease;

public class UserModal {
    private String userName;
    private String email;
    private String phone;
    private String password;
    private String confrmPassword;

    public String getBank_acc_no() {
        return bank_acc_no;
    }

    public void setBank_acc_no(String bank_acc_no) {
        this.bank_acc_no = bank_acc_no;
    }

    public String getBank_acc_name() {
        return bank_acc_name;
    }

    public void setBank_acc_name(String bank_acc_name) {
        this.bank_acc_name = bank_acc_name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getUpi_pin() {
        return upi_pin;
    }

    public void setUpi_pin(String upi_pin) {
        this.upi_pin = upi_pin;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    private String bank_acc_no, bank_acc_name, bank_name, upi_pin, ifsc_code, balance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfrmPassword() {
        return confrmPassword;
    }

    public void setConfrmPassword(String confrmPassword) {
        this.confrmPassword = confrmPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public UserModal(String username, String email, String phone, String password, String cnfrm_Password, String bank_acc_name, String bank_acc_no, String bank_name, String ifsc_code, String upi_pin, String balance)
    {
        this.userName = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.confrmPassword = cnfrm_Password;
        this.bank_acc_name = bank_acc_name;
        this.bank_acc_no = bank_acc_no;
        this.bank_name = bank_name;
        this.ifsc_code = ifsc_code;
        this.upi_pin = upi_pin;
        this.balance = balance;
    }

}

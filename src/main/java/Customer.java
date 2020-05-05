public class Customer {
    private int customerId;
    private String
            firstName,
            lastName,
            gender,
            address,
            phone,
            email,
            city,
            country;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public public String toString() {
        return "Customer{" +
                "Customer ID=" + customerId +
                ", First Name='" + firstName + "\t" +
                ", Last Name='" + lastName + "\t" +
                ", Gender='" + gender + "\t" +
                ", Address='" + address + "\t" +
                ", Phone='" + phone + "\t" +
                ", Email='" + email + "\t" +
                ", City='" + city + "\t" +
                ", Country='" + country + "\t" +
                '}';
    }
}
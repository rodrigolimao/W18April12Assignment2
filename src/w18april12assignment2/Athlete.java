/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18april12assignment2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author rodrigolima
 */
public class Athlete {

    private String firstName, lastName, gender, shift, sport,
            phone, streetAddress, state, city, postalCode, studentNumber;
    private LocalDate enteringDate, dateOfBirth, dateEnrolled;
    private int height;

    public Athlete(String firstName, String lastName, String gender, String shift, String sport,
            int height, String phone, String streetAddress, String state, String city, String postalCode,
            LocalDate enteringDate, LocalDate dateOfBirth, LocalDate dateEnrolled, String studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setShift(shift);
        setSport(sport);
        setHeight(height);
        setPhone(phone);
        setStreetAddress(streetAddress);
        setState(state);
        setCity(city);
        setPostalCode(postalCode);
        setEnteringDate(enteringDate);
        setDateOfBirth(dateOfBirth);
        setDateEnrolled(dateEnrolled);
        setStudentNumber(studentNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Setting first Name that cannot be empty
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        if (!firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name cannot be empty");
        }
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Setting lastName that cannot be empty
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name cannot be empty");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.isEmpty()) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender cannot be empty");
        }
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if ("Morning".equals(shift) || "Night".equals(shift)) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException("Shift can be only Morning or Night");
        }
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {

        /*
        String[] validSports = {"Basketball","Volleyball","Soccer","Table Tennis","Swimming", "Handball"};
        
        for (String validSport : validSports)
        {
            if (validSport.equalsIgnoreCase(sport))
            {
                this.sport = validSport;
                return;
            }
        }
        throw new IllegalArgumentException("Valid sports are: Volley, Basketball, etc...");
    } */
        if (!sport.isEmpty()) {
            this.sport = sport;
        } else {
            throw new IllegalArgumentException("Sport should never be empty");
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 130 && height <= 240) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height shoud be between 130 and 240");
        }

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Setting streetAddress that cannot be empty
     *
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        if (streetAddress.isEmpty()) {
            throw new IllegalArgumentException("Street Address should never be empty");
        } else {
            this.streetAddress = streetAddress;
        }
    }

    public String getState() {
        return state;
    }

    /**
     * Setting the state that cannot be empty
     *
     * @param state
     */
    public void setState(String state) {
        if (state.isEmpty()) {
            throw new IllegalArgumentException("State should never be empty");
        } else {
            this.state = state;
        }
    }

    public String getCity() {
        return city;
    }

    /**
     * Setting the city that cannot be empty
     *
     * @param city
     */
    public void setCity(String city) {
        if (city.isEmpty()) {
            throw new IllegalArgumentException("City should never be empty");
        } else {
            this.city = city;
        }
    }

    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setting the postalCode that cannot be empty
     *
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        if (postalCode.matches("\\(?[1-9]\\d{4}\\)?[-.\\s]?[1-9]\\d{2}")) {
            this.postalCode = postalCode;
        } else {
            throw new IllegalArgumentException("Postal Code in the wrong format");
        }
    }

    public LocalDate getEnteringDate() {
        return enteringDate;
    }

    /**
     * Setting the entering date in university to not be after LocalDate.now()
     *
     * @param enteringDate
     */
    public void setEnteringDate(LocalDate enteringDate) {
        if (!enteringDate.isAfter(LocalDate.now())) {
            this.enteringDate = enteringDate;
        } else {
            throw new IllegalArgumentException("Invalid entering date");
        }

    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * getYearBorn() returns the year a Student was born
     *
     * @return
     */
    public int getYearBorn() {
        return this.dateOfBirth.getYear();
    }

    /**
     * Setting getAge to work dynamically based on the current date
     *
     * @return
     */
    public int getAge() {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        return age;
    }

    /**
     * Setting the date of Birth if the exception that age must be below 100
     * years
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        if (age > 100 || age < 15) {
            throw new IllegalArgumentException("Age must be below 100 years or above 15 years old.");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public int getYearEnrolled() {
        return dateEnrolled.getYear();
    }

    /**
     * Setting the date of enrollment with the exception that the date cannot be
     * in future
     *
     * @param dateEnrolled
     */
    public void setDateEnrolled(LocalDate dateEnrolled) {

        if (dateEnrolled.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Please insert a valid date");
        } else {
            this.dateEnrolled = dateEnrolled;
        }
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Setting the StudentNumber that cannot be negative
     *
     * @param studentNumber
     */
    public void setStudentNumber(String studentNumber) {

        if (studentNumber.matches("\\d{9}")) {
            this.studentNumber = studentNumber;
        } else {
            throw new IllegalArgumentException("Student number has to be a 9 number digit");
        }
    }

    public String getPhone() {
        return phone;
    }

    /**
     * Setting the StudentNumber in the Brazilian format
     *
     * @param phone
     */
    public void setPhone(String phone) {
        if (phone.matches("\\(?[9]\\d{4}\\)?[-.\\s]?[2-9]\\d{3}")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone in the wrong type");
        }
    }

    public String toString() {

        return String.format("%n %s %s with %scm %s, %s shift athlete of %s Phone Number: %s Street Address %s, %s, %s Postal Code:%s Student number: %s Entered the Athletics in %s born in %s, age %s since %s in University %n", firstName, lastName, height, gender, shift, sport,
                phone, streetAddress, state, city, postalCode, studentNumber, enteringDate, dateOfBirth, getAge(), dateEnrolled);
    }

}
//phone.matches("\\(?[2-9]\\d{2}\\)?[-.\\s]?[2-9]\\d{2}[-.\\s]?\\d{4}"))//

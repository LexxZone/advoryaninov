package ru.job4j.lite.sort;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 */
public class User implements Comparable<User> {
    public String name;
    public int age;

    /**
     * This is constructor for User class
     *
     * @param name - name of person
     * @param age - age of person
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Get User name
     *
     * @return name - name of User
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get User age
     *
     * @return age - age of User
     */
    public int getAge() {
        return this.age;
    }

    /**
     *
     *  Overrided method.
     *  @param user
     *  @return negative number, positive number or zero
     *  Comparing users. If there are two or more users with the same
     *      * age they are sorted by the name
     *
     */
    @Override
    public int compareTo(User user) {
        return this.age - user.age;
    }
}
package com.dimidium.workonintent;

import android.os.Parcel;
import android.os.Parcelable;

public class Acсount implements Parcelable {


    private String name;
    private String lastName;
    private Integer age;
    private String email;

    public Acсount(String name, String lastName, int age, String email) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setEmail(email);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected Acсount(Parcel in) {
        name = in.readString();
        lastName = in.readString();
        age = in.readInt();
        email = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(lastName);
        dest.writeInt(age);
        dest.writeString(email);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Account> CREATOR = new Creator<Account>() {
        @Override
        public Account createFromParcel(Parcel in) {
            return new Acсount(in);
        }

        @Override
        public Account[] newArray(int size) {
            return new Account[size];
        }
    };
}



}
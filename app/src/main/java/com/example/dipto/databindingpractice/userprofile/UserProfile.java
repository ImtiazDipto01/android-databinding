package com.example.dipto.databindingpractice.userprofile;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.dipto.databindingpractice.BR;

public class UserProfile extends BaseObservable {

    private String name ;
    private int age ;
    private String image ;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

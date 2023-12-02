package ru.netology.conditional.Controller;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}

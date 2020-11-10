package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.support.PageFactory;


public abstract class basePage {


    public basePage(){

        PageFactory.initElements(Driver.getDriver(),this );
    }


}

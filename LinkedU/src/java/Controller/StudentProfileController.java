/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Profile;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.mail.Part;

/**
 *
 * @author IT353S710
 */
@ManagedBean
@SessionScoped
public class StudentProfileController implements Serializable {

    private Profile myProfileModel; //personal profile
    private Profile viewProfileModel; //other student profiles
    private Part myImage;

    /**
     * Creates a new instance of StudentProfileController
     */
    public StudentProfileController() {
        if (myProfileModel == null) {
            myProfileModel = new Profile("pdkaufm");
        }
    }

    public String loadMyProfile() {
        /*DATABASE ACCESS*/
        
        return "myProfile.xhtml?faces-redirect=true";
    }

    public String gotoUpdateGeneral() {

        return "updateProfile.xhtml?faces-redirect=true";
    }

    public String updateFinished() {
        /*DATA VALIDATION*/
        return "myProfile.xhtml?faces-redirect=true";
    }

    public String uploadImage() throws IOException {
        boolean status = false;

        if (status) { //successful upload
            myProfileModel.setImage(true);
        } else { //failed/no upload
            //Error Message?
        }
        return null;
    }

    public Profile getMyProfileModel() {
        return myProfileModel;
    }

    public void setMyProfileModel(Profile myProfileModel) {
        this.myProfileModel = myProfileModel;
    }

    public Profile getViewProfileModel() {
        return viewProfileModel;
    }

    public void setViewProfileModel(Profile viewProfileModel) {
        this.viewProfileModel = viewProfileModel;
    }

    public Part getMyImage() {
        return myImage;
    }

    public void setMyImage(Part myImage) {
        this.myImage = myImage;
    }

}

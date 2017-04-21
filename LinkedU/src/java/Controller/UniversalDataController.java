/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author IT353S710
 */
@ManagedBean
@ApplicationScoped
public class UniversalDataController {

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private Map<String, String> universities;
    private Map<String, String> majors;

    /**
     * Creates a new instance of UniversalDataController
     */
    public UniversalDataController() {
        universities = new HashMap<String, String>();
        universities.put("Princeton University", "Princeton University");
        universities.put("Harvard University", "Harvard University");
        universities.put("University of Chicago", "University of Chicago");
        universities.put("Illinois State University", "Illinois State University");
        universities.put("Stanford University", "Stanford University");

        Map<String, String> map = new HashMap<String, String>();
        map.put("Art and Archaeology", "Art and Archaeology");
        map.put("Chemical and Biological Engineering", "Chemical and Biological Engineering");
        map.put("Economics", "Economics");
        map.put("Computer Science", "Computer Science");
        data.put("Princeton University", map);

        map = new HashMap<String, String>();
        map.put("Applied mathematics", "Applied mathematics");
        map.put("Business economics", "Business economics");
        map.put("Computational Science and Engineering", "Computational Science and Engineering");
        data.put("Harvard University", map);

        map = new HashMap<String, String>();
        map.put("Biological Sciences Division", "Biological Sciences Division");
        map.put("Humanities Division", "Humanities Division");
        map.put("Physical Sciences Division", "Physical Sciences Division");
        map.put("Computer Science Division", "Computer Science Division");
        data.put("University of Chicago", map);

        map = new HashMap<String, String>();
        map.put("Anthropology - Applied Community & Economic Development", "Anthropology - Applied Community & Economic Development");
        map.put("Biological Sciences - Biomathematics", "Biological Sciences - Biomathematics");
        map.put("Chemistry - Master of Chemistry Education", "Chemistry - Master of Chemistry Education");
        map.put("Information Systems - Internet Application Development", "Information Systems - Internet Application Development");
        data.put("Illinois State University", map);

        map = new HashMap<String, String>();
        map.put("Computational and Mathematical Engineering ", "Computational and Mathematical Engineering ");
        map.put("Chemistry  ", "Chemistry  ");
        map.put("Music ", "Music ");
        map.put("Economics ", "Economics ");
        map.put("Computer Science ", "Computer Science");
        data.put("Stanford University", map);
    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public void setData(Map<String, Map<String, String>> data) {
        this.data = data;
    }

    public Map<String, String> getUniversities() {
        return universities;
    }

    public void setUniversities(Map<String, String> universities) {
        this.universities = universities;
    }

    public Map<String, String> getMajors() {
        return majors;
    }

    public void setMajors(Map<String, String> majors) {
        this.majors = majors;
    }
    
    

}

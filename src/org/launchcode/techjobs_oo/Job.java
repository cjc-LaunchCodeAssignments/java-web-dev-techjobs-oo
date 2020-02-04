package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    @Override
    public String toString() {
        String line1 = " \n";
        String line2 = "ID: " + this.getId() + "\n";
        String line3 = "Name: " + name + "\n";
        String line4 = "Employer: " + employer + "\n";
        String line5 = "Location: " + location + "\n";
        String line6 = "Position Type: " + positionType + "\n";
        String line7 = "Core Competency: " + coreCompetency + "\n";
        String lineLast = " \n";
        String noData = "Data not available";
        if(getName()==null && getEmployer() == null && getLocation() == null && getPositionType() == null && getCoreCompetency() == null){
            return line1 + "OOPS! This job does not seem to exist." + lineLast;
        } else {

            if (getName() == null || getName() == "") {
                line3 = "Name: " + noData + "\n";
            }
            if(getEmployer() == null || employer.getValue() == "" ){
                line4 = "Employer: " + noData + "\n";
            }
            if(getLocation() == null || location.getValue() == "") {
                line5 = ("Location: " + noData + "\n");
            }
            if(getPositionType() == null || positionType.getValue() == "") {
                line6 = "Position Type: " + noData + "\n";
            }
            if(getCoreCompetency() == null || positionType.getValue() == "") {
                line7 = "Core Competency: " + noData + "\n";
            }
        }
        return  line1 + line2 + line3 + line4 + line5 + line6 + line7 + lineLast;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

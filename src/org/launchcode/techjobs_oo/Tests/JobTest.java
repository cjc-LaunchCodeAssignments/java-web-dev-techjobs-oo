package org.launchcode.techjobs_oo.Tests;

import static org.junit.Assert.*;
import org.junit.*;

import org.launchcode.techjobs_oo.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        

        assertFalse(job1.getId() == job2.getId());
        assertEquals(1, job2.getId() - job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);

        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToString() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] firstLine = testJob3.toString().split("\n");
        assertEquals(" ", firstLine[0]);
        assertEquals(" ", firstLine[firstLine.length-1]);
        assertEquals("ID: " + testJob3.getId(), firstLine[1]);
        assertEquals("Name: Product tester", firstLine[2]);
        assertEquals("Employer: ACME", firstLine[3]);
        assertEquals("Location: Desert", firstLine[4]);
        assertEquals("Position Type: Quality control", firstLine[5]);
        assertEquals("Core Competency: Persistence", firstLine[6]);
    }

    @Test
    public void moreStringTestsWithNullData(){
        Job testJob4 = new Job();
        assertEquals(" \nOOPS! This job does not seem to exist. \n", testJob4.toString());
        testJob4.setName("Product tester");
        assertEquals(" \n" +
                "ID: " + testJob4.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n" +
                " \n", testJob4.toString());
        Job testJob5 = new Job();
        testJob5.setEmployer(new Employer("ACME"));
        assertEquals(" \n" +
                "ID: " + testJob5.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n" +
                " \n", testJob5.toString());
        Job testJob6 = new Job();
        testJob6.setLocation(new Location("Kansas City"));
        testJob6.setCoreCompetency(new CoreCompetency("Java"));
        assertEquals(" \n" +
                "ID: " + testJob6.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Kansas City\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Java\n" +
                " \n", testJob6.toString());
    }

    @Test
    public void moreStringTestsWithEmptyData(){
        Job testJob4 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals(" \nOOPS! This job does not seem to exist. \n", testJob4.toString());
        testJob4.setName("Product tester");
        assertEquals(" \n" +
                "ID: " + testJob4.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n" +
                " \n", testJob4.toString());
        Job testJob5 = new Job();
        testJob5.setEmployer(new Employer("ACME"));
        assertEquals(" \n" +
                "ID: " + testJob5.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n" +
                " \n", testJob5.toString());
        Job testJob6 = new Job();
        testJob6.setLocation(new Location("Kansas City"));
        testJob6.setCoreCompetency(new CoreCompetency("Java"));
        assertEquals(" \n" +
                "ID: " + testJob6.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Kansas City\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Java\n" +
                " \n", testJob6.toString());
    }

}
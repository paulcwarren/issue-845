package com.example.issue845.enums;

public enum EducationLevelCode {

	AssociateDegree("Associate Degree"),
	BachelorsDegree("Bachelor's Degree"),
	Doctorate("Doctorate, PhD"),
	DoctorDentistry("Doctor of Dentistry"),
	DoctorMedicine("Doctor of Medicine"),
	DoctorVeterinary("Doctor of Veterinary Medicine"),
	FourYearsCollegeNoDegree("4 years of College, no degree"),
	GED("General Educational Diploma (GED)"),
	HighSchool("High School"),
	LawDegree("Law Degree"),
	LessThanHighSchoolDiploma("Less than High School Diploma"),
	MastersDegree("Master's Degree"),
	OneYearCollegeNoDegree("1 year of College, no degree"),
	PostGraduate("Post Graduate"),
	SomeCollegeNoDegree("Some College - No Degree"),
	ThreeYearsCollegeNoDegree("3 years of College, no degree"),
	TwoYearsCollegeNoDegree("2 years of College, no degree"),
	Unknown("Unknown"),
	VocationalTechnical("Vocational/Technical"),
	;
	private String description;
	EducationLevelCode(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
	
}

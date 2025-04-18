import exceptions.*;

final class Student {
    private String name;
    private long prn;
    private double cgpa;
    private String branch;
    
    // Valid branches list
    private static final String[] VALID_BRANCHES = {"CSE", "AIML", "ENTC", "MECH", "CIVIL"};

    /**
     * Constructor for Student class
     * 
     * @param name   Name of the student
     * @param prn    PRN of the student
     * @param cgpa   CGPA of the student
     * @param branch Branch of the student
     * @throws InvalidNameException if name is invalid
     * @throws InvalidPRNException if PRN is invalid
     * @throws InvalidCGPAException if CGPA is invalid
     * @throws InvalidBranchException if branch is invalid
     */
    public Student(String name, long prn, double cgpa, String branch) 
            throws InvalidNameException, InvalidPRNException, 
                   InvalidCGPAException, InvalidBranchException {
        setName(name);
        setPRN(prn);
        setCGPA(cgpa);
        setBranch(branch);
    }

    /**
     * Set student name
     * 
     * @param name Student name
     * @throws InvalidNameException if name is null or empty
     */
    public void setName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty");
        }
        this.name = name;
    }

    /**
     * Set student PRN
     * 
     * @param prn Student PRN
     * @throws InvalidPRNException if PRN is negative or not 8 digits
     */
    public void setPRN(long prn) throws InvalidPRNException { 
        if (prn <= 0) {
            throw new InvalidPRNException("PRN cannot be negative or zero");
        }
        if (String.valueOf(prn).length() != 11) {
            throw new InvalidPRNException("PRN must be 11 digits");
        }
        this.prn = prn;
    }

    /**
     * Set student CGPA
     * 
     * @param cgpa Student CGPA
     * @throws InvalidCGPAException if CGPA is out of range (0-10)
     */
    public void setCGPA(double cgpa) throws InvalidCGPAException { 
        if (cgpa < 0 || cgpa > 10) {
            throw new InvalidCGPAException("CGPA must be between 0 and 10");
        }
        this.cgpa = cgpa;
    }

    /**
     * Set student branch
     * 
     * @param branch Student branch
     * @throws InvalidBranchException if branch is invalid
     */
    public void setBranch(String branch) throws InvalidBranchException {
        if (branch == null || branch.trim().isEmpty()) {
            throw new InvalidBranchException("Branch cannot be null or empty");
        }
        
        boolean isValid = false;
        for (String validBranch : VALID_BRANCHES) {
            if (validBranch.equalsIgnoreCase(branch)) {
                isValid = true;
                break;
            }
        }
        
        if (!isValid) {
            throw new InvalidBranchException("Invalid branch. Valid branches: CS, IT, ENTC, MECH, CIVIL");
        }
        
        this.branch = branch.toUpperCase();
    }

    public long getPRN() { 
        return prn;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getBranch() {
        return branch;
    }

    /**
     * Display student details
     */
    public void display() {
        System.out.println("Name: " + getName() + " | PRN: " + getPRN() + 
                          " | CGPA: " + getCgpa() + " | Branch: " + getBranch());
    }
}
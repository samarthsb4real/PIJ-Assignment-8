class Student {
    private String name;
    private long prn;
    private double cgpa;
    private String branch;


    public Student(String name, long prn, double cgpa, String branch) {
        setName(name);
        setPRN(prn);
        setCGPA(cgpa);
        setBranch(branch);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPRN(long prn) { 
        this.prn = prn;
    }

    public void setCGPA(double cgpa) { 
        this.cgpa = cgpa;
    }

    public void setBranch(String branch) {
        this.branch = branch;
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

    public void display() {
        System.out.println("Name: " + getName() + " PRN:" + getPRN() + " CGPA:" + getCgpa() + " Branch:" + getBranch());
    }
}
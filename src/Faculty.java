public  class Faculty extends Employee{
    private String[]Courses = new String[2];

    public Faculty(String name,int salary,String[]courses){
        super(name,salary);
        Courses = courses;
    }



    public String getName()
    {
        return super.getName();
    }

    public String[]getCourses(){
       return Courses;
    }

    public void setCourses(String[]extracourses){
        this.Courses=new String[extracourses.length];
        for(int i = 0;i<extracourses.length;i++){
            this.Courses[i]=extracourses[i];
        }
    }


    public String toString() {
        return "employee "+getName()+"'s salary is"+getSalary();

    }
}

package harshpatel_a1_hr;

import java.time.*;

public class harshpatel_a1_HR {

    private String name_first;
    private String name_last;
    private int month_birth;
    private int day_birth;
    private int year_birth;
    
    public harshpatel_a1_HR(String fname, String lname, int m, int d, int y) {
        name_first = fname; name_last = lname;
        month_birth = m; day_birth = d; year_birth = y;
    }
    
    public void set_fname(String f_name){name_first = f_name;}
    public void set_lname(String l_name){name_last = l_name;}
    public void b_month(int m){month_birth = m;}
    public void b_day(int d){day_birth = d;}
    public void b_year(int y){year_birth = y;}

    public String get_fname(){return name_first;}    
    public String get_lname(){return name_last;}
    public int get_b_month(){return month_birth;}
    public int get_b_day(){return day_birth;}
    public int get_b_year(){return year_birth;}
    
    public int age(){
        LocalDate birthday = LocalDate.of(year_birth, month_birth, day_birth);
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today).getYears();
    }  
    public int HRM(){ return (220 - age());}  
    public double target1(){
        double ST = 0.5 * HRM();
        return ST;
    }
    public double target2(){
        double BT = 0.85 * HRM();
        return BT;
    }
}

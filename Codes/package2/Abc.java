package package2;

//import packages.*; improting all files at once
import packages.tools.advClac;
import packages.tools.*;
import packages.calc2;
//import package.subpackage.subpackage.clas name;

//like there we can use classes in the same package. but to access other packages we need to use import. here we import packages package and from there advcalc and calc files. so we can use the classes of those files here
public class Abc {
    public static void main(String[] args) {
        advClac j = new advClac();
        calc k = new calc();
        calc2 t = new calc2();
        j.assign(0);
    }
}

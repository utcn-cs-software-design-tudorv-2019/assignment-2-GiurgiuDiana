package Testing;


import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.Iterator;

import C.TeacherController;
import M.Entities.Teacher;
import M.Services.TeacherService;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.web.servlet.ModelAndView;

/**
 * The Class JUnitServiceTestExample.
 */
public class MockTest {

    public void test1()
    {
        Teacher th= new Teacher("nUME","parola","ADRESA","EMAIL",33);
        ModelAndView tct= new TeacherController().postTeacher(th);
    System.out.println(tct);


    }

}
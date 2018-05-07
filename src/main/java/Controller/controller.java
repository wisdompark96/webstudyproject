package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import java.util.Calendar;

@Controller
public class controller {

    @RequestMapping(value="/hello.do")
    public ModelAndView test(@RequestParam("name") String name){

        ModelAndView mv = new ModelAndView();
        mv.addObject("hello");

        return mv;
    }

    private String getGreeting() {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour >= 6 && hour <= 10) {

            return "Good morning!";
        }
            else if (hour >= 12 && hour <= 15) {
            return "Did you have lunch?";
        } else if (hour >= 18 && hour <= 24) {
            return "Good evening!";
        }
        return "Hello!";
    }

}

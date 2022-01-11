package web.Service;

import org.springframework.ui.Model;

public interface CarService {
    String printCarsList(Integer count, Model model);
}

package at.fhtw.appel.colors.service;

import at.fhtw.appel.colors.dto.Message;
import org.springframework.stereotype.Service;

@Service
public class ColorService {

    private final Message message = new Message();

    public String getMessage() {    //get Message Spring
        return message.getMes();
    }

    public void setMessage(String mes) {    //set Message Spring
        message.setMes(mes);
    }

    public String getCoColor(String color){
        return message.getCompColor(color);
    }
}

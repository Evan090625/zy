package com.gogowise.rep.course.vo.question;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by benson on 14-1-6.
 */
public class Query {

    private String question;

    private Opt opt;
    private String answer;
    private List<String> items;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @XmlElement(name="opt")
    public Opt getOpt() {
        return opt;
    }

    public void setOpt(Opt opt) {
        this.opt = opt;
    }

//    @XmlElementWrapper(name="opt")
//    @XmlElement(name="item")
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}

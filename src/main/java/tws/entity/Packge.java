package tws.entity;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class Packge implements Serializable {
    private String id;
    private String name;
    private String phone;
    private String status;
    private Data time;
    private  String weight;

    public Packge() {

    }

    public Packge(String id, String name, String phone, String status, Data time,String weight) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.time = time;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getTime() {
        return time;
    }

    public void setTime(Data time) {
        this.time = time;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
